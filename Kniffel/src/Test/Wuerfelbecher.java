package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Wuerfelbecher {

	public static void main(String[] args) {
		Scanner scan = null;

		ArrayList<Integer> wuerfelbecher = new ArrayList<>();
		int minimum = 1;
		int maximum = 6;

		int wuerfel1 = minimum + (int) (Math.random() * maximum);
		wuerfelbecher.add(wuerfel1);
		int wuerfel2 = minimum + (int) (Math.random() * maximum);
		wuerfelbecher.add(wuerfel2);
		int wuerfel3 = minimum + (int) (Math.random() * maximum);
		wuerfelbecher.add(wuerfel3);
		int wuerfel4 = minimum + (int) (Math.random() * maximum);
		wuerfelbecher.add(wuerfel4);
		int wuerfel5 = minimum + (int) (Math.random() * maximum);
		wuerfelbecher.add(wuerfel5);

		System.out.println(wuerfelbecher);
		scan = new Scanner(System.in);
		System.out.println("Welche Würfel wollen sie erneut würfeln?");
		System.out.println("Drücken sie 0 für weiter und x für abbruch");

		switch (scan.nextLine()) {
		case "1":
			
			break;

		default:
			break;
		}
	}

}
