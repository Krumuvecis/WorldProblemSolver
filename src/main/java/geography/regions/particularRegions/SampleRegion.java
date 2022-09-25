package geography.regions.particularRegions;

import geography.regions.AbstractRegion;
import geography.regions.RegionBorderInfo;
import geography.regions.Border;
import geography.regions.Location;

import java.util.ArrayList;

public class SampleRegion extends AbstractRegion {
    public SampleRegion() {
        super(new ArrayList<>() {{
            add(new RegionBorderInfo(new NorthernBorder(), false));
            add(new RegionBorderInfo(new SouthernBorder(), true));
        }});
    }

    private static class NorthernBorder extends Border {
        NorthernBorder() {
            super(new ArrayList<>() {{
                add(new Location(
                        "west",
                        20, 10));
                add(new Location(
                        "north 1",
                        30, 30));
                add(new Location(
                        "north 2",
                        30, 50));
            }});
        }
    }

    private static class SouthernBorder extends Border {
        SouthernBorder() {
            super(new ArrayList<>() {{
                add(new Location(
                        "south 1",
                        10, 30));
                add(new Location(
                        "south 2",
                        10, 50));
                add(new Location(
                        "east",
                        20, 70));
            }});
        }
    }
}