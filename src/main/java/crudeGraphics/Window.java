package crudeGraphics;

import org.jetbrains.annotations.NotNull;

import javax.swing.JFrame;

public class Window extends JFrame {
    private static final int[] WINDOW_SIZE_ERROR_CORRECTION = new int[] {16, 39};

    public Window(int @NotNull [] size) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(
                size[0] + WINDOW_SIZE_ERROR_CORRECTION[0],
                size[1] + WINDOW_SIZE_ERROR_CORRECTION[1]);
        add(new Contents());
        setVisible(true);
    }
}