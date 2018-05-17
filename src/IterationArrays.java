public class IterationArrays {
    public static void main(String[] args) {
        int[] arrayOfInts = new int[10];

        for (int i=0; i<arrayOfInts.length;i++){
            arrayOfInts[i] = i;
            System.out.print(arrayOfInts[i] + ", ");
        }

        System.out.println();

        for (int v=0; v<arrayOfInts.length;v++){
            arrayOfInts[v] *= 10;
            System.out.print(arrayOfInts[v] + ", ");
        }
    }
}
