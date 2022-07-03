package glacialMelting;

//TODO: add javadoc
public class YearlyData {
    public int year;
    public double
            temperature,
            glacierVolume,
            seaLevelRise;

    protected YearlyData(int year,
                         double temperature,
                         double glacierVolume,
                         double seaLevelRise) {
        this.year = year;
        this.temperature = temperature;
        this.glacierVolume = glacierVolume;
        this.seaLevelRise = seaLevelRise;
    }
}