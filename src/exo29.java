import java.util.Scanner;

public class exo29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hero = "-[T]-";
        String flower = "*";
        boolean gameOn = true;
        final int POSITION_MIN = 0;
        final int POSITION_PORTE = 3;
        int position = 5;
        int happiness = 1;

        String[] map = new String[11];

        for (int i = 0; i < map.length; i++) {
            map[i] = flower;
        }
        map[position] = hero;

        System.out.println("--- LES AVENTURES DE MAURICE LE CHEVALIER JOYEUX ---");
        System.out.println("Maurice est un chevalier");
        System.out.println("Mais plutôt que de partir à la guerre, Maurice préfère parcourir les champs de fleurs");
        System.out.println("Déplace Maurice à travers le champ de fleurs pour le rendre le + heureux possible.");
        System.out.println();

        map[POSITION_PORTE] = "P";

        while (gameOn) {
            System.out.println("Bonheur : " + happiness);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < map.length; i++) {
                sb.append(map[i]);
            }

            System.out.println(sb);
            System.out.println("G => gauche, D => droite, Q => enfin partir");
            System.out.println("action");
            String userChoice = sc.nextLine();

            map[position] = flower;

            switch (userChoice) {
                case "g":
                case "G":
                    if (position == POSITION_MIN) {
                        position = map.length - 1;
                    } else {
                        position--;
                        if (position == POSITION_PORTE) {
                            position--;
                        }
                    }
                    break;
                case "d":
                case "D":
                    if (position == map.length - 1 || position == POSITION_PORTE - 1) {

                        System.out.println("Vous êtes bloqué");
                    } else {
                        position++;
                    }
                    break;
                case "q":
                case "Q":
                    gameOn = false;
                    break;
                default:
                    System.out.println("Arrête de dire des bétises, Maurice a besoin de toi !");
            }

            map[position] = hero;
            happiness++;
        }

    }
}
