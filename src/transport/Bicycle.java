package transport;

public class Bicycle extends Transport {
    @Override
    public void move() {
        System.out.println("Еду пропорционально усилиям велосипедиста");
    }
}
