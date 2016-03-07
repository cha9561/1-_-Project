package com.sist.woo;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.io.*;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.event.*;
import javax.swing.border.*;

interface INIT_MENU
{
	int INPUT=1, EXIT=2;
}
interface 	INPUT_SELECT
{
	int NORMAL=1, UNIV=2, COMPANY=3;
}

class MenuChoiceExceptuion extends Exception
{
	int wrongChoice;
	
	public MenuChoiceExceptuion(int choice)
	{
		super("잘못된 선택이 이뤄졌습니다.");
		wrongChoice=choice;
	}
	public void showWrongChoice()
	{
		System.out.println(wrongChoice+"에 해당하는 선택은 존재하지 않습니다.");
	}
}

public class PhoneInfo {
	String name;
	String phoneNumber;
	
	/*public PhoneInfo(String name, String num, String birth)
	{
		this.name=name;
		phoneNumber=num;
		
	}*/
	public PhoneInfo(String name, String num)
	{
		this.name=name;
		phoneNumber=num;
	}
	
	public void showPhoneInfo()
	{
		System.out.println("name :"+name);
		System.out.println("phone :"+phoneNumber);
	}
	public String toString()
	{
		return"name : "+name+'\n'+"phone : "+phoneNumber+'\n';
	}
	
	public int hashcode()
	{
		return name.hashCode();
	}
	
	public boolean equals(Object obj)
	{
		PhoneInfo cmp=(PhoneInfo)obj;
		if(name.compareTo(cmp.name)==0)
			return true;
		else
			return false;
	}
}
class PhoneUnivInfo extends PhoneInfo
{
	String major;
	int year;
	
	public PhoneUnivInfo(String name, String num, String major, int year) {
		super(name, num);
		this.major=major;
		this.year=year;
		// TODO 자동 생성된 생성자 스텁
	}
	
	public void showPhoneInfo()
	{
		super.showPhoneInfo();
		System.out.println("major : "+major);
		System.out.println("year : "+year);
	}
	
	public String toString()
	{
		return super.toString()+"major : "+major+'\n'+"year : "+year+'\n';
	}
	
}
class PhoneCompanyInfo extends PhoneInfo
{
	String company;
	public PhoneCompanyInfo(String name, String num, String company) {
		super(name, num);
		// TODO 자동 생성된 생성자 스텁
		this.company=company;
	}
	public void showPhoneinfo()
	{
		super.showPhoneInfo();
		System.out.println("company : "+company);
	}
	public String toString()
	{
		return super.toString()+"company : "+company+'\n';
	}
}

class PhoneBookManager
{
	//final int MAX_CNT=100;
	//PhoneInfo[] infoStorage=new PhoneInfo[MAX_CNT];
	//int curCnt=0;
	private final File dataFile=new File("PhoneBook.dat");
	HashSet<PhoneInfo> infoStorage=new HashSet<PhoneInfo>();
	
	static PhoneBookManager inst=null;
	public static PhoneBookManager createManagerInst()
	{
		if(inst==null)
			inst=new PhoneBookManager();
		
		return inst;
	}
	
	private PhoneBookManager()
	{
		readFormFile();
	}
	
	private PhoneInfo readFriendInfo()
	{
		System.out.println("이름 : ");
		String name=MenuViewer.scan.nextLine();
		System.out.println("전화번호 : ");
		String phone=MenuViewer.scan.nextLine();
		return new PhoneInfo(name, phone);
	}
	
	private PhoneInfo readUnivFriendInfo()
	{
		System.out.println("이름 : ");
		String name=MenuViewer.scan.nextLine();
		System.out.println("전화번호 : ");
		String phone=MenuViewer.scan.nextLine();
		System.out.println("전공 : ");
		String major=MenuViewer.scan.nextLine();
		System.out.println("학년 : ");
		int year=MenuViewer.scan.nextInt();
		MenuViewer.scan.nextLine();
		return new PhoneUnivInfo(name, phone, major, year);
	}
	
	private PhoneInfo readCompanyFriendInfo()
	{
		System.out.println("이름 : ");
		String name=MenuViewer.scan.nextLine();
		System.out.println("전화번호 : ");
		String phone=MenuViewer.scan.nextLine();
		System.out.println("회사 : ");
		String company=MenuViewer.scan.nextLine();
		return new PhoneCompanyInfo(name, phone, company);
	}
	
	public void inputData() throws MenuChoiceExceptuion
	{
		System.out.println("데이터 입력을 시작합니다..");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택>>");
		int choice=MenuViewer.scan.nextInt();
		MenuViewer.scan.nextLine();
		PhoneInfo info=null;
	
		if(choice<INPUT_SELECT.NORMAL || choice>INPUT_SELECT.COMPANY)
			throw new MenuChoiceExceptuion(choice);
		
		switch(choice)
		{
		case INPUT_SELECT.NORMAL:
			info=readFriendInfo();
			break;
		case INPUT_SELECT.UNIV:
			info=readUnivFriendInfo();
			break;
		case INPUT_SELECT.COMPANY:
			info=readCompanyFriendInfo();
			break;
		}
		//infoStorage[curCnt++]=info;
		boolean isAdded=infoStorage.add(info);
		if(isAdded==true)
		System.out.println("데이터 입력이 완료되었습니다. \n");
		else 
			System.out.println("이미 저장된 데이터 입니다. \n");
	}
	
	public String searchData(String name)
	{
		/*System.out.println("데이터 검색을 시작합니다..");
		
		System.out.print("이름 : ");
		String name=MenuViewer.scan.nextLine();*/
		/*
		int dataIdx=search(name);
		if(dataIdx<0)
		{
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
			
		}
		else
		{
			infoStorage[dataIdx].showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다. \n");
		}
		*/
		PhoneInfo info=search(name);
		if(info==null)
			return null;
		else
			return info.toString();
	}
	
	public boolean deleteData(String name)
	{
		/*System.out.println("데이터 삭제를 시작합니다..");
		
		System.out.println("이름 : ");
		String name=MenuViewer.scan.nextLine();*/
		/*
		int dataIdx=search(name);
		if(dataIdx<0)
		{
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		}
		else
		{
			for(int idx=dataIdx; idx<(curCnt-1); idx++)
				infoStorage[idx]=infoStorage[idx+1];
			
			curCnt--;
			System.out.println("데이터 삭제가 완료되었습니다. \n");
		}
		*/
		Iterator<PhoneInfo> itr=infoStorage.iterator();
		while(itr.hasNext())
		{
			PhoneInfo curInfo=itr.next();
			if(name.compareTo(curInfo.name)==0)
			{
				itr.remove();
				//System.out.println("데이터 삭제가 완료되었습니다. \n");
				return true;
			}
		}
		return false;
	}
	private PhoneInfo search(String name)
	{
		/*
		for(int idx=0; idx<curCnt; idx++)
		{
			PhoneInfo curInfo=infoStorage[idx];
			if(name.compareTo(curInfo.name)==0)
				return idx;
		}
		*/
		Iterator<PhoneInfo> itr=infoStorage.iterator();
		while(itr.hasNext())
		{
			PhoneInfo curInfo=itr.next();
			if(name.compareTo(curInfo.name)==0)
				return curInfo;
		}
		return null;
	}
	public void storeToFile()
	{
		try
		{
			FileOutputStream file=new FileOutputStream(dataFile);
			ObjectOutputStream out=new ObjectOutputStream(file);
			
			Iterator<PhoneInfo> itr=infoStorage.iterator();
			while(itr.hasNext())
				out.writeObject(itr.next());
			
			out.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void readFormFile()
	{
		if(dataFile.exists()==false)
			return;
		try
		{
			FileInputStream file=new FileInputStream(dataFile);
			ObjectInputStream in=new ObjectInputStream(file);
			
			while(true)
			{
				PhoneInfo info=(PhoneInfo)in.readObject();
				if(info==null)
					break;
				infoStorage.add(info);
			}
			in.close();
		}catch(IOException e)
		{
			return;
		}
		catch(ClassNotFoundException e)
		{
			return;
		}
	}
}



class MenuViewer
{
	static Scanner scan=new Scanner(System.in);
	
	public static void showMenu()
	{
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		//System.out.println("2. 데이터 검색");
		//System.out.println("3. 데이터 삭제");
		System.out.println("2. 프로그램 종료");
		System.out.println("선택 : ");
	}
}
class SearchEventHandler implements ActionListener
{
	JTextField searchField;
	JTextArea textArea;
	
	public SearchEventHandler(JTextField field,JTextArea area)
	{
		// TODO 자동 생성된 생성자 스텁
		searchField=field;
		textArea=area;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO 자동 생성된 메소드 스텁
		String name=searchField.getText();
		PhoneBookManager manager=PhoneBookManager.createManagerInst();
		String srchResult=manager.searchData(name);
		if(srchResult==null)
		{
			textArea.append("해당하는 데이터가 존재하지 않습니다.\n");
		}
		else
		{
			textArea.append("찾으시는 정보를 알려드립니다. \n");
			textArea.append(srchResult);
			textArea.append("\n");
		}
		
	}
	
}
class DeleteEventHandler implements ActionListener
{
	JTextField delField;
	JTextArea textArea;
	public DeleteEventHandler(JTextField field, JTextArea area)
	{
		// TODO 자동 생성된 생성자 스텁
		delField=field;
		textArea=area;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO 자동 생성된 메소드 스텁
		String name=delField.getText();
		PhoneBookManager manager=PhoneBookManager.createManagerInst();
		boolean isDeleted=manager.deleteData(name);
		if(isDeleted)
			textArea.append("데이터 삭제를 완료하였습니다. \n");
		else
			textArea.append("해당하는 데이터가 존재하지 않습니다. \n");
	}
	
}
class searchDelFrame extends JFrame
{
	JTextField srchField=new JTextField(15);
	JButton srchBtn=new JButton("SEARCH");
	
	JTextField delField=new JTextField(15);
	JButton delBtn=new JButton("DEL");
	
	JTextArea textArea=new JTextArea(20,25);
	
	public searchDelFrame(String string) {
		// TODO 자동 생성된 생성자 스텁
	}

	public searchDelFrame()
	{
		//super(title);
		setBounds(100,200,330,450);
		setLayout(new BorderLayout());
		Border border=BorderFactory.createEtchedBorder();
		
		Border srchBorder=BorderFactory.createTitledBorder(border,"Search");
		JPanel srchPanel=new JPanel();
		srchPanel.setBorder(srchBorder);
		srchPanel.setLayout(new FlowLayout());
		srchPanel.add(srchField);
		srchPanel.add(srchBtn);
		
		Border delBorder=BorderFactory.createTitledBorder(border,"Delete");
		JPanel delPanel=new JPanel();
		delPanel.setBorder(delBorder);
		delPanel.setLayout(new FlowLayout());
		delPanel.add(delField);
		delPanel.add(delBtn);
		
		JScrollPane scrollTextArea=new JScrollPane(textArea);
		Border textBorder=BorderFactory.createTitledBorder(border,"Information Board");
		scrollTextArea.setBorder(textBorder);
		
		add(srchPanel,BorderLayout.NORTH);
		add(delPanel,BorderLayout.SOUTH);
		add(scrollTextArea, BorderLayout.CENTER);
		
		srchBtn.addActionListener(new SearchEventHandler(srchField, textArea));
		delBtn.addActionListener(new DeleteEventHandler(delField, textArea));
		
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}

class PhoneBook
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBookManager manager=PhoneBookManager.createManagerInst();
		searchDelFrame winframe=new searchDelFrame("PhoneBook");
		int choice;
		
		while(true)
		{
			try
			{
			MenuViewer.showMenu();
			choice=MenuViewer.scan.nextInt();
			MenuViewer.scan.nextLine();
			
			if(choice<INIT_MENU.INPUT || choice>INIT_MENU.EXIT)
				throw new MenuChoiceExceptuion(choice);
			
			switch(choice)
			{
			case INIT_MENU.INPUT:
				manager.inputData();
				break;
			/*case INIT_MENU.SEARCH:
				manager.searchData();
				break;
			case INIT_MENU.DELETE:
				manager.deleteData();
				break;*/
			case INIT_MENU.EXIT:
				manager.storeToFile();
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				return;
			}
			}catch(MenuChoiceExceptuion e)
			{
				e.showWrongChoice();
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다. \n");
			}
		}
	}
}
