public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 42; i++) {
            for (int j = 0; j <= 42; j++) {
                for (int k = 0; k <= 42; k++) {
                    if(i+j+k==42) {
                        System.out.println(String.format("%d %d %d", i, j, k));
                    }
                }
            }
            
        }
    }
}