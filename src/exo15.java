public class exo15 {
    public static void main(String[] args) {
        int i = 1, j;
        while(i <= 10)
        {
            System.out.println("la table par "+i);
            j=1;
            while(j <= 10)
            {
                System.out.println(i + " x "+ j + " = " + (i*j));
                j++;
            }
            i++;
        }
    }
}
