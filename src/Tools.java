public class Tools {

    /** Проверка строки на палиндром */
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replace(" ", "");
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    /** Сумма цифр в числе */
    public static int sumOfDigits(int n) {
        n = Math.abs(n);
        int total = 0;
        while (n > 0) {
            total += n % 10;
            n /= 10;
        }
        return total;
    }

    /** Проверка на простое число */
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int k = 2; k * k <= n; k++) {
            if (n % k == 0) {
                return false;
            }
        }
        return true;
    }

}
