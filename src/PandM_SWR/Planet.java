package PandM_SWR;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Planet extends OrbitalObject {
    private int moons;
    private ArrayList<Moon> mooon;

    public Planet() {
    }

    public Planet(int moons, double distanceToSun, double circumference, double diameter) {
        super(distanceToSun, circumference, diameter);
        this.moons = moons;
        mooon = new ArrayList<>();
        for (int i = 0; i < moons; i++){
            Moon newMoon = new Moon();
            this.mooon.add(newMoon);
        }
    }
    public int getMoons(){
        return moons;
    }

    public void setMoons(int moons) {
        this.moons = moons;
    }

    public int getMooon() {
        return mooon.size();
    }

    public void setMooon(ArrayList<Moon> mooon) {
        this.mooon = mooon;
    }

    public double planetTestDistance(Planet a){
        if (a.getDistanceToSun() > getDistanceToSun()){
            return a.getDistanceToSun() - getDistanceToSun();
        } else {
            return getDistanceToSun() - a.getDistanceToSun();
        }
    }

}
