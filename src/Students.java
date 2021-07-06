import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        System.out.println("Enter number of Students -> ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int details[][] = new int[n][];
        int sum = 0;

        //Loop for different Students----------------------------------------------
        for (int row = 0; row < n; row++) {
            System.out.println("Enter number of Subjects student " + row + " has taken -> ");
            int sub = in.nextInt();
            details[row] = new int[sub + 1];
            //Loop for different subject marks-------------------------------------
            for (int col = 0; col < sub + 1; col++) {


                if (col != sub) {
                    int marks = in.nextInt();
                    sum += marks;
                    details[row][col] = marks;
                } else {
                    details[row][col] = sum/col;
                    sum = 0;
                }
            }
        }

        //Printing the Jagged array
        for (int[] detail : details) {
            //System.out.print(details[row] + "-->\t");
            System.out.println();
            for (int i : detail) {
                System.out.print(i + "\t");
            }
        }

    }
}
