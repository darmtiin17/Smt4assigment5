public class Circle exstends Shape{
    protected Double radius;
    public Circle(Double radius, String name){
        super.setName(name);
        this.calculateArea(radius);
        this.calculatePerimeter(radius);

    }
    public void calculateArea(Double radius){
        super.area =Math.PI* Math.pow(radius, b:2);

    }
    public void calculatePerimeter(Double radius){
        super.perimeter = 2* Match.PI*radius;
    }

}
