package com.sgtesting.iodemo;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
		
		File f=new File("D:\\CITY\\DEMO\\Sample.txt");
		String s1=f.getName();
		System.out.println("File Name:"+s1);
		System.out.println("+++++++++++++");
		String s2=f.getParent();
		System.out.println("Parent Folder:"+s2);
		System.out.println("+++++++++++++");
		File f1=f.getParentFile();
		System.out.println("Parent File :"+f1);
		System.out.println("+++++++++++++");
		String path1=f.getAbsolutePath();
		System.out.println("Path :"+path1);
		System.out.println("+++++++++++++");
		String path2=f.getPath();
		System.out.println("Path :"+path2);
		System.out.println("+++++++++++++");
		boolean v1=f.isFile();
		System.out.println("Is it a File ?:"+v1);
		System.out.println("+++++++++++++");
		boolean v2=f.isDirectory();
		System.out.println("Is it a Folder ?:"+v2);
		System.out.println("+++++++++++++");
		boolean isRead=f.canRead();
		System.out.println("Is it readable?:"+isRead);
		System.out.println("+++++++++++++");
		boolean isWrite=f.canWrite();
		System.out.println("Is it writable?:"+isWrite);
		System.out.println("+++++++++++++");
		boolean isExecute=f.canExecute();
		System.out.println("Is it Executable?:"+isExecute);
		System.out.println("+++++++++++++");
	}

}

