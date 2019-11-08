import java.util.Scanner;

public class exo24 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        int j, nb;

        double somme = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nb Joueurs : ");
        nb = Integer.parseInt(sc.nextLine());

        while (nb <= 0 || nb>10)
        {
            System.out.println("Entre 1 et 10 joueurs svp !");
            nb = Integer.parseInt(sc.nextLine());
        }

        j = 1;
        while(j <= nb)
        {
            System.out.println("Score du joueur"+j);
            tab[j-1]= Integer.parseInt(sc.nextLine());
            somme += tab[j-1];
            j++;
        }

        System.out.println("La moyenne est " + (somme/nb));

    }
}
