import java.util.Scanner;

public class supp1 {
    public static void main(String[] args) {
        // mdp 3 essais
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre pseudo");
        String pseudo = sc.nextLine();

        System.out.println("Entrez votre mdp");
        String mdp = sc.nextLine();

        String password;
        int i = 1;

        do {
            System.out.println("Entrez votre mdp pour vous connecter ");
            password = sc.nextLine();
            i++;
        }while (!mdp.equals(password) && i <=3);

        if(!mdp.equals(password))
        {
            System.out.println("Compte bloqué");
        }
        else
        {
            System.out.println("Tu es connecté");
        }




    }
}
