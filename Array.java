// Yishai Baron 308396761
public class Array {

	private int [] numbers;

	public Array(int[] array) { //constructor
		numbers= new int[array.length];
		for(int i=0; i<array.length;i++)
			numbers[i]=array[i];	 
	}
	// Methods
	public boolean isPrefix(Array other)
	{
		if(other.numbers.length>numbers.length)
			return false;
		for (int i=0 ; i<other.numbers.length ; i++)
			if(other.numbers[i]!=numbers[i])
				return false;
		return true;
	}
	public boolean isSuffix(Array other) 
	{
		if(other.numbers.length>numbers.length)
			return false;
		for (int i=this.numbers.length-1,j=other.numbers.length-1 ;j>0 ; i--,j--) 
			if(this.numbers[i]!=other.numbers[j])
				return false;
		return true;
	}
	public Array longestCommonPrefix(Array other) {
		int [] prefixArray= new int [this.sizeForPerfixArray(other)];

		for (int i=0;i<this.numbers.length && i<other.numbers.length ;i++)	
			if(other.numbers[i]!=this.numbers[i])
				break;
			else
				prefixArray[i]=this.numbers[i];
		return new Array(prefixArray);
	}
	public Array longestCommonSuffix(Array other)
	{
		int [] suffixArray= new int [this.sizeForSuffixArray(other)];
		int place=this.sizeForSuffixArray(other)-1;

		for (int i=1;i<=this.numbers.length && i<=other.numbers.length ;i++,place--)
			if(other.numbers[other.numbers.length-i]==this.numbers[numbers.length-i])
				suffixArray[place]=this.numbers[this.numbers.length-i];
			else
				break;
		return new Array(suffixArray);
	}
	public int longestPrefixAndSuffix() 
	{
		int counter=0,i=0,j=this.numbers.length-1,temp=0;
	
		if(this.numbers[i]==this.numbers[j] && this.numbers[i]==this.numbers[j-1] && this.numbers[i+1]==this.numbers[j])
		{
			for(i=0; i<this.numbers.length/2 && j>=this.numbers.length/2 && this.numbers[i]==this.numbers[j];)
			{
				counter++;
				i++;
				j--;
			}
			return counter;
		}	
	
		while(this.numbers[i]!=this.numbers[j] && j>this.numbers.length/2)
			j--;
		temp=j;
		while(i<this.numbers.length/2 && j<=this.numbers.length-1 && this.numbers[i]==this.numbers[j])
		{
			counter++;
			i++;	
			j++;

		}
		if(this.numbers.length-temp==counter)
			return counter;
		else
			return 0;

	}
	public Array uniteWith(Array other){
		int j=0;
		int [] uniteArray= new int[this.numbers.length+other.numbers.length];
		for(int i=0;i<this.numbers.length;i++)
			uniteArray[i]=this.numbers[i];

		for(int i=this.numbers.length;j<other.numbers.length;i++){
			uniteArray[i]=other.numbers[j];
			j++;
		}
		return new Array(uniteArray);
	}
	public void removeSub(Array other){
		int [] subArray= new int[this.numbers.length-other.numbers.length];
		boolean flag=true;
		int i=0,j=0,k=0,ilocation=0,klocaion=0;

		while(flag)
		{
			if(this.numbers[i]!=other.numbers[j])//if there not the same numbers
			{
				subArray[k]=this.numbers[i];//put the number in this inside subArray
				k++;
				i++;
				if(k>=subArray.length || i>=this.numbers.length)//if im out of bound exception flag= false end of WHILE
					flag=false;
			}
			if(this.numbers[i]==other.numbers[j])//if is Contained in other--step forward
			{
				j++;
				i++;
				if(j>=other.numbers.length || i>=this.numbers.length)//if im out of bound exception flag= false end of WHILE
				{
					ilocation=i;
					klocaion=k;
					flag=false;
				}
			}
		}
		for(;klocaion<subArray.length;klocaion++,ilocation++)//if all others variables not in the other put them in  the subArray
			subArray[klocaion]=this.numbers[ilocation];

		numbers=subArray;
		System.out.println(new Array(numbers));
	}
	public String toString() {
		String s="";
		for(int i=0;i<this.numbers.length;i++)
		{
			if(i<this.numbers.length-1)
				s+=this.numbers[i] + ", ";
			else
				s+=this.numbers[i];
		}	
		return "{" + s +"}";
	}

	private int sizeForPerfixArray(Array other){//the size of perfix
		int counter=0;
		for (int i=0 ; i<this.numbers.length && i<other.numbers.length; i++) 
			if(other.numbers[i]!=this.numbers[i])
				break;
			else
				counter++;
		return counter;
	}
	private int sizeForSuffixArray(Array other){//the size of suffix
		int counter=0;
		for (int i=1 ; i<=this.numbers.length && i<=other.numbers.length; i++) 
			if(other.numbers[other.numbers.length-i]!=this.numbers[numbers.length-i])
				break;
			else
				counter++;
		return counter;
	}
	
}

