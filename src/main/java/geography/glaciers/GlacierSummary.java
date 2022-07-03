package geography.glaciers;

import geography.ClimateChange;

import java.util.List;
import java.util.ArrayList;

//TODO: add javadoc
public class GlacierSummary {
    private static final double TOTAL_GLACIER_VOLUME_2022 = 1.7 * Math.pow(10, 14); //in cubic meters
    private static final double TOTAL_GLACIER_VOLUME_CHANGE_2022 = -(TOTAL_GLACIER_VOLUME_2022 * 0.02); //in cubic meters

    static List<Glacier> glacierList;

    static {
        glacierList = new ArrayList<>();
        glacierList.add(new Glacier(
                "Total",
                new GlacierReference2022(
                        TOTAL_GLACIER_VOLUME_2022,
                        TOTAL_GLACIER_VOLUME_CHANGE_2022)));
    }

    public static double maxGlacierVolume(double temperature) {
        double sum = 0;
        for (Glacier glacier : glacierList) {
            sum += glacier.getMaxGlacierVolume(temperature);
        }
        return sum;
    }

    static class Glacier {
        String name;
        GlacierReference glacierReference;

        Glacier(String name, GlacierReference glacierReference) {
            this.name = name;
            this.glacierReference = glacierReference;
        }

        double getMaxGlacierVolume(double temperature) {
            double deltaT = temperature - glacierReference.getGlobalTemperature();
            double yearsSinceReference = deltaT / ClimateChange.yearlyTemperatureChange();

            return yearsSinceReference * glacierReference.getGlacierVolumeChange() + glacierReference.getGlacierVolume();
        }
    }

    static class GlacierReference {
        private final double
                globalTemperature,
                glacierVolume,
                glacierVolumeChange;

        GlacierReference(double globalTemperature,
                         double glacierVolume,
                         double glacierVolumeChange) {
            this.globalTemperature = globalTemperature;
            this.glacierVolume = glacierVolume;
            this.glacierVolumeChange = glacierVolumeChange;
        }

        double getGlobalTemperature() {
            return globalTemperature;
        }

        double getGlacierVolume() {
            return glacierVolume;
        }

        double getGlacierVolumeChange() {
            return glacierVolumeChange;
        }
    }

    static class GlacierReference2022 extends GlacierReference {
        GlacierReference2022(double glacierVolume, double glacierVolumeChange) {
            super(ClimateChange.GLOBAL_TEMPERATURE_2022, glacierVolume, glacierVolumeChange);
        }
    }
}