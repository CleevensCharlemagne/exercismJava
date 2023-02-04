package birdWatcher;


class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {

        this.birdsPerDay = birdsPerDay.clone();

    }

    public int[] getLastWeek() {

        return this.birdsPerDay;

    }

    public int getToday() {

        return this.getLastWeek()[getLastWeek().length - 1];

    }

    public void incrementTodaysCount() {

        this.birdsPerDay[this.birdsPerDay.length - 1] += 1;

    }

    public boolean hasDayWithoutBirds() {

        boolean foundZero = false;

        for(int i = 0; i < this.birdsPerDay.length; i++){

            if (this.birdsPerDay[i] == 0){

                foundZero = true;

                break;

            }
        }

        return foundZero;
    }

    public int getCountForFirstDays(int numberOfDays) {

        int sum = 0;

        for (int i = 0; i < numberOfDays; i++){

            sum += this.birdsPerDay[i];

        }

        return sum;

    }

    public int getBusyDays() {

        int acc = 0;



        if(this.birdsPerDay.length == 0){

            empty = true;

        }

        if(isEmpty){
            return 0;
        }

        for (int i = 0; i < this.birdsPerDay.length; i++){
            if (this.birdsPerDay[i] >= 5){
                acc++;
            }
        }
        return acc;
    }
}

