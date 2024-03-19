public class App{
    Run | Debug
    public static void main(String[]args)throws Exception{
        RightTriangle ABC=new RightTriangle(name:"ABC", base:3.0, height:4.0);
        ABC.specificMethod();

        //The Type is Triangle, but behavior is RightTriangle
        Triangle BCD= new RightTriangle(name:"BCD", base:3.0, height:base:4.0);
        BCD.hallo();
        Triangle CDE =new Triangle(name:"CDE", side1:3.0,side2:4.0,side3:5.0);
        CDE.hallo();
    }
