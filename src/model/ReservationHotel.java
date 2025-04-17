package model;

public class ReservationHotel extends Reservation {
	int nbLitSimple;
	int nbLitDouble;
	
	public ReservationHotel(int jour, int mois, int nbLitSimple, int nbLitDouble, int numeroChambre) {
		super(jour, mois, numeroChambre);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
	}
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le " + jour + "/" + mois + " : ");
		if(nbLitSimple != 0) {
			chaine.append(nbLitSimple + " lits simples");
			if(nbLitDouble != 0) {
				chaine.append(" et ");
			}
		}
		if(nbLitDouble != 0) {
			chaine.append(nbLitDouble + " lits doubles");
		}
		
		chaine.append("chambre n°" + numeroEntiteReserve);
		
		return chaine.toString();
	}
}
