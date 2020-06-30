package be.vdab;

public abstract class Mamal extends Animal implements Breathable {

    private boolean canSwim;
    private int numberOfLegs;

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void breathe() {
        System.out.println("Mamal breathes go HU HU");
    }
}
