package com.sist.kim;
import java.util.Scanner;


public class Ver03 {
	
	class PhoneInfo
	{
		String name;
		String PhoneNumber;
		String birth;

		public PhoneInfo(String name,String num,String birth)
		{
			this.name=name;
			this.PhoneNumber=num;
			this.birth=birth;
		}

		public PhoneInfo(String name,String num)
		{
			this.name=name;
			this.PhoneNumber=num;
			this.birth=null;
		}

		public void showPhoneInfo()
		{
			System.out.println("name : "+name);
			System.out.println("phone : "+PhoneNumber);
			if(birth!=null)
			{
				System.out.println("birth : "+birth);
			}
			System.out.println();
		}
	}

	class PhoneBookManager
	{
		final int MAX_CNT=100;
		PhoneInfo[] infoStorage=new PhoneInfo[MAX_CNT];
		int curCnt=0;

		public void inputData()
		{
			System.out.println("데이터 이볅을 시작합니다!!");

			System.out.print("이름 : ");
			String name=MenuViewer.keybord.nextLine();
			System.out.print("전화번호 : ");
			String phone=MenuViewer.keybord.nextLine();
			System.out.print("생년월일 : ");
			String birth=MenuViewer.keybord.nextLine();

			infoStorage[curCnt++]=new PhoneInfo(name,phone,birth);
			System.out.println("데이터 입력이 완료되었습니다.\n");
		}
		public void searchData()
		{
			System.out.println("데이터 검색을 시작합니다!");
			System.out.print("이름 : ");
			String name=MenuViewer.keybord.nextLine();

			int dataIdx=search(name);
			if(dataIdx<0)
			{
				System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
			}
			else
			{
				infoStorage[dataIdx].showPhoneInfo();
				System.out.println("데이터 검색이 완료되었습니다.\n");
			}
		}
		public void deleteData()
		{
			System.out.println("데이터를 삭제합니다!!");
			System.out.print("이름 : ");
			String name =MenuViewer.keybord.nextLine();
			int dataIdx=search(name);
			if(dataIdx<0)
			{
				System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
			}
			else
			{
				for(int idx=dataIdx;idx<(curCnt-1);idx++)
					infoStorage[idx]=infoStorage[idx+1];
				curCnt--;
				System.out.println("데이터 삭제가 완료되었습니다.\n");
			}
		}
		private int search(String name)
		{
			for(int idx=0;idx<curCnt;idx++)
			{
				PhoneInfo curInfo=infoStorage[idx];
				if(name.compareTo(curInfo.name)==0)
					return idx;
			}
			return -1;
		}
	}
	static class MenuViewer
	{
		public static Scanner keybord=new Scanner(System.in);

		public static void showMenu()
		{
			System.out.println("선택하세요!");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 데이터 검색");
			System.out.println("3. 데이터 삭제");
			System.out.println("4. 프로그램 종료");
			System.out.println("선택 : ");
		}
	}
		
	class ver03{
		public void main(String[] args) {
			
			PhoneBookManager manager = new PhoneBookManager();
			int choce;

			while(true)
			{
				MenuViewer.showMenu();
				choce=MenuViewer.keybord.nextInt();
				MenuViewer.keybord.nextLine();

				switch(choce)
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
					System.out.println("프로그램을 종료합니다!");
					return;
				}
			}
		}
	}
}
	
	
	

