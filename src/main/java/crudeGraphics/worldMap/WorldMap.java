package crudeGraphics.worldMap;

import java.util.Objects;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WorldMap {
    private static final @NotNull String
            commonPath = "src/main/resources/map/",
            equirectangularPath = commonPath + "equirectangular_2058x1036.png",
            mercatorPath = commonPath + "mercator_792x480.png";
    private static final @NotNull ProjectionType
            DEFAULT_PROJECTION = ProjectionType.EQUIRECTANGULAR;
    private final @NotNull ProjectionType projection;

    @SuppressWarnings("unused")
    protected WorldMap() {
        this(null);
    }

    protected WorldMap(@Nullable ProjectionType projection) {
        this.projection = Objects.requireNonNullElse(projection, DEFAULT_PROJECTION);
    }

    protected BufferedImage getImage() throws IOException {
        String filePath;
        switch (projection) {
            case EQUIRECTANGULAR -> filePath = equirectangularPath;
            case MERCATOR -> filePath = mercatorPath;
            default -> throw new IOException();
        }
        return ImageIO.read(new File(filePath));
    }
}