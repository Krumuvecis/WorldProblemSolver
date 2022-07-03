package outputUtilities;

import java.util.Objects;

import org.jetbrains.annotations.Nullable;

public class OutputUtilities {
    public static void printLine(@Nullable String message) {
        System.out.println(Objects.requireNonNullElse(message, ""));
    }

    public static void separator() {
        printLine("-".repeat(12));
    }
}