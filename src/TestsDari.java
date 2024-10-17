// To avoid conflicts when testing our parts of the code
// We will be using separate files
// You can copy-paste the Simulation code in here if you so choose
// or any other things that you are working on
public class TestsDari {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            Ecological building = new Ecological();
            System.out.println(building.getConstructionCost());
        }

        System.out.println(Double.MAX_VALUE);

    }
}
