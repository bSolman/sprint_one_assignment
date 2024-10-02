package Plants;

import Enums.PlantType;
import Interface.ConsumerInterface;

public abstract class Plant implements ConsumerInterface {
    // Här är instansvariablerna av privat art.
    // Dessa kommer du bara åt genom instansiering utav objekt.
    // Detta så att slumpmässig manipulering skall undvikas (Inkapsling)
    private double height;
    private final String NAME;
    private final String PLANT_TYPE;

    public Plant(String PLANT_TYPE, String NAME, double height) {
        this.PLANT_TYPE = PLANT_TYPE;
        this.NAME = NAME;
        this.height = height;
    }

    // Nedan är getters samt en setter för instansvariablerna.
    // Har gjort merparten till final så mestadels getters, men setHeight finns kvar,
    // vem vet, växten kanske växer i framtiden.
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getNAME() {
        return NAME;
    }

    public String getPLANT_TYPE() {
        return PLANT_TYPE;
    }

    public String getPlantTypeName(){
        return this.PLANT_TYPE;
    }

    public String getFoodType() {
        return switch (this.PLANT_TYPE){
            case "kaktus" -> "mineralvatten";
            case "köttätande växt" -> "proteindryck";
            case "palm" -> "kranvatten";
            default -> throw new IllegalStateException("Unexpected value: " + this.PLANT_TYPE);
        };
    }

    @Override
    public String toString() {
        return "Plant{" +
                "height=" + height +
                ", NAME='" + NAME + '\'' +
                ", PLANT_TYPE='" + PLANT_TYPE + '\'' +
                '}';
    }
}
