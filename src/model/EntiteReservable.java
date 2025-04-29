package model;

public abstract class EntiteReservable <F extends Formulaire> {
	private CalendrierAnnuel carnetReservation;
	private int identification;
	private F formulaire;
	
	public int getIdentification() {
		return identification;
	}
	
	public void setIdentification(int identification) {
		this.identification = identification;
	}
	
	public boolean estLibre() {
		return carnetReservation.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public abstract boolean compatible(F formulaire);
	
	public abstract Reservation reserver(F formulaire);
}
