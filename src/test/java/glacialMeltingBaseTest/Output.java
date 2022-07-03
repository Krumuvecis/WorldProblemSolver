package glacialMeltingBaseTest;

import geography.waters.OpenWaters;
import glacialMelting.GlacialMelting;
import glacialMelting.YearlyData;

import static utilities.Utilities.*;

import org.jetbrains.annotations.NotNull;

/**
 * A utility class for output.
 */
class Output {
    /**
     * Run this to print output.
     *
     * @param glacialMelting A GlacialMelting object.
     */
    protected static void output(@NotNull GlacialMelting glacialMelting) {
        printInitialParameters();
        printYearlyData(glacialMelting);
    }

    private static void printInitialParameters() {
        printLine("Initial parameters:");
        printLine("Total ocean area: "
                + doubleToString(OpenWaters.totalOceanArea() / Math.pow(10, 12), 0)
                + " millions of km2");
    }

    private static void printYearlyData(@NotNull GlacialMelting glacialMelting) {
        for (YearlyData year : glacialMelting.yearList) {
            separator();
            printLine("Year: "
                    + year.year
                    + ", global temperature: +"
                    + doubleToString(year.temperature, 1)
                    + " C");
            printLine("glacier volume: "
                    + doubleToString(year.glacierVolume / Math.pow(10, 12), 1)
                    + " thousands of km3");
            printLine("sea level rise: "
                    + doubleToString(year.seaLevelRise * 100, 2)
                    + " cm");
        }
    }
}