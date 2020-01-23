package com.sist.io;
// 폴더 안이 비어있지 않다면(파일이 있다면 ) 지울 수 없다 => 파일 => 폴더 순으로 지우면 됨
import java.io.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File dir=new File("c:\\oracle");
			if(dir.exists())
			{
					File[] files=dir.listFiles();
					//System.out.println(files.length);  파일의 개수가 몇개냐
					if(files.length>0)
					{
						// 파일이 있는경우
						for(File f:files)
						{
							f.delete();
						}
						dir.delete();    // 파일 삭제 후 디렉토리 삭제 
					}
					else
					{
						 // 파일이 없는 경우
						dir.delete();
					}
			}
			System.out.println("oracle폴더 삭제 완료");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
	}
	}
}
