package com.sist.cha;

import java.util.Scanner;


class PhoneInfo{
	String name;
	String phoneNumber;
	String birthday;
	
	public PhoneInfo(String name, String pN, String birth) {
		this.name=name;
		this.phoneNumber=pN;
		this.birthday=birth;
	}
	public PhoneInfo(String name, String pN) {
		this(name, pN, null);
	}
	void printInfom()
	{
		System.out.println("입력된 정보 출력 ...");
		System.out.println("이름 :"+this.name);
		System.out.println("전화번호 :"+this.phoneNumber);
		System.out.println("생년월일 :"+this.birthday);
	}
}

public class PhoneBookVer01 {
	public static void selMenu()
	{
		System.out.println("선택하세요...");
		System.out.println("1.데이터 입력");
		System.out.println("2.프로그램 종료");
		System.out.print("선택 : ");
	}
	public static void insertData()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("이름 : ");
		String name=scan.next();
		System.out.print("전화번호: ");
		String pN=scan.next();
		System.out.print("생년월일: ");
		String birth=scan.next();
		PhoneInfo pBook=new PhoneInfo(name, pN,birth);
		pBook.printInfom();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*PhoneBookVer01 user1=new PhoneBookVer01("차승호", "010-111-1111");
		user1.printInfom();
		PhoneBookVer01 user2=new PhoneBookVer01("차승호2", "010-222-2222", "19870427");
		user2.printInfom();*/
		while(true)
		{
			Scanner scan=new Scanner(System.in);
			selMenu();
			int select=scan.nextInt();
			switch (select) {
			case 1:
				insertData();
				break;
			case 2:
				return;
			default:
				System.out.println("1이나 2중 선택하세요.");
				break;
			}
			/*if(select == 1)
			{
				System.out.println("선택 : "+select);
				System.out.print("이름 : ");
				String name=scan.next();
				System.out.print("전화번호: ");
				String pN=scan.next();
				System.out.print("생년월일: ");
				String birth=scan.next();
				PhoneInfo pBook=new PhoneInfo(name, pN,birth);
				pBook.printInfom();
			}
			else if(select == 2)
			{
				return;
			}
			else
			{
				System.out.println("1이나 2중 선택하세요.");
			}*/
		}
	}

}

