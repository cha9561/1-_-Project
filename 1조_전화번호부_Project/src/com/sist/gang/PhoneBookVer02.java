package com.sist.gang;

import java.util.Scanner;

class PhoneInfo2
{
	String name;
	String phoneNumber;
	String birth;
	
	public PhoneInfo2(String name,String phoneNumber,String birth)
	{
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birth=birth;
	}
	public PhoneInfo2(String name,String phoneNumber)
	{
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	public void showPhoneInfo()
	{
		System.out.println("name: "+name);
		System.out.println("phoneNumber: "+phoneNumber);
		if(birth!=null)
		System.out.println("birth:" +birth);
		else
			System.out.println("birth:"+null);
	}
}
public class PhoneBookVer02 {
	static Scanner scan=new Scanner(System.in);
	public static void ShowMenu()
	{
		System.out.println("선택하세요...");
		System.out.println("데이터 입력");
		System.out.println("프로그램 종료");
		System.out.print("선택: ");
	}
	public static void readData()
	{
		System.out.print("이름: ");
		String name=scan.nextLine();
		System.out.print("전화번호: ");
		String phoneNumber=scan.nextLine();
		System.out.println("생년월일: ");
		String birth=scan.nextLine();
		
		PhoneInfo2 info=new PhoneInfo2(name, phoneNumber, birth);
		System.out.println("\n입력된 정보 출력...");
		info.showPhoneInfo();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		while(true)
		{
			ShowMenu();
			choice=scan.nextInt();
			scan.nextLine();
			
			/*switch(choice)
			{
			case 1:
				readData();
				break;
			case 2:
				System.out.println("프로그램을 종료합니다.");
				return;
			}*/
			if(choice==1)
				readData();
			else
				System.out.println("프로그램 종료");
			
		}
	}

}
