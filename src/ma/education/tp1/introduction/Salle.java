package ma.education.tp1.introduction;

public class Salle {
	public long id;
	public String nom;
	
	public Salle (){
		
	}
	
	public Salle(String nom) {
        this.nom = nom;
    }
	
	public Salle(long id, String nom) {
        this.nom = nom;
        this.id = id;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Salle o1 = new Salle();
		Salle o2 = new Salle("Salle Informatique");
		Salle o3 = new Salle(2, "Salle des cours");
		// System.out.println(o1);
		System.out.println(o2.nom);
		System.out.println(o3.nom+" id:"+o3.id);
		System.out.println(!o2.equals(o3) ? "Objects are not equal" : "Objects are equal");
	}

}
