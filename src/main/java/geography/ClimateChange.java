package geography;

//TODO: add javadoc
public class ClimateChange {
    public static final double GLOBAL_TEMPERATURE_2022 = 13.9;

    //assumes constant temperature increase over time
    public static double yearlyTemperatureChange() {
        //https://www.climate.gov/news-features/understanding-climate/climate-change-global-temperature
        return 0.18 / 10;
    }
}