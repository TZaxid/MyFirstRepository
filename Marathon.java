/**
 * Created by tzaxid on 26.01.15.
 */
public class Marathon {
    public static void main(String[] args){
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };

        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

        for (int i = 0; i < names.length; i++)
            System.out.println(names[i] + ": " + times[i]);
        int indexBestTime = getBestRunnerIndex(times);
        System.out.println("Best runner is " +names[indexBestTime] + ": " + times[indexBestTime]);
        int indexSecondTime = getSecondRunnerIndex(times);
        System.out.println("Second best runner is " +names[indexSecondTime ] + ": " + times[indexSecondTime]);
    }

    private static int getBestRunnerIndex(int[] times){
        int minTime = times[0];
        int minTimeIndex = 0;
        for (int i = 1; i < times.length; i++){
            if (times[i] < minTime){
                minTime = times[i];
                minTimeIndex = i;
            }
        }
        return minTimeIndex;
    }

    private static int getSecondRunnerIndex(int[] times){
        int bestTimeIndex = getBestRunnerIndex(times);
        int secondMinTime = times[0];
        int secondMinTimeIndex = 0;
        for (int i = 1; i < times.length; i++){
            if (times[i] < secondMinTime && i != bestTimeIndex){
                secondMinTime  = times[i];
                secondMinTimeIndex = i;
            }
        }
        return secondMinTimeIndex;
    }
}

