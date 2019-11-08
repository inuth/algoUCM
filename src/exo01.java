public class exo01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;

        System.out.println("avant a="+a + " b = "+b);

        c = a;
        a = b;
        b = c;

        System.out.println("apres a="+a + " b = "+b);

    }
}
