package model;

public class ReservationRestaurant extends Reservation {
	int numeroService;
	
	public ReservationRestaurant(int jour, int mois, int numeroService, int numeroTable) {
		super(jour, mois, numeroTable);
		this.numeroService = numeroService;
	}
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le " + jour + "/" + mois + "\nTable " + numeroEntiteReserve + " pour le ");
		if(numeroService == 1) {
			chaine.append("premier service.");
		} else {
			chaine.append("deuxième service.");
		}
		return chaine.toString();
	}
}
