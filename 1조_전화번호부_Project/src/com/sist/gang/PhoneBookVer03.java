package com.sist.gang;
import java.util.Scanner;
class PhoneInfo
{
	String name;
	String phoneNumber;
	String birth;
	public PhoneInfo(String name,String phoneNumber,String birth)
	{
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birth=birth;
	}
	public PhoneInfo(String name,String phoneNumber)
	{
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birth=null;
	}
	public void ShowPhoneInfo()
	{
		System.out.println("name: "+name);
		System.out.println("PhoneNumber: "+phoneNumber);
		if(birth!=null)
			System.out.println("birth: "+birth);
		
		System.out.println(" ");//데이터 구분을 위해
	}
	
}
class PhoneBookManager
{
	final int MAX_CNT=100;
	PhoneInfo[] infoStorage=new PhoneInfo[MAX_CNT];
	int curCNT=0;
	
	public void inputData()
	{
		System.out.println("데이터를 입력합니다.");
		System.out.print("이름: ");
		String name=MenuViewer.scan.nextLine();
		System.out.print("전화번호: ");
		String phoneNumber=MenuViewer.scan.nextLine();
		System.out.print("생년월일: ");
		String birth=MenuViewer.scan.nextLine();
		
		infoStorage[curCNT++]=new PhoneInfo(name,phoneNumber,birth);
		System.out.println("데이터 입력이 완료되었습니다.\n");
	}
	public void searchData()
	{
		System.out.println("데이터를 검색합니다.");
		System.out.println("이름: ");
		String name=MenuViewer.scan.nextLine();
		int dataIdx=search(name);
		if(dataIdx<0)
			System.out.println("해당 데이터가 존재하지 않습니다.\n");
		else
		{
			infoStorage[dataIdx].ShowPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다.\n");
		}
		
	}
	public void deleteData()
	{
		System.out.println("데이터를 삭제합니다.");
		System.out.println("이름: ");
		String name=MenuViewer.scan.nextLine();
		int dataIdx=search(name);
		if(dataIdx<0)
			System.out.println("해당 데이터가 존재하지 않습니다.\n");
		else
		{
			for(int idx=dataIdx;idx<(curCNT-1);idx++)
				infoStorage[idx]=infoStorage[idx+1];
			curCNT--;
			System.out.println("데이터 삭제가 완료되었습니다.\n");
		}
	}
	
	private int search(String name)
	{
		for(int idx=0;idx<curCNT;idx++)
		{
			PhoneInfo curInfo=infoStorage[idx];
			if(name.compareTo(curInfo.name)==0)
				return idx;
		}
		return -1;
	}
}

class MenuViewer
{
	public static Scanner scan=new Scanner(System.in);
	
	public static void showMenu()
	{
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4.프로그램 종료");
		System.out.println("선택: ");
	}
}

public class PhoneBookVer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBookManager manager=new PhoneBookManager();
		int choice;
		
		while(true)
		{
			MenuViewer.showMenu();
			choice=MenuViewer.scan.nextInt();
			MenuViewer.scan.nextLine();
			
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
					System.out.println("프로그램을 종료합니다.\n");
					return;
			}
		}
	}

}

