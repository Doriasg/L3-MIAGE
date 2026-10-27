package exercice3;

public class Parallelepiped {
	// Exercice 3.1
	public static void calcule(double longueur, double largeur, double hauteur) {
		double aire = longueur * largeur * 2 + largeur * hauteur *2 + longueur*hauteur*2 ;
		double volume = longueur*largeur * hauteur;
		System.out.println("Le volume est " + volume + " " + "et l'aire est " + " " + aire);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcule(12, 3,5);

	}

}
