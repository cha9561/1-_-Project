package com.sist.woo;
import java.util.Scanner;
class PhoneInfo3
{
	String name;
	String phone;
	String birth;

	public PhoneInfo3(String name, String phone, String birth) 
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
		System.out.println("이름 : "+name);
		System.out.println("번호 : "+phone);
		System.out.println("생일 : "+birth);
		System.out.println();
	}
}
class PhoneBookManage
{
	PhoneInfo3[] infoStorage=new PhoneInfo3[100];
	int Cnt=0;
	public void inputData()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name=scan.nextLine();
		System.out.println("전화번호를 입력하세요 : ");
		String phone=scan.nextLine();
		System.out.println("생년월일을 입력하세요 : ");
		String birth=scan.nextLine();
		
		infoStorage[Cnt++]=new PhoneInfo3(name,phone,birth);
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	
	public void searchData()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("데이터 겁색을 시작합니다");
		
		System.out.println("이름 : ");
		String name=scan.nextLine();
		
		int idx=search(name);
		if(idx<0)
			System.out.println("값이 존재하지 않습니다.");
		else
			infoStorage[idx].printInfo();
		System.out.println("데이터 검색이 완료되었습니다.");
	}
	public void deleteData()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("데이터 삭제를 시작합니다.");
		
		System.out.println("이름 : ");
		String name=scan.nextLine();
		
		int data=search(name);
		if(data<0)
			System.out.println("입력된 사람이 아닙니다");
		else
			for(int idx=data;idx<Cnt-1;idx++)
			infoStorage[idx]=infoStorage[idx+1];
		Cnt--;
		System.out.println("데이터 삭제가 완료되었습니다.");
		
	}
	private int search(String name)
	{
		for(int idx=0;idx<=Cnt;idx++)
		{
			PhoneInfo3 info=infoStorage[idx];
			if(name.compareTo(info.name)==0);
			return idx;
		}
		return -1;
	}
}
class Menu
{
	static Scanner scan=new Scanner(System.in);
	public static void menu()
	{
		System.out.println("전화번호부를 시작합니다. 사용할 기능릉 입력하세요.");
		System.out.println("1.전화번호부 입력");
		System.out.println("2.전화번호부 검색");
		System.out.println("3.전화번호부 삭제");
		System.out.println("4.프로그램 종료");
		System.out.println("선택 : ");
		
	}
}
public class PhoneBookVer3 {

	public static void main(String[] args) 
	{
		PhoneBookManage manager=new PhoneBookManage();
		int choice;
		while(true)
		{
			Menu.menu();
			choice=Menu.scan.nextInt();
			Menu.scan.nextLine();
			switch(choice)
			{
			case 1:
				manager.inputData();
				break;
			case 2:
				manager.searchData();
				break;
			case 3:
				manager.deleteData();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}
}
