package geography.glaciers;

import geography.ClimateChange;

//TODO: add javadoc
public class GlacierSummary {
    private static final double GLACIER_VOLUME_2022 = 1.7 * Math.pow(10, 14); //in cubic meters
    private static final double GLACIER_VOLUME_CHANGE_2022 = -(GLACIER_VOLUME_2022 * 0.02); //in cubic meters

    public static double maxGlacierVolume(double temperature) {
        return (temperature - ClimateChange.GLOBAL_TEMPERATURE_2022)
                * GLACIER_VOLUME_CHANGE_2022 / ClimateChange.yearlyTemperatureChange()
                + GLACIER_VOLUME_2022;
    }
}