package com.sist.woo;
import java.util.Scanner;
public class ��ȭ��ȣ2�ܰ� {
	
	class phoneInfo
	{
		String name;
		String phone;
		String birth;

		public phoneInfo(String name, String phone) 
		{
			// TODO �ڵ� ������ ������ ����
			this.name=name;
			this.phone=phone;
			this.birth=null;
		}

		public void phoneInfo(String name, String phone,String birth)
		{
			this.name=name;
			this.phone=phone;
			this.birth=birth;
		}
	}
	class phoneBook
	{
		Scanner scan=new Scanner(System.in);
		public void phoneInfo()
		{
			System.out.println("�̸��� �Է��ϼ��� : ");
			String name=scan.nextLine();
			System.out.println("��ȭ��ȣ�� �Է��ϼ��� : ");
			String phone=scan.nextLine();
			System.out.println("��������� �Է��ϼ��� : ");
			String birth=scan.nextLine();
			
			phoneInfo info=new phoneInfo(name,phone);
			System.out.println("�Էµ� �� ��� : ");
			info.phoneInfo(name,phone,birth);
		}
		public void main(String[] args) 
		{
			// TODO �ڵ� ������ �޼ҵ� ����
			phoneInfo();
		}
	}
}
