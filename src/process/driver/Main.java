package process.driver;

import java.util.Scanner;

import process.transaction.MoneyTransaction;

public class Main {

	public static void main(String[] args) {
				
			System.out.println("Enter the size of Array : ");
			Scanner sc=new Scanner(System.in);
			int size= sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the values");
			for (int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the total number of targets :");
			int num=sc.nextInt();
			
			for (int i=0;i<num;i++) {
			System.out.println("Enter the value of target : ");
			int target=sc.nextInt();
			MoneyTransaction tran=new MoneyTransaction();
			tran.transactions(arr,target);
			sc.close();
			}
			
		}


	}


