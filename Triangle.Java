public class Triangle exstends Shape{
    proctected Double side1;
    proctected Double side2;
    proctected Double side3;

    public Triangle(){
        this.side1=0.0;
        this.side2=0.0;
        this.side3=0.0;
    }

    public Triangle (String name, Double side1, Double side2, Duble side3){
        this.name=name;
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        this.calculateArea();
    }
    vold randomMethod(){
        System.out.println(x:"Random method");
    }
    vold hallo(){
        System.out.println("Hallo I'm Triangle");
    }
    protected vold calculateArea(){
        /*Using heron formula */
        double halfPerimeter=(side1+side2+side3)/2;
        super.area = Math.sqrt(halfPerimeter* (halfPerimeter-side1)*(halfPerimeter-side2)*(halfPerimeter-side3)):

    }
    public vold getInfo(){
        System.out.println("Triangle "+name+"info");
        System.out.println("area"+super.area);
        System.out.println("with sides"+side1);
        System.out.println(","+side2);
        System.out.println(","+side3);
        System.out.println();

    }

}
