package geography.regions.particularRegions;

import geography.regions.AbstractRegion;
import geography.regions.RegionBorderInfo;
import geography.regions.particularBorders.RussiaBelarusSouthwards;
import geography.regions.particularBorders.RussiaNorthWestClockwise;
import geography.regions.particularBorders.RussiaSouthCounterClockwise;

import java.util.ArrayList;

public class Russia extends AbstractRegion {
    public Russia() {
        super(new ArrayList<>() {{
            add(new RegionBorderInfo(new RussiaNorthWestClockwise(), false));
            add(new RegionBorderInfo(new RussiaSouthCounterClockwise(), true));
            add(new RegionBorderInfo(new RussiaBelarusSouthwards(), true));
        }});
    }
}