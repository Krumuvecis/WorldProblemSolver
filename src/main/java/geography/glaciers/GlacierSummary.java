package geography.glaciers;

import java.math.BigDecimal;

import static utilities.BigDecimalHelper.newBigDecimal;

public class GlacierSummary {
    public BigDecimal totalGlacierVolume;

    public GlacierSummary() {
        totalGlacierVolume = newBigDecimal("1.7", 14); //in cubic meters
    }
}