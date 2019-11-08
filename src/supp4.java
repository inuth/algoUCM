import java.util.Scanner;

public class supp4 {
    public static void main(String[] args) {
        // etoile répétitive
        Scanner sc = new Scanner(System.in);

        System.out.println("Nb de répétition");
        int nbRepetition = Integer.parseInt(sc.nextLine());
        System.out.println("Nb de tirets");
        int nbTiret = Integer.parseInt(sc.nextLine());
        System.out.println("Nb d'étoiles");
        int nbEtoiles = Integer.parseInt(sc.nextLine());

        String affiche = "";
        int i = 0;
        while(i < nbTiret)
        {
            affiche = affiche + "-";
            i++;
        }
        i = 0;
        while(i < nbEtoiles)
        {
            affiche = affiche + "*";
            i++;
        }
        i = 1;
        String temp = affiche;
        while(i < nbRepetition)
        {
            affiche = affiche + temp;
            i++;
        }
        System.out.println(affiche);
    }
}
