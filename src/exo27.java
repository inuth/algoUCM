import java.util.Scanner;

public class exo27 {
    public static void main(String[] args) {
        // trouver le min dans tab
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Entrez le nombre "+(i+1));
            tab[i] = Integer.parseInt(sc.nextLine());

        }
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if(tab[i]< min)
                min = tab[i];

        }

        System.out.println("le min est : "+min);
    }
}
