package de.bbq.schwaiger.kniffel;

public class Spieler {

	String spielername = "";
	int einser;
	int zweier;
	int dreier;
	int vierer;
	int fuenfer;
	int sechser;
	int bonus;
	int dreierpasch;
	int viererpasch;
	int fuenferpasch;
	int fullHouse;
	int kleineStrasse;
	int grosseStrasse;
	int kniffel;
	int kniffelBonus;
	int chance;
	int gesamtsumme;
	
	
	public String getSpielername() {
		return this.spielername;
	}
	public void setSpielername(String spielername) {
		this.spielername = spielername;
	}
	public int getEinser() {
		return this.einser;
	}
	public void setEinser(int einser) {
		this.einser = einser;
	}
	public int getZweier() {
		return this.zweier;
	}
	public void setZweier(int zweier) {
		this.zweier = zweier;
	}
	public int getDreier() {
		return this.dreier;
	}
	public void setDreier(int dreier) {
		this.dreier = dreier;
	}
	public int getVierer() {
		return this.vierer;
	}
	public void setVierer(int vierer) {
		this.vierer = vierer;
	}
	public int getFuenfer() {
		return this.fuenfer;
	}
	public void setFuenfer(int fuenfer) {
		this.fuenfer = fuenfer;
	}
	public int getSechser() {
		return this.sechser;
	}
	public void setSechser(int sechser) {
		this.sechser = sechser;
	}
	public int getBonus() {
		return this.bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getDreierpasch() {
		return this.dreierpasch;
	}
	public void setDreierpasch(int dreierpasch) {
		this.dreierpasch = dreierpasch;
	}
	public int getViererpasch() {
		return this.viererpasch;
	}
	public void setViererpasch(int viererpasch) {
		this.viererpasch = viererpasch;
	}
	public int getFuenferpasch() {
		return this.fuenferpasch;
	}
	public void setFuenferpasch(int fuenferpasch) {
		this.fuenferpasch = fuenferpasch;
	}
	public int getFullHouse() {
		return this.fullHouse;
	}
	public void setFullHouse(int fullHouse) {
		this.fullHouse = fullHouse;
	}
	public int getKleineStrasse() {
		return this.kleineStrasse;
	}
	public void setKleineStrasse(int kleineStrasse) {
		this.kleineStrasse = kleineStrasse;
	}
	public int getGrosseStrasse() {
		return this.grosseStrasse;
	}
	public void setGrosseStrasse(int grosseStrasse) {
		this.grosseStrasse = grosseStrasse;
	}
	public int getKniffel() {
		return this.kniffel;
	}
	public void setKniffel(int kniffel) {
		this.kniffel = kniffel;
	}
	public int getKniffelBonus() {
		return this.kniffelBonus;
	}
	public void setKniffelBonus(int kniffelBonus) {
		this.kniffelBonus = kniffelBonus;
	}
	public int getChance() {
		return this.chance;
	}
	public void setChance(int chance) {
		this.chance = chance;
	}
	public int getGesamtsumme() {
		return this.gesamtsumme;
	}
	public void setGesamtsumme(int gesamtsumme) {
		this.gesamtsumme = gesamtsumme;
	}
	public Spieler(String spielername, int einser, int zweier, int dreier, int vierer, int fuenfer, int sechser,
			int bonus, int dreierpasch, int viererpasch, int fuenferpasch, int fullHouse, int kleineStrasse,
			int grosseStrasse, int kniffel, int kniffelBonus, int chance, int gesamtsumme) {
		super();
		this.spielername = spielername;
		this.einser = einser;
		this.zweier = zweier;
		this.dreier = dreier;
		this.vierer = vierer;
		this.fuenfer = fuenfer;
		this.sechser = sechser;
		this.bonus = bonus;
		this.dreierpasch = dreierpasch;
		this.viererpasch = viererpasch;
		this.fuenferpasch = fuenferpasch;
		this.fullHouse = fullHouse;
		this.kleineStrasse = kleineStrasse;
		this.grosseStrasse = grosseStrasse;
		this.kniffel = kniffel;
		this.kniffelBonus = kniffelBonus;
		this.chance = chance;
		this.gesamtsumme = gesamtsumme;
	}
	@Override
	public String toString() {
		return "Spieler [spielername=" + spielername + ", einser=" + einser + ", zweier=" + zweier + ", dreier="
				+ dreier + ", vierer=" + vierer + ", fuenfer=" + fuenfer + ", sechser=" + sechser + ", bonus=" + bonus
				+ ", dreierpasch=" + dreierpasch + ", viererpasch=" + viererpasch + ", fuenferpasch=" + fuenferpasch
				+ ", fullHouse=" + fullHouse + ", kleineStrasse=" + kleineStrasse + ", grosseStrasse=" + grosseStrasse
				+ ", kniffel=" + kniffel + ", kniffelBonus=" + kniffelBonus + ", chance=" + chance + ", gesamtsumme="
				+ gesamtsumme + "]";
	}
	public Spieler() {
		super();
	}
	
	
	
	
	
}
