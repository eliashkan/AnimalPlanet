package be.vdab;

public abstract class Bird extends Animal implements Breathable {

    private String featherColour;
    private boolean canFly;

    @Override
    public void breathe() {
        System.out.println("birdy breathes go GHA GHA");
    }

    public String getFeatherColour() {
        return featherColour;
    }

    public void setFeatherColour(String featherColour) {
        this.featherColour = featherColour;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
