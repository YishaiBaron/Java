/* ***********************
 * Name: Netanel Draiman *
 * ID#: 200752152        *
 *      Home Ex6         *
 *************************/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ExpensesTester {
	
	private static final String String = null;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opt = 0;
		boolean isLegal; //flag for Main menu Loop.
		
		do { //Main Loop - Main Menu.
			isLegal = true;
			System.out.println("*** Main Menu ***\nChoose Option: \n1. Add Expense \n2. Search \n3. Exit");
			opt = scan.nextInt();
			if (opt < 1 || opt > 3) {
				isLegal = false;
				continue; //returns to main menu
			}
			
			/********* Add Expense **************/
			if (opt == 1) {
				double amount=0;
				String description;
				Date date = new Date();
				boolean legalFormat; //flag for legal Date format
				SimpleDateFormat df = new SimpleDateFormat("dd.mm.yyyy");
				
				System.out.println("Please enter the following information:");
				
				do { //checking for legal date format
					System.out.println("Enter Date of The Expense: (format: dd.mm.yyyy)");
					String dateString;
					legalFormat = true;
					dateString = scan.next();
					try {
						date = df.parse(dateString);
					} catch (ParseException e) {
						System.out.println("Error! wrong date format!!");
						legalFormat = false; 
					}
				}while (!legalFormat);
				
				do { //checking legal amount
					System.out.println("Enter Amount of the Expense:");
					amount = scan.nextDouble();
					if(amount <= 0) {
						System.out.println("Error! illegal amount, must be larger than zero.");
					}
				} while (amount <=0);
				
				
				System.out.println("Enter Expense Description:");
				description = scan.next();
				
				Expense e = new Expense(amount, description, date);
				try {
					ExpenseDB.addExpense(e);
				} catch (AddException e1) {
					System.out.println("Error in Adding Expense");
					isLegal = false;
					continue; //returns to main menu
				}
				System.out.println("Adding Expense was Successful!");
				
				//after adding Expense returns to main menu
				isLegal = false;
				continue;
			}
			
			/********* Search **************/
			if (opt == 2) { 
				int searchOpt=0;
				String criteria;
				boolean legalCriteria; //flag for Legal search Criteria:  <, >, =.
				do {
					System.out.println("Choose Search Option:\n1. By Amount \n2. By Date");
					searchOpt = scan.nextInt();
				} while (searchOpt < 1 || searchOpt > 2);
					
				///////Search by Amount//////////
				if (searchOpt == 1) {
					double searchAmount=0;
					
					do { //checking legal input for amount
						System.out.println("Enter Amount:");
						searchAmount = scan.nextDouble();
					} while (searchAmount <= 0);
					
					do { //checking legal input for search criteria
						legalCriteria = true;
						System.out.println("Please Enter Search parameter: (< , > , = )");
						criteria = scan.next();
						if (!criteria.equals("<") && !criteria.equals(">") && !criteria.equals("="))
							legalCriteria=false;
					} while (!legalCriteria);
					
					ArrayList<Expense> temp = ExpenseDB.getExpensesByAmount(searchAmount, criteria);
					if (temp == null || temp.isEmpty()) {
						System.out.println("There are no Expenses Matching your Search Criteria");
						isLegal=false;
						continue; //returns to main menu
					}
					System.out.println("---------------------------");
					for (int i=0; i < temp.size(); i++)
						System.out.println(temp.get(i));
					System.out.println("---------------------------");
				}
				
			    ///////Search by Date///////
				if (searchOpt == 2) {
					boolean legalFormat; //flag for legal Date format
					Date date = new Date();
					SimpleDateFormat df = new SimpleDateFormat("dd.mm.yyyy");
					do { //checking legal date format
						System.out.println("Enter Date of The Expense: (format: dd.mm.yyyy)");
						String dateString;
						legalFormat = true;
						dateString = scan.next();
						try {
							date = df.parse(dateString);
						} catch (ParseException e) {
							System.out.println("Error! wrong date format!!");
							legalFormat = false;
						}
					}while (!legalFormat);
					
					do { //checking legal input for search criteria
						legalCriteria = true;
						System.out.println("Please Enter Search parameter: (< , > , = )");
						criteria = scan.next();
						if (!criteria.equals("<") && !criteria.equals(">") && !criteria.equals("="))
							legalCriteria=false;
					} while (!legalCriteria);
					
					ArrayList<Expense> temp = ExpenseDB.getExpensesByDate(date, criteria);
					if (temp == null || temp.isEmpty()) {
						System.out.println("There are no Expenses Matching your Search Criteria");
						isLegal=false;
						continue; //returns to main menu
					}
					System.out.println("---------------------------");
					for (int i=0; i < temp.size(); i++) {
						System.out.println(temp.get(i));
					}
					System.out.println("---------------------------");
				}
				
				//after searching, returns to main menu.
				isLegal=false;
				continue;
			}
			
			/********* Exit **************/
			if (opt == 3)
				break;
			
		} while (!isLegal);
		
		scan.close();
	}

}
