public class exo25 {
    public static void main(String[] args) {
        // le chevalier
        String[] tablo = new String[6];
        tablo[0] = "-";
        tablo[1] = "|";
        tablo[2] = "T";
        tablo[3] = "|";
        tablo[4] = "-";
        tablo[5] = "!";

        String printMe = "";

        String[] olbat = new String[tablo.length];

        for (int i = 0; i < olbat.length; i++)
        {
            olbat[i] = tablo[tablo.length-1-i];
        }

        // dessiner le combat
        for (int i = 0; i < tablo.length; i++) {
            printMe += tablo[i];
        }
        printMe += " ";
        for (int i = 0; i < olbat.length; i++) {
            printMe += olbat[i];
        }

        System.out.println("LE DUEL : ");
        System.out.println(printMe);


    }
}
