
import java.util.*;

public class BoxPrint {
    private static Scanner sc;
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("type f for full box, e for empty box or b for both: ");
        String s = in.nextLine();

        int rows, columns, i, j;
        sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");
        rows = sc.nextInt();

        System.out.print("Enter Number of Columns : ");
        columns = sc.nextInt();

        if(s.equals("b"))
        {
            for(i = 1; i <= rows; i++) {
                for (j = 1; j <= columns; j++) {
                    if (i == 1 || i == rows || j == 1 || j == columns) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }

            System.out.print("\n");

            for(i = 1; i <= rows; i++) {
                for (j = 1; j <= columns; j++) {
                    if (i == 1 || i == rows || j == 1 || j == columns) {
                        System.out.print("*");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.print("\n");
            }

        }
        else if (s.equals("f"))
        {
            for(i = 1; i <= rows; i++) {
                for (j = 1; j <= columns; j++) {
                    if (i == 1 || i == rows || j == 1 || j == columns) {
                        System.out.print("*");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.print("\n");
            }
        }
        else if (s.equals("e"))
        {
            for(i = 1; i <= rows; i++) {
                for (j = 1; j <= columns; j++) {
                    if (i == 1 || i == rows || j == 1 || j == columns) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
        }
        else
        {
            System.out.println("invalid response");
        }
    }
    }
