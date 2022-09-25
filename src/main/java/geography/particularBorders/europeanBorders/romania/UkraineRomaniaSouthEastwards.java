package geography.particularBorders.europeanBorders.romania;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class UkraineRomaniaSouthEastwards extends AbstractBorder {
    public UkraineRomaniaSouthEastwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Giurgiulesti",
                    45.4740227215942, 28.203272065434106));
            add(new Location(
                    "Cardon",
                    45.26210961214868, 29.672225602400413));
        }});
    }
}