package s040;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Begin block loop " + i);

            if (i == 2) {
                continue; //ti porta in su al for e salta il ciclo if se i == 2
            }

            System.out.println("End block loop " + i);
        }
    }
}
