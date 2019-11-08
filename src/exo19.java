import java.util.Scanner;

public class exo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez n :");
        int n = Integer.parseInt(sc.nextLine());
        int n10 = n, i=0;

        while(i < 9)
        {
            n10 *= n;
            i++;
        }
        System.out.println(n+"^10 = "+n10);
    }
}
