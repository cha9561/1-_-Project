package com.sist.kim;

public class �� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--){ // ��
			for(int j=1;j<=(6-i);j++){ //�� ��
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=2; i<6; i++){ // ��
			for(int j=i;j<6;j++){ //�� ��
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
