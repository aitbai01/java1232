public class tap713 {
    public static void main(String[] args) {

        int[] C = new int[20];
        double sum = 0;

        for(int i=0;i<20;i++){
            C[i] = (int)(Math.random()*50);
            sum += C[i];
            System.out.print(C[i] + " ");
        }

        System.out.println("\nОрташа мән: " + sum/20);
    }
}