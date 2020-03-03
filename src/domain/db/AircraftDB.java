package domain.db;

import domain.model.Aircraft;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AircraftDB {

    private ArrayList<Aircraft> aircrafts = new ArrayList<>();


    public AircraftDB(){
        Aircraft test1 = new Aircraft("Airbus A380", "F-WWOW", 544, 275);
        Aircraft test2 = new Aircraft("Boeing 737 MAX", "DF-OQS", 220, 100);
        Aircraft test3 = new Aircraft("Boeing 747-8", "TS-OPQ", 467, 442);
        Aircraft test4 = new Aircraft("Boeing 767-300F", "OP-QOR", 351, 204);
        Aircraft test5 = new Aircraft("Airbus A330", "LQ-ARF", 290, 181);


        aircrafts.add(test1);
        aircrafts.add(test2);
        aircrafts.add(test3);
        aircrafts.add(test4);
        aircrafts.add(test5);
    }
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
