package geography.regions;

import java.util.Arrays;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import java.awt.*;

import geography.Coordinates;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AbstractRegion {
    private final @NotNull Map<@NotNull Border, @NotNull Boolean> borders; //boolean shows if reversed order

    public AbstractRegion(@Nullable Map<@NotNull Border, @NotNull Boolean> borders) {
        this.borders = Objects.requireNonNullElse(borders, new HashMap<>());
    }

    public @NotNull Polygon getPolygon(int[] drawSize) {
        double[][] totalCoordinateArray = getTotalCoordinateArray();
        int pointCount = totalCoordinateArray.length;
        int[]
                xPoints = new int[pointCount],
                yPoints = new int[pointCount];
        for (int i = 0; i < pointCount; i++) {
            int[] parsedCoordinates = parseCoordinates(totalCoordinateArray[i], drawSize);
            xPoints[i] = parsedCoordinates[0];
            yPoints[i] = parsedCoordinates[1];
        }
        return new Polygon(xPoints, yPoints, pointCount);
    }

    private double[][] getTotalCoordinateArray() {
        double[][] totalCoordinateArray = new double[0][2];
        for (Border border : borders.keySet()) {
            int previousArraySize = totalCoordinateArray.length;
            double[][] borderCoordinateArray = border.getCoordinates();
            //double[][] tempArray = totalCoordinateArray;
            totalCoordinateArray = Arrays.copyOf(
                    totalCoordinateArray,
                    previousArraySize + borderCoordinateArray.length);
            //totalCoordinateArray = new double[previousArraySize + borderCoordinateArray.length][2];
            boolean reverse = borders.get(border);

            for (int i = 0; i < borderCoordinateArray.length; i++) {
                int newIndex;
                if (reverse) {
                    newIndex = totalCoordinateArray.length - 1 - i;
                } else {
                    newIndex = previousArraySize + i;
                }
                totalCoordinateArray[newIndex] = borderCoordinateArray[i];
            }
        }
        return totalCoordinateArray;
    }

    private static int[] parseCoordinates(double[] polar, int[] drawSize) {
        int[] drawable = Coordinates.polarToDrawable(polar, drawSize);
        return new int[] {drawable[0], drawable[1]};
    }
}