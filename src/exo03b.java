public class exo03b {
    public static void main(String[] args) {
        int a, b, c, d, e;
        a = 8%3;
        // 2
        b = 4 +a;
        // 6
        c = b*a;
        // 12
        d = (c-a)*b;
        // 60
        e = ((a+7)*(d/a))*0;
        // 0
        System.out.println("a="+a+", b="+b+", c ="+c+", d="+d+"e= "+e);

    }
}
