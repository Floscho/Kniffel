package de.bbq.schwaiger.kniffel;

import java.util.ArrayList;

public class Würfelbecher {

	public void Wuerfelbecher() {
		int wuerfel;

		ArrayList<Integer> wuerfelbecher = new ArrayList<>();
		int minimum = 1;
		int maximum = 6;

		for (int i = 0; i < 4; i++) {
			wuerfel = minimum + (int) (Math.random() * maximum);
			wuerfelbecher.add(wuerfel);
		}
		System.out.println(wuerfelbecher);

	}
}
