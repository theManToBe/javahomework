public class CountSingleDigits {
    public static void main(String[] args) {
        int[] count = new int[10];
        for (int i = 0;i < 100;i++){
            int n = (int)(Math.random() * 10);
            count[n]++;
        }
        for (int i = 0;i < 10;i++){
            System.out.println("The number of " + i + " is " + count[i]);
        }
    }
}

