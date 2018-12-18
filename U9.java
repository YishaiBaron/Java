/*
	This program is going to process homework and test grades for a course.
	Read input file in the form:
	hw1 hw2 hw3 hw4 ... hw10 midterm final
	one line per student
	first line has
	#hw maxhw maxmidterm maxfinal
	at most 150 students
*/

import java.io.*;
import java.util.*;

public class U9
{
public static void main(String[] args) throws IOException
{
	final int MAXSIZE = 50;
	final int HWPERCENT = 30;
	final int MIDPERCENT = 20;
	final int FINALPERCENT = 50;
	
	Scanner kb = new Scanner(System.in);
	System.out.println("enter input filename with grades data");
	String filename = kb.nextLine();
	Scanner infile = new Scanner(new FileReader(filename));
	
	// get initialization data from the input file
	int numHW = infile.nextInt();
	double maxHW = infile.nextDouble();
//	int maxMid = infile.nextInt();
// int maxFinal = infile.nextInt();
	int maxMid = 100;
	int maxFinal = 100;
		
	// set up arrays for scores
	double[][] hwgrades = new double[MAXSIZE][numHW];
	int[] midterms = new int[MAXSIZE];
	int[] finals = new int[MAXSIZE];
	int students = 0;
	double grade;
		
	// get scores from the input file
	// for every student (line in the file)
		// read numHW homework scores
		// read midterm
		// read final
	
	while (infile.hasNext())
	{
		for (int count=0; count < numHW; count++)
		{
			hwgrades[students][count] = infile.nextDouble();
		}
		midterms[students] = infile.nextInt();
		finals[students] = infile.nextInt();
		
		students++;
	}
	System.out.println("there were " + students + " in the file");
	
	// compute course grades & display
	// for every student
		// compute HW grade
		// calculate course grade = HW * HWPERCENT + midterm*MIDPERCENT + final*FINALPERCENT
	for (int s=0; s < students; s++)
	{
		grade = hwGrade(hwgrades[s],maxHW) * HWPERCENT/100.0;
		grade += midterms[s] * MIDPERCENT / 100.0;
		grade += finals[s] * FINALPERCENT / 100.0;
		System.out.println("course grade for student " + (s+1) + ": " + grade);
	}
	
	System.out.print("enter hw # to average 1-" + numHW + ": ");
	int hwnum = kb.nextInt() - 1;
	grade = 0;
	for (int s=0; s < students; s++)
	{
		grade += hwgrades[s][hwnum];
	}
	System.out.println("average is " + grade / students);
	
	// print all homework scores, one homework per line
	for (hwnum=0; hwnum < numHW; hwnum++)
	{
		for (int s=0; s < students; s++)
			System.out.printf("%5.1f", hwgrades[s][hwnum]);
		System.out.println();
	}
	System.out.println();
	
	// print the normal hw table
	print2D(hwgrades);
}

/**
	Compute homework grade (out of 100) for one student.
	@param hws the homework grades for that student
	@param max the max homework value
	@return the hw grade computed

*/
public static double hwGrade(double[] hws, double max)
{
	double result = 0;
	for (int i=0; i < hws.length; i++)
		result = result + hws[i];
	result = result / hws.length;  // average
	result = result / max;  // normalized
	return result * 100;
}

public static void print2D(double[][] ra2d)
{
	System.out.println(ra2d.length);  // # of rows
	System.out.println(ra2d[0].length);  // # of cols

	for (int row=0; row < ra2d.length; row++)
	{	for (int col=0; col < ra2d[row].length; col++)
			System.out.printf("%5.1f", ra2d[row][col]);
		System.out.println();
	}
}

}