// Yishai Baron id 308396761
//ex8
public class Ex8 {
	public static int howManyEven(int num)
	{       if(num<10)
			return isEven(num);
		    return isEven(num%10)+howManyEven(num/10); //Recursion with num/10
	}
	private static int isEven(int num)
	{
		if(num%2==0)
			return 1;
		return 0;
	}
	
	
	public static int longestAscending(int[]  a) {
	int c=1; //counter
	int index = 1;// index 1 from array 
	return count(a, index,c,a[0]);
	
	}
private static int count(int a[], int index,int c, int lastbigarr){
	
	if (index == a.length) 
     return  c;
    else if (lastbigarr>=a[index])
     return  count(a, index+1, c,lastbigarr); // just index++, Recursion
    else if (lastbigarr < a[index])
    	lastbigarr=a[index];          // the last array =  next big index 
    c++;                              //counter++
    
    return  count(a, index+1, c, lastbigarr); //index++, Recursion

}
public static int[] merge(int[] a, int[] b){
	int[] newArr= new int[a.length+b.length];// length of new arr = a lengh + b lengh

return sorting(a, b, newArr, 0, 0, 0);
}
private static int[] sorting (int[]a, int[]b, int[]newArr,int indexa,int indexb,int indexnewArr){
if(indexa==a.length && indexb==b.length) //final indexes
	return newArr;
else if(indexa==a.length){ //final index a
	newArr[indexnewArr]=b[indexb]; 
	return sorting(a, b, newArr, indexa, indexb+1, indexnewArr+1); //
}
else if(indexb==b.length){//final index b
	newArr[indexnewArr]=a[indexa];
	return sorting(a, b, newArr, indexa+1, indexb, indexnewArr+1); 
}

else if(a[indexa]<=b[indexb]){
		newArr[indexnewArr] = a[indexa];
	return sorting(a, b, newArr, indexa+1, indexb, indexnewArr+1);
}
else if (a[indexa]>b[indexb]) {
			newArr[indexnewArr] = b[indexb];
	return sorting(a, b, newArr, indexa, indexb+1, indexnewArr+1);
}

				else return newArr;
}
public static boolean equalIgnoreCase(String s1, String s2)  {
	 {
			if(s1.length() != s2.length()) return false;        // If unequal lengths
			else if(s1.length()==0 && s2.length()==0) return true; 	  //if both are empty

		 char s1char= s1.charAt(0); //first char on string 1, to upper case 
		 char s2char= s2.charAt(0);	//first char on string 2, to upper case 
     if (s1char>= 'a' && s1char<='z') s1char -=32;
     if (s2char>= 'a' && s2char<='z') s2char -=32;
			
     if (s1char==s2char)
	    {
	            return equalIgnoreCase(s1.substring(1),s2.substring(1));// Recursion substring -first char
	    }

	    //nothing worked out
	    return false;
	}
}

}