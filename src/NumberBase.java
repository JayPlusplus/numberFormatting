import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.lang.*;
	
public class NumberBase {
		public static void testRandom() {
			
			Random r = new Random();
			Scanner keyboard = new Scanner(System.in);
			
			int low, high, result;
			
			System.out.println("Put your high number here!");
			high = keyboard.nextInt();
			
			System.out.println("Put your low number here!");
			low = keyboard.nextInt();
			result = r.nextInt(high-low) + low;
			System.out.println("Your random number is " + result);
			
		}
		public static void testPercent() {
			//return a number formatted as a percentage
			double a;
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Put your percent number here!");
			a = keyboard.nextDouble();
			Locale currentLocale = Locale.getDefault();
			Double percent = new Double(a);
			NumberFormat percentFormatter;
			String percentOut;
			
			percentFormatter = NumberFormat.getPercentInstance(currentLocale);
			percentOut = percentFormatter.format(percent);
			System.out.println(percentOut + "  " + currentLocale.toString());
		}
		public static void testCurrency() {
			//return a number formatted as currency
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Put your currency number here!");
			double a = keyboard.nextDouble();
			Locale currentLocale = Locale.getDefault();
			Double currency = new Double(a);
			NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
			String currencyOut = currencyFormatter.format(currency);
			System.out.println(currencyOut + " " + currentLocale.toString());
		}
		//return a number formatted to a specific number of decimal places
		public static void testDecimal() {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Put your number here!");
			double a = keyboard.nextDouble();
			Double number = new Double(a);
			NumberFormat numberDec = NumberFormat.getNumberInstance();	
			numberDec.setMaximumFractionDigits(2);
			String numberOut = numberDec.format(number);
			System.out.println(numberOut);
		}
		//Return the Maximum value of two numbers (see the Math class)
		public static void testMaximum() {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Test your maximum number here!");
			double a = keyboard.nextDouble();
			double b = keyboard.nextDouble();
			double result = Math.max(a,b);
			System.out.println("Math.max(" + a + "," + b + ")=" + result);
		   }
			
		
		//Return the Minimum value of two numbers (see the Math class)
		public static void testMinimum() {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Test your minimum number here!");
			double a = keyboard.nextDouble();
			double b = keyboard.nextDouble();
			double result = Math.min(a,b);
			System.out.println("Math.max(" + a + "," + b + ")=" + result);
		   }
			
}
	

