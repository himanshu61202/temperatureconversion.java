package internship;
import java.util.*;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
int ch=0;
float temp=0.0f;
System.out.print("Enter the temperature which you want to convert. ");
temp =sc.nextFloat();
System.out.println("Enter choice 1 to convert temperature from kelvin to celcius");
System.out.println("Enter choice 2 to convert temperature from kelvin to fahrenheit");
System.out.println("Enter choice 3 to convert temperature from celcius to kelvin");
System.out.println("Enter choice 4 to convert temperature from celcius to fahrenheit");
System.out.println("Enter choice 5 to convert temperature from fahrenheit to kelvin");
System.out.println("Enter choice 6 to convert temperature from fahrenheit to celcius");
System.out.println("Enter the choice in which you want to convert. ");
ch=sc.nextInt();
switch(ch)
{
case 1:
{
float c;
c=temp-273;
System.out.println("Temperature in celcius is: "+c);
break;
}
case 2:
{
	double c1;
	c1=(temp-273.15)*(1.8)+32;
	System.out.println("Temperature in Fahrenheit is: "+c1);
	break;
}
case 3:
{
	double c2;
	c2=(temp+273.15);
	System.out.println("Temperature in Kelvin is: "+c2);
    break;	
}
case 4:
{
	double c3;
	c3=(temp*1.8000 + 32.0);
	System.out.println("Temperaturn in Fahrenheit is: "+c3);
	break;
}
case 5:
{
	double c4;
	c4=((temp-32)*(0.555))+273.15;
	System.out.println("Temperature in Kelvin is: "+c4);
	break;
}
case 6:
{
	double c5;
	c5=(0.555)*(temp-32);
	System.out.println("Temperature in Celsius is: "+c5);
	break;
}
default:
{
	System.out.println("Wrong choice");
}
	}

}
}
