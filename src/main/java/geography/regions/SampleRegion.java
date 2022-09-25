package geography.regions;

import java.util.ArrayList;
import java.util.HashMap;

public class SampleRegion extends AbstractRegion {
    public SampleRegion() {
        super(new HashMap<>() {{
            put(new Border(new ArrayList<>() {{ //northern border
                add(new Location(
                        "west",
                        20, 10));
                add(new Location(
                        "north 1",
                        30, 30));
                add(new Location(
                        "north 2",
                        30, 50));
            }}), false); //clockwise
            put(new Border(new ArrayList<>() {{ //southern border
                add(new Location(
                        "south 1",
                        10, 30));
                add(new Location(
                        "south 2",
                        10, 50));
                add(new Location(
                        "east",
                        20, 70));
            }}), true); //counter-clockwise
        }});
    }
}
