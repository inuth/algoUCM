import java.util.Scanner;

public class exo05 {
    public static void main(String[] args) {
        System.out.println("Encodez le nb de secondes à convertir");
        Scanner sc = new Scanner(System.in);
        int userEntry = Integer.parseInt(sc.nextLine());
        int seconde = userEntry % 60;
        int minutes = (userEntry%3600)/60;
        int heure = (userEntry%86400)/3600;
        int jour = (userEntry/86400);

        System.out.println(userEntry+ " secondes correspond à "+jour+" jour(s), "+heure+" heure(s) "+minutes + " minute(s) "+seconde+" seconde(s)");

    }
}
