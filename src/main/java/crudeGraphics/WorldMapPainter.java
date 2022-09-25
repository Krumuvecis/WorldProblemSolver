package crudeGraphics;

import java.util.Objects;
import java.io.IOException;
import java.awt.*;
import java.awt.image.ImageObserver;

import org.jetbrains.annotations.NotNull;

class WorldMapPainter {
    private static final @NotNull WorldMap.WorldMapType
            DEFAULT_PROJECTION = WorldMap.WorldMapType.EQUIRECTANGULAR;
    private final @NotNull WorldMap.WorldMapType projection;

    WorldMapPainter() {
        this(null);
    }

    WorldMapPainter(WorldMap.WorldMapType projection) {
        this.projection = Objects.requireNonNullElse(projection, DEFAULT_PROJECTION);
    }

    void paintMap(Graphics g, ImageObserver observer, int[] drawSize) {
        WorldMap.WorldMapType projection = WorldMap.WorldMapType.EQUIRECTANGULAR;
        try {
            Image resizedMap = WorldMap.getWorldMapImage(projection).getScaledInstance(
                    drawSize[0], drawSize[1],
                    Image.SCALE_SMOOTH);
            g.drawImage(resizedMap, 0, 0, observer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}