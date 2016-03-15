package com.sist.kim;
/*i 줄수
j 공백
k 별표*/
public class rrr {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      for(int i=1;i<=5;i++)
      {
         for(int j=1;j<=i-1;j++)
         {
        	 System.out.print(" ");
         }
         for(int k=1;k<=5-i;k++)
         {
        	 System.out.print("*");
         }
         
         for(int j=1;j<5;j++)
         {
        	 System.out.print("");
         }
         for(int k=5;k<=10-i;k++)
         System.out.print("*");
         System.out.println();
      }
	  /* for(int i=6;i<=10;i++)
	      {
	         for(int j=1;j<=10-i;j++)
	         {System.out.print(" ");}
	         
	         for(int k=1;k<=i-5;k++)
	         {System.out.print("*");}
	         
	         System.out.print("");
	         for(int k=1;k<=i-6;k++)
	         {System.out.print("*");}
	         System.out.println();
	      }
      */
         
      
   }

}