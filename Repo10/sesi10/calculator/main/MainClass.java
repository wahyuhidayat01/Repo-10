package main;

import service.CalculatorService;
import service.impl.CalculatorServiceImpl;
import java.util.Scanner;


public class MainClass {
	static Scanner input = new Scanner(System.in);
	public static void main (String[] args){
		int bil1;
		int bil2;
		String operation;
		
		CalculatorServiceImpl service = new	CalculatorServiceImpl();
		try {
			System.out.println("Masukkan Bilangan 1 :");
			bil1 = input.nextInt();
		
			System.out.println("Masukkan Bilangan 2 :");
			bil2 = input.nextInt();
			
			System.out.println("Masukkan Operator <+,-,*,/> : ");
			String tanda = input.next();
			
			if (tanda.equals("+")){
				System.out.println("Hasil Perhitungan Dari : "+bil1+" + "+bil2+"= "+service.tambah(bil1, bil2) );
			}
			else if (tanda.equals("-")){
				System.out.println("Hasil Perhitungan Dari : "+bil1+" - "+bil2+"= "+service.kurang(bil1, bil2));
			}
			else if (tanda.equals("*")){
				System.out.println("Hasil Perhitungan Dari : "+bil1+" * "+bil2+"= "+service.kali(bil1, bil2));
			}
			else if (tanda.equals("/")){
				System.out.println("Hasil Perhitungan Dari : "+bil1+" / "+bil2+"= "+service.bagi(bil1, bil2));
			}
		} catch (Exception e) {	
			
		}
	}
}