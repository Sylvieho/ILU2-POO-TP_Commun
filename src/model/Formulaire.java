package model;

public abstract class Formulaire {
	int jour;
	int mois;
	int numeroEntiteReserve;
	
	public Formulaire(int jour, int mois){
		this.jour = jour;
		this.mois = mois; 
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}
	
	public void setIdentificationEntite(int numeroEntiteReserve) {
		this.numeroEntiteReserve = numeroEntiteReserve;
	}
	
	public int getIdentificationEntite() {
		return numeroEntiteReserve;
	}
}
