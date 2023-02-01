package cookYourLasagna;

public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutesInTheOven){
        return 40 - actualMinutesInTheOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers){
        int timeForOneLayer = 2;
        int result = numberOfLayers * timeForOneLayer;
        return result;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(){
        return 0;
    }
}

