package exercice3;

public class Average_Args {

	//Exercice 3.3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Convertir les trois arguments en entiers
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
        // 2. Calculer la moyenne
		double moyenne = (a+b+c)/3.0; 
        // 3. Afficher le résultat
		System.out.println("La moyenne des nombres " + a + " " + b + " " + c + " est " + moyenne);

	}

	}


