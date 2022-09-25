package geography.particularBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class RussiaNorthWestClockwise extends AbstractBorder {
    public RussiaNorthWestClockwise() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Ignalino",
                    56.08382855179491, 28.282544362741156));
            add(new Location(
                    "Narva",
                    59.375673218491244, 28.191094467038518));
            add(new Location(
                    "Murmansk",
                    68.96407408832415, 33.04263265722734));
            /*add(new Location(
                    "",
                    ));
            add(new Location(
                    "",
                    ));*/
        }});
    }
}