package geography;

import geography.glaciers.GlacierSummary;

import java.math.BigDecimal;

import static utilities.BigDecimalHelper.newBigDecimal;

public class GeographySummary {
    public static BigDecimal totalOceanArea, totalSaharaArea;

    static {
        totalOceanArea = newBigDecimal("3.6",14); //in meters; 3.6*10^14
        totalSaharaArea = newBigDecimal("9.2",12); //in meters; 9.2*10^12
        //glaciers = new GlacierSummary();
    }
}