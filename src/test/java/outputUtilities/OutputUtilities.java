package outputUtilities;

import java.util.Objects;

import org.jetbrains.annotations.Nullable;

/**
 * A utility class for common output functionality.
 */
public class OutputUtilities {
    /**
     * Prints a line to console.
     *
     * @param line Line to print.
     */
    public static void printLine(@Nullable String line) {
        System.out.println(Objects.requireNonNullElse(line, ""));
    }

    /**
     * Prints a separator to console.
     */
    public static void separator() {
        printLine("-".repeat(12));
    }
}