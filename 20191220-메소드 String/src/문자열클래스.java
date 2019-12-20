// String : ¹®ÀÚ¿­À» Á¦¾î
/*
 *   java.lang => import¸¦ »ı·«ÇÒ ¼ö ÀÖ´Ù
 *   ¹®ÀÚ¿­À» ÀúÀåÇÏ´Â ¹æ¹ı
 *   		1)	 String º¯¼ö¸í = " Hello Java ";
 *   		2) 	 String  º¯¼ö¸í = new String (" ");   °°Àº ¹®ÀÚ¿­ => º°µµ·Î ÀúÀå
 *   														===
 *   														»õ·Î¿î ¸Ş¸ğ¸®¿¡ ÀúÀå
 *   
 *   String ¿¡¼­ Á¦°øÇÏ´Â ±â´É
 *   1)  equals : ÀúÀåµÈ ¹®ÀÚ¿­ ÀÏÄ¡ ¿©ºÎ  (true/false)
 *   			ID , PW ; ·Î±×ÀÎ( ´ë¼Ò¹®ÀÚ ±¸ºĞ)
 *   			¹®ÀÚ¿­Àº(==)À» »ç¿ëÇÏ¸é ¾ÈµÊ.
 *   
 *   		String s= " Hello ";
 *   		String s1= " Hello" ;   				// ÁÖ¼Ò°ªÀÌ °°À¸´Ï±î ºñ±³°¡ µÊ
 *   		String s2= new String ("Hello");
 *   			if (s==s1)  true    (s1==s2) false
 *   => ±×·¯´Ï±î s.equals(s1) ÀÌ°É ½á¶ó
 *   
 *   => ¿øÇü
 *   			boolean equals(String data) 
 *   
 *   2)  substring : ¹®ÀÚ¿­À» ÀÚ¸¦¶§
 *   			String s = "0123456789";
 *   			substring(3)   =>3456789
 *   			String s= "112ºĞ,15¼¼ÀÌ»ó°ü¶÷°¡"
 *   			substring(0,3)   => " 112"
 *   									== end-1     === > 012				
 *   			substring(int start)
 *   			substring( int start, int end)
 *   3)  length  : ¹®ÀÚ¿­ °³¼ö
 *   		String s="Hello È«±æµ¿";
 *   4)  trim : ÁÂ¿ìÀÇ °ø¹é¹®ÀÚ Á¦°Å
 *   		String s="Hello Java";
 *   						=> s.trim().length
 *   5)  startsWith, endsWith
 *   			; ½ÃÀÛ¹®ÀÚ¿­ÀÌ °°À» ‹š, ¾Õ±ÛÀÚ/µŞ±ÛÀÚ°¡ °°Àº °ÍÀ» Ã£¾Æ¶ó   ex) °Ë»ö±â
 *   			startsWith("ÀÚ¹Ù")
 *   6)  indexOf, lastIndexOf
 *   		¹®ÀÚÀÇ À§Ä¡( indexOf: ¾Õ¿¡¼­, lastIndexOf: µÚ¿¡¼­)
 *   		String s="Hello Java";
 *   		s.indexOf('a') =  7
 *   		s.lastIndexoOf('a') = 9
 *   7)  split
 *  		String s="ÀÌº´Çå, ÇÏÁ¤¿ì, ¼öÁö, ÀüÇıÁø, ¸¶µ¿¼®"  
 *  		String [] names= s.split(,);
 *  	 	Á¤±Ô½Ä  ( ip±Ü¾î¿À´Â ¹ı)
 *  		=====
 *  				211.238.142.181
 *  				211.238.142.180
 *  				211.238.142.1
 *  				211.238.142.0
 *  				211.238.1.1
 *  				[0-9] {1,3}\\.[0-9] {1,3}\\.[0-9] {1,3}\\.[0-9] {1,3}      = ¼ıÀÚ 0ºÎÅÍ 9±îÁö / ¼ıÀÚ ÇÑÀÚ¸®ºÎÅÍ ¼¼ÀÚ¸®±îÁö
 *  /^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])   = emailÁ¤±Ô½Ä
 *   8)  toUpperCase, toLowerCase   : ´ë/¼Ò¹®ÀÚ º¯È¯
*				String s="Hello";
*				s.toUpperCase()		==> HELLO
*				s.toLowerCase() 		==> hello
 *   9) replace,replaceAll    ===> Á¤±Ô½Ä
 *   							String s="113ºĞ"
 *   							s.replaceAll("[^0-9]","")  ==>113     			^ÀÇ ÀÇ¹Ì: Á¦¿ÜÇÑ
 *   							s.replaceAll("^[0-9]","")   								 ^[ ÀÇ ÀÇ¹Ì : ¼ıÀÚ·Î ½ÃÀÛÇÏ´Â
 *   							s.replaceAll("[0-9]$","")									]$ÀÇ ÀÇ¹Ì : ¼ıÀÚ·Î ³¡³ª´Â   
*   							s.replaceAll("[^°¡-ÆR]","") 
 *   							s.replaceAll("[^A-Za-z]","") 
 *   		=======
 *   			º¯°æ ==>   String s="Hello Java"
 *   									s.replace('a','b') ="Hello Jbvb"
 *   
 *   10)  contains ()  : Æ÷ÇÔµÈ ¹®ÀÚ¸¦ Ã£´Â °æ¿ì
 *  
 */
import java.util.Scanner;
public class ¹®ÀÚ¿­Å¬·¡½º {
	
	static String[] autoComplate(String data)
	{
		String[] ss= {
				"ÀÚ¹Ù¿ÍJSP","ÀÚ¹Ù ÇÁ·Î±×·¡¹Ö", "½ºÇÁ¸µ 5","Ajax¿Í JSP","¸®´ö½º¿Í ¸®¾×Æ®",
				"ÀÚ¹Ù¿Í ¿À¶óÅ¬","MVC ±¸Á¶","ÄÚÆ²¸°°ú ¾Èµå·ÎÀÌµå","ÄÚÆ²¸° ÇÁ·Î±×·¥","½ºÇÁ¸µ µ¥ÀÌÅÍ",
				"È¥ÀÚ ¹è¿ì´Â ÀÚ¹Ù","Áö´ÉÇüÀ¥ ÇÁ·Î±×·¥","À¥ ÇÁ·Î±×·¥","ÀÚ¹Ù À¥ÇÁ·Î±×·¥","¿À¶óÅ¬ ÀÚ¹Ù"
		};
		String[] findData= new String[10];
		int j=0;
		for(int i=0;i<ss.length; i++)
		{
			if(ss[i].contains(data))
			{
				findData[j]=ss[i];
				j++;
			}
		}
		return findData;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("°Ë»ö¾î ÀÔ·Â: ");
		String data=scan.next();
		
		String [] fd=autoComplate(data);
		for(int i=0;i<fd.length;i++)
		{
			if(fd[i]!=null)
			{
				System.out.println(fd[i]);
			}
		}
		
		
	}

}
