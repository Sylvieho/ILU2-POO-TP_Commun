package model;

public class ReservationSpectacle extends Reservation {
	int numeroZone;
	int numeroChaise;
	
	public ReservationSpectacle(int jour, int mois, int numeroZone, int numeroChaise) {
		super(jour, mois);
		this.numeroZone = numeroZone;
		this.numeroChaise = numeroChaise;
	}
}
