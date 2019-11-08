import java.util.Random;
import java.util.Scanner;

public class projet_justePrix {
    public static void main(String[] args) {
        String vert = "\u001b[32m";
        String rouge = "\u001b[31m";
        String jaune = "\u001b[33m";
        String blanc = "\u001b[0m";

        Scanner sc = new Scanner(System.in);
        boolean close = false, isNumber = false;
        int niveau = 0, bound = 0;
        String levelTexte = "";
        String continueGame = "";

        do {
            // page acccueil
            System.out.println("Le juste prix");
            System.out.println("Choisissez niveau");
            System.out.println(vert+"1 : Facile entre 1 et 10");
            System.out.println(jaune+"2 : Facile entre 1 et 100");
            System.out.println(rouge+"3 : Facile entre 1 et 1000"+blanc);

            isNumber = false;
            niveau = 0;

            while(niveau < 1 || niveau > 3 || isNumber == false)
            {
                isNumber = false;
                try{
                    System.out.println("Niveau :");
                    niveau = Integer.parseInt(sc.nextLine());
                    isNumber = true;
                    if(niveau < 1 || niveau > 3)
                    {
                        System.out.println("Veuillez entrez un niveau entre 1 et 3");
                    }
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Niveau inconnu, veuillez saisir un nombre");
                }
            }

            switch(niveau)
            {
                case 1 :
                    bound = 10;
                    levelTexte = "Le juste prix facile entre 1 et 10";
                    break;
                case 2 :
                    bound = 100;
                    levelTexte = "Le juste prix moyen entre 1 et 100";
                    break;
                case 3 :
                    bound = 1000;
                    levelTexte = "Le juste prix difficile entre 1 et 1000";
                    break;
                default:
                    System.out.println("Erreur ???");
            }
            Random random = new Random();
            int justePrix = random.nextInt(bound+1);
            System.out.println("----------------------------------");
            System.out.println(levelTexte+"\n Le juste prix est "+justePrix);
            System.out.println("----------------------------------");

            int occurence = 10;
            int proposition = -1;

            do {
                isNumber = false;
                while(!isNumber || proposition < 0 || proposition > bound)
                {
                    isNumber = false;
                    try {
                        System.out.println("Il vous reste "+occurence+" essais");
                        System.out.println("Vous pensez à : ");
                        proposition = Integer.parseInt(sc.nextLine());
                        isNumber = true;
                        if(proposition < 0 || proposition > bound)
                        {
                            System.out.println("Veuillez entrer un nombre compris en 1 et "+bound);
                        }
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Veuillez entrer un nombre valide");
                    }
                }

                if(proposition < justePrix)
                {
                    System.out.println("*****************************");
                    System.out.println("C'est plus");
                    System.out.println("*****************************");
                }
                else if(proposition > justePrix)
                {
                    System.out.println("*****************************");
                    System.out.println("C'est moins");
                    System.out.println("*****************************");
                }
                occurence--;

            } while(proposition != justePrix && occurence > 0);

            if(occurence > 0)
            {
                System.out.println("Félicitations ! le jp est bien "+justePrix);
            }
            else
            {
                System.out.println("Perdu ! le jp était "+justePrix);
            }

            System.out.println("Voulez vous rejouer ? true/false");
            continueGame = sc.nextLine();
//            if(!continueGame.equals("true") || !continueGame.equals("false") )
//            {
                while(!continueGame.equals("true") && !continueGame.equals("false") )
                {
                    System.out.println("Veuillez saisir true ou false");
                    continueGame = sc.nextLine();
                }
//            }
            if(continueGame.equals("true"))
            {
                close = false;
            }
            else
            {
                close = true;
            }
        }while(!close);

        System.out.println("Merci.");


    }
}
