class Average {

 public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        System.out.println(CountGreaterThanPreviousAverage(responseTimes)); 
 }


 public static int CountGreaterThanPreviousAverage(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return 0;
}

        int count = 0;
        long runsum = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            double preavg = (double) runsum / i;
             
            if (arr[i] > preavg) {
                count++;
            }

            runsum += arr[i];
        }

        return count;
    }

   }
