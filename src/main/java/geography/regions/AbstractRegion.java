package geography.regions;

import org.jetbrains.annotations.NotNull;

public class AbstractRegion {
    public final double[] westernExtreme, easternExtreme;
    public final double[][] northernBorder, southernBorder;

    public AbstractRegion(double @NotNull [] westernExtreme,
                   double @NotNull [] easternExtreme,
                   double @NotNull [] @NotNull [] northernBorder,
                   double @NotNull [] @NotNull [] southernBorder) {
        this.westernExtreme = westernExtreme;
        this.easternExtreme = easternExtreme;
        this.northernBorder = northernBorder;
        this.southernBorder = southernBorder;
    }
}