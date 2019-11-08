import java.util.Scanner;

public class supp3 {
    public static void main(String[] args) {
        // plus petit parmi 10 entiers
        Scanner sc = new Scanner(System.in);
        int petit = 99999;
        for (int i = 0; i <= 9; i++)
        {
            System.out.println("Entrez un entier ");
            int ent = Integer.parseInt(sc.nextLine());

            if(petit > ent)
            {
                petit = ent;
            }

        }
        System.out.println(petit);
    }
}
