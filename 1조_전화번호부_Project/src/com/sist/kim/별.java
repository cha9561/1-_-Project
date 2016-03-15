package com.sist.kim;

public class 별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--){ // 행
			for(int j=1;j<=(6-i);j++){ //공 백
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=2; i<6; i++){ // 행
			for(int j=i;j<6;j++){ //공 백
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
