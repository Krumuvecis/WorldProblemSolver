package saharaSolution.waterLayer;

import geography.GeographySummary;

import java.math.BigDecimal;

import static utilities.BigDecimalHelper.newBigDecimal;

public class WaterLayer {
    public BigDecimal maxHeight = newBigDecimal("10",0);

    WaterLayer() {

    }

    private BigDecimal getMaxVolume() {
        return GeographySummary.totalSaharaArea.multiply(maxHeight);
    }
}