package com.sist.son;

import java.util.Scanner;

/*
 * 민지 메인 Class
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
		System.out.println("이름:"+name);
		System.out.println("전화번호:"+phoneNumber);
		System.out.println("생년월일:"+birthday);
	}

	public static void main(String[] args) {
		PhoneBookVer01 pbv1=new PhoneBookVer01("손민지","01099793342","910902");
		pbv1.phoneInfo();
		PhoneBookVer01 pbv2=new PhoneBookVer01("홍길동","01012345678");
		pbv2.phoneInfo();
	
	}

}
