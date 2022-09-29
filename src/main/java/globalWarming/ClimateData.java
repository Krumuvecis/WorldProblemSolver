package globalWarming;

import historicalData.HistoricalData;
import abstractStatistics.SimpleRecord;

import org.jetbrains.annotations.NotNull;

public class ClimateData {

    //yearly global average temperature
    public static final @NotNull HistoricalData HISTORICAL_DATA = new HistoricalData() {
        {
            //2020 climate report study, TODO: get source
            add(2020, new SimpleRecord(13.9));
        }
    };
}