package ma.education.tp1.introduction;

public class SalleCours extends Salle {
	int nbPlaces;
	
	public SalleCours(long id, String nom, int nbPlaces) {
		super(id, nom);
		this.nbPlaces = nbPlaces;
	}

}
