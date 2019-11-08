import java.util.Scanner;

public class exo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Etes-vous pret : 1 pour oui / 2 pour non");
//        int reponse = Integer.parseInt(sc.nextLine());
//        int nbBalles = 5;
//
//        if(nbBalles > 0 && reponse == 1)
//        {
//            while(nbBalles > 0)
//            {
//                System.out.println("Balle lancée");
//                nbBalles--;
//            }
//        }
//        else
//        {
//            if(reponse == 2)
//            {
//                System.out.println("Vous n'êtes pas prêt");
//            }
//            if(nbBalles == 0)
//            {
//                System.out.println("Il ne reste plus de balles");
//            }
//        }
        System.out.println("Entrez le nombre de balles dans le panier");
        int nbBalles = Integer.parseInt(sc.nextLine());
        while (nbBalles > 0)
        {
            System.out.println("Etes-vous prêt ?");
            int ready = Integer.parseInt(sc.nextLine());
            if(ready == 1)
            {
                System.out.println("Lancer balle");
                nbBalles--;
            }
            else
            {
                System.out.println("lancement impossible : vous n'ête pas pret");
            }
        }

        System.out.println("Le réservoir est vide");

    }
}
