package com.sist.kim;
import java.util.*;
/*
 * 동호 메인 Class
 */
class PhoneInfo
{
	String name;
	String phoneNumber;
	String birth;

	public PhoneInfo(String name,String num,String birth)
	{
		this.name = name;
		phoneNumber=num;
		this.birth=birth;
	}
	public PhoneInfo(String name,String num)
	{
		this.name = name;
		phoneNumber=num;
		this.birth=null;
	}
	public void showPhoneInfo()
	{
		System.out.println("name : "+name);
		System.out.println("phone : "+phoneNumber);
		if(birth!=null)
			System.out.println("birth : "+birth);
		
		System.out.println("");
	}
}
public class PhoneBookVer01 {
	static Scanner scan=new Scanner(System.in);
	public static void menu()
	{
		System.out.println("선택하세요");
		System.out.println("1. ==> 데이터 입력");
		System.out.println("2. ==> 종료");
		System.out.print("선택 : ");
	}
	public static void readData()
	{
		System.out.print("이름  : ");
		String name=scan.nextLine();
		System.out.print("전화번호 : ");
		String phone=scan.nextLine();
		System.out.print("생년월일 : ");
		String birth=scan.nextLine();
		
		PhoneInfo info=new PhoneInfo(name,phone,birth);
		System.out.println("\n입력된 정보 출력..");
		info.showPhoneInfo();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		while(true)
		{
			menu();
			choice=scan.nextInt();
			scan.nextLine();
			
			switch(choice)
			{
				case 1:
				readData();
				break;
				case 2:
				System.out.println("프로그램 종료");
				return;
			}
		}
	}

}
