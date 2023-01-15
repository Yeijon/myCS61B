public class MaxArray {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int n = 1;
        int big = m[0];
        int len = m.length;
        while (n < len){
            if (m[n] < big){
                big = big;
            } else {
                big = m[n];
            }
            n++;
        }

        return big;
    }

    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       System.out.println("The biggest number in array is: "+max(numbers)+"!");
       //System.out.println(numbers.length);
    }

}