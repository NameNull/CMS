package cn.yjava.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

public class YjAutoProjectUtil {
	
	private static String description="新闻";
	private static  String entity = "News";
	private static  String lowEntity = "news";
	
	private static String srcPath="src\\cn\\yjava\\";
	private static String author="俞杰";
	private static String date = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(new Date());
	
	public static void main(String[] args){
		//实体类
		create("entity", srcPath+"model\\", entity+".java");
		//逻辑层
		create("dao", srcPath+"dao\\", "I"+entity+"Dao.java");
		create("daoImpl", srcPath+"dao\\impl\\", entity+"DaoImpl.java");
		//业务层
		create("service", srcPath+"service\\", "I"+entity+"Service.java");
		create("serviceImpl", srcPath+"service\\impl\\", entity+"ServiceImpl.java");
		//控制层
		create("action", srcPath+"web\\action\\admin\\", entity+"Action.java");
		//页面
		create("list", "WebRoot\\WEB-INF\\pages\\", lowEntity+".jsp");
	}
	
	/**
	 * 
	 * @description 自动生成
	 * @方法名 create
	 * @param templateName
	 * @param targetPath
	 * @param fileName void
	 * @exception
	 */
	public static void create(String templateName,String targetPath,String fileName){
		try {
			//获取模板页面路径
			String templatePath = YjFileUtils.getPath("template\\"+templateName+".txt");
			//写入到磁盘里面去
			String result = replaceModel(templatePath);
			//要生成的根目录
			String daoRoot =  YjFileUtils.getPath(targetPath);
			File rootPath  = new File(daoRoot);
			//如果路径不存在那么就创建
			if(!rootPath.exists())rootPath.mkdirs();
			//产生接口文件
			File daoJava = new File(rootPath, fileName);
			//将模板中替换好的数据通过写入目录中去
			FileUtils.writeStringToFile(daoJava, result, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @description 替换模板
	 * @方法名 replaceModel
	 * @param path
	 * @return
	 * @throws IOException String
	 * @exception
	 */
	public static String replaceModel(String path) throws IOException{
		String result = FileUtils.readFileToString(new File(path),"UTF-8");
		result = result.replaceAll("\\[entity\\]", entity)
				.replaceAll("\\[lowEntity\\]", lowEntity)
				.replaceAll("\\[description\\]", description)
				.replaceAll("\\[author\\]", author)
				.replaceAll("\\[date\\]", date);
		return result;
	}
}
