import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Expense implements Serializable {
private double amount;String description; Date eDate;
public Expense(double amount, String description, Date eDate) {
	setAmount(amount);
	setDescription(description);
	setDate(eDate);
}

/****** Get\Set Methods for Instance Variables *******/
public void setDate(Date eDate) {
	this.eDate = eDate;
}
public Date getDate () {
	return eDate;
}

public void setAmount (double amount) {
	this.amount = amount;
}
public double getAmount () {
	return amount;
}

public void setDescription (String description) {
	this.description = description;
}
public String getDescription () {
	return description;


}
public String toString() {
	String s;
	BigDecimal bd = new BigDecimal(getAmount());
	bd = bd.setScale(2, RoundingMode.HALF_UP);
	SimpleDateFormat df = new SimpleDateFormat("dd.mm.yyyy");
	s = df.format(getDate()) + " " + getDescription() + " " + bd;
	
	return s;



}
}
