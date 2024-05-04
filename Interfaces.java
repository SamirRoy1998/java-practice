package pkg1;

interface bicycle {
    void breaks(int decrement);

    void accelerate(int increase);
}

interface horn {
    void blowHorn();
}

class AvonCycle implements bicycle, horn {

    @Override
    public void breaks(int decrement) {
        System.out.println("Breaks");
    }

    @Override
    public void accelerate(int increase) {
        System.out.println("Accelerate");
    }

    @Override
    public void blowHorn() {
        System.out.println("peep peep");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.accelerate(10);
        ac.breaks(2);
        ac.blowHorn();
    }
}
