package geography.particularRegions;

import geography.AbstractRegion;
import geography.RegionBorderInfo;
import geography.particularBorders.RussiaBelarusSouthwards;
import geography.particularBorders.BelarusWestClockwise;

import java.util.ArrayList;

public class Belarus extends AbstractRegion {
    public Belarus() {
        super(new ArrayList<>() {{
            add(new RegionBorderInfo(new RussiaBelarusSouthwards(), false));
            add(new RegionBorderInfo(new BelarusWestClockwise(), false));
        }});
    }
}