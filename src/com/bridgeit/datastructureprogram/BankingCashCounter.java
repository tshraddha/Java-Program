package com.bridgeit.datastructureprogram;

import com.bridgeit.utility.Utility;

public class BankingCashCounter {

	private static int transcat;

	public static void main(String[] args) {

		System.out.println("Enter the length.");

		Utility utility = new Utility();

		int length = utility.inputInteger();

		Queue q = new Queue(length);
        int count=0;
        int transact=0;
		for (int i = 0; i <= length; i++) {
			System.out.println("1) Queue Number");

			System.out.println("2) Transaction");

			System.out.println("Enter the choice.");

			int choice = utility.inputInteger();
			if (choice == 1) 
			{
				//count++;
				q.queue(1);
			
				/*else
				{
					q.deQueue();
				}*/
				System.out.println("Person added in the queue");
				
			}

			else {
				if(q.empty())
				{
				
			    }
				else
				{
					q.transaction();
	               // transcat++;
				}
			
		}

		}
	}
}


