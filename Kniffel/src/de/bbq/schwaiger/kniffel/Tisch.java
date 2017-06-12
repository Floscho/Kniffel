package de.bbq.schwaiger.kniffel;

import java.util.ArrayList;

public class Tisch {
	private int count = 1;

	public void WuerfelErgebnis() {
		ArrayList<Wuerfel> wurfErgebnis = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			Wuerfel wuerfel = new Wuerfel();
			wurfErgebnis.add(wuerfel);
		}
		for (Wuerfel wuerfel : wurfErgebnis) {

			System.out.println(count + "." + wuerfel.getWuerfel());
			count++;
		}
	}

}
