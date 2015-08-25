package cn.yjava.test;

import java.util.List;

import org.apache.struts2.json.JSONException;
import org.apache.struts2.json.JSONUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.yjava.service.IPermissionService;


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
	@Autowired
	private IPermissionService pemissionService;
	@Test
	public void handler() throws JSONException{
		List<Object[]> objects = pemissionService.find(1);
		System.out.println(JSONUtil.serialize(objects));
	}
	
}
