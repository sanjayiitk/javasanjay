class box2 {
    int l = 5;
    int b = 10;
    int h = 15;
    int vol;

    void display() {
        vol = l * b * h;
        System.out.println("volume of box is" + vol);

    }

}

class box1 {
    public static void main(String[] args) {
        box2 b = new box2();
        b.display();
    }

}
