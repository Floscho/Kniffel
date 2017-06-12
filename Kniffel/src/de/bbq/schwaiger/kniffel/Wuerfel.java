package de.bbq.schwaiger.kniffel;

public class Wuerfel {
	int minimum = 1;
	int maximum = 6;
	
	int wuerfel = minimum + (int) (Math.random() * maximum);

	public int getWuerfel() {
		return this.wuerfel;
	}

	public void setWuerfel(int wuerfel) {
		this.wuerfel = wuerfel;
	}

	

	
}