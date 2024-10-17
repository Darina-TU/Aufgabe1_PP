/**
 * Returns
 */
public class IntervalConstants {

    //private static final IntervalConstants CONSTANTS = new IntervalConstants();

    // ------ APARTMENT UNITS & RESIDENTS------

    // Each building can has MIN to MAX number of apartment units
    public final int UNITS_MIN = 1;
    public final int UNITS_MAX = 1382;  // Karl Marx Hof (largest Building in Vienna) https://en.wikipedia.org/wiki/Karl-Marx-Hof

    /*
    Average (PURCHASE) Price in Vienna: € 5.575/m² https://www.properstar.at/austria/vienna/house-price

    EDUCATED ASSUMPTION:
    Let's assume the construction company wants to make a big profit.
    We assume the construction cost is HALF of the final price. (we round it up for simplicity)
    Construction Cost Per Meter: € 2.800/m²

    Residents Per Unit in Vienna: 2 (page 5) -> https://www.wien.gv.at/statistik/pdf/viennainfigures-2024.pdf
    Average Housing Space Per Resident = 36 m (page 5) -> https://www.wien.gv.at/statistik/pdf/viennainfigures-2024.pdf
    Space per UNIT = 72 m (based on our assumptions)
    Construction Cost = € 2.800 * 72 m² = 201 600 € (let's round it up for simplicity)
    Construction Cost = 200 000 €
    That's the general estimate for the construction of a unit
    Based on the type of Building and total units, each Object of the type Building will have a different cost
     */

    //TODO: Type of material
    public final int RESIDENTS_PER_UNIT = 2;
    private final double CONSTRUCTION_COST_GENERAL = 200000.00;  // General estimate for the average construction

    // ------ CONSTRUCTION_COST is based on the TYPE of building and on the number of UNITS------

    // Percentages applied to CONSTRUCTION_COST_GENERAL (These are educated guesses)
    // In general minimal uses less expensive materials than ecological and the highGrade one is the most expensive build
    private final double MINIMAL_CONSTRUCTION_WEIGHT = 0.8;   // Assumption: A minimal build will be a bit less expensive than the average
    private final double ECOLOGICAL_CONSTRUCTION_WEIGHT = 1.2; // According to PDF: More expensive than the minimal build
    private final double HIGHGRADE_CONSTRUCTION_WEIGHT = 1.6;  // According to PDF: The most expensive type

    public final double CONSTRUCTION_COST_MINIMAL_UNIT = CONSTRUCTION_COST_GENERAL * MINIMAL_CONSTRUCTION_WEIGHT;
    public final double CONSTRUCTION_COST_ECOLOGICAL_UNIT = CONSTRUCTION_COST_GENERAL * ECOLOGICAL_CONSTRUCTION_WEIGHT;
    public final double CONSTRUCTION_COST_HIGHGRADE_UNIT = CONSTRUCTION_COST_GENERAL * HIGHGRADE_CONSTRUCTION_WEIGHT;


    // ------ MATERIAL ------
    /*
    Calculate Volume:
    Assume the house has a single story with an average ceiling height of about 2.5 meters.
    Volume = Floor Area × Height = 72 m² × 2.5 m = 180 m³.

    Assumed Material Density:
    For a typical house constructed with reinforced concrete and masonry, the average density can be around 2,000 kg/m³ (this includes walls, roof, and flooring).

    Weight Calculation:
    Weight = Volume × Density = 180 m³ × 2,000 kg/m³ = 360,000 kg (or 360 tons).
     */

}

class Randoms {
    /*
    units

     */

    //private static final Randoms random = new Randoms();

    private final IntervalConstants constants = new IntervalConstants();

    public int getRandomUnitsNumber(){
        double min = constants.UNITS_MIN;
        double max = constants.UNITS_MAX;
        double calculationInRange = min + (int)(Math.random() * (max - min + 1));
        return (int) Math.floor(calculationInRange);   // we floor it because an apartment unit cannot be a double
    }
    public int RandomFromInterval(double min, double max){
        double calculationInRange = min + (int)(Math.random() * (max - min + 1));
        return (int) Math.floor(calculationInRange);
    }
}
