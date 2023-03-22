package T3;

import java.util.ArrayList;
        /*
        Implement a function that accepts 3 integer values a, b, c.
        The function should return true if a triangle can be built with the sides of given length and false in any other case.
        (In this case, all triangles must have surface greater than 0 to be accepted).
        */
class TriangleTester{
    public static boolean isTriangle(int a, int b, int c){
        if ((a <= 0) || (b <= 0) || (c <=0))
            return false;

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(a);
        integers.add(b);
        integers.add(c);
        integers.sort(null);

        if (integers.get(2) >= integers.get(0) + integers.get(1))
            return false;

        return true;
    }
}
