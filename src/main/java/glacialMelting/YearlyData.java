package glacialMelting;

public class YearlyData {
    public int year;
    public double temperature;
    public double glacierVolume;

    protected YearlyData(int year, double temperature, double glacierVolume) {
        this.year = year;
        this.temperature = temperature;
        this.glacierVolume = glacierVolume;
    }
}