package cs520.hw3.part1;
import java.util.*;
import javax.swing.JOptionPane;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			String input, output;
			
			String age, newAge;
			
			input = JOptionPane.showInputDialog("Enter data using the format Name,Age,City:");

String trimmed= input.trim(); 
System.out.println(trimmed);
System.out.print("First comma position: " + trimmed.indexOf(",")+ ", ");

int firstCommaIndex = trimmed.indexOf(",");
String nameSubstring = trimmed.substring(0,firstCommaIndex);
System.out.print("Name: "+nameSubstring + ", ");
System.out.println("Length: " + nameSubstring.length());
//int secondCommaIndex = ordinalIndexOf(trimmed, ",", 2);
//= trimmed.substring(firstCommaIndex,trimmed.length());


//same thing but the second comma (age)
int secondCommaIndex = trimmed.indexOf(",", firstCommaIndex+1);
System.out.print("Second comma position: " + secondCommaIndex +",");
String ageSubstring = trimmed.substring(firstCommaIndex+1,secondCommaIndex);
System.out.println(" Age: "+ageSubstring);

//now figure out their age in 10 years
int intAge = Integer.parseInt(ageSubstring);
System.out.println("your age will be "+(intAge+10) + "in 10 years from now!");


//city stats
String citySubstring = trimmed.substring(secondCommaIndex+1,trimmed.length());
System.out.print("City: "+citySubstring +", ");
System.out.println("Length: " + citySubstring.length());

		}}}



