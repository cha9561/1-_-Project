package com.sist.son;

import java.util.Scanner;

/*
 * ���� ���� Class
 */
public class PhoneBookVer01 {
	String name;
	String phoneNumber;
	String birthday;
	
	public PhoneBookVer01(String name,String phoneNumber,String birthday){
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birthday=birthday;
	}
	public PhoneBookVer01(String name, String phoneNumber){
		this(name,phoneNumber,"");
	}
	public void phoneInfo(){
		System.out.println("�̸�:"+name);
		System.out.println("��ȭ��ȣ:"+phoneNumber);
		System.out.println("�������:"+birthday);
	}

	public static void main(String[] args) {
		PhoneBookVer01 pbv1=new PhoneBookVer01("�չ���","01099793342","910902");
		pbv1.phoneInfo();
		PhoneBookVer01 pbv2=new PhoneBookVer01("ȫ�浿","01012345678");
		pbv2.phoneInfo();
	
	}

}
