package domain.db;

import domain.model.Aircraft;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AircraftDB {

    private ArrayList<Aircraft> aircrafts = new ArrayList<>();


    public void add(Aircraft aircraft){
        aircrafts.add(aircraft);
    }

    public ArrayList<Aircraft> getAircrafts(){
        return aircrafts;
    }

    public String getPlaneWithMostSeats(){
        String nameWithMostSeats = "";
        for (Aircraft s : this.aircrafts) {
            for (Aircraft a: this.aircrafts){
                if (s.getNrOfSeats() > a.getNrOfSeats()){
                    nameWithMostSeats = s.getName();
                }
            }
        }
        return nameWithMostSeats;

    }

    public void setAircrafts(ArrayList<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }

}
