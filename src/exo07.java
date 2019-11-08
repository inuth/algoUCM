public class exo07 {
    public static void main(String[] args) {
        int year = 1997;
        if((year%4==0 && year % 100 != 0) || (year%400 == 0))
        {
            System.out.println(year+" est une année bissextile");
        }
        else
        {
            System.out.println(year+" n'est pas une année bissextile");
        }
    }
}
