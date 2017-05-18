package parrot;

public class AfricanParrot extends Parrot {
    private int numberOfCoconuts;
    private final double loadFactor = 9.0;

    AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }
    @Override
    public double getSpeed(){
        return Math.max(0, super.baseSpeed - loadFactor * numberOfCoconuts);
    }
}
