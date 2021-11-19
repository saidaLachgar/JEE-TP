package ma.education.tp1.introduction;
import ma.education.tp1.introduction.Salle;
import ma.education.tp1.introduction.SalleCours;

public class TestHeritage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salle s1= new SalleCours(1, "Salle 1", 20);
		SalleCours s2 = new SalleCours(2, "Salle 2", 20);
		SalleCours s3 =(SalleCours) s1; // CAST To tell complier that the variable s1 contains the class SalleCours 
		SalleCours s4 = s2;
	}

}
