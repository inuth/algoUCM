import java.util.Scanner;

public class exo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int justePrix, proposition;

        System.out.println("Entrez le juste prix");
        justePrix = Integer.parseInt(sc.nextLine());
        System.out.println("Entrez la proposition");
        proposition = Integer.parseInt(sc.nextLine());

        while(proposition != justePrix)
        {
            if(proposition < justePrix)
            {
                System.out.println("C'est plus");
            }
            else
            {
                System.out.println("C'est moins");
            }
            System.out.println("Entrez la proposition");
            proposition = Integer.parseInt(sc.nextLine());
        }
        System.out.println("C'est gagné");

    }
}
