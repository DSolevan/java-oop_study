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

    public static String drawHealth(int currentHealth, int maxHealth) {
        if (maxHealth <= 0) {
            throw new IllegalArgumentException("Здоровье не может равняться 0 или быть меньше");
        }
        if (currentHealth > maxHealth) {
            throw new IllegalArgumentException("Текущее здоровье не может быть больше максимального");
        }
        if (currentHealth < 0) {
            throw new IllegalArgumentException("Здоровье не может опуститься ниже нуля");
        }
        StringBuilder sb = new StringBuilder();
        int filledCells = (int) Math.ceil((double) currentHealth / maxHealth * 10);
        for (int i = 0; i <= 9; i++) {
            if (filledCells > i) {
                sb.append("█");
            } else {
                sb.append("░");
            }
        }
        sb.append(" HP: ").append(currentHealth).append("/").append(maxHealth);
        String result = sb.toString();
        return result;
    }

    public static int readNumber(int max) {
        if (max < 1) {
            throw new IllegalArgumentException("Диапазон неверен");
        }
        while (true) {
            String line = scanner.nextLine();
            try {
                int n = Integer.parseInt(line.trim());
                if (n >= 1 && n <= max) {
                    return n;
                }
                System.out.println("Число не в диапазоне от 1 до " + max);
            } catch (NumberFormatException e) {
                System.out.println("Это не число, попробуйте ещё раз");
            }
        }
    }
}
