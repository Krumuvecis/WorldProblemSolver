package glacialMeltingBaseTest;

import glacialMelting.GlacialMelting;

import static outputUtilities.OutputUtilities.printLine;
import static outputUtilities.OutputUtilities.separator;
import static utilities.TextFormatter.doubleToString;

public class GlacialMeltingBaseTest {
    private static GlacialMelting glacialMelting;

    public static void main(String[] args) {
        int yearsToCalculate = 50;
        prepareGlacialMelting(yearsToCalculate);
        output();
    }

    private static void prepareGlacialMelting(int years) {
        glacialMelting = new GlacialMelting(years);
    }

    private static void output() {
        for (GlacialMelting.YearlyData year : glacialMelting.yearList) {
            separator();
            printLine("year: " + year.year
                    + ", temperature: +" + doubleToString(year.temperature, 1) + " C");
            printLine("glacier volume: " + doubleToString(year.glacierVolume, 2) + "%");
        }
    }
}