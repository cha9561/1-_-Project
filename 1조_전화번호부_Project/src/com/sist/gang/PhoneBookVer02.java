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
		System.out.println("�����ϼ���...");
		System.out.println("������ �Է�");
		System.out.println("���α׷� ����");
		System.out.print("����: ");
	}
	public static void readData()
	{
		System.out.print("�̸�: ");
		String name=scan.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phoneNumber=scan.nextLine();
		System.out.println("�������: ");
		String birth=scan.nextLine();
		
		PhoneInfo2 info=new PhoneInfo2(name, phoneNumber, birth);
		System.out.println("\n�Էµ� ���� ���...");
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
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}*/
			if(choice==1)
				readData();
			else
				System.out.println("���α׷� ����");
			
		}
	}

}
