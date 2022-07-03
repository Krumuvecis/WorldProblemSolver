package glacialMelting;

import java.util.ArrayList;
import java.util.List;

public class GlacialMelting {
    private static final double GLOBAL_TEMPERATURE = 13.9;
    private static final YearlyData FIRST_YEAR = new YearlyData(
            2022,
            GLOBAL_TEMPERATURE,
            maxGlacierVolume(GLOBAL_TEMPERATURE));

    public List<YearlyData> yearList;

    public GlacialMelting(int years) {
        prepareYearList(years);
    }

    private void prepareYearList(int years) {
        addFirstYear();
        double  temperature = FIRST_YEAR.temperature;
        int     startingYear = FIRST_YEAR.year + 1,
                endYear = startingYear + years + 1;
        for (int year = startingYear; year < endYear; year++) {
            temperature += yearlyTemperatureChange();
            yearList.add(new YearlyData(year, temperature, maxGlacierVolume(temperature)));
        }
    }

    private void addFirstYear() {
        yearList = new ArrayList<>();
        yearList.add(FIRST_YEAR);
    }

    private static double maxGlacierVolume(double temperature) {
        double coefficient = -20; //function k - probably negative
        double offset = 100 - 13.9 * coefficient; //function b
        return Math.max(0, temperature * coefficient + offset);
    }

    static double yearlyTemperatureChange() {
        return 0.1;
    }
}