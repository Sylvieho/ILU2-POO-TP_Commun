package model;

public class CalendrierAnnuel {
	private Mois[] calendrier = new Mois[12];
	
	public CalendrierAnnuel() {
		this.calendrier[0] = new Mois("janvier", 31);
		this.calendrier[1] = new Mois("février", 28);
		this.calendrier[2] = new Mois("mars", 31);
		this.calendrier[3] = new Mois("avril", 30);
		this.calendrier[4] = new Mois("mai", 31);
		this.calendrier[5] = new Mois("juin", 30);
		this.calendrier[6] = new Mois("juillet", 31);
		this.calendrier[7] = new Mois("août", 31);
		this.calendrier[8] = new Mois("septembre", 30);
		this.calendrier[9] = new Mois("octobre", 31);
		this.calendrier[10] = new Mois("novembre", 30);
		this.calendrier[11] = new Mois("décembre", 31);
	}
	
	private class Mois{
		private String nom;
		private boolean[] jours;
		
		public Mois(String nom, int nbJours){
			this.nom = nom;
			this.jours = new boolean[nbJours];
			for(int i = 0; i < nbJours; i++) {
				jours[i] = false;
			}
		}
		
		public boolean estLibre(int jour) {
			return !jours[jour-1];
		}
		
		public void reserver(int jour) throws IllegalStateException {
			if(!estLibre(jour)) {
				throw new IllegalStateException("Aucune disponibilité pour ce jour");
			}
			jours[jour-1] = true;
		}
	}
	
	public boolean estLibre(int jour, int mois) {
		return calendrier[mois-1].estLibre(jour);
	}
	
	public boolean reserver(int jour, int mois) {
		boolean reservable = estLibre(jour, mois);
		if(reservable) calendrier[mois-1].reserver(jour);
		return reservable;
	}
	
}
