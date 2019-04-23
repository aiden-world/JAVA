package com.atguigu.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

/*
 * 一、JDK1.8之前
 * 1、java.util.Date为核心
 * 2、java.util.Calendar日历
 * 3、java.text.DateFormat：java.text.SimpleDateFormat
 * 4、java.sql包下：在讲JDBC，Java连接数据库时讲解
 * 		java.sql.Date
 * 		java.sql.Time
 * 		java.sql.Timestamp
 * 
 * 
 * 1、java.util.Date
 * （1）new Date()：当前系统日期时间
 * （2）long getTime()：距离1970年1月1日 0点的毫秒数
 * （3）new Date(毫秒)
 * 
 * 2、java.util.Calendar：抽象类
 * 		java.util.GregorianCalendar 
 * （1）get(常量字段)
 * （2）getInstance()
 * 
 * 3、日期时间格式化问题
 * java.text.DateFormat：java.text.SimpleDateFormat
 * 
 * 二、JDK1.8之后
 */
public class TestDate {
	@Test
	public void test5(){
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒  SSS毫秒  E 是这一年的D天");
		String s = sf.format(now);
		System.out.println(s);
		
		SimpleDateFormat sf2 = new SimpleDateFormat("Z");
		System.out.println(sf2.format(now));//+0800
	}
	
	@Test
	public void test4(){
		String[] all = TimeZone.getAvailableIDs();
		for (int i = 0; i < all.length; i++) {
			System.out.println(all[i]);
		}
	}
	
	@Test
	public void test3(){
		//getInstance(TimeZone zone, Locale aLocale) 
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("America/Toronto"),Locale.US);
	
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DATE);
//		int hour1= c.get(Calendar.HOUR);//12小时制
		int hour2 = c.get(Calendar.HOUR_OF_DAY);//24小时制
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		int days = c.get(Calendar.DAY_OF_YEAR);
		System.out.println(year + "年" + month + "月" + day + "日" + hour2 + "时" + minute + "分" + second + "秒");
		System.out.println("第" + days + "天");
		
	}
	
	@Test
	public void test2(){
	/*	Calendar c = new GregorianCalendar();
		System.out.println(c);*/
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DATE);
		int hour1= c.get(Calendar.HOUR);//12小时制
		int hour2 = c.get(Calendar.HOUR_OF_DAY);//24小时制
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		int days = c.get(Calendar.DAY_OF_YEAR);
		System.out.println(year + "年" + month + "月" + day + "日" + hour1 + "时" + minute + "分" + second + "秒");
		System.out.println("第" + days + "天");
	}
	
	@Test
	public void test1(){
		//Date对象表示某一个瞬间的日期和时间
		Date now = new Date();
		System.out.println(now);//Fri Mar 15 11:24:36 CST 2019
		
		long time = now.getTime();
		System.out.println(time);//1552620366588
		
		long maxTime = Long.MAX_VALUE;
		Date d = new Date(maxTime);
		System.out.println(d);
	}
}
