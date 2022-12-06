package com.lockedme;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class FileUtil {
	static int count = 0;
	List<MyFile> files=new ArrayList<>();
	public FileUtil() throws NullPointerException
	{File f =new File("/home/brosesdagmail/java");
	String [] fs = f.list();
	for(String file:fs)
	{
		count++;
	files.add(new MyFile(count,file));
	
    }
	}
	

	public List<MyFile> getfiles() throws NullPointerException
	{
		files.clear();
		count=0;
		File f =new File("/home/brosesdagmail/java");
        String [] fs = f.list();
        for(String file:fs)
    	{
    		count++;
    	files.add(new MyFile(count,file));
    	
        }
        
        return files;
	
	}
	
	public void addFile(String fileName) throws IOException
	{
		
		File f=new File("/home/brosesdagmail/java/"+fileName+".txt");
		f.createNewFile();
	}
	
	public boolean deleteFile(String filename)
	{
		boolean isDeleted=false;
		files = getfiles();
		for (MyFile file:files)
		{
			if(file.getFilename().startsWith(filename) )
			{
		      File f = new File("/home/brosesdagmail/java/"+file.getFilename());
		      f.delete();
		     
		      isDeleted=true;
		      break;
		      
			}
		}
		System.out.println(isDeleted);
		return isDeleted;
		
	}
	
	public boolean search(String filename) throws IOException
	{
		boolean isfound=false;
		files = getfiles();
		for (MyFile file:files)
		{
			if(file.getFilename().startsWith(filename) )
			{
		     
		      isfound=true;
		      break;
		      
			}
		}
		System.out.println(isfound);
		return isfound;
	}
}
