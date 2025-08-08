class Box{
    private int length, breadth, height;

    public void setDimension(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }

    public int getVolume(){
        return length * breadth * height;
    }

    public void showDimension(){
        System.out.println("Length :" + length);
        System.out.println("Breadth :" + breadth);
        System.out.println("Height :" + height);
    }

}

class Example{
    public static void main(String[] args){
        Box smallBox = new Box(); // Creating an instance of Box class
        smallBox.setDimension(5, 3, 2); // Setting dimensions of the box
        smallBox.showDimension(); // Displaying dimensions of the box
        System.out.println("Volume of the box is: " + smallBox.getVolume()); // Calculating and displaying the volume of the box
        System.out.println("-----------------------------------------------------");
        smallBox = new Box(); // Creating a new instance of Box class
        smallBox.showDimension(); // Displaying dimensions of the new box which will be 0;
        System.out.println("Volume of the box is: " + smallBox.getVolume()); // Calculating and displaying the volume of the box
    }
}