package ma.education.tp.abstarctkeyword;

public class Test {
	public static void main(String[] args) {
		//FormeGeometrique f1 = new FormeGeometrique();
		//FormeGeometrique f2 = new FormeGeoTypeA();
		FormeGeometrique f3 = new Triangle();
		FormeGeometrique f4 = new FormeGeometrique() {
			@Override // Classe fille Annonyme
			public double calculerSurface() {
				return 22;
			}
		};
	}
}
