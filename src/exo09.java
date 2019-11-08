import java.util.Scanner;

public class exo09 {
    public static void main(String[] args) {
        int stockCoca = 0, stockEau = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sélectionnez une boisson : \n 1 pour coca \n 2 pour eau");
        int choix = Integer.parseInt(sc.nextLine());
        switch(choix)
        {
            case 1 :
                if(stockCoca > 0)
                {
                    stockCoca--;
                    System.out.println("Voici votre coca");
                    System.out.println("Coca reste "+stockCoca+", Eau reste "+stockEau);
                }
                else {
                    System.out.println("Stock coca est vide");
                }
                break;
            case 2 :
                if(stockEau > 0)
                {
                    stockEau--;
                    System.out.println("Voici votre eau");
                    System.out.println("Eau reste "+stockCoca+", Eau reste "+stockEau);
                }
                else {
                    System.out.println("Stock eau est vide");
                }
                break;
            default :
                System.out.println("Choix inconnu");
        }
    }
}
