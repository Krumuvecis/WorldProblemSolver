package utilities;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.jetbrains.annotations.NotNull;

/**
 * Currently doesn't work.
 * TODO: fix and add javadoc
 */
public class BigDecimalHelper {
    public static @NotNull BigDecimal newBigDecimal(@NotNull String base, int power) {
        BigDecimal baseBig = new BigDecimal(base);
        return new BigDecimal(newBigInteger2(baseBig, power));
    }

    public static @NotNull BigInteger newBigInteger(@NotNull String base, int power) {
        return (new BigInteger(base)).multiply((BigInteger.TEN).pow(power));
    }

    public static @NotNull BigInteger newBigInteger2(@NotNull BigDecimal base, int power) {
        BigInteger integerBase = base.unscaledValue();
        int finalScale = power + base.scale();
        BigInteger multiplier = (BigInteger.TEN).pow(finalScale);
        return (integerBase).multiply(multiplier);
    }
}