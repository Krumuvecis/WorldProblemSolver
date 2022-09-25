package crudeGraphics;

import geography.regions.AbstractRegion;
import geography.regions.particularRegions.SampleRegion;
import geography.regions.particularRegions.Russia;
import geography.regions.particularRegions.Belarus;

import java.util.List;
import java.util.ArrayList;
import java.awt.*;

class RegionPainter {
    private final List<RegionDrawInfo> regionDrawInfo;

    RegionPainter() {
        regionDrawInfo = new ArrayList<>() {{
            add(new RegionDrawInfo(new SampleRegion(), 0, true));
            add(new RegionDrawInfo(new Russia(), 2, true));
            add(new RegionDrawInfo(new Belarus(), 1, true));
        }};
    }

    void paintRegions(Graphics g, int[] drawSize) {
        for (RegionDrawInfo regionInfo : regionDrawInfo) {
            if (regionInfo.draw) {
                switch (regionInfo.dangerLevel) {
                    case 1 -> g.setColor(new Color(255, 220, 20, 170));
                    case 2 -> g.setColor(new Color(255, 30, 20, 170));
                    default -> g.setColor(new Color(20, 200, 255, 170));
                }
                paintRegion(g, drawSize, regionInfo.region);
            }
        }
    }

    private void paintRegion(Graphics g, int[] drawSize, AbstractRegion region) {
        g.fillPolygon(region.getPolygon(drawSize));
    }

    private static class RegionDrawInfo {
        AbstractRegion region;
        int dangerLevel; // 0; 1; 2
        boolean draw;

        RegionDrawInfo(AbstractRegion region, int dangerLevel, boolean draw) {
            this.region = region;
            this.dangerLevel = dangerLevel;
            this.draw = draw;
        }
    }
}