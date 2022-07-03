package glacialMeltingBaseTest;

import glacialMelting.GlacialMelting;

import static outputUtilities.OutputUtilities.printLine;
import static outputUtilities.OutputUtilities.separator;
import static utilities.TextFormatter.doubleToString;

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
        for (GlacialMelting.YearlyData year : glacialMelting.yearList) {
            separator();
            printLine("year: " + year.year
                    + ", temperature: +" + doubleToString(year.temperature, 1) + " C");
            printLine("glacier volume: " + doubleToString(year.glacierVolume, 2) + "%");
        }
    }
}