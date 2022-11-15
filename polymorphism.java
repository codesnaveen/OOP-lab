abstract class shape{
    abstract void numberofsides();
}
class rectangle extends shape{
  void numberofsides(){
    System.out.println("number of sides of rectangle is 4");

}
}
class traingle extends shape{
    void numberofsides(){
        System.out.println("number of sides of traingle is 3");

}

}
class hexagon extends shape{
    void numberofsides(){
        System.out.println("number of sides of hexagon is 6");

}
}

public class Polymorphism {
    public static void main(String[] args) {

        rectangle r=new rectangle();
        traingle t=new traingle();
        hexagon h=new hexagon();
        
        r.numberofsides();
        t.numberofsides();
        h.numberofsides();
    }
}
