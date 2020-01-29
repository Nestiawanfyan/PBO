import java.util.Scanner;

class lain {
    public static void lol(String[] args) {
       //kode 
    }
}


public class Run {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        var type = input.next();
        var Shape = new Shape(type);

        System.out.println(Shape.rotate());
        System.out.println(Shape.play_sound());
    }    
}