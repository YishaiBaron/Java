import IllegalFormatException.IllegalFormatException;

/**
 * Created by רותם זליג on 26/06/2017.
 */

public class LinearFragment {
    private double Coefficient;
    public LinearFragment(double a) throws InvalidCoefficientException {
        if (a == 0)
            throw new InvalidCoefficientException("This coefficient is invalid ");
        this.Coefficient = a;
    }

    public double getCoefficient(){
        return Coefficient;
    }

    public void setCoefficient(double a) throws InvalidCoefficientException{
        if (a == 0)
            throw new InvalidCoefficientException("This coefficient is invalid ");
        this.Coefficient = a;
    }

    public String toString(){
        if(Coefficient==1)
            return "x";
        else if(Coefficient==-1)
            return "-x";
        else
            return Coefficient+"x";
    }

    public static LinearFragment parseFragment(String s) throws IllegalFormatException{

        double newNumber = 0;
        String temp = "";
        int counterx = 0 , counterMu = 0 ,counterMi = 0 , counterPoint=0;
        final char SPACE = ' ' ;
        if(s.isEmpty()==true)
            throw new IllegalFormatException(" you must enter number");

        for (int i=0 ; i<s.length()-1 ; i++){ // תנאי קיצון מתי זה לא טוב בכללי
            if (s.charAt(i) > 32 && s.charAt(i) < 42 || s.charAt(i) > 42 && s.charAt(i) < 45 || s.charAt(i) == '/' ||
                    s.charAt(i) > 57 & s.charAt(i) < 120 || s.charAt(i) > 120 && s.charAt(i) < 128 || s.charAt(i) == SPACE)
                throw new IllegalFormatException(" Your number is invalid ");
            if(s.charAt(i) == 'x')
                counterx++;
            if(s.charAt(i)== '-')
                counterMi++;
            if(s.charAt(i) == '*')
                counterMu++;
            if(s.charAt(i) == '.')
                counterPoint++;
            if(counterMi>1 || counterMu >1 || counterx>1 || counterPoint>1)
                throw new IllegalFormatException(" Your number is invalid");
            if(s.charAt(i)== '*' && s.charAt(i+1) != 'x')
                throw new IllegalFormatException(" Your number is invalid");

        }
        if(s.charAt(s.length()-1) != 'x')
            throw new IllegalFormatException(" you must enter x");
        else if ( s.charAt(s.length()-1) == 'x' && (s.charAt(0)== '-') && s.length()==2)
            temp = "-1";
        else if ( s.charAt(0) == 'x' && s.length() == 1 )
            temp = "1";
        else if(s.charAt(s.length()-2) == '*')
            temp =s.substring(0, s.length()-2);
        else if (s.charAt(s.length()-2) != '*')
            temp = s.substring(0, s.length()-1);

        newNumber = Double.parseDouble(temp);

        try {
            return new LinearFragment(newNumber);
        }
        catch (InvalidCoefficientException e) {
            throw new IllegalFormatException("this number is not viled");
        }
    }
    }
