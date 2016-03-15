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
class PhoneManager{
	Scanner scan=new Scanner(System.in);
	static PhoneInfo [] pList= new PhoneInfo[100];
	int userCount=0;
	void insert()
	{
		String name;
		String pN;
		String birth;
		System.out.println("������ �Է��� �����մϴ�...");
		while(true)
		{
			System.out.print("�̸� : ");
			name=scan.next();
			if(nameSearch(name)<userCount)
			{
				System.out.println("�̸��� �ߺ��Ǿ� �Է��Ҽ� �����ϴ�.");
				continue;
			}
			break;
		}		
		System.out.print("��ȭ��ȣ: ");
		pN=scan.next();
		System.out.print("�������: ");
		birth=scan.next();
		PhoneInfo pI= new PhoneInfo(name, pN, birth);
		pList[userCount]=pI;
		userCount++;
		System.out.println("������ �Է��� �����Ͽ����ϴ�.");
	}
	void search()
	{
		System.out.println("������ �˻��� �����մϴ�...");
		System.out.print("�̸� : ");
		String name=scan.next();
		int num=nameSearch(name);
		if(num>=userCount)
			System.out.println("������ ã���� �����ϴ�.");
		else
			pList[num].printInfom();
		System.out.println("������ �˻��� �������ϴ�.");
	}
	void delete()
	{
		System.out.println("������ ������ �����մϴ�...");
		System.out.print("�̸� : ");
		String name=scan.next();
		int num=nameSearch(name);
		
		if(num>=userCount)
			System.out.println("������ ã���� �����ϴ�.");
		else
		{
			for(int i=num; i<userCount; i++)
			{
				if(i+1 >= userCount)
					pList[i]=null;
				else
					pList[i]=pList[i+1];
			}
		}
		userCount--;
		System.out.println("������ ������ �������ϴ�.");
	}
	int nameSearch(String name)
	{
		int num=0;
		for(int i=0; i<userCount; i++)
		{
			if(name.equals(pList[i].name))
			{
				return num;
			}
			num++;
		}
		return num;
	}
}
public class PhoneBookVer01 {
	public static void selMenu()
	{
		System.out.println("�����ϼ���...");
		System.out.println("1.������ �Է�");
		System.out.println("2.������ �˻�");
		System.out.println("3.������ ����");
		System.out.println("4.���α׷� ����");
		System.out.print("���� : ");
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		PhoneManager man=new PhoneManager();
		while(true)
		{
			selMenu();
			int select=scan.nextInt();
			switch (select) {
			case 1:
				man.insert();
				break;
			case 2:
				man.search();
				break;
			case 3:
				man.delete();
				break;
			case 4:
				System.out.println("���α׷� �����մϴ�");
				return;
			default:
				System.out.println("1~4 �� �����Ͻÿ�");
			}
		}
	}

}

