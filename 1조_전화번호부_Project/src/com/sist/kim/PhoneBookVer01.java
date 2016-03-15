package com.sist.kim;
import java.util.*;
/*
 * ��ȣ ���� Class
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
		System.out.println("�����ϼ���");
		System.out.println("1. ==> ������ �Է�");
		System.out.println("2. ==> ����");
		System.out.print("���� : ");
	}
	public static void readData()
	{
		System.out.print("�̸�  : ");
		String name=scan.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phone=scan.nextLine();
		System.out.print("������� : ");
		String birth=scan.nextLine();
		
		PhoneInfo info=new PhoneInfo(name,phone,birth);
		System.out.println("\n�Էµ� ���� ���..");
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
				System.out.println("���α׷� ����");
				return;
			}
		}
	}

}
