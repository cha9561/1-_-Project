package com.sist.hwang;
/*
 * ��� ���� Class
 */
import java.util.Scanner;

class PhoneInfo
{
	static Scanner scan=new Scanner(System.in);
	String name;
	String phoneNumber;
	String birthday;

	//������
	public PhoneInfo(String name, String phoneNumber, String birthday)
	{
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birthday=birthday;
	}
	public PhoneInfo(String name, String phoneNumber)
	{
		this(name,phoneNumber," ");
	}

	//�Է�
	public static void showMenu()
	{
		System.out.println("�����ϼ���");
		System.out.println("1.�������Է�");
		System.out.println("2.���α׷�����");
		System.out.print("���� : ");
	}
	
	public static void inputInfo()
	{			
		//�Է¹ޱ�
			System.out.print("�̸� : ");
			String name=scan.nextLine();			
			System.out.print("��ȭ��ȣ : ");
			String phoneNumber=scan.nextLine();
			System.out.print("������� : ");
			String birthday=scan.nextLine();	
			PhoneInfo person= new PhoneInfo(name,phoneNumber,birthday);
			person.printInfo();
	}

	
	//���
	public void printInfo()
	{
		System.out.println("�̸� :"+name);
		System.out.println("��ȭ��ȣ :"+phoneNumber);
		if(birthday.equals(" "))
		{
			System.out.println("������� :�Է�X");
		}
		else
		{
			System.out.println("������� :"+birthday);
		}
		System.out.println();
	}
}

public class PhoneBookVer01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			PhoneInfo.showMenu();

			int num=scan.nextInt();
			if(num==1)
			{
				PhoneInfo.inputInfo();
			}
			else
			{	
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
					}
		
	}

}





//add to index -> commit -> (remote -> fetch from) -> push (add all branches spec)
//��ġ ������ �޾ƿ°� ������ �ٷ� Ǫ�� ���� ���� ! ** merge -> add to index -> commit -> push 