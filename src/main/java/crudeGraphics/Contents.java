package crudeGraphics;

import geography.regions.SampleRegion;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Contents extends JPanel {
    Contents() {
        setBackground(Color.black);
        setOpaque(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        WorldMap.WorldMapType projection = WorldMap.WorldMapType.EQUIRECTANGULAR;
        try {
            Image resizedMap = WorldMap.getWorldMapImage(projection).getScaledInstance(
                    this.getWidth(), this.getHeight(),
                    Image.SCALE_SMOOTH);
            g.drawImage(resizedMap, 0, 0 , this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.setColor(Color.red);
        drawSampleRegion(g);

        g.setColor(new Color(20, 255, 20, 190));
        drawGroundTrack(g, 24.1056, 56.9677); //Riga
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

    private void drawSampleRegion(Graphics g) {
        SampleRegion sampleRegion = new SampleRegion();
        int
                northernBorderPointCount = sampleRegion.northernBorder.length,
                southernBorderPointCount = sampleRegion.southernBorder.length,
                pointCount = northernBorderPointCount + southernBorderPointCount + 2;
        int[]
                xPoints = new int[pointCount],
                yPoints = new int[pointCount];

        int[] westernExtreme = polarToDrawable(sampleRegion.westernExtreme);
        xPoints[0] = westernExtreme[0];
        yPoints[0] = westernExtreme[1];

        for (int i = 0; i < northernBorderPointCount; i ++) {
            int[] point = polarToDrawable(sampleRegion.northernBorder[i]);
            xPoints[i + 1] = point[0];
            yPoints[i + 1] = point[1];
        }

        int[] easternExtreme = polarToDrawable(sampleRegion.easternExtreme);
        xPoints[northernBorderPointCount + 1] = easternExtreme[0];
        yPoints[northernBorderPointCount + 1] = easternExtreme[1];

        for (int i = 0; i < southernBorderPointCount; i ++) {
            int[] point = polarToDrawable(sampleRegion.southernBorder[i]);
            xPoints[northernBorderPointCount + southernBorderPointCount + 1 - i] = point[0];
            yPoints[northernBorderPointCount + southernBorderPointCount + 1 - i] = point[1];
        }

        g.fillPolygon(xPoints, yPoints, pointCount);
    }

    private int[] polarToDrawable(double[] polar) {
        int
                drawWidth = this.getWidth(),
                drawHeight = this.getHeight();

        double[]
                centerOffset = new double[] {
                        drawWidth / 2.0,
                        drawHeight / 2.0},
                scale = new double[] {
                        drawWidth / (Math.PI * 2),
                        drawHeight / (Math.PI)};

        int
                drawX = (int) (centerOffset[0] + polar[0] * scale[0]),
                drawY = (int) (centerOffset[1] - polar[1] * scale[1]);
        if (drawX >= drawWidth) {
            drawX -= drawWidth;
        }
        return new int[] {drawX, drawY};
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