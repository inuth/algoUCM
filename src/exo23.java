public class exo23 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        int i = 0;
        int temp = 2;
        while(i < tab.length)
        {
            tab[i] = temp;
            temp *= 2;
            i++;
        }

        i = 0;
        System.out.print(" | ");
        while (i < tab.length)
        {
            System.out.print(tab[i]+" | ");
            i++;
        }
    }
}
