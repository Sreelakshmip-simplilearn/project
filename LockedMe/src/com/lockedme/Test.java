package com.lockedme;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws IOException,NullPointerException
	{
FileUtil util=new FileUtil();
int ch;
Scanner sc = new Scanner(System.in);
try 
{
do
{
	System.out.println("1:Add File");
	System.out.println("2:Delete File");
	System.out.println("3:Display File");
	System.out.println("4:Search File");
	System.out.println("5:Exit");
	System.out.println("Enter your choice");
    ch=sc.nextInt();
    switch(ch)
    {
    case 1:
    	String filename;
    	System.out.println("Enter the File Name");
    	filename=sc.next();
    	util.addFile(filename);
    	break;
    case 2:
    	String filename1;
    	System.out.println("Enter the File Name to be deleted");
    	filename1=sc.next();
    	util.deleteFile(filename1);
    	
    	break;
    case 3:
    	List<MyFile> files = util.getfiles();
    	for (MyFile f:files)
    		System.out.println(f.getId() + " " + f.getFilename());
    	break;
    case 4:
    	String filename2;
    	System.out.println("Enter the filename to be searched");
    	filename2=sc.next();
    	if(util.search(filename2))
    	{
    		System.out.println("file exsists");
    	}
    	else
    	{
    		System.out.println("File does not exsist");
    	}
    	break;
    }
    }while (ch<5);

}catch(IOException e)
{
	System.out.println(e);
    
}
catch (NullPointerException n)
{
	System.out.println(n);
}
}
	}

