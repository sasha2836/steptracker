public class Converter {
    double convertToKm(int steps) {
        double km = steps * 0.75 / 1000;
        return km;
    }
    double convertStepsToKilocallories(int steps) {
        double kl = (steps * 50) / 1000;
        return kl;
    }
}
