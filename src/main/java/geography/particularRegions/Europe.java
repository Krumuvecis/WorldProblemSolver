package geography.particularRegions;

import geography.AbstractRegion;
import geography.RegionBorderInfo;
import geography.particularBorders.*;

import java.util.ArrayList;

public class Europe extends AbstractRegion {
    public Europe() {
        super(new ArrayList<>() {{
            add(new RegionBorderInfo(new RussiaNorwayNorthwards(), true));
            add(new RegionBorderInfo(new RussiaFinlandNorthwards(), true));
            add(new RegionBorderInfo(new RussiaBalticCoastNorthwards(), true));
            add(new RegionBorderInfo(new RussiaEstoniaSouthwards(), false));
            add(new RegionBorderInfo(new RussiaLatviaSouthwards(), false));
            add(new RegionBorderInfo(new BelarusWestNorthwards(), true));
            //add(new RegionBorderInfo(new (), false));
        }});
    }
}