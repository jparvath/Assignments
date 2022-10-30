
abstract class Shape
{
    public abstract void draw();

}
class line extends Shape
{
    public void draw()
    {
        System.out.println("drawing a line");
    }
}
class rectangle extends Shape
{
    public void draw()
    {
        System.out.println("drawing a rectangle");
    }
}
class cube extends Shape
{
    public void draw()
    {
        System.out.println("drawing a cube");
    }
}

public class Shapes {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        line a = new line();
        rectangle b=new rectangle();
        cube c= new cube();
        a.draw();
        b.draw();
        c.draw();

    }

}





