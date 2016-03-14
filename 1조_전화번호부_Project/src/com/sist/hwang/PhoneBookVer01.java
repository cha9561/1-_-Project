package com.sist.hwang;
/*
 * 희라 메인 Class
 */
import java.util.Scanner;

class PhoneInfo
{
	static Scanner scan=new Scanner(System.in);
	String name;
	String phoneNumber;
	String birthday;

	//생성자
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

	//입력
	public static void showMenu()
	{
		System.out.println("선택하세요");
		System.out.println("1.데이터입력");
		System.out.println("2.프로그램종료");
		System.out.print("선택 : ");
	}
	
	public static void inputInfo()
	{			
		//입력받기
			System.out.print("이름 : ");
			String name=scan.nextLine();			
			System.out.print("전화번호 : ");
			String phoneNumber=scan.nextLine();
			System.out.print("생년월일 : ");
			String birthday=scan.nextLine();	
			PhoneInfo person= new PhoneInfo(name,phoneNumber,birthday);
			person.printInfo();
	}

	
	//출력
	public void printInfo()
	{
		System.out.println("이름 :"+name);
		System.out.println("전화번호 :"+phoneNumber);
		if(birthday.equals(" "))
		{
			System.out.println("생년월일 :입력X");
		}
		else
		{
			System.out.println("생년월일 :"+birthday);
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
				System.out.println("프로그램을 종료합니다.");
				break;
			}
					}
		
	}

}





//add to index -> commit -> (remote -> fetch from) -> push (add all branches spec)
//패치 다음에 받아온게 있으면 바로 푸쉬 하지 말고 ! ** merge -> add to index -> commit -> push 