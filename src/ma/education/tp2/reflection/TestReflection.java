package ma.education.tp2.reflection;

import java.lang.reflect.*;

import ma.education.tp1.introduction.Salle;

public class TestReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class cs = Salle.class;
		
		Field[] fields = cs.getDeclaredFields();
		for (Field f :fields) {
			System.out.println(f.getName());
		}
		
		Method[] methodes = cs.getDeclaredMethods();
		for (Method m :methodes) {
			System.out.println(m.getName());
		}
		
		Constructor[] constrs = cs.getDeclaredConstructors();
		
		for (Method m :methodes) {
			System.out.println(m.getName());
		}
		Object o1 = constrs[2].newInstance(null);
		Object o2 = constrs[1].newInstance("Salle Informatique");
		Object o3 = constrs[0].newInstance(2, "Salle des cours");
		System.out.println(constrs.length);
		
		System.out.println(!o2.equals(o3) ? "Objects are not equal" : "Objects are equal");
		
	}

}
