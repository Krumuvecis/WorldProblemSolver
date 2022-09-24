package geography.regions;

public class SampleRegion extends AbstractRegion {
    public SampleRegion() {
        super(
                new double[] {      //west
                        Math.toRadians(10),
                        Math.toRadians(20)
                },
                new double[] {      //east
                        Math.toRadians(70),
                        Math.toRadians(20)
                },
                new double[][] {    //north, clockwise
                        new double[] {
                                Math.toRadians(30),
                                Math.toRadians(30)
                        },
                        new double[] {
                                Math.toRadians(50),
                                Math.toRadians(30)
                        }
                },
                new double[][] {    //south, counter-clockwise
                        new double[] {
                                Math.toRadians(30),
                                Math.toRadians(10)
                        },
                        new double[] {
                                Math.toRadians(50),
                                Math.toRadians(10)
                        }
                });
    }
}
