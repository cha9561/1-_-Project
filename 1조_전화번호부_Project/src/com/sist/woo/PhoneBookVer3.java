package com.sist.woo;
import java.util.Scanner;
class PhoneInfo3
{
	String name;
	String phone;
	String birth;

	public PhoneInfo3(String name, String phone, String birth) 
	{
		// TODO �ڵ� ������ ������ ����
		this.name=name;
		this.phone=phone;
		if(birth==null)
		this.birth=null;
		else
			this.birth=birth;
	}

	
	public void printInfo()
	{
		System.out.println("�Էµ� ���� ��� ");
		System.out.println("�̸� : "+name);
		System.out.println("��ȣ : "+phone);
		System.out.println("���� : "+birth);
		System.out.println();
	}
}
class PhoneBookManage
{
	PhoneInfo3[] infoStorage=new PhoneInfo3[100];
	int Cnt=0;
	public void inputData()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name=scan.nextLine();
		System.out.println("��ȭ��ȣ�� �Է��ϼ��� : ");
		String phone=scan.nextLine();
		System.out.println("��������� �Է��ϼ��� : ");
		String birth=scan.nextLine();
		
		infoStorage[Cnt++]=new PhoneInfo3(name,phone,birth);
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
	}
	
	public void searchData()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("������ �̻��� �����մϴ�");
		
		System.out.println("�̸� : ");
		String name=scan.nextLine();
		
		int idx=search(name);
		if(idx<0)
			System.out.println("���� �������� �ʽ��ϴ�.");
		else
			infoStorage[idx].printInfo();
		System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�.");
	}
	public void deleteData()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("������ ������ �����մϴ�.");
		
		System.out.println("�̸� : ");
		String name=scan.nextLine();
		
		int data=search(name);
		if(data<0)
			System.out.println("�Էµ� ����� �ƴմϴ�");
		else
			for(int idx=data;idx<Cnt-1;idx++)
			infoStorage[idx]=infoStorage[idx+1];
		Cnt--;
		System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.");
		
	}
	private int search(String name)
	{
		for(int idx=0;idx<=Cnt;idx++)
		{
			PhoneInfo3 info=infoStorage[idx];
			if(name.compareTo(info.name)==0);
			return idx;
		}
		return -1;
	}
}
class Menu
{
	static Scanner scan=new Scanner(System.in);
	public static void menu()
	{
		System.out.println("��ȭ��ȣ�θ� �����մϴ�. ����� ��ɸ� �Է��ϼ���.");
		System.out.println("1.��ȭ��ȣ�� �Է�");
		System.out.println("2.��ȭ��ȣ�� �˻�");
		System.out.println("3.��ȭ��ȣ�� ����");
		System.out.println("4.���α׷� ����");
		System.out.println("���� : ");
		
	}
}
public class PhoneBookVer3 {

	public static void main(String[] args) 
	{
		PhoneBookManage manager=new PhoneBookManage();
		int choice;
		while(true)
		{
			Menu.menu();
			choice=Menu.scan.nextInt();
			Menu.scan.nextLine();
			switch(choice)
			{
			case 1:
				manager.inputData();
				break;
			case 2:
				manager.searchData();
				break;
			case 3:
				manager.deleteData();
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
		}
	}
}
