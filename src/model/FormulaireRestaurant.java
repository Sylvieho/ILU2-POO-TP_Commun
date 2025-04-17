package model;

public class FormulaireRestaurant extends Formulaire {
	int nombrePersonnes;
	int numService;
	
	public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numeroService) {
		super(jour, mois);
		this.nombrePersonnes = nbPersonnes;
		this.numService = numeroService;
	}

	public int getNombrePersonnes() {
		return nombrePersonnes;
	}

	public int getNumService() {
		return numService;
	}
	
	
}
