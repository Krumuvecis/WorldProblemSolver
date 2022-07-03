package geography.waters;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

class Ocean {
    private static final String UNDEFINED_NAME = "An unnamed ocean";
    private final String name;
    private final double area;

    /**
     * Creates a new ocean.
     *
     * @param name Name of the ocean
     * @param area Area of the ocean in millions of km2.
     */
    protected Ocean(@Nullable String name, double area) {
        this.name = Objects.requireNonNullElse(name, UNDEFINED_NAME);
        this.area = area * getAreaConversionFactor(); // converts to m2
    }

    private static double getAreaConversionFactor() {
        double million = Math.pow(10, 6);
        double squareKilometer = Math.pow(10, 6);
        return million * squareKilometer;
    }

    protected @NotNull String getName() {
        return name;
    }

    protected double getArea() {
        return area;
    }
}
