package com.sist.woo;
import java.util.Scanner;
class phoneInfo2
{
	String name;
	String phone;
	String birth;

	public phoneInfo2(String name, String phone, String birth) 
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
		System.out.println("�̸� : "+this.name);
		System.out.println("��ȣ : "+this.phone);
		System.out.println("���� : "+this.birth);
	}
}
public class ��ȭ��ȣ2�ܰ� {

		Scanner scan=new Scanner(System.in);
		public void phoneInfo()
		{
			System.out.println("�̸��� �Է��ϼ��� : ");
			String name=scan.nextLine();
			System.out.println("��ȭ��ȣ�� �Է��ϼ��� : ");
			String phone=scan.nextLine();
			System.out.println("��������� �Է��ϼ��� : ");
			String birth=scan.nextLine();
			
			phoneInfo2 info=new phoneInfo2(name,phone,birth);
			System.out.println("�Էµ� �� ��� : ");
			info.printInfo();
		}
		
	
	public static void main(String[] args) 
	{
		// TODO �ڵ� ������ �޼ҵ� ����
		��ȭ��ȣ2�ܰ� phone=new ��ȭ��ȣ2�ܰ�();
		phone.phoneInfo();
		
	}
}
