import java.util.ArrayList;

public class BigRectLister {

    public static void main(String[] args) {

        ArrayList<Object> rects = new ArrayList<Object>();

        rects.add(new Rectangle(1, 1));
        rects.add(new Rectangle(2, 2));
        rects.add(new Rectangle(2, 5));
        rects.add(new Rectangle(1, 4));
        rects.add(new Rectangle(3, 4));
        rects.add(new Rectangle(4, 3));
        rects.add(new Rectangle(5, 3));
        rects.add(new Rectangle(3, 6));
        rects.add(new Rectangle(2, 1));
        rects.add(new Rectangle(4, 2));


        //Displaying without applying the filter for debugging purposes.

        System.out.println("Before Filter Application...\n");

        for (Object o : rects) {
            Rectangle r = (Rectangle) o;
            System.out.println(r);
        }

        System.out.println(" ");

        Filter f = null;

        rects = BigRectangleFilter.collectAll(rects, f);

        System.out.println("After Filter Application\n");

        for (Object o:rects)
        {
            Rectangle r = (Rectangle) o;
            System.out.println(r);
        }

    }
}