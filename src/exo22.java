import java.util.Scanner;

public class exo22 {
    public static void main(String[] args) {
        //-Écrire un algorithme qui saisit 6 entiers et les stocke dans un tableau, puis affiche le contenu de ce tableau une fois qu’il est rempli.
        int[] tableau = new int[6];
        System.out.println("Entrez 6 valeurs : ");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i< 6)
        {
            System.out.println("Entrez la valeur "+(i+1)+" : ");
            tableau[i] = Integer.parseInt(sc.nextLine());
            i++;
        }

        i = 0;
        while(i < tableau.length)
        {
            System.out.println(tableau[i]);
            i++;
        }
    }
}
