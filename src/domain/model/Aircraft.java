package domain.model;

public class Aircraft {
    private String name;
    private String registrationNr;
    private double nrOfSeats;
    private double weight;

    public Aircraft(String name, String registrationNr, double nrOfSeats, double weight){
        setName(name);
        setRegistrationNr(registrationNr);
        setNrOfSeats(nrOfSeats);
        setWeight(weight);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegistrationNr(String registrationNr) {
        this.registrationNr = registrationNr;
    }

    public void setNrOfSeats(double nrOfSeats) {
        this.nrOfSeats = nrOfSeats;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getRegistrationNr() {
        return registrationNr;
    }

    public double getNrOfSeats() {
        return nrOfSeats;
    }

    public double getWeight() {
        return weight;
    }
}
