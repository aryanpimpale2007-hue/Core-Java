import java.util.Scanner;

public class Voting {

    static int voteA = 0;
    static int voteB = 0;

    static void calc(int vote){
        if (vote==1) {
            voteA++;
            System.out.println("Vote given to A");
        }
        else if (vote==2) {
            voteB++;
            System.out.println("Vote given to B");
        }
    }

    static void display(){
        System.out.println("Vote for Candidate A: "+voteA);
        System.out.println("Vote for Candidate B: "+voteB);

        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("1. Vote 1 for candidate A");
            System.out.println("2. Vote 2 for candidate B");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                        calc(ch);
                    break;
            
                case 2: 
                        calc(ch);
                    break;

                case 3:
                        display();
                    break;

                case 4:
                        System.out.println("Voting ended");
                    break;

                default:
                        System.out.println("Invalid choice!!!");
                    break;
            }


        } while (ch!=4);
        

        sc.close();
    }
}
