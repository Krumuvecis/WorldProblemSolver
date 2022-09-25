package crudeGraphics;

import crudeGraphics.worldMap.WorldMapPainter;
import geography.Coordinates;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class Contents extends JPanel {
    private final WorldMapPainter worldMapPainter;
    private final RegionPainter regionPainter;

    public Contents() {
        setBackground(Color.black);
        setOpaque(true);
        worldMapPainter = new WorldMapPainter();

        regionPainter = new RegionPainter();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        worldMapPainter.paintMap(g, this, new int[] {
                this.getWidth(),
                this.getHeight()});
        regionPainter.paintRegions(g, new int[] {
                this.getWidth(),
                this.getHeight()});

        g.setColor(new Color(20, 255, 20, 190));
        drawGroundTrack(g, 24.1056, 56.9677); //Riga
        drawGroundTrack(g, 28.72072572239927, 44.87737491123246); //Romania
        drawGroundTrack(g, 12.222585507407091, 44.42201217577874); //Italy
        drawGroundTrack(g, -0.5614115111024103, 38.38596174661448); //Spain
        g.setColor(new Color(20, 50, 255, 190));
        drawGroundTrack(g, -52.6832, 5.1673); //Guiana Space Centre
    }

    private void drawGroundTrack(Graphics g, double startingLongitude, double startingLatitude) {
        double[] startingPointRadians = new double[] {
                Math.toRadians(startingLongitude),
                Math.toRadians(startingLatitude)};
        int dataPoints = 200;
        double deltaFi = 2 * Math.PI / dataPoints;
        for (int i = 0; i < dataPoints; i++) {
            double longitudeOffset = deltaFi * i;
            g.setColor(new Color(20, 255, 20, 190));
            drawSinglePoint(g, polarToDrawable(new double[] {
                    longitudeOffset + startingPointRadians[0],
                    startingPointRadians[1] * Math.cos(longitudeOffset)}));
        }
    }

    private int[] polarToDrawable(double[] polar) {
        int[] drawable = Coordinates.polarToDrawable(
                polar,
                new int[] {
                        this.getWidth(),
                        this.getHeight()});
        return new int[] {drawable[0], drawable[1]};
    }

    private void drawSinglePoint(Graphics g, int[] location) {
        int ovalSize = 6;
        g.fillOval(
                (int) (location[0] - ovalSize / 2.0),
                (int) (location[1] - ovalSize / 2.0),
                ovalSize,
                ovalSize);
    }
}