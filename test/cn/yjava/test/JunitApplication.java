package cn.yjava.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.yjava.dao.INewsDao;
import cn.yjava.model.Admin;
import cn.yjava.model.News;
import cn.yjava.util.GatherNewsUtil;
import cn.yjava.util.YjStringUtils;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:bean.xml"})
public class JunitApplication {
	/*@Autowired
	private IPermissionDao pemissionDao;
	@Test
	public void handler() throws JSONException{
		List<Object[]> objects = pemissionDao.find(1);
		System.out.println(JSONUtil.serialize(objects));
	}*/
	/*@Autowired
	private IPermissionService pemissionService;
	@Test
	public void handler() throws JSONException{
		List<Object[]> objects = pemissionService.find(1);
		System.out.println(JSONUtil.serialize(objects));
	}*/
	@Autowired
	private INewsDao newsDao;
	@Test
	public void handle(){
		String url = "http://news.qq.com/";
		String filterUrl  = "http://news.qq.com/a/";
		Document document = Jsoup.parse(GatherNewsUtil.getHtmlResourceByURL(url,"GBK"));//java.net下面api
		//第三步：抓取网页中所有需要的URL
		Elements links = document.getElementsByTag("a");
		Set<String> urls = new HashSet<String>();
		for (Element element : links) {
			String href = element.attr("href");
			if(YjStringUtils.isNotEmpty(href) && href.startsWith(filterUrl)){
				urls.add(href);
			}
		}
		//第四步：解析匹配出来的URL，将需要的匹配出来，保存到数据库
		for (String string : urls) {
			try {
				Document document2 = Jsoup.parse(GatherNewsUtil.getHtmlResourceByURL(string,"GBK"));
				String title = document2.getElementsByTag("h1").get(0).text();
				String keyword = document2.getElementsByTag("meta").get(2).attr("content");
				String desc = document2.getElementsByTag("meta").get(3).attr("content");
				String content = document2.getElementById("Cnt-Main-Article-QQ").html();
				News news = new News();
				news.setTitle(title);
				news.setContent(content);
				news.setPublishDate(new Date());
				news.setAuthor("俞杰");
				news.setHitNum(0);
				news.setIsTop(0);
				news.setState(0);
				news.setIsDelete(0);
				news.setAdmin(new Admin(1));
				news.setSort(1);
				news.setKeyword(keyword);
				news.setDescription(desc);
				newsDao.save(news);
				System.out.println("插入一条成功----");
			} catch (Exception e) {
				continue;
			}
		}
	}
}
