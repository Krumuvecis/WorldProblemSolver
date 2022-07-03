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
        oceanList.add(new Ocean("Pacific", 168.723));
        oceanList.add(new Ocean("Atlantic", 85.133));
        oceanList.add(new Ocean("Indian", 70.560));
        oceanList.add(new Ocean("Southern", 21.960));
        oceanList.add(new Ocean("Arctic", 15.558));

        setOceanAreaSum();
    }

    private static void setOceanAreaSum() {
        double areaSum = 0;
        for (Ocean ocean : oceanList) {
            areaSum += ocean.getArea();
        }
        oceanAreaSum = areaSum;
    }

    public static double totalOceanArea() {
        return oceanAreaSum;
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