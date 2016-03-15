package com.sist.cha;

import java.util.Scanner;

class PhoneInfo{
	String name;
	String phoneNumber;
	String birthday;
	
	public PhoneInfo(String name, String pN, String birth) {
		this.name=name;
		this.phoneNumber=pN;
		this.birthday=birth;
	}
	public PhoneInfo(String name, String pN) {
		this(name, pN, null);
	}
	void printInfom()
	{
		System.out.println("입력된 정보 출력 ...");
		System.out.println("이름 :"+this.name);
		System.out.println("전화번호 :"+this.phoneNumber);
		System.out.println("생년월일 :"+this.birthday);
	}
}
class PhoneManager{
	Scanner scan=new Scanner(System.in);
	static PhoneInfo [] pList= new PhoneInfo[100];
	int userCount=0;
	void insert()
	{
		String name;
		String pN;
		String birth;
		System.out.println("데이터 입력을 시작합니다...");
		while(true)
		{
			System.out.print("이름 : ");
			name=scan.next();
			if(nameSearch(name)<userCount)
			{
				System.out.println("이름이 중복되어 입력할수 없습니다.");
				continue;
			}
			break;
		}		
		System.out.print("전화번호: ");
		pN=scan.next();
		System.out.print("생년월일: ");
		birth=scan.next();
		PhoneInfo pI= new PhoneInfo(name, pN, birth);
		pList[userCount]=pI;
		userCount++;
		System.out.println("데이터 입력을 성공하였습니다.");
	}
	void search()
	{
		System.out.println("데이터 검색을 시작합니다...");
		System.out.print("이름 : ");
		String name=scan.next();
		int num=nameSearch(name);
		if(num>=userCount)
			System.out.println("정보를 찾을수 없습니다.");
		else
			pList[num].printInfom();
		System.out.println("데이터 검색이 끝났습니다.");
	}
	void delete()
	{
		System.out.println("데이터 삭제를 시작합니다...");
		System.out.print("이름 : ");
		String name=scan.next();
		int num=nameSearch(name);
		
		if(num>=userCount)
			System.out.println("정보를 찾을수 없습니다.");
		else
		{
			for(int i=num; i<userCount; i++)
			{
				if(i+1 >= userCount)
					pList[i]=null;
				else
					pList[i]=pList[i+1];
			}
		}
		userCount--;
		System.out.println("데이터 삭제가 끝났습니다.");
	}
	int nameSearch(String name)
	{
		int num=0;
		for(int i=0; i<userCount; i++)
		{
			if(name.equals(pList[i].name))
			{
				return num;
			}
			num++;
		}
		return num;
	}
}
public class PhoneBookVer01 {
	public static void selMenu()
	{
		System.out.println("선택하세요...");
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4.프로그램 종료");
		System.out.print("선택 : ");
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		PhoneManager man=new PhoneManager();
		while(true)
		{
			selMenu();
			int select=scan.nextInt();
			switch (select) {
			case 1:
				man.insert();
				break;
			case 2:
				man.search();
				break;
			case 3:
				man.delete();
				break;
			case 4:
				System.out.println("프로그램 종료합니다");
				return;
			default:
				System.out.println("1~4 중 선택하시오");
			}
		}
	}

}

