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
		System.out.println("�Էµ� ���� ��� ...");
		System.out.println("�̸� :"+this.name);
		System.out.println("��ȭ��ȣ :"+this.phoneNumber);
		System.out.println("������� :"+this.birthday);
	}
}

public class PhoneBookVer01 {
	public static void selMenu()
	{
		System.out.println("�����ϼ���...");
		System.out.println("1.������ �Է�");
		System.out.println("2.���α׷� ����");
		System.out.print("���� : ");
	}
	public static void insertData()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("�̸� : ");
		String name=scan.next();
		System.out.print("��ȭ��ȣ: ");
		String pN=scan.next();
		System.out.print("�������: ");
		String birth=scan.next();
		PhoneInfo pBook=new PhoneInfo(name, pN,birth);
		pBook.printInfom();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*PhoneBookVer01 user1=new PhoneBookVer01("����ȣ", "010-111-1111");
		user1.printInfom();
		PhoneBookVer01 user2=new PhoneBookVer01("����ȣ2", "010-222-2222", "19870427");
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
				System.out.println("1�̳� 2�� �����ϼ���.");
				break;
			}
			/*if(select == 1)
			{
				System.out.println("���� : "+select);
				System.out.print("�̸� : ");
				String name=scan.next();
				System.out.print("��ȭ��ȣ: ");
				String pN=scan.next();
				System.out.print("�������: ");
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
				System.out.println("1�̳� 2�� �����ϼ���.");
			}*/
		}
	}

}

