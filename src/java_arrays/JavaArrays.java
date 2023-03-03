package java_arrays;

public class JavaArrays {
    /** 2. Գրել method, որը տպում է short[] s  array-ի էլեմենտները հակառակ հերթականությամբ
     * @param s
     */
    public void reversedArray(short[] s) {
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i] + " ");
        }
    }


    /** 3. Գրել method, որը գտնում և  տպում է  long[] l array-ի ամենամեծ տարրը
     * @param l
     * @return
     */
    public long arraysMax(long[] l) {
        long max = l[0];
        for (int i = 0; i < l.length; i++) {
            if (l[i] > max) {
                max = l[i];
            }
        }
        return max;
    }

    /**
     * 5 ․ Գրել method, որը int[] n array-ի էլեմենտները և տեղափոխում  int[] m  array-ի մեջ։
     *
     * @param n
     * @param m
     * @return
     */
    public int[] method5(int[] n, int[] m) {
        if (n.length != m.length) {
            System.out.println("lengths of m and n must be equal");
            return m;
        }
        return m = n;
    }

    /**
     * 6․ Գրել method, որը ստեղծում է երկու նույն չափը ունեցող array-ներ գումարում է array -ի համապատասխան էլեմենտները և գրում երրորդ array-ի մեջ։
     *
     * @param array1
     * @param array2
     * @return
     */
    public int[] method6(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length];
        if (array1.length != array2.length) {
            System.out.println("lengths of array1 and array2 must be equal");
            return array3;
        }
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] + array2[i];
        }
        return array3;
    }

    /**
     * 7. Գրել method, որը հաշվում է թե քանի անգամ է  k թիվը հանդիպել array-ի  Էլեմենտների մեջ։
     *
     * @param array
     * @return k
     */
    public int method7(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[i]) {
                k = i;
            }
        }
        return k;
    }

    public void method8(int[] array){

    }

    /**
     * 9․ Դասավորել տրված թվերի հաջորդականության անդամները նվազման կարգով:
     *
     * @param array
     */
    public void method9(int[] array) {

        int lesser = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    array[i] = array[i] ^ array[j] ^ (array[j] = array[i]);
                }
            }
        }
    }

    /**
     * 10․ Դասավորել տրված ամբողջ թվերի
     * հաջորդականության անդամներն անյպես, որ վերջում լինեն կենտերը:
     *
     * @param arr
     * @return
     */
    public int[] evenOdd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            while (arr[left] % 2 == 0) {
                left++;
            }
            while (arr[right] % 2 == 1) {
                right--;
            }
            if (left < right) {
                int swap = arr[left];
                arr[left] = arr[right];
                arr[right] = swap;
            }
        }
        return arr;
    }

    /**
     * 11․ Տրված իրական թվերի հաջորդականությունից հեռացնել բոլոր զրոները։
     * @param array
     * @return
     */
    public int[] removeZeros(int[] array) {
        int newArrMembers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newArrMembers++;
            }
        }
        int[] newArray = new int[newArrMembers];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }

    /**
     * 13․ Ներածել n բնական թիվը 2-ական տեսքով՝ ստանալով 0-ներից
     * ու 1-երից կազմված զանգված և արտածել n  թվի 10-ական ներկայացումը:
     * @param array
     * @return
     */
    public int binaryToDecimal(int[] array){
        int n = 0;
        for (int i = array.length - 1, b = 0; i >= 0; i--, b++) {
            array[i] = (int) (array[i] * Math.pow(2, b));
            n += array[i];
        }
        return n;
    }

    /**
     * 14․ Տպել տրված մատրիցի գլխավորա անկյունագծից վերև բոլոր տարերը:
     * @param array
     */
    public void upperMatrix(int array[][]) {
        for (int i = 0; i< array.length; i++){
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i][j]);
            }
        }

    }

    /**
     * 15․ Շրջել տրված ամբողջ թվերի քառակուսային մատրիցը
     * գլխավոր անկյունագծի նկատմամբ:
     * @param array
     */
    public void reverseMartix(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                array[i][j] = array[i][j] ^ array[j][i]^(array[j][i]= array[i][j]);
            }
        }
    }

//    public boolean isMatrixsStingMembersSumEven(int[][] matrix){
//        int strsum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < ; j++) {
//                strsum
//            }
//        }
//    }

    public static void main(String[] args) {
        JavaArrays obj = new JavaArrays();
//        long[] l = {-5, 8, 20, 0}; //3
//        System.out.println(arraysMax(l));

//        short[] s = {2, 52, 3}; //2
//        reversedArray(s);

//        int[] n = {5, 3, 9, 20}; //5
//        int[] m = new int[2];
//        int[] nm = method5(n, m);
//        for (int i = 0; i < nm.length; i++) {
//            System.out.println(nm[i]);

//        int[] array = {2, 5, 2, 2};         //7
//        System.out.println(method7(array));

//        int[] array = {1, 3, 2, 9}; //9
//        //int[] array2 =method9(array);
//        method9(array);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);

//        int[] arr = {25, 21, 36, 20, 39}; //10
//        evenOdd(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);

//        int[] array = {0, 5, 3, 0, 0, 1}; //11
//        array = obj.removeZeros(array);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);

//        int[][] array = {  //14
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16} };
//
//        obj.upperMatrix(array);

        int[] array = {1, 0, 1, 0};
        System.out.println(obj.binaryToDecimal(array));


    }
}
