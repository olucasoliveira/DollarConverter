package application;

import java.util.Locale;
import java.util.Scanner;

import CurrencyConverter.Converter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price ? :");
		double dollarPrice = sc.nextDouble();
		

		System.out.println("How many dollars will be bought? :");
		double dollarToBought = sc.nextDouble();
		
		double value = Converter.converter(dollarToBought, dollarPrice);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", value);
		
		
		
		
		sc.close();
	}

}
