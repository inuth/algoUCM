import java.util.Scanner;

public class supp2 {
    public static void main(String[] args) {
        // demi sapin
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez un nombre");
        int nb = sc.nextInt();
        sc.nextLine();

        int i = 1;
        while(i <= nb)
        {
            int j = 0;
            while(j < i)
            {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
