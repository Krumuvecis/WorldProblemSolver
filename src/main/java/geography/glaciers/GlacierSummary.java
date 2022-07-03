package geography.glaciers;

import geography.GeographySummary;

public class GlacierSummary {

    private static final double GLACIER_VOLUME_2022 = 1.7 * Math.pow(10, 14); //in cubic meters
    private static final double GLACIER_VOLUME_CHANGE_2022 = -(GLACIER_VOLUME_2022 / 50); //in cubic meters

    public static double maxGlacierVolume(double temperature) {
        return GLACIER_VOLUME_2022 * (1 + (GeographySummary.GLOBAL_TEMPERATURE_2022 - temperature) / (50 * GeographySummary.yearlyTemperatureChange()));
    }
}