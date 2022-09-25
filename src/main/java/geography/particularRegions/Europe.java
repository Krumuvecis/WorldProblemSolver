package geography.particularRegions;

import geography.AbstractRegion;
import geography.RegionBorderInfo;
import geography.particularBorders.*;
import geography.particularBorders.europeanBorders.*;
import geography.particularBorders.europeanBorders.romania.RomaniaMoldovaSouthwards;
import geography.particularBorders.europeanBorders.romania.UkraineRomaniaNorthEastwards;
import geography.particularBorders.europeanBorders.romania.UkraineRomaniaSouthEastwards;

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
            add(new RegionBorderInfo(new PolandUkraineSouthwards(), false));
            add(new RegionBorderInfo(new UkraineSlovakiaSouthwards(), false));
            add(new RegionBorderInfo(new UkraineHungarySouthwards(), false));
            add(new RegionBorderInfo(new UkraineRomaniaNorthEastwards(), false));
            add(new RegionBorderInfo(new RomaniaMoldovaSouthwards(), false));
            add(new RegionBorderInfo(new UkraineRomaniaSouthEastwards(), false));
            /*add(new RegionBorderInfo(new (), false)); //romania black-sea coast
            add(new RegionBorderInfo(new (), false)); //bulgaria black-sea coast
            add(new RegionBorderInfo(new (), false)); //turkey-bulgaria
            add(new RegionBorderInfo(new (), false)); //turkey-greece
            add(new RegionBorderInfo(new (), false)); //greece mediterranean coast
            add(new RegionBorderInfo(new (), false)); //europe common mediterranean coast
            add(new RegionBorderInfo(new (), false)); //europe common atlantic coast*/
        }});
    }
}