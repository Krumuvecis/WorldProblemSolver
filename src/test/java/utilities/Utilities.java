package utilities;

import java.util.List;

import glacialMelting.YearlyData;

import static consoleUtils.ConsoleUtils.printSeparator;

//TODO: add javadoc
public class Utilities {
    public static abstract class AbstractYearlyDataPrinter {
        public void print(List<YearlyData> yearList) {
            for (YearlyData year : yearList) {
                printSeparator();
                printSingleYear(year);
            }
        }

        public abstract void printSingleYear(YearlyData year);
    }
}