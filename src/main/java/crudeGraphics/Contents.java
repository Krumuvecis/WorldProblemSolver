package crudeGraphics;

import crudeGraphics.worldMap.WorldMapPainter;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

import org.jetbrains.annotations.NotNull;

public class Contents extends JPanel {
    private final @NotNull WorldMapPainter worldMapPainter;
    private final @NotNull RegionPainter regionPainter;
    private final @NotNull GroundTrackPainter groundTrackPainter;

    public Contents() {
        setBackground(Color.black);
        setOpaque(true);
        worldMapPainter = new WorldMapPainter();
        regionPainter = new RegionPainter();
        groundTrackPainter = new GroundTrackPainter();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int @NotNull [] drawSize = getDrawSize();
        worldMapPainter.paintMap(g, this, drawSize);
        regionPainter.paintRegions(g, drawSize);
        groundTrackPainter.paintGroundTracks(g, drawSize);
    }

    private int @NotNull [] getDrawSize() {
        return new int[] {
                this.getWidth(),
                this.getHeight()};
    }
}