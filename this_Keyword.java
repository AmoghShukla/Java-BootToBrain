class Box{
    private int l, b, h;

    public Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public int volume() {
        return l * b * h;
    }

    // public void sendbox(){
    //     Gift gf = new Gift();
    //     gf.acceptgift(this); // here, this refers to the current Box object which is being sent as a gift

    // }
}

public class this_Keyword {
    public static void main(String[] args) {
        Box bb = new Box(10, 20, 30);
        //bb.sendbox();
    }
}

