package com.sist.son;

import java.util.Scanner;

public class PhoneBookVer02 {
	String name;
	String phone;
	String birth;
	
	public void showPhoneInfo(){
		System.out.println("입력된 정보 출력...");
		System.out.println("name:"+name);
		System.out.println("phone:"+phone);
		System.out.println("birth:"+birth);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
		System.out.println("선택하세요...");
		System.out.println("1.데이터입력");
		System.out.println("2.프로그램 종료");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("선택:");
		int num=scan.nextInt();
		
		if(num==1)
		{
			PhoneBookVer02 pbv=new PhoneBookVer02();
			
			Scanner data = new Scanner(System.in);
			System.out.print("이름:");
			pbv.name=data.nextLine();
			
			System.out.print("전화번호:");
			pbv.phone=data.nextLine();
			
			System.out.print("생년월일:");
			pbv.birth=data.nextLine();
			
			
			pbv.showPhoneInfo();
			continue;
		}
		else if(num==2)
		{
			System.out.println("프로그램 종료");
			break;
		}
		}
	}

}
