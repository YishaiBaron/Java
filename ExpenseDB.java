import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ExpenseDB {
	private final static File DB = new File("C:\\Expenses.dat");
	public static void addExpense(Expense ex) throws AddException {
		if (!DB.canWrite()) //write ability check
			return;
		try { //rewriting all existing Expenses then writing the new Expense
			ArrayList<Expense> arr = getAllExpenses();
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DB)); 
			if (arr != null || !arr.isEmpty()) {
				for (int i=0; i < arr.size(); i++) {
					out.writeObject(arr.get(i));
				}
			}
			out.writeObject(ex);
			out.close();
		}
		catch (IOException e) {
			AddException ae = new AddException();
			throw ae;
		}
	}
	private static ArrayList<Expense> getAllExpenses() {
		if (!DB.canRead()) //read ability check
			return null;
		try { //Retrieving all Expenses
			ArrayList<Expense> arr = new ArrayList<Expense>();
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream(DB));
			while(true) {
				try {
					arr.add((Expense) oin.readObject());
				}
				catch (EOFException e) {
					break;
				}
				catch (ClassNotFoundException e) {
					oin.close();
					return null;
				}
			}
			oin.close();
			return arr;
		}  
		catch (IOException e) {
			return null;
		}
	}
	
	public static ArrayList<Expense> getExpensesByAmount(double amount, String criteria) {
		ArrayList<Expense> temp = getAllExpenses();
		ArrayList<Expense> arr = new ArrayList<Expense>();
		
		//Returning all Expenses matching criteria
		if (criteria.equals("=")) {
			for (Expense e : temp) {
				if (e.getAmount() == amount)
					arr.add(e);
			}
		}
		else if (criteria.equals("<")) {
			for (Expense e : temp) {
				if (e.getAmount() < amount)
					arr.add(e);
			}
		}
		else if (criteria.equals(">")) {
			for (Expense e : temp) {
				if (e.getAmount() > amount)
					arr.add(e);
			}
		}
		return arr;
	}
	
	public static ArrayList<Expense> getExpensesByDate(java.util.Date d, String criteria) {
		ArrayList<Expense> temp = getAllExpenses();
		ArrayList<Expense> arr = new ArrayList<Expense>();
		
		//Returning all Expenses matching criteria
		if (criteria.equals("=")) {
			for (Expense e : temp) {
				if (e.getDate().equals(d))
					arr.add(e);
			}
		}
		else if (criteria.equals(">")) {
			for (Expense e : temp) {
				if (e.getDate().after(d))
					arr.add(e);
			}
		}
		else if (criteria.equals("<")) {
			for (Expense e : temp) {
				if (e.getDate().before(d))
					arr.add(e);
			}
		}
		return arr;
	}
	
}
