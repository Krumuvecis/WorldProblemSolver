package crudeGraphics;

import geography.Coordinates;

import java.awt.*;

public class GroundTrackPainter {
    void paintGroundTracks(Graphics g, int[] drawSize) {
        g.setColor(new Color(20, 255, 20, 190));
        drawGroundTrack(g, drawSize, 24.1056, 56.9677); //Riga
        drawGroundTrack(g, drawSize, 28.72072572239927, 44.87737491123246); //Romania
        drawGroundTrack(g, drawSize, 12.222585507407091, 44.42201217577874); //Italy
        drawGroundTrack(g, drawSize, -0.5614115111024103, 38.38596174661448); //Spain
        g.setColor(new Color(20, 50, 255, 190));
        drawGroundTrack(g, drawSize, -52.6832, 5.1673); //Guiana Space Centre
    }

    private void drawGroundTrack(Graphics g, int[] drawSize, double startingLongitude, double startingLatitude) {
        double[] startingPointRadians = new double[] {
                Math.toRadians(startingLongitude),
                Math.toRadians(startingLatitude)};
        int dataPoints = 200;
        double deltaFi = 2 * Math.PI / dataPoints;
        for (int i = 0; i < dataPoints; i++) {
            double longitudeOffset = deltaFi * i;
            g.setColor(new Color(20, 255, 20, 190));
            drawSinglePoint(g, Coordinates.polarToDrawable(
                    new double[] {
                            longitudeOffset + startingPointRadians[0],
                            startingPointRadians[1] * Math.cos(longitudeOffset)},
                    drawSize));
        }
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