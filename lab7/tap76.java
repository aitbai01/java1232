
public class tap76 {
    public static void main(String[] args) {

        int[][] A = new int[10][10];
        int[] B = new int[10];

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                A[i][j] = (int)(Math.random()*40 - 20);
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0;i<10;i++){
            int sum = 0;

            for(int j=0;j<10;j++){
                if(A[i][j] < 0){
                    sum += A[i][j];
                }
            }

            B[i] = sum;
        }

        System.out.println("Қатар бойынша теріс элементтер қосындысы:");

        for(int i=0;i<10;i++){
            System.out.print(B[i] + " ");
        }
    }
}