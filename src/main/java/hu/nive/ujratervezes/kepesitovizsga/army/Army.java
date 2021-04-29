package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Army {

    private List<MilitaryUnit> militaryUnitList = new ArrayList<>();


    public void addUnit(MilitaryUnit militaryUnit){
        militaryUnitList.add(militaryUnit);
    }

    public void damageAll(int damage){

        for (Iterator<MilitaryUnit> i = militaryUnitList.iterator(); i.hasNext();) {
            MilitaryUnit figter = i.next();
            figter.sufferDamage(damage);  // ezt javítsd ha kell!
            if (figter.getHitPoints()<25) {
                i.remove();
            }
        }

    }

    public int getArmyDamage(){
        int counter=0;
        for (MilitaryUnit mu:militaryUnitList) {
            counter += mu.getDidDamage();
        }
        return counter;
    }

    public int getArmySize(){
        return militaryUnitList.size();
    }


}
