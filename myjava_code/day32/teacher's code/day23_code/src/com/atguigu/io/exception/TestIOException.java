package com.atguigu.io.exception;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 说一下关于IO流的程序中的异常处理。
 * (1)try..catch
 * try{
 * 		...
 * }catch(异常类型  e){
 * 	...
 * }finally{
 * 	...
 * }
 * (2)JDK1.7引入的try...catch...with ...resource
 * try(需要关闭的资源对象的声明和创建){
 * 	...
 * }catch(异常类型  e){
 * 	...
 * }
 * 无论是否发生异常，也无论是否处理异常，都会关闭这些资源对象
 * 
 */
public class TestIOException {
	//方案三：既想要把异常抛出调用者处理，但是转为运行时异常，又想要确保资源的关闭
	//可以使用JDK1.7引入的try...catch...with ...resource
	public static void copyFile5(File src, File dest){
		try (
				//创建IO流
				FileInputStream fis = new FileInputStream(src);
				BufferedInputStream bis = new BufferedInputStream(fis);
				
				FileOutputStream fos = new FileOutputStream(dest);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				){
			
			//读写操作
			byte[] data = new byte[1024];
			int len;
			while((len = bis.read(data)) != -1){
				bos.write(data, 0, len);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	//方案二：既想要把异常抛出调用者处理，但是转为运行时异常，又想要确保资源的关闭
	public static void copyFile4(File src, File dest){
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			//创建IO流
			fis = new FileInputStream(src);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(dest);
			bos = new BufferedOutputStream(fos);
			
			//读写操作
			byte[] data = new byte[1024];
			int len;
			while((len = bis.read(data)) != -1){
				bos.write(data, 0, len);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}finally{
			try {
				//关闭
				if(bos != null){
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(fos != null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(bis != null){
					bis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(fis != null){
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//方案二：既想要把异常抛出调用者处理，又想要确保资源的关闭
	public static void copyFile3(File src, File dest)throws Exception{
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			//创建IO流
			fis = new FileInputStream(src);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(dest);
			bos = new BufferedOutputStream(fos);
			
			//读写操作
			byte[] data = new byte[1024];
			int len;
			while((len = bis.read(data)) != -1){
				bos.write(data, 0, len);
			}
		} catch (Exception e) {
			throw e;
		}finally{
			try {
				//关闭
				if(bos != null){
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(fos != null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(bis != null){
					bis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(fis != null){
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//方案一：在方法内部处理了异常
	public static void copyFile2(File src, File dest){
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			//创建IO流
			fis = new FileInputStream(src);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(dest);
			bos = new BufferedOutputStream(fos);
			
			//读写操作
			byte[] data = new byte[1024];
			int len;
			while((len = bis.read(data)) != -1){
				bos.write(data, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				//关闭
				if(bos != null){
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(fos != null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(bis != null){
					bis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(fis != null){
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void copyFile(File src, File dest)throws IOException{
		//创建IO流
		FileInputStream fis = new FileInputStream(src);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream(dest);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//读写操作
		byte[] data = new byte[1024];
		int len;
		while((len = bis.read(data)) != -1){
			bos.write(data, 0, len);
		}
		
		//关闭
		bos.close();
		fos.close();
		bis.close();
		fis.close();
	}
}
