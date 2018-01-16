package edu.fju;

import java.util.Scanner;


public class VendingMachine {

	public static void main(String[] args) {
		int h = -1;
		while(h <0){
		int p = 0;
		System.out.println("請輸入金額或英文");
		System.out.println("目前餘額: + p");
		int n[] = {10,15,10,18,10,20,15,18};
		Scanner scanner = new Scanner(System.in);
int i = Integer.parseInt(scanner.nextLine());
switch(i){
case "a":
	if(n[0] <= p){
		p = p- n[0];
		System.out.println("Don!" + "餘額:");
	}else{
		System.out.println("Beep");
	}break;
case 1:
	p = p+1;

	}
	}
}
}