package ma.education.tp3.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Terre t1= Terre.getInstance(1000, 2000);
        Terre t2= Terre.getInstance(4000, 5000);
        System.out.println(t1.distanceToSoleil+" "+t1.surface);
        System.out.println(t2.distanceToSoleil+" "+t2.surface);
    }
}
