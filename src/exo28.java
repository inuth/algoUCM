import java.util.Scanner;

public class exo28 {
    public static void main(String[] args) {
        int[] tab = {1,4,3,5,2};
        Scanner sc = new Scanner(System.in);
        int nb = Integer.parseInt(sc.nextLine());
        int i ;

        for (i = tab.length-1; i > -1 && tab[i]!= nb; i--);

        System.out.println(i);

    }
}
