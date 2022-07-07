package utilities;

import java.util.List;

import glacialMelting.YearlyData;

import static consoleUtils.ConsoleUtils.separator;

//TODO: add javadoc
public class Utilities {
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