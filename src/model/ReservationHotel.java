package model;

public class ReservationHotel extends Reservation {
	int nbLitSimple;
	int nbLitDouble;
	int numeroChambre;
	
	public ReservationHotel(int jour, int mois, int nbLitSimple, int nbLitDouble, int numeroChambre) {
		super(jour, mois);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
		this.numeroChambre = numeroChambre;
	}
}
