package glacialMeltingBaseTest;

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
        for (YearlyData year : glacialMelting.yearList) {
            separator();
            printLine("year: " + year.year
                    + ", global temperature: +" + doubleToString(year.temperature, 3) + " C");
            printLine("glacier volume: " + doubleToString(year.glacierVolume, 0) + " m3");
            printLine("sea level rise: " + doubleToString(year.seaLevelRise, 3) + " m");
        }
    }
}