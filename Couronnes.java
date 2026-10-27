package exercice3;

public class Couronnes {
	
	//Exercice 3.4- Surface d'un couronne délimitée par deux cercles
	public static double surfaceCercle(double rayon) {
		return Math.PI*rayon*rayon;
	}
	public static double surfaceCouronne(double r1, double r2) {
		double rayon;
		if (r1 < 0 || r2 < 0) {
			System.out.println("Les valeurs de r1 et r2 doivent etre positives");
		}
		if(r1 < r2) {
			rayon = r2;
		}else {
			rayon = r1;
		}
		
		return surfaceCercle(rayon);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(surfaceCouronne(2.3, 4.1));
		System.out.println(surfaceCouronne(4.1, 2.3));

	}

}
