package geography.particularRegions;

import geography.AbstractRegion;
import geography.RegionBorderInfo;
import geography.particularBorders.RussiaNorthWestClockwise;
import geography.particularBorders.RussiaSouthCounterClockwise;
import geography.particularBorders.RussiaBelarusSouthwards;

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