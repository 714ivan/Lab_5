
package lab_5;

import java.util.Scanner;

public class Lab_5 {

    public static void main(String[] args) {
       Circle circle=new Circle();
       Circle circle1=new Circle(5, 5, 3.5);
       circle.printCircle();
       circle1.printCircle();
       System.out.println(circle.CenterToCenterDistance(circle1));
       System.out.println(circle.CirclesTouch(circle1));
       circle.CircleRandomMove();
       circle.printCircle();
    }
    
}
 class Circle {
    double x;
    double y;
    double r;
  
    public Circle() {
        System.out.println("Введите значение координаты x");
        x=double_in();
        System.out.println("Введите значение координаты y");
        y=double_in();
        System.out.println("Введите радиус");
        r=double_in();
    }
    private static double double_in() {
        Scanner sc= new Scanner(System.in);
        while (!(sc.hasNextDouble())) { 
             System.out.println("Повторите ввод");
             sc.next();
         }
        double Number =Double.parseDouble(sc.next());
        return Number;
    }
    public Circle(double a, double b, double s) {
        x = a;
        y = b;
        r = s;
    }
    
    void set(double a,double b,double c){
      x=a;
      y=b;
      r=c;
    }
    public void printCircle() {
      System.out.println("Окружность с центром ("+x+";"+y+") и радиусом "+r);
    }
    
    public double CircleLength(){
        double c=2*Math.PI*this.r;
        return c;
    }
    // перемещает центр, движение окружности
    public void CircleRandomMove() {
        double rand=Math.random()*198-99;
        double RC=Math.sqrt(rand*rand+rand*rand);
        x = x+RC;
        rand=Math.random()*198-99;
        RC=Math.sqrt(rand*rand+rand*rand);
        y = y+RC;
    }
    public double CenterToCenterDistance(Circle cir){
        return Math.sqrt((this.x-cir.x)*(this.x-cir.x)+(this.y-cir.y)*(this.y-cir.y));
        //AB = √(xb - xa)2 + (yb - ya)2
    }
    public boolean CirclesTouch(Circle cir){
        double dis=CenterToCenterDistance(cir);
        return (dis==this.r+cir.r)||(dis==Math.abs(this.r-cir.r));
    }

// Методом вычисляется расстояние до точки:
double getDistance(){
return Math.sqrt(x*x+y*y+r*r);
}

 }   
