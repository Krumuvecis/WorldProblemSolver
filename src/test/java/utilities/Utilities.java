package utilities;

import java.util.List;
import java.util.Objects;
import java.text.DecimalFormat;

import glacialMelting.YearlyData;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class Utilities {
    private static final String
            NUMBER_SYMBOL = "#",
            DECIMAL_SEPARATOR = ".";
    public static String doubleToString(double d, int decimalPlaces) {
        return getDecimalFormat(decimalPlaces).format(d);
    }

    private static DecimalFormat getDecimalFormat(int decimalPlaces) {
        StringBuilder formatStringBuilder = new StringBuilder(NUMBER_SYMBOL);
        if (decimalPlaces > 0) {
            formatStringBuilder.append(DECIMAL_SEPARATOR);
            formatStringBuilder.append(NUMBER_SYMBOL.repeat(decimalPlaces));
        }
        return new DecimalFormat(formatStringBuilder.toString());
    }

    /**
     * Prints a line to console.
     *
     * @param line Line to print.
     */
    public static void printLine(@Nullable String line) {
        System.out.println(Objects.requireNonNullElse(line, ""));
    }

    /**
     * Prints a separator to console.
     */
    public static void separator() {
        printLine("-".repeat(12));
    }

    public static abstract class AbstractYearlyDataPrinter {
        public void print(List<YearlyData> yearList) {
            for (YearlyData year : yearList) {
                separator();
                printSingleYear(year);
            }
        }

        public abstract void printSingleYear(YearlyData year);
    }
}