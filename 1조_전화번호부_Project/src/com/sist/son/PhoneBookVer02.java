package com.sist.son;

import java.util.Scanner;

public class PhoneBookVer02 {
	String name;
	String phone;
	String birth;
	
	public void showPhoneInfo(){
		System.out.println("�Էµ� ���� ���...");
		System.out.println("name:"+name);
		System.out.println("phone:"+phone);
		System.out.println("birth:"+birth);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
		System.out.println("�����ϼ���...");
		System.out.println("1.�������Է�");
		System.out.println("2.���α׷� ����");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("����:");
		int num=scan.nextInt();
		
		if(num==1)
		{
			PhoneBookVer02 pbv=new PhoneBookVer02();
			
			Scanner data = new Scanner(System.in);
			System.out.print("�̸�:");
			pbv.name=data.nextLine();
			
			System.out.print("��ȭ��ȣ:");
			pbv.phone=data.nextLine();
			
			System.out.print("�������:");
			pbv.birth=data.nextLine();
			
			
			pbv.showPhoneInfo();
			continue;
		}
		else if(num==2)
		{
			System.out.println("���α׷� ����");
			break;
		}
		}
	}

}
