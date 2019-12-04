public class Analyzer {

    public static int linearSearch(String [] dataSet, String element){
        //algorithim that linearly searches
        for(int i = 0; i < dataSet.length; i++){
            if(element.equals(dataSet[i])){
                return i; //returns the index at which the number exists
            }
        }

        return -1;
    }

    public static int binarySearch(String [] dataSet, String element){
        int mid;
        int low;
        int high;

        low = 0;
        high = dataSet.length - 1;
        while(high >= low){
            mid = (high + low) / 2;

            if(dataSet[mid].compareTo(element) < 0){ //compare to looks at the string character by character and determines which one comes first alphabetically
                                                    //if it is negative that means that dataSet[mid] comes before element
                low = mid + 1;
            }
            else if(dataSet[mid].compareTo(element) > 0){ //if it is positive that means that dataSet[mid]comes AFTER element
                high = mid - 1;
            }
            else{ //if this happens that means that it equals 0, which means that they are the same
                return mid;
            }
        }
        return -1;
    }

    public static void main(String [] args){
        StringData temp = new StringData();
        String [] data = temp.getData();
        long time1, time2, time3, time4;

        System.out.println("Test case for \"vigne\":\n");
        time1 = System.nanoTime();
        linearSearch(data, "vigne");
        time2 = System.nanoTime() - time1;
        System.out.println("Linear Search Time (nanoseconds): " + time2 + "\n");
        time3 = System.nanoTime() - time1 - time2;
        binarySearch(data, "vigne");
        time4 = System.nanoTime() - time3 - time2 - time1;
       System.out.println("Binray Search Time (nanoseconds): " + time4 + "\n");




    }
}
