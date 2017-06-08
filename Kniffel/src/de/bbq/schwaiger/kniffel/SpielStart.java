package de.bbq.schwaiger.kniffel;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SpielStart {

	Scanner scan = null;
	int anzahl = 0;
	int wuerfel;
	ArrayList<String> spielername = new ArrayList<>();
	Random r = new Random();

	public SpielStart() {
		this.Spielerabfrage();
		this.Spielernamen();
		this.Block();
		System.out.println(spielername.get(r.nextInt(spielername.size()))+ " darf beginnen!");
		
		this.Wuerfelbecher();
		// testausgabe
		//System.out.println(spielername);

	}

	public void Spielerabfrage() {
		this.scan = new Scanner(System.in);
		System.out.println("Wieviele Spieler nehmen Teil?");
		this.anzahl = this.scan.nextInt();

	}

	public void Spielernamen() {
		int count = 1;
		this.scan = new Scanner(System.in);
		for (int i = 1; i < anzahl + 1; i++) {
			System.out.println("Name des " + count + ". Spielers");
			spielername.add(this.scan.nextLine());
			count++;
		}
	}

	public void Wuerfelbecher() {
		ArrayList<Integer> wuerfelbecher = new ArrayList<>();
		int minimum = 1;
		int maximum = 6;

		for (int i = 0; i < 4; i++) {
			wuerfel = minimum + (int) (Math.random() * maximum);
			wuerfelbecher.add(this.wuerfel);
		}
		System.out.println(wuerfelbecher);

	}
	public void Block() {
		System.out.println("\t\t" + spielername.get(0) + "\t" + spielername.get(1) +
				"\t" + spielername.get(2) + "\t" + spielername.get(3));
		System.out.println("Einser");
		System.out.println("Zweier");
		System.out.println("Dreier");
		System.out.println("Vierer");
		System.out.println("Fünfer");
		System.out.println("Sechser");
		System.out.println("Bonus");
		System.out.println("Dreierpasch");
		System.out.println("Vierpasch");
		System.out.println("Full House");
		System.out.println("Kleine Straße");
		System.out.println("Große Straße");
		System.out.println("Kniffel");
		System.out.println("Kniffel Bonus");
		System.out.println("Chance");
		System.out.println("Punkte");
		
	}

}
