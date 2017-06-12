package Test;

import java.util.ArrayList;

import de.bbq.schwaiger.kniffel.Wuerfel;

public class Testor {

	public static void main(String[] args) {

		ArrayList<Wuerfel> wurfErgebnis = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			Wuerfel wuerfel = new Wuerfel();
			wurfErgebnis.add(wuerfel);
		}
		for (Wuerfel wuerfel : wurfErgebnis) {
			System.out.println(wuerfel.getWuerfel());
		}
		
		
	}
}