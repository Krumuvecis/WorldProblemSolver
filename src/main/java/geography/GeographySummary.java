package geography;

public class GeographySummary {
    public static final double totalOceanArea = 3.6 * Math.pow(10, 14); //in meters
    public static final double GLOBAL_TEMPERATURE_2022 = 13.9;

    public static final double totalSaharaArea = 9.2 * Math.pow(10, 12); //in meters

    public static double yearlyTemperatureChange() {
        //https://www.climate.gov/news-features/understanding-climate/climate-change-global-temperature
        return 0.18 / 10;
    }
}