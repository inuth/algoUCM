import java.util.Random;
import java.util.Scanner;

public class demineur {
    static final int NB_LIGNE = 5;
    static final int NB_COLONNE = 5;
    static final char CHAR_SECRET = '*';
    static int nbCasesTrouvees = 0;
    public static void main(String[] args) {




        // --- INITIALISATION ---

        int[][] plateau = new int[NB_LIGNE][];
        for (int i = 0; i < plateau.length; i++) {
            plateau[i] = new int[NB_COLONNE];
        }
        //tableau de boolean pour se souvenir des cases "cochées" par le user
        boolean[][] plateauCheck = new boolean[NB_LIGNE][NB_COLONNE];


        // --- PLACEMENT DES BOMBES ---

        // 20% de bombes (on pourrait imaginer différents niveaux de difficulté)
        int nbBombes = (NB_COLONNE * NB_LIGNE) / 5;

        Random rnd = new Random();
        int cptBombes = 0;
        while (cptBombes < nbBombes){
            int ligne = rnd.nextInt(NB_LIGNE);
            int colonne = rnd.nextInt(NB_COLONNE);
            if (plateau[ligne][colonne] != 9){
                plateau[ligne][colonne] = 9;
                cptBombes++;
            }
        }


        // CALCUL DES NOMBRES

        for (int i = 0; i < NB_LIGNE; i++) {
            for (int j = 0; j < NB_COLONNE; j++) {
                // il va falloir check les cases autour
                // MAIS il faut faire attention à ne pas sortir du plateau

                if (plateau[i][j] != 9){
                    int n = 0;
                    // on va devoir check les games de [i-1 -> i+1] [j-1 -> j+1]
                    // SAUF si on se trouve au bord d'un plateau
                    int iBorneInf = i == 0 ? 0 : -1;
                    int iBorneSup = i == NB_LIGNE-1 ? 0 : 1;
                    int jBorneInf = j == 0 ? 0 : -1;
                    int jBorneSup = j == NB_COLONNE-1 ? 0 : 1;
                    for (int k = iBorneInf; k <= iBorneSup; k++) {
                        for (int l = jBorneInf; l <= jBorneSup; l++) {
                            if (plateau[i+k][j+l] == 9){
                                n++;
                            }
                        }
                    }
                    plateau[i][j] = n;
                }

            }
        }


        // --- JEU ---
        System.out.println("GAME ON");
        Scanner sc = new Scanner(System.in);

        int nbCasesATrouver = (NB_COLONNE * NB_LIGNE) - nbBombes;
        boolean bhoum = false;
        while (bhoum == false && nbCasesTrouvees < nbCasesATrouver){
            // Afficher le plateau
            for (int i = 0; i < NB_LIGNE; i++) {
                for (int j = 0; j < NB_COLONNE; j++) {
                    if (plateauCheck[i][j]){
                        System.out.print(plateau[i][j] + " ");
                    }
                    else {
                        System.out.print(CHAR_SECRET + " ");
                    }
                }
                System.out.println();
            }

            // demander input (to do : vérifier que l'input soit dans les limites)
            System.out.println("numéro ligne puis numéro colonne");
            int ligne = sc.nextInt();
            int colonne = sc.nextInt();

            bhoum = clickCase(plateau, plateauCheck, ligne, colonne);


        }
        if (bhoum){
            System.out.println("VOUS AVEZ PERDU ! hahaha");
        }
        else{
            System.out.println("BRAVO ! vous avez gagné :)");
        }

        System.out.println("VOICI LE PLATEAU !\n");
        for (int i = 0; i < NB_LIGNE; i++) {
            for (int j = 0; j < NB_COLONNE; j++) {
                System.out.print(plateau[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static boolean clickCase (int[][] plateau, boolean[][] plateauCheck, int ligne, int colonne){
        if (plateauCheck[ligne][colonne] == false){
            plateauCheck[ligne][colonne] = true;
            if (plateau[ligne][colonne] == 9){
                return true;
            }
            else if(plateau[ligne][colonne] == 0){
                int ligneBorneInf = ligne == 0 ? 0 : -1;
                int ligneBorneSup = ligne == plateau.length-1 ? 0 : 1;

                for (int i = ligneBorneInf; i <= ligneBorneSup; i++) {
                    int colonneBorneInf = colonne == 0 ? 0 : -1;
                    int colonneBorneSup = colonne == plateau[ligne+i].length-1 ? 0 : 1;
                    for (int j = colonneBorneInf; j <= colonneBorneSup; j++) {
                        clickCase(plateau, plateauCheck, ligne + i, colonne + j);
                    }
                }
            }
        }
        nbCasesTrouvees += 1;
        return false;
    }
}
