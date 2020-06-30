package be.vdab.mamal;

import be.vdab.Mamal;

public class Cow extends Mamal {

    private boolean hasHorns;

    public Cow(boolean hasHorns) {
        this.hasHorns = hasHorns;
    }

    public boolean isHasHorns() {
        return hasHorns;
    }

    public void setHasHorns(boolean hasHorns) {
        this.hasHorns = hasHorns;
    }
}