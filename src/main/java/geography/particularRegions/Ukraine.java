package geography.particularRegions;

import geography.AbstractRegion;
import geography.RegionBorderInfo;
import geography.particularBorders.*;

import java.util.ArrayList;

public class Ukraine extends AbstractRegion {
    public Ukraine() {
        super(new ArrayList<>() {{
            add(new RegionBorderInfo(new UkraineBelarusEastwards(), false));
            //add(new RegionBorderInfo(new (), false));
        }});
    }
}