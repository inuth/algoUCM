public class exo32 {
    public static void main(String[] args) {
        int[] tab1 = new int[]{7,9,1,4,6,8,4};
        boolean[] tab1Check = new boolean[tab1.length];
        int[] tab2 = new int[]{14,9,4,78,23,6};
        boolean[] tab2Check = new boolean[tab2.length];

        int[] tab3 = new int[tab1.length + tab2.length];
        for (int i = 0; i < tab3.length; i++) {
            int minTab1 = Integer.MAX_VALUE;
            int posMinTab1 = -1;

            int minTab2 = Integer.MAX_VALUE;
            int posMinTab2 = -1;

            for (int j = 0; j < tab1.length; j++) {
                if (!tab1Check[j] && tab1[j] < minTab1){
                    minTab1 = tab1[j];
                    posMinTab1 = j;

                }
            }
            for (int j = 0; j < tab2.length; j++) {
                if (!tab2Check[j] && tab2[j] < minTab2){
                    minTab2 = tab2[j];
                    posMinTab2 = j;

                }
            }

            if (minTab1 < minTab2){
                tab3[i] = minTab1;
                tab1Check[posMinTab1] = true;
            }
            else {
                tab3[i] = minTab2;
                tab2Check[posMinTab2] = true;
            }
        }

        for (int i = 0; i < tab3.length; i++) {
            System.out.println(tab3[i]);
        }
    }

}
