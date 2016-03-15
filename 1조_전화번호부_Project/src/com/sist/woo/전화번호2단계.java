package com.sist.woo;
import java.util.Scanner;
class phoneInfo2
{
	String name;
	String phone;
	String birth;

	public phoneInfo2(String name, String phone, String birth) 
	{
		// TODO 자동 생성된 생성자 스텁
		this.name=name;
		this.phone=phone;
		if(birth==null)
		this.birth=null;
		else
			this.birth=birth;
	}

	public void printInfo()
	{
		System.out.println("입력된 정보 출력 ");
		System.out.println("이름 : "+this.name);
		System.out.println("번호 : "+this.phone);
		System.out.println("생일 : "+this.birth);
	}
}
public class 전화번호2단계 {

		Scanner scan=new Scanner(System.in);
		public void phoneInfo()
		{
			System.out.println("이름을 입력하세요 : ");
			String name=scan.nextLine();
			System.out.println("전화번호를 입력하세요 : ");
			String phone=scan.nextLine();
			System.out.println("생년월일을 입력하세요 : ");
			String birth=scan.nextLine();
			
			phoneInfo2 info=new phoneInfo2(name,phone,birth);
			System.out.println("입력된 값 출력 : ");
			info.printInfo();
		}
		
	
	public static void main(String[] args) 
	{
		// TODO 자동 생성된 메소드 스텁
		전화번호2단계 phone=new 전화번호2단계();
		phone.phoneInfo();
		
	}
}
