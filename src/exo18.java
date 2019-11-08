import java.util.Scanner;

public class exo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean active = true;

        do {
            System.out.println("Entrez le premier nombre");

            double nb1 = Double.parseDouble(sc.nextLine());
            System.out.println("Entrez l'opérateur : ");
            String op = sc.nextLine();
            System.out.println("Entrez le nombre2 :");
            double nb2 = Double.parseDouble(sc.nextLine());

            switch(op)
            {
                case "+":
                    System.out.println(nb1 + nb2);
                    break;
                case "-":
                    System.out.println(nb1 - nb2);
                    break;
                case "*":
                    System.out.println(nb1 * nb2);
                    break;
                case "/":
                    if(nb2 == 0)
                    {
                        System.out.println("Division par 0");
                    }
                    else
                    {
                        System.out.println(nb1 / nb2);
                    }
                    break;
                default :
                    System.out.println("Erreur : opérateur inconnu");
                    break;
            }
            System.out.println("Voulez-vous recalculer");
            active = Boolean.parseBoolean(sc.nextLine());

        } while (active);


    }
}
