package SuperGameOnline;

public class ToolBox {

    public static String arrToString(int[] arr) {
        StringBuilder s = new StringBuilder();
        for (int o : arr) {
            s.append(o);
        }
        return s.toString();
    }

    public static String arrToString(int[][] arr) {
        StringBuilder s = new StringBuilder();
        for (int[] ints : arr) {
            s.append(arrToString(ints));
            s.append("\n");
        }
        return s.toString();
    }
    public static String arrToString(char[] arr) {
        StringBuilder s = new StringBuilder();
        for (char o : arr) {
            s.append(o);
        }
        return s.toString();
    }

    public static String arrToString(char[][] arr) {
        StringBuilder s = new StringBuilder();
        for (char[] ints : arr) {
            s.append(arrToString(ints));
            s.append("\n");
        }
        return s.toString();
    }

    public static String arrToString(byte[] arr) {
        StringBuilder s = new StringBuilder();
        for (byte o : arr) {
            s.append(o);
        }
        return s.toString();
    }

    public static String arrToString(byte[][] arr) {
        StringBuilder s = new StringBuilder();
        for (byte[] ints : arr) {
            s.append(arrToString(ints));
            s.append("\n");
        }
        return s.toString();
    }

    public static void showArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i!=arr.length-1)
                System.out.print("\t");
        }
        System.out.println("]");
    }

    public static void showArr(int[][] arr){
        System.out.println("{");
        for (int[] elements : arr) {
            showArr(elements);
        }
        System.out.println("}");
    }

    public static void showArr(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%.2f", arr[i]);
            if(i!=arr.length-1)
                System.out.print("\t");
        }
        System.out.println("]");
    }

    public static void showArr(double[][] arr){
        System.out.println("{");
        for (double[] elements : arr) {
            showArr(elements);
        }
        System.out.println("}");
    }

    public static void showArr(float[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%.2f", arr[i]);
            if(i!=arr.length-1)
                System.out.print("\t");
        }
        System.out.println("]");
    }

    public static void showArr(float[][] arr){
        System.out.println("{");
        for (float[] elements : arr) {
            showArr(elements);
        }
        System.out.println("}");
    }

    public static void showArr(char[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i!=arr.length-1)
                System.out.print("\t");
        }
        System.out.println("]");
    }

    public static void showArr(char[][] arr){
        System.out.println("{");
        for (char[] elements : arr) {
            showArr(elements);
        }
        System.out.println("}");
    }

    public static void showArr(byte[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i!=arr.length-1)
                System.out.print("\t");
        }
        System.out.println("]");
    }

    public static void showArr(byte[][] arr){
        System.out.println("{");
        for (byte[] elements : arr) {
            showArr(elements);
        }
        System.out.println("}");
    }

    public static void sortArrAscending(int[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrAscending(double[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrAscending(char[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            char temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrAscending(float[] arr) {
        //selection sort;
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            float temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrAscending(byte[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            byte temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrDescending(int[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[max_idx])
                    max_idx = j;

            int temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrDescending(double[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[max_idx])
                    max_idx = j;

            double temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrDescending(char[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[max_idx])
                    max_idx = j;

            char temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrDescending(float[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[max_idx])
                    max_idx = j;

            float temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrDescending(byte[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[max_idx])
                    max_idx = j;

            byte temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static int getIntRandomNumber(int min, int max){
        //range [min, max]
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int[] getInt1DArr(int length){
        int[] arr = new int[length];
        for (int i = 0, counter = 1; i < arr.length; i++) {
            arr[i] = counter++;
        }
        return arr;
    }

    public static int[][] getInt2DArr(int rows, int columns){
        int[][] arr = new int[rows][columns];
        for (int i = 0, counter = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = counter++;
            }
        }
        return arr;
    }
    public static String intToString(int a){

        return Integer.toString(a);
    }
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;


        int middle = low + (high - low) / 2;
        int opora = array[middle];


        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    public static int stoi(String s){

        return Integer.parseInt(s);
    }
    public static int binarySearch(int[] a, int val){
        int l = 0, r = a.length - 1;

        while (r > l) {
            int m = (l + r) / 2;    //целочисленное деление!

            if (a[m] < val) {
                l = m + 1;
            } else if (a[m] > val) {
                r = m - 1;
            } else {
                return m;
            }
        }

        if (a[l] == val) {
            return l;
        } else {
            return -1;
        }
    }
    public static int euklidus(int a, int b){
        if (a < b) {
            int temp = a;
            a  = b;
            b = temp;
        }

        while (b>0) {
            a %= b;
            int temp = a;
            a  = b;
            b = temp;
        }

        return a;
    }
    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    public static int[] splitToDigits(int a){
        int size = 0;
        int temp = 0;
        for (int i = 1000000;i >0;i/=10){
            if (a%i!=a){
                temp = i;
                break;
            }
        }
        int tempNum = temp;
        temp*=10;
        while(temp>1){
            temp/=10;
            size++;
        }
        int[] b = new int[size];
        for (int i =0;i < size;i++){
            b[i] = a/tempNum;
            a-=(a/tempNum)*tempNum;
            tempNum/=10;
        }
        return b;
    }
    public static int lcm(int a,int b){

        return a / euklidus(a, b) * b;
    }

}
