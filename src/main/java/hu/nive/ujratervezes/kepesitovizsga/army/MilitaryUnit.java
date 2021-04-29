package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    private int lifePower;
    private int attackDamage;
    private boolean pancelozott;
    private int didDamage=0;

    public MilitaryUnit(int lifePower, int damage, boolean pancelozott) {
        this.lifePower = lifePower;
        this.attackDamage = damage;
        this.pancelozott = pancelozott;
    }

    public int doDamage(){
        didDamage= attackDamage;
        return attackDamage;
    }

    public int getDidDamage() {
        return didDamage;
    }

    public void setDidDamage(int didDamage) {
        this.didDamage = didDamage;
    }

    public void sufferDamage(int damage){
        if (pancelozott){
            lifePower= lifePower-(damage/2);
        } else {
            lifePower= lifePower-(damage);
        }
    }


    public int getHitPoints(){
        return lifePower;
    }




}
