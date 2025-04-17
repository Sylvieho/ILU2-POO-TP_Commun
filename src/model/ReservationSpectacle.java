package model;

public class ReservationSpectacle extends Reservation {
	int numeroZone;
	
	public ReservationSpectacle(int jour, int mois, int numeroZone, int numeroChaise) {
		super(jour, mois, numeroChaise);
		this.numeroZone = numeroZone;
	}
	
	@Override
	public String toString() {
		return "Le " + jour + "/" + mois + " : chaise n°" + numeroEntiteReserve + " dans la zone " + numeroZone;
	}
}
