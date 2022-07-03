package geography.waters;

import java.util.List;
import java.util.ArrayList;

//TODO: add javadoc
public class OpenWaters {
    static List<Ocean> oceanList;
    private static double oceanAreaSum;

    static {
        oceanList = new ArrayList<>();

        //Data from: https://en.wikipedia.org/wiki/Ocean#Oceanic_divisions (cited: 03.07.2022 20:08 GMT+2)
        oceanList.add(new Ocean(
                "Pacific",
                168.723 * Math.pow(10, 12)));
        oceanList.add(new Ocean(
                "Atlantic",
                85.133 * Math.pow(10, 12)));
        oceanList.add(new Ocean(
                "Indian",
                70.560 * Math.pow(10, 12)));
        oceanList.add(new Ocean(
                "Southern",
                21.960 * Math.pow(10, 12)));
        oceanList.add(new Ocean(
                "Arctic",
                15.558 * Math.pow(10, 12)));

        setOceanAreaSum();
    }

    private static void setOceanAreaSum() {
        double areaSum = 0;
        for (Ocean ocean : oceanList) {
            areaSum += ocean.area;
        }
        oceanAreaSum = areaSum;
    }

    public static double totalOceanArea() {
        return oceanAreaSum;
    }

    static class Ocean {
        String name;
        double area;

        Ocean(String name, double area) {
            this.name = name;
            this.area = area;
        }
    }

    //for abstraction
    static class BodyOfWater {
        String name;
        double area;

        BodyOfWater(String name, double area) {
            this.name = name;
            this.area = area;
        }
    }
}