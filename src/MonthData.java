public class MonthData {
    int[] days = new int[30];

    void printDayAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println(i + 1 + "день :" + days[i]);
        }
    }
    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps += days[i];
        }
        return sumSteps;
    }
    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            maxSteps += days[i];
        }
        return maxSteps;
    }
    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] >= goalByStepsPerDay) {
                currentSeries++;
            } else {
                if (currentSeries > finalSeries) {
                    finalSeries = currentSeries;
                }
                currentSeries = 0;
            }
        }
        return finalSeries;
    }
    void printDaysandStepsPerMounth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println("День " + (i + 1) + ": " + days[i] + " шагов");
        }
    }

}
