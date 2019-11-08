import java.util.Scanner;

public class exo12 {
    public static void main(String[] args) {
        int j1, h1, m1, s1, j2, h2, m2, s2, jdif, hdif, mdif, sdif;
        Scanner sc = new Scanner(System.in);

        System.out.println("j1");
        j1 = Integer.parseInt(sc.nextLine());
        System.out.println("h1");
        h1 = Integer.parseInt(sc.nextLine());
        System.out.println("m1");
        m1 = Integer.parseInt(sc.nextLine());
        System.out.println("s1");
        s1 = Integer.parseInt(sc.nextLine());

        System.out.println("j2");
        j2 = Integer.parseInt(sc.nextLine());
        System.out.println("h2");
        h2 = Integer.parseInt(sc.nextLine());
        System.out.println("m2");
        m2 = Integer.parseInt(sc.nextLine());
        System.out.println("s2");
        s2 = Integer.parseInt(sc.nextLine());

        int sec1 = j1*86400+h1*3600+m1*60+s1;
        int sec2 = j2*86400+h2*3600+m2*60+s2;

        int secdif = Math.abs(sec1-sec2);

        jdif = secdif/86400;
        hdif = secdif/3600%24;
        mdif = secdif/60%60;
        sdif = secdif % 60;

        System.out.println(" La différence entre ces deux durées de "+jdif+" j, "+hdif+"h, "+mdif+"m et "+sdif+"s.\n");






    }
}
