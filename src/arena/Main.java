package arena;

public class Main {
    public static void main(String[] args) {

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("[0] - Выход\n[1] - Бой\n[2] - Правила");
            System.out.print("> ");
            int choice = ArenaTools.readNumber(0, 2);
            switch (choice) {
                case 0 -> isRunning = false;
                case 1 -> System.out.println("заглушка");
                case 2 -> ArenaTools.printRules();
            }
        }

    }
}
