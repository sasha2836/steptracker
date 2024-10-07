//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    import java.util.Scanner;

    class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            StepTracker stepTracker = new StepTracker(scanner);
            while (true) {
                printMenu();
                int i = scanner.nextInt();
                if (i == 1) {
                    stepTracker.addNewNumberStepsPerDay();
                } else if (i == 2) {
                    stepTracker.changeStepGoal();
                } else if (i == 3) {
                    stepTracker.printStatistic();
                } else if (i == 4) {
                    break;
                } else {
                    System.out.println("Такой команды нет.");
                }
            }
    }

    static void printMenu() {
        System.out.println("Добро пожаловать в приложение.");
        System.out.println("Внести количество шагов за определеный день - 1");
        System.out.println("Изменить цель шагов - 2");
        System.out.println("Посмотреть статистику за определеный месяц - 3");
        System.out.println("Выход из системы - 4");
    }
}