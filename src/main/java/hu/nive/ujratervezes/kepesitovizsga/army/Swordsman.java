package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private boolean shield = true;

    public Swordsman(boolean pancelozott) {
        super(100, 10, pancelozott);
    }


    @Override
    public void sufferDamage(int damage) {
        if (shield){
            shield=false; // no shield
         return;
        }
        super.sufferDamage(damage);
    }
}
