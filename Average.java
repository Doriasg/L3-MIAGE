package exercice3;

public class Average {
	//Exo 3-2-"Ce programme permet de calculer la moyenne de trois nombres de type int
	
	public static double moyenne(int a , int b, int c) {
		double moyenne = (double) (a+b+c)/3; 
		return moyenne;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(moyenne(3,1,1));
		System.out.println(moyenne(-12,2,12));

	}

}
