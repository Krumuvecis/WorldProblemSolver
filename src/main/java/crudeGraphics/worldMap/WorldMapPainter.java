package crudeGraphics.worldMap;

import java.io.IOException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WorldMapPainter {
    private final @NotNull WorldMap worldMap;

    public WorldMapPainter() {
        this(null);
    }

    public WorldMapPainter(@Nullable ProjectionType projection) {
        worldMap = new WorldMap(projection);
    }

    public void paintMap(Graphics g, ImageObserver observer, int[] drawSize) {
        try {
            Image resizedMap = worldMap.getImage().getScaledInstance(
                    drawSize[0], drawSize[1],
                    Image.SCALE_SMOOTH);
            g.drawImage(resizedMap, 0, 0, observer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}