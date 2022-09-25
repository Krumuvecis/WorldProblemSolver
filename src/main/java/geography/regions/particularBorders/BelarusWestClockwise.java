package geography.regions.particularBorders;

import geography.regions.Border;
import geography.regions.Location;

import java.util.ArrayList;

public class BelarusWestClockwise extends Border {
    public BelarusWestClockwise() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Lenino",
                    52.1884463054773, 31.67390427401385));
            add(new Location(
                    "Novaya Guta",
                    52.1005657924268, 30.95217982528073));
            add(new Location(
                    "Chernobyl",
                    51.287551529789205, 30.218024285375392));
            add(new Location(
                    "Brest",
                    52.09188423402427, 23.7670700886953));
            add(new Location(
                    "Grodno",
                    53.65403295707895, 23.80602042158762));
        }});
    }
}