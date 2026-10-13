package arena;

import java.util.Scanner;
import java.util.Random;

public class ArenaTools {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static int rollDamage(int min, int max) {
        if (min < 0) {
            throw new IllegalArgumentException("Минимальный урон " + min + " не может быть отрицательным");
        }
        if (max < min) {
            throw new IllegalArgumentException("Максимальный диапазон не может быть меньше минимального");
        }
        return random.nextInt(min, max + 1);
    }

    public static boolean isCrit(int percent) {
        if (percent > 100 || percent < 0) {
            throw new IllegalArgumentException("Процент должен быть в диапозоне от 0 до 100 {" + percent + "}" );
        }
        int chance = random.nextInt(0, 100);
        return percent > chance;
    }

}
