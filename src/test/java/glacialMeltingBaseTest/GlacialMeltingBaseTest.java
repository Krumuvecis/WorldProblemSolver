package glacialMeltingBaseTest;

import glacialMelting.GlacialMelting;

/**
 * Tests glacial melting base rate.
 */
public class GlacialMeltingBaseTest {
    private static GlacialMelting glacialMelting;

    /**
     * Main method of this test.
     * Run this to start.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        int yearsToCalculate = 50;
        prepareGlacialMelting(yearsToCalculate);
        Output.output(glacialMelting);
    }

    private static void prepareGlacialMelting(int years) {
        glacialMelting = new GlacialMelting(years);
    }
}