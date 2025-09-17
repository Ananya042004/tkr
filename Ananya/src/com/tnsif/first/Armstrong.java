package com.tnsif.first;

public class Armstrong {

	public static void main(String[] args) {
		int number=153;
		int originalnumber=number;
		int sum=0;
		int numberofDigits=0;
		int tempnumber=number;
		while(tempnumber!=0)
		{
			tempnumber/=10;
			numberofDigits++;
			
		}
		tempnumber=number;
		while(tempnumber!=0)
		{
			int digit=tempnumber%10;
			sum+=Math.pow(digit, numberofDigits);
			tempnumber/=10;
		}
		if(sum==originalnumber)
		{
			System.out.println(originalnumber + "is an armstrong number");
			
		}else {
			System.out.println(originalnumber + "is not an armstrong number");
		}
	}

}
