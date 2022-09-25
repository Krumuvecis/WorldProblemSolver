package geography.regions.particularRegions;

import geography.regions.Location;

import java.util.ArrayList;
import java.util.List;

public abstract class RoughRussia /*extends AbstractRegion*/ {
    private static final Location
            west = new Location(
                    "Zilupe",
                    56.38599669655892, 28.11822037999451),
            east = new Location(
                    "Anadyr",
                    64.67176159066214, 177.38919121179643);

    private static final List<Location>
            northernBorder = new ArrayList<>() {
                {
                    add(new Location(
                            "Narva",
                            59.370481867793615, 28.169117565015192));
                    add(new Location(
                            "Murmansk",
                            68.96407408832415, 33.04263265722734));
                    //TODO: finish this
                }
            },
            southernBorder = new ArrayList<>() {
                {
                    add(new Location(
                            "Kerch strait",
                            45.206991993143575, 36.611975365031476));
                    add(new Location(
                            "Sochi",
                            43.570233889524566, 39.746514173975655));
                    add(new Location(
                            "Derbent",
                            42.051154397196896, 48.29154199287194));
                    add(new Location(
                            "Astrakhan",
                            46.365573248440185, 48.0623604426328));
                    add(new Location(
                            "Gmelinka",
                            50.36361790019497, 46.89722491767021));
                    add(new Location(
                            "Pogodayev",
                            51.68107282933388, 51.05869947217407));
                    add(new Location(
                            "Orsk",
                            51.18287125686199, 58.515547461632295));
                    add(new Location(
                            "Troitsk",
                            54.048521783346786, 61.56927851952059));
                    //TODO: finish this
                }
            };
    public RoughRussia() {
        /*super(
                west.getCoordinates(),
                east.getCoordinates(),
                getBorderCoordinates(northernBorder), //north, clockwise
                getBorderCoordinates(southernBorder)); //south, counter-clockwise*/
    }
}