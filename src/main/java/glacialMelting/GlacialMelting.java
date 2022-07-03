package glacialMelting;

import geography.GeographySummary;
import geography.glaciers.GlacierSummary;

import java.util.ArrayList;
import java.util.List;

import static geography.GeographySummary.GLOBAL_TEMPERATURE_2022;

//TODO: finish this and add javadoc
public class GlacialMelting {
    private static final YearlyData FIRST_YEAR = new YearlyData(
            2022,
            GLOBAL_TEMPERATURE_2022,
            GlacierSummary.maxGlacierVolume(GLOBAL_TEMPERATURE_2022),
            0);

    public List<YearlyData> yearList;

    public GlacialMelting(int years) {
        prepareYearList(years);
    }

    private void prepareYearList(int years) {
        addFirstYear();
        double  temperature = FIRST_YEAR.temperature,
                glacierVolume = FIRST_YEAR.glacierVolume,
                seaLevelRise = FIRST_YEAR.seaLevelRise;

        int     startingYear = FIRST_YEAR.year + 1,
                endYear = startingYear + years + 1;
        for (int year = startingYear; year < endYear; year++) {
            temperature += GeographySummary.yearlyTemperatureChange();
            double glacierVolumeChange = glacierVolumeChange(temperature, glacierVolume);
            glacierVolume += glacierVolumeChange;
            seaLevelRise += seaLevelRise(glacierVolumeChange);

            yearList.add(new YearlyData(year, temperature, glacierVolume, seaLevelRise));
        }
    }

    private void addFirstYear() {
        yearList = new ArrayList<>();
        yearList.add(FIRST_YEAR);
    }

    private static double glacierVolumeChange(double temperature, double previousVolume) {
        return GlacierSummary.maxGlacierVolume(temperature) - previousVolume;
    }

    private static double seaLevelRise(double glacierVolumeChange) {
        return -glacierVolumeChange / GeographySummary.totalOceanArea;
    }
}