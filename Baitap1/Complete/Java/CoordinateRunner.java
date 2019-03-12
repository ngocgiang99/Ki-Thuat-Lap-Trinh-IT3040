import java.util.*;
import java.lang.Math;

public class CoordinateRunner {

    public static void main(String args[]) {
        CoordinateRunner demo = new CoordinateRunner();

        Coordinate c = new Coordinate(3, 4);
        Coordinate origin = new Coordinate(0, 0);
        
        System.out.println(c.x + " " + origin.x);
        System.out.println(c.distance(origin));
        /*
            System.out.print(Coordinate.distance(c, origin)); 
            Đây không phải là một static method nên không thể gọi được như python
        */
        System.out.println(origin.distance(c));
        c.println();
    }

}