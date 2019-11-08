import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class exo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int justePrix, proposition, tentatives =1;

        // poss1
        justePrix = ThreadLocalRandom.current().nextInt(0, 100+1);

//        // poss2
//        justePrix = 1+(int)(Math.random() * 100);
//
//        // poss3
//        Random r = new Random();
//        int min = 1, max = 100;
//        justePrix = min+r.nextInt(max-min);

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
            tentatives++;
            System.out.println("Entrez la proposition");
            proposition = Integer.parseInt(sc.nextLine());
        }
        System.out.println("C'est gagné en "+tentatives+" tentatives");
    }
}
