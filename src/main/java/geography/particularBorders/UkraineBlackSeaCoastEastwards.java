package geography.particularBorders;

import geography.AbstractBorder;
import geography.Location;

import java.util.ArrayList;

public class UkraineBlackSeaCoastEastwards extends AbstractBorder {
    public UkraineBlackSeaCoastEastwards() {
        super(new ArrayList<>() {{
            add(new Location(
                    "Cardon",
                    45.26210961214868, 29.672225602400413));
            add(new Location(
                    "Yuzhne",
                    46.62527079320756, 31.109867595444207));
            add(new Location(
                    "Foros",
                    44.407635201380806, 33.772198761474584));
            add(new Location(
                    "Kerch strait",
                    45.206991993143575, 36.611975365031476));
        }});
    }
}