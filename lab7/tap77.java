public class tap77 {
    public static void main(String[] args) {

        double[][] B = new double[5][5];
        double[] A = new double[5];

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                B[i][j] = Math.random()*20 - 10;
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0;i<5;i++){
            double sum = 0;

            for(int j=0;j<5;j++){
                if(B[i][j] > 0){
                    sum += B[i][j];
                }
            }

            A[i] = sum;
        }

        System.out.println("Қатар бойынша оң элементтер қосындысы:");

        for(int i=0;i<5;i++){
            System.out.print(A[i] + " ");
        }
    }
}
