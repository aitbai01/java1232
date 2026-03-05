
public class tap78 {
    public static void main(String[] args) {

        double[][] A = new double[12][6];

        for(int i=0;i<12;i++){
            for(int j=0;j<6;j++){
                A[i][j] = Math.random()*20 - 10;
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Баған бойынша теріс элементтердің көбейтіндісі:");

        for(int j=0;j<6;j++){
            double mult = 1;

            for(int i=0;i<12;i++){
                if(A[i][j] < 0){
                    mult *= A[i][j];
                }
            }

            System.out.print(mult + " ");
        }
    }
}