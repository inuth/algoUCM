public class exo04 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;


        System.out.println("avant a="+a + " b = "+b);

        a = a +b;
        b = a-b;
        a = a-b;

        System.out.println("apres a="+a + " b = "+b);
    }
}
