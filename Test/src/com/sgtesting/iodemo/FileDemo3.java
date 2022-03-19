package com.sgtesting.iodemo;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {
	//	createFolder();
	//	createNestedFolder();
	//	renameFolder();
	//	deleteFolder();
		folderCollections();
	}
	private static void createFolder()
	{
		File f=new File("D:\\CITY\\DEMO\\Welcome");
		boolean val=f.mkdir();
		System.out.println(val);
	}
	
	private static void createNestedFolder()
	{
		File f=new File("D:\\CITY\\DEMO\\D1\\D2\\D3\\D4\\D5");
		boolean val=f.mkdirs();
		System.out.println(val);
	}
	
	private static void renameFolder()
	{
		File f=new File("D:\\CITY\\DEMO\\Welcome");
		File f1=new File("D:\\CITY\\DEMO\\WelcomeNEW");
		boolean val=f.renameTo(f1);
		System.out.println(val);
	}
	
	private static void deleteFolder()
	{
		File f1=new File("D:\\CITY\\DEMO\\WelcomeNEW");
		boolean val=f1.delete();
		System.out.println(val);
	}

	private static void folderCollections()
	{
		File f=new File("D:\\CITY\\DEMO");
		File f1[]=f.listFiles();
		for(int i=0;i<f1.length;i++)
		{
			boolean val=f1[i].isDirectory();
			if(val==true)
			{
				System.out.println(f1[i].getPath());
			}
		}
	}
}

