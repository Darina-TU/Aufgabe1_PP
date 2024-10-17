public class Test {
    /* simulates one building per type for 500 years. when lifecycle done or damage more than 90
    building will be destroyed and a new one is build in its place (newly generated) for the same type.
     */
    public static void main(String[] args) {
        int catastrophyNum = 1; //the num must be picked so that a catastrophy occurs
        //initialize buildings
        for(int j = 0; j < 10; j++) { //10 simulations as requested in angabe
            //rendom occurance of catastrophy --> 1% chance per year that a catasrophy occurs
            for (int i = 0; i < 500; i++) { //years the simulstion is running
                int catastrophyChance = (int) Math.round(Math.random()*100); //100 not inculded
                if(catastrophyChance == catastrophyNum){
                    Randoms ran = new Randoms();
                    int catastrophyDamage = ran.RandomFromInterval(20,100); //how many damage points were added to damage variable
                    //for every building we add the catastrophyDamage/weight to damage counter of building
                    //weight = 0,8 for min, 1,2 for öko, 1,6 for high

                    //yearly damage added to damage counter
                    //renovation if year(i) is the renovation year --> ask kati if you don´t understand

                    //if(damageCounter >= 90 || lifeCounter == lifecycle){
                        //building destroy
                        //create new one of same type in its place
                    //}

                    //calculate KeyFigures and Zielfunktion
                }
            }
        }
    }

}
