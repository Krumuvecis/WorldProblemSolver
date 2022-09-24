package globalWarming;

import historicalData.HistoricalData;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class ClimateChange {

    //assumes constant temperature increase over time
    public static double yearlyTemperatureChange() {
        //https://www.climate.gov/news-features/understanding-climate/climate-change-global-temperature
        double citedTemperatureIncrease = 0.18; // Kelvins
        int durationOfStudy = 10; // years

        return citedTemperatureIncrease / durationOfStudy;
    }

    public static double getAverageTemperatureByYear(int year)
            throws IllegalStateException, IndexOutOfBoundsException {
        @NotNull HistoricalData historicalData = getHistoricalData();
        try {
            return historicalData.getValueAt(year);
        } catch (IndexOutOfBoundsException e) {
            int @Nullable [] bounds = historicalData.getBounds();
            if (bounds == null) {
                throw new IllegalStateException();
            } else {
                if (year > bounds[1]) {
                    //TODO: out of bounds, return estimate
                    int lastRecordedYear = historicalData.getLastKey();
                    return getFutureEstimate(year, lastRecordedYear, historicalData.getValueAt(lastRecordedYear));
                } else {
                    throw e;
                }
            }
        }
    }

    private static @NotNull HistoricalData getHistoricalData() {
        return ClimateData.HISTORICAL_DATA;
    }

    private static double getFutureEstimate(int desiredYear,
                                            int lastHistoricalYear,
                                            double lastRecord) {
        int timeDifference = desiredYear - lastHistoricalYear; // years
        double temperatureChange = timeDifference * yearlyTemperatureChange();
        return lastRecord + temperatureChange;
    }
}