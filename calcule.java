import java.util.Scanner;

// Classe Calculatrice
class Calculatrice {
    public double addition(double a, double b) {
        return a + b;
    }

    public double soustraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erreur : Division par zéro non autorisée.");
        }
        return a / b;
    }
}

// Classe Test avec la méthode main
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calc = new Calculatrice();

        System.out.println("Bienvenue dans la calculatrice Java !");
        
        while (true) {
            System.out.print("Entrez l'opération (+, -, *, /) ou 'q' pour quitter : ");
            String operation = scanner.next();

            if (operation.equalsIgnoreCase("q")) {
                System.out.println("Merci d'avoir utilisé la calculatrice. Au revoir !");
                break;
            }

            System.out.print("Entrez le premier nombre : ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Entrez le deuxième nombre : ");
            double num2 = scanner.nextDouble();

            try {
                double resultat = 0;
                switch (operation) {
                    case "+":
                        resultat = calc.addition(num1, num2);
                        break;
                    case "-":
                        resultat = calc.soustraction(num1, num2);
                        break;
                    case "*":
                        resultat = calc.multiplication(num1, num2);
                        break;
                    case "/":
                        resultat = calc.division(num1, num2);
                        break;
                    default:
                        System.out.println("Opération non reconnue. Veuillez entrer +, -, * ou /.");
                        continue;
                }
                System.out.println("Résultat : " + resultat);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}