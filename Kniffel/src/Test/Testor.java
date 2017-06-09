package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Testor {

	public static void main(String[] args) {
		Scanner scan = null;
		scan = new Scanner(System.in);
		int minimum = 1;
		int maximum = 6;
		ArrayList<Integer> wuerfelbecher1 = new ArrayList<>();
		int wuerfel2 = minimum + (int) (Math.random() * maximum);

		

		for (int i = 0; i < 5; i++) {
			int wuerfel1 = minimum + (int) (Math.random() * maximum);
			wuerfelbecher1.add(wuerfel1);
		}
		System.out.println(wuerfelbecher1);
		for (int i = 1; i < 3; i++) {
			System.out.println("Welche Würfel wollen sie erneut würfeln?");
			System.out.println("Drücken sie 0 für weiter und 99 für abbruch");
			int antwort = scan.nextInt();

			if (antwort == 0) {
				break;
			}
			if (antwort == 99) {
				break;
			}
			if (antwort == 1) {
				wuerfelbecher1.remove(0);
				wuerfelbecher1.add(0,wuerfel2);
			}
			if (antwort == 2) {
				wuerfelbecher1.remove(1);
				wuerfelbecher1.add(1,wuerfel2);
			}
			if (antwort == 3) {
				wuerfelbecher1.remove(2);
				wuerfelbecher1.add(2,wuerfel2);
			}
			if (antwort == 4) {
				wuerfelbecher1.remove(3);
				wuerfelbecher1.add(3,wuerfel2);
			}
			if (antwort == 5) {
				wuerfelbecher1.remove(4);
				wuerfelbecher1.add(4,wuerfel2);
			}
			System.out.println(wuerfelbecher1);
		}
	}
}
