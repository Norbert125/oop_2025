public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        //double x[] = {7, 1, -3, 45, 9};
        //System.out.printf("MAX: %6.2f\n", maxElement(x));

        int n = 13;
        //int order = 2;
        //System.out.println(getBit(n, order));
        System.out.println(countBits(n));

    }

    static double maxElement(double array[]) {
        if(array.length == 0) {
            System.out.println("Empty array");
            return 0;
        }
        double max = array[0];
        for (int i = 1; i < array.length; ++i) {
            //max = max > array[i] ? max : array[i];
            max = Math.max(max, array[i]);
        }
        return max;
    }
    public static byte getBit(int number, int order){
        if(order < 0 || order > 32){return -1;}
        byte bit = (byte)(1 & (number >> order));
        return bit;
    }
    public static int countBits(int number){
        int counter = 0;
        while(number != 0){
            if((number & 1) == 1){counter++;}
            number = number >> 1;
        }
        return counter;
    }

}