package ma.education.tp.abstarctkeyword;

public abstract class FormeGeometrique {
	
	double surface;
	
	// M�thode abstraite sans corps
	public abstract double calculerSurface();
	
	// M�thode concr�te avec un corps
	public void afficherSurface() {
		System.out.println(this.surface);
	}

}
