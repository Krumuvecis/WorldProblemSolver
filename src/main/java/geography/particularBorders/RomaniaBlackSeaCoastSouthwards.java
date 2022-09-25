package geography.particularBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class RomaniaBlackSeaCoastSouthwards extends AbstractBorder {
    public RomaniaBlackSeaCoastSouthwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Cardon",
                    45.26210961214868, 29.672225602400413));
            add(new Location(
                    "Vama Veche",
                    43.74862931043579, 28.576014547346777));
        }});
    }
}