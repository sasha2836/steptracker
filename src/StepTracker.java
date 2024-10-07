import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    Converter converter = new Converter();
    int stepsGo = 10000;
    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int monthNumber = scanner.nextInt();
        System.out.println("Введите день от 1 до 30 (включительно)");
        int monthDay = scanner.nextInt();
        System.out.println("Введите количество шагов");
        int monthSteps = scanner.nextInt();
        MonthData monthData = monthToData[monthNumber - 1];
        monthData.days[monthDay - 1] = monthSteps;
    }
    void changeStepGoal() {
        System.out.println("Какая новая цель?");
        int newGo = scanner.nextInt();
        stepsGo = newGo;
    }
    void printStatistic() {
        System.out.println("Введите число месяца");
        int month = scanner.nextInt();
        MonthData monthData = monthToData[month - 1];
        monthData.printDaysandStepsPerMounth();
        System.out.println("Всего шагов за месяц " + monthData.sumStepsFromMonth() + ".");
        System.out.println("Максимальное количество шагов за день " + monthData.maxSteps());
        System.out.println("Лучшая серия " + monthData.bestSeries(stepsGo));
        System.out.println("Всего проидино километров " + converter.convertToKm(monthData.sumStepsFromMonth()));
        System.out.println("Всего сожено килокалорий " + converter.convertStepsToKilocallories(monthData.sumStepsFromMonth()));

    }

}
