public class exo06 {
    public static void main(String[] args) {
        //  A = 3, B = 9, C = Faux, D = NON (C), E = 9.
        int A = 3, B = 9, E = 9;
        boolean C = false, D = !C;

        //1. (A > 8)
        System.out.println("1. "+(A > 8));
        // (3 > 8)
        // false

        // 2. (B == 9)
        System.out.println("2. "+(B == 9));
        // (9 == 9)
        // true

        // 3. (NON(A != 3))
        System.out.println("3. "+(!(A != 3)));
        // (NON(3 != 3))
        // (NON(false))
        // true

        // 4. (NON(C))
        System.out.println("4. "+(!(C)));
        // (NON(false))
        // true

        // 5. ((A < B) OU C)
        System.out.println("5. "+((A < B) || C));
        // ((3 < 9) OU false)
        // (true OU false)
        // true

        // 6. NON((A + B) != 12)
        System.out.println("6. "+(!((A + B) != 12)));
        // NON((3 + 9) != 12)
        // NON(12 != 12)
        // NON(false)
        // true

        // 7. ((B == 5) OU ( (E > 10) ET (A < 8) ))
        System.out.println("7. "+((B == 5) || ( (E > 10) && (A < 8) )));
        // ((9 == 5) OU ( (9 > 10) ET (3 < 8) ))
        // (false OU ( false ET true ))
        // (false OU false)
        // false

        // 8. ((((B == 5) OU ((E > 10) ET (A < 8))) OU (A < B) OU C) ET C)
        System.out.println("8. "+ ((((B == 5) || ((E > 10) && (A < 8))) || (A < B) || C) && C));
        // ((((B == 5) OU ((E > 10) ET (A < 8))) OU (A < B) OU C) ET false)
        // false

        // 9. A != 3
        System.out.println("9. "+(A != 3));
        // 3 != 3
        // false

        // 10. !(D) || C
        System.out.println("10. "+(!(D) || C));
        // !(true) || false
        // false || false
        // false

        // 11. ((A + B) == 12) && D
        System.out.println("11. "+(((A + B) == 12) && D));
        // ((3 + 9) == 12) && true
        // (12 == 12) && true
        // true && true
        // true

    }
}
