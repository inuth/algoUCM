import java.util.Scanner;
public class exo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre nom :");
        String nom = sc.nextLine();
        System.out.println("Entrez votre prenom :");
        String prenom = sc.nextLine();

        System.out.println("Bienvenue " + nom + " "+ prenom);
    }
}
