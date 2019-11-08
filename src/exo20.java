import java.util.Scanner;

public class exo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, power, result = 1, i = 1;
        System.out.println("Entrez n :");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("Entrez la puissance : ");
        power = Integer.parseInt(sc.nextLine());

        while (i <= power)
        {
            result *= n;
            i++;
        }
        System.out.println(n+"^"+power+" = "+result);
    }
}
