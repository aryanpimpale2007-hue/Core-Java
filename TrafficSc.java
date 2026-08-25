import java.util.*;

public class TrafficSc {
        static void displaySignal(String signal, int duration){
            for(int i=duration; i>=1; i--){
                System.out.println(signal+"Light: "+i+" seconds");
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter signal duration: ");
        int duration = sc.nextInt();

        int red = duration/3;
        int yellow = duration/6;
        int green = duration-red-yellow;

        int signal = 1;

        switch (signal) {
            case 1:
                displaySignal("Red",red);

            case 2:
                displaySignal("Yellow", yellow);

            case 3:
                displaySignal("Green", green);
            
            }
            sc.close();
    }
}
