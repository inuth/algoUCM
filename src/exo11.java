import java.util.Scanner;

public class exo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la note :");

        double cote = Double.parseDouble(sc.nextLine());
        if(cote >= 0 && cote <= 20)
        {
            if(cote < 11)
            {
                System.out.println("I");
            }
            else if(cote < 13)
            {
                System.out.println("S");
            }
            else if(cote < 16)
            {
                System.out.println("B");
            }
            else if(cote < 19)
            {
                System.out.println("TB");
            }
            else
            {
                System.out.println("Excellent");
            }
        }
        else
        {
            System.out.println("Cote non valide");
        }
    }
}
