package com.sist.gang;

/*
 * ���� ���� ���� Class
 * 
 * team=>add=>commit:����   fetch=>�ٸ� ����� �Ÿ� �޴� ����  merge=>�浹 ��ȭ
 * Version 0.1
 */
class PhoneInfo1
{
	String name;
	String phoneNumber;
	String birth;
	
	public PhoneInfo1(String name,String phoneNumber,String birth)
	{
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birth=birth;
	}
	public PhoneInfo1(String name,String phoneNumber)
	{
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	public void showPhoneInfo()
	{
		System.out.println("name: "+name);
		System.out.println("phoneNumber: "+phoneNumber);
		if(birth!=null)
			System.out.println("birth: "+birth);
		
		System.out.println("");
	}
}
public class PhoneBookVer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneInfo1 p1=new PhoneInfo1("������","010-9228-4027","4/27");
		PhoneInfo1 p2=new PhoneInfo1("������","010-3571-5977");
		p1.showPhoneInfo();
		p2.showPhoneInfo();
		
	}

}
