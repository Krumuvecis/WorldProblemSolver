package crudeGraphics;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WorldMap {
    enum WorldMapType {
        EQUIRECTANGULAR,
        MERCATOR
    }

    private static final String
            commonPath = "src/main/resources/map/",
            equirectangularPath = commonPath + "equirectangular_2058x1036.png",
            mercatorPath = commonPath + "mercator_792x480.png";

    static BufferedImage getWorldMapImage(WorldMapType type) throws IOException {
        String filePath;
        switch (type) {
            case EQUIRECTANGULAR -> filePath = equirectangularPath;
            case MERCATOR -> filePath = mercatorPath;
            default -> throw new IOException();
        }
        return ImageIO.read(new File(filePath));
    }
}