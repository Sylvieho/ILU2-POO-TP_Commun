package model;

public class CentraleReservation <T extends EntiteReservable<U>, U extends Formulaire> {
	private T[] entites;
	private int nbEntites;
	
	public CentraleReservation(T[] entites) {
		this.entites = entites;
		this.nbEntites = 0;
	}
	
	public int ajouterEntite(T entite) {
		this.entites[this.nbEntites] = entite;
		
		this.nbEntites++;
		
		return this.nbEntites;
	}
	
	public int[] donnerPossibilites(U formulaire) {
		int[] possibilites = new int[this.nbEntites];
		
		for(int i = 0; i<nbEntites; i++) {
			if(this.entites[i].compatible(formulaire)) {
				possibilites[i] = this.entites[i].getIdentification();
			} else {
				possibilites[i] = 0;
			}
		}
		return possibilites;
	}
	
	public Reservation reserver(int numEntite, U formulaire) {
		T entite = this.entites[numEntite -1];
		
		formulaire.setIdentificationEntite(entite.getIdentification());
		
		return entite.reserver(formulaire);
	}
}
