package geography.glaciers;

import geography.GeographySummary;

public class GlacierSummary {

    private static final double GLACIER_VOLUME_2022 = 1.7 * Math.pow(10, 14); //in cubic meters
    private static final double GLACIER_VOLUME_CHANGE_2022 = -(GLACIER_VOLUME_2022 / 50); //in cubic meters

    public static double maxGlacierVolume(double temperature) {
        //TODO: finish this
        double coefficient = GLACIER_VOLUME_CHANGE_2022; //function k - probably negative
        double offset = GLACIER_VOLUME_2022 - GeographySummary.GLOBAL_TEMPERATURE_2022 * coefficient; //function b
        return Math.max(0, temperature * coefficient + offset);
    }
}