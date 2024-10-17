public class Ecological {   // implements KeyFigures
    private final int LIFE_CYCLE = 50;   // depends on the type of building
    private final int RENOVATION_CYCLE = 20; // depends on the type of building

    //TODO: Type of material

    // costTotal = buildingCost + maintenanceCost + renovationCost + disposalCost
    //Condition for costs: calculations will be limited to 2 decimal place
    private double costTotal = 0.00;
    private double constructionCost;    // dependent on the apartmentsUnits

    private int apartmentUnits;     // random interval
    private int residents;          // apartmentUnits * 3

    private double co2Total;        // tons of co2
    private double wasteTotal;
    private double energyTotal;     // maintenanceCost is dependent on the energyUsage, dependent on type of building

    private double reusabilityOfMaterial = 0.05;    // how many percent of the material can be reused during renovation

    private int lifeSatisfaction;   // Condition: 0 - 100 %

    private int yearsActive = 0;


    public Ecological() {
        Randoms rand = new Randoms();
        IntervalConstants constants = new IntervalConstants();
        constructionCost = constants.CONSTRUCTION_COST_ECOLOGICAL_UNIT * rand.getRandomUnitsNumber();




    }


    public void addYear(){yearsActive++;}

    // Somewhere we are gonna do those operations, it does not need to be in this class yet
    //public void renovate()    ->      waste is created
    //public void demolish()    ->      waste is created

    public double getConstructionCost(){
        return constructionCost;
    }
}
