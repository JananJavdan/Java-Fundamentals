package Les3;

public class RectangelApp {
    public static void main(String[] args) { //met static : ik kan aanroepen method zonder object
        Rectangle rectangle = new Rectangle(10,15); // alleen met een object aanroep ik alle methoden

        System.out.println("rect1");
        System.out.println("height = " + rectangle.getHeight());
        System.out.println("width = " + rectangle.getWidth());

        System.out.println("rect2: ");
        Rectangle rect2 = new Rectangle(1,2,3,4);
        System.out.println("height =" +rect2.getHeight());
        System.out.println("width =" +rect2.getWidth());
        System.out.println("x =" +rect2.getX());
        System.out.println("y =" + rect2.getX());

        rectangle.setHeight(17);
        rectangle.setWidth(16);


        System.out.println("rect3: ");
        Rectangle rect3 = new Rectangle(rectangle);
        System.out.println("height =" +rect3.getHeight());
        System.out.println("width =" + rect3.getWidth());
        System.out.println("x =" + rect3.getX());
        System.out.println("y =" + rect3.getY());
    }


}
