package model;

public class Restaurant implements IEtablissement<FormulaireRestaurant> {
	CentraleReservation <Table, FormulaireRestaurant> centrale = new CentraleReservation<>(new Table[10]);
	
	public void ajouterTable(int nbChaise) {
		Table table = new Table(nbChaise);
		table.setIdentification(centrale.ajouterEntite(table));
	}
	
	public int[] donnerPossibilites (FormulaireRestaurant formulaire) {
		
	}
	
	public Reservation reserver(int numEntite, FormulaireRestaurant formulaire) {
		
	}
	
	private static class Table extends EntiteReservable<FormulaireRestaurant>{
		private CalendrierAnnuel calenderierDeuxiemeService;
		private int nbChaises;
		
		protected Table(int nbChaises) {
			this.nbChaises = nbChaises;
		}
		
		public Reservation reserver(FormulaireRestaurant formulaireRestaurant) {
			
		}
		
		public boolean compatible(FormulaireRestaurant formulaireRestaurant) {
			
		}
	}
}
