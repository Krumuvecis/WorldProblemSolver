package geography.regions;

import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Location {
    private static final String DEFAULT_NAME = "Location";
    public final String name;
    public final double latitude, longitude;

    public Location(@Nullable String name, double latitude, double longitude) {
        this.name = Objects.requireNonNullElse(name, DEFAULT_NAME);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    double @NotNull [] getCoordinates() {
        return new double[] {
                Math.toRadians(longitude),
                Math.toRadians(latitude)};
    }
}