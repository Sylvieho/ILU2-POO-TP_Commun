package model;

public class ReservationRestaurant extends Reservation {
	int numeroService;
	int numeroTable;
	
	public ReservationRestaurant(int jour, int mois, int numeroService, int numeroTable) {
		super(jour, mois);
		this.numeroService = numeroService;
		this.numeroTable = numeroTable;
	}
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le " + jour + "/" + mois + "\nTable " + numeroTable + " pour le ");
		if(numeroService == 1) {
			chaine.append("premier service.");
		} else {
			chaine.append("deuxième service.");
		}
		return chaine.toString();
	}
}
