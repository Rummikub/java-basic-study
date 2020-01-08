package com.sist.exception;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
				int a=10;
				int b=0;
				System.out.println("a= " +a+" , b=  "+b);
				int []arr=new int[2];
				int c=a/b;
				System.out.println("c: "+c);
		}
		catch(NumberFormatException ex)
		{				
			System.out.println("NumberFormatException ex");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{				
			System.out.println("ArrayIndexOutOfBoundsException ex");
		}
		catch(ArithmeticException ex)
		{		
			System.out.println("ArithmeticException ex");
		}
		catch(NullPointerException ex)
		{
			System.out.println("NullPointerException ex");
		}
		catch(ClassCastException ex)
		{				
			System.out.println("ClassCastException ex");
		}
		catch (RuntimeException ex) //=>아래 예외처리 종류의 상위 클래스 ( 최상위를 가장 마지막에 써줘) 
		{
			System.out.println("RuntimeException ex");
		}
		System.out.println("프로그램종료");

	}

}
