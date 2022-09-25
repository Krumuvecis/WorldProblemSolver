package geography.regions.particularRegions;

import geography.regions.AbstractRegion;
import geography.regions.RegionBorderInfo;
import geography.regions.particularBorders.BelarusWestClockwise;
import geography.regions.particularBorders.RussiaBelarusSouthwards;

import java.util.ArrayList;

public class Belarus extends AbstractRegion {
    public Belarus() {
        super(new ArrayList<>() {{
            add(new RegionBorderInfo(new RussiaBelarusSouthwards(), false));
            add(new RegionBorderInfo(new BelarusWestClockwise(), false));
        }});
    }
}