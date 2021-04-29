package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

    private boolean firstDodamage = true;

    public HeavyCavalry() {
        super(150, 20, true);
    }

    @Override
    public int doDamage() {
        if (firstDodamage) {
            firstDodamage = false;
            super.setDidDamage(doDamage()*3);
            return super.doDamage() * 3;
        } else {
            return super.doDamage();
        }
    }
}



