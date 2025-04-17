package model;

public abstract class Reservation {
	int jour;
	int mois;
	int numeroEntiteReserve;
	
	public Reservation(int jour, int mois, int numeroEntiteReserve) {
		this.jour = jour;
		this.mois = mois;
		this.numeroEntiteReserve = numeroEntiteReserve;
	}
}
