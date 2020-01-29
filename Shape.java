public class Shape {
    String type;

    Shape(String type){
        this.type = type;
    }

    public String rotate() {
        return "rotate 360^ for " + this.type; 
    }

    public String play_sound(){
        return "play sound for " + this.type;
    }
}

