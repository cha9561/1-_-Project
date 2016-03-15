package com.sist.gang;
import java.util.Scanner;
class PhoneInfo
{
	String name;
	String phoneNumber;
	String birth;
	public PhoneInfo(String name,String phoneNumber,String birth)
	{
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birth=birth;
	}
	public PhoneInfo(String name,String phoneNumber)
	{
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birth=null;
	}
	public void ShowPhoneInfo()
	{
		System.out.println("name: "+name);
		System.out.println("PhoneNumber: "+phoneNumber);
		if(birth!=null)
			System.out.println("birth: "+birth);
		
		System.out.println(" ");//������ ������ ����
	}
	
}
class PhoneBookManager
{
	final int MAX_CNT=100;
	PhoneInfo[] infoStorage=new PhoneInfo[MAX_CNT];
	int curCNT=0;
	
	public void inputData()
	{
		System.out.println("�����͸� �Է��մϴ�.");
		System.out.print("�̸�: ");
		String name=MenuViewer.scan.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phoneNumber=MenuViewer.scan.nextLine();
		System.out.print("�������: ");
		String birth=MenuViewer.scan.nextLine();
		
		infoStorage[curCNT++]=new PhoneInfo(name,phoneNumber,birth);
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.\n");
	}
	public void searchData()
	{
		System.out.println("�����͸� �˻��մϴ�.");
		System.out.println("�̸�: ");
		String name=MenuViewer.scan.nextLine();
		int dataIdx=search(name);
		if(dataIdx<0)
			System.out.println("�ش� �����Ͱ� �������� �ʽ��ϴ�.\n");
		else
		{
			infoStorage[dataIdx].ShowPhoneInfo();
			System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�.\n");
		}
		
	}
	public void deleteData()
	{
		System.out.println("�����͸� �����մϴ�.");
		System.out.println("�̸�: ");
		String name=MenuViewer.scan.nextLine();
		int dataIdx=search(name);
		if(dataIdx<0)
			System.out.println("�ش� �����Ͱ� �������� �ʽ��ϴ�.\n");
		else
		{
			for(int idx=dataIdx;idx<(curCNT-1);idx++)
				infoStorage[idx]=infoStorage[idx+1];
			curCNT--;
			System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.\n");
		}
	}
	
	private int search(String name)
	{
		for(int idx=0;idx<curCNT;idx++)
		{
			PhoneInfo curInfo=infoStorage[idx];
			if(name.compareTo(curInfo.name)==0)
				return idx;
		}
		return -1;
	}
}

class MenuViewer
{
	public static Scanner scan=new Scanner(System.in);
	
	public static void showMenu()
	{
		System.out.println("1.������ �Է�");
		System.out.println("2.������ �˻�");
		System.out.println("3.������ ����");
		System.out.println("4.���α׷� ����");
		System.out.println("����: ");
	}
}

public class PhoneBookVer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBookManager manager=new PhoneBookManager();
		int choice;
		
		while(true)
		{
			MenuViewer.showMenu();
			choice=MenuViewer.scan.nextInt();
			MenuViewer.scan.nextLine();
			
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
					System.out.println("���α׷��� �����մϴ�.\n");
					return;
			}
		}
	}

}

