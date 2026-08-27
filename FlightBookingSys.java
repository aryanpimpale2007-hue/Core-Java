import java.util.Scanner;

public class FlightBookingSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        int seats[][] = new int[5][5];

        do {
            System.out.println("Enter a choice: ");
            System.out.println("1. Reserve seat in row, column: ");
            System.out.println("2. Cancel a seat in row, column: ");
            System.out.println("3. Display status");
            System.out.println("4. Exit");

            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter row(1-5):");
                    int r = sc.nextInt();

                    System.out.println("Enter column(1-5)");
                    int c = sc.nextInt();

                    if (r>=1 && r<=5 && c>=1 && c<=5) {
                        if (seats[r-1][c-1]==0) {
                            seats[r-1][c-1]=1;

                            System.out.println("Seat [" + r + "," + c + "] Reserved successfully");
                        }
                        else{
                            System.out.println("Seat is already booked");
                        }    
                    }
                    else{
                        System.out.println("Invalid choice of row or column");
                    }
                    
                    break;

                case 2:
                    System.out.println("Enter row(1-5):");
                    r = sc.nextInt();

                    System.out.println("Enter column(1-5)");
                    c = sc.nextInt();

                    if (r>=1 && r<=5 && c>=1 && c<=5) {
                        if (seats[r-1][c-1]==1) {
                            seats[r-1][c-1]=0;

                            System.out.println("Seat [" + r + "," + c + "] Cancelled successfully");
                        }
                        else{
                            System.out.println("Seat is not reserved");
                        }    
                    }
                    else{
                        System.out.println("Invalid choice of row or column");
                    }
                    
                    break;

                case 3:
                    System.out.println("----Seat status----");
                    
                    for(int i=0;i<5;i++){
                        for(int j=0;j<5;j++){
                            System.out.print(seats[i][j]+" ");
                        }
                        System.out.println();
                    }

                    System.out.println("0 is available");
                    System.out.println("1 is not available");
            
                break;

                case 4:
                    System.out.println("4. Exit");

                default:
                    System.out.println("Invalid choice");
                    break;
                }

        } while (ch!=4);
        
        sc.close();
    }
}
