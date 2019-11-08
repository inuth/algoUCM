public class exo26 {
    public static void main(String[] args) {
        int[] tab = {1,4,3,5,2};
        int temp;

        for (int i = tab.length; i > 1 ; i--) {
            for (int j = 0; j < i - 1; j++) {
                if(tab[j+1] < tab[j])
                {
                    temp = tab[j+1];
                    tab[j+1] = tab[j];
                    tab[j] = temp;
                }
            }
        }

        System.out.print("|");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " | ");
        }
    }
}
