import java.util.Scanner;

public class exo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Le lanceur est-il prêt ?");
        boolean pret = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Le panier est-il vide ?");
        boolean panierVide = Boolean.parseBoolean(sc.nextLine());

        if(pret && !panierVide)
        {
            System.out.println("Lancer la balle");
        }
        else
        {
            System.out.println("Ne pas lancer la balle");
            if(!pret)
            {
                System.out.println("Car vous n’êtes pas prêt");
            }
            if(panierVide)
            {
                System.out.println("Car le panier est vide");
            }
        }
    }
}
