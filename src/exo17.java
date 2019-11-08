import java.util.Scanner;

public class exo17 {
    public static void main(String[] args) {
        int stockCoca = 0, stockEau = 2;
        boolean boisson;

        Scanner sc = new Scanner(System.in);

        do {
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
                        System.out.println("Coca reste "+stockCoca+", Eau reste "+stockEau);
                    }
                    else {
                        System.out.println("Stock eau est vide");
                    }
                    break;
                default :
                    System.out.println("Choix inconnu");
            }
            if(stockCoca > 0 || stockEau > 0)
            {
                System.out.println("Voulez-vous une autre boisson ? true/false");
                boisson = Boolean.parseBoolean(sc.nextLine());
            }
            else
            {
                boisson = false;
                System.out.println("Distributeur vide");
            }
        }while(boisson && (stockCoca > 0 || stockEau > 0));


        System.out.println("Au revoir");
    }
}
