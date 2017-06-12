package de.bbq.schwaiger.kniffel;

import java.util.ArrayList;
import java.util.Scanner;

public class SpielStart {

	Scanner scan = null;
	int anzahl = 0;
	ArrayList<Spieler> spielerliste = new ArrayList<>();
	

	public SpielStart() {
		this.Spielerabfrage();
		this.Spielernamen();
		Tisch tisch = new Tisch();
		tisch.WuerfelErgebnis();
		spielerliste.get(0).setDreier(6);
		this.Block();
		
		// testausgabe
		

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
			Spieler spieler = new Spieler();
			System.out.println("Name des " + count + ". Spielers");
			spieler.setSpielername(this.scan.nextLine());
			spielerliste.add(spieler);
			count++;
		}
	}

	public void Block() {
		int count = 0;
		for (int i = 1; i < anzahl + 1; i++) {
			System.out.println("\t\t" + spielerliste.get(0 + count).getSpielername());
			System.out.println("");
			System.out.println("Einser" + "\t\t " + spielerliste.get(0 + count).getEinser());
			System.out.println("Zweier" + "\t\t " + spielerliste.get(0 + count).getZweier());
			System.out.println("Dreier" + "\t\t " + spielerliste.get(0 + count).getDreier());
			System.out.println("Vierer" + "\t\t " + spielerliste.get(0 + count).getVierer());
			System.out.println("Fünfer" + "\t\t " + spielerliste.get(0 + count).getFuenfer());
			System.out.println("Sechser" + "\t\t " + spielerliste.get(0 + count).getSechser());
			System.out.println("Bonus" + "\t\t " + spielerliste.get(0 + count).getBonus());
			System.out.println("Dreierpasch" + "\t " + spielerliste.get(0 + count).getDreierpasch());
			System.out.println("Vierpasch" + "\t " + spielerliste.get(0 + count).getViererpasch());
			System.out.println("Full House" + "\t " + spielerliste.get(0 + count).getFullHouse());
			System.out.println("Kleine Straße" + "\t " + spielerliste.get(0 + count).getKleineStrasse());
			System.out.println("Große Straße" + "\t " + spielerliste.get(0 + count).getGrosseStrasse());
			System.out.println("Kniffel" + "\t\t " + spielerliste.get(0 + count).getKniffel());
			System.out.println("Kniffel Bonus" + "\t " + spielerliste.get(0 + count).getKniffelBonus());
			System.out.println("Chance" + "\t\t " + spielerliste.get(0 + count).getChance());
			System.out.println("Gesamtsumme" + "\t " + spielerliste.get(0 + count).getGesamtsumme());
			count++;
		}
	}
}