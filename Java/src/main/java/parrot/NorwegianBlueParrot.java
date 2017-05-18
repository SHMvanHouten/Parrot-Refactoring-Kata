package parrot;

public class NorwegianBlueParrot extends Parrot {

    private double maximumSpeed = 24.0;
    private double voltage;
    private boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed(){
        if(isNailed){
            return 0;
        }else{
            return Math.min(maximumSpeed, voltage*baseSpeed);
        }
    }


}
