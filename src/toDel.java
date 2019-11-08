import java.math.BigDecimal;

public class toDel {
    public static void main(String[] args) {
        factoriel(5);

    }
    /*
    * 5! = 5 * 4 * 3 * 2 * 1
    * 4! = 4 * 3 * 2 * 1
    * 5! = 5 * 4!
    * 0! = 1
    * */

    public static int factoriel(int nbr){
        if (nbr < 0){
            return -1;
        }
        if (nbr == 0){
            return 1;
        }
        System.out.println(nbr);
        int result = nbr * factoriel(nbr-1);
        System.out.println(nbr);
        return result;
    }



}
