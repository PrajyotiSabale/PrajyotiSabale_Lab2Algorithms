package com.gl.driver;

import java.util.Scanner;

import com.gl.service.Transactions;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transactions transaction = new Transactions();
		int transactionArr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		transactionArr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the values of the array " + (i + 1));
			transactionArr[i] = sc.nextInt();
		}

		System.out.println("Enter the number of targets that needs to be acheived");
		int noOfTargets = sc.nextInt();
		for (int j = 0; j < noOfTargets; j++) {
			System.out.println("Enter the target value");
			int target = sc.nextInt();
			int transactionNumber = transaction.istargetAcheived(transactionArr, target);
			if (transactionNumber == -1) {
				System.out.println("Target is not acheived");
			} else {
				System.out.println("Target acheived after " + transactionNumber + " transaction");
			}
		}
		sc.close();
	}
}
