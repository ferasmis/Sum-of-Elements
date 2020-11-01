/*******************************************************************************
*Name: Feras Isied
* Class: CS 141
* Quarter: Winter 2019
* Assignment: Summing all elements / Assignment 7
* Description: Summing all elements in specified row and element in an array
*
 ******************************************************************************/
import java.util.Scanner;
public class SumOfElements {
    public static void main(String[] args) {
        double sum[][]= new double[3][4];
        System.out.println("Enter a 3 by 4 matrix row by row");
        Scanner input = new Scanner(System.in);
        
        //loop to store user input into an array
        for(int row=0; row<3 ;row++){
            for(int column=0 ; column<4 ;column++){
                sum[row][column]=input.nextDouble();
            }//end inner for
        }//end outer for
      
        //loop to display the sum of elemnts in column
        for(int i=0; i<4;i++){
          System.out.println("Sum of the elements at column "+ i + " is "+
                  sumColumn(sum,i));
        } //end loop
       
        //loop to display the sum of elemnts in row
        for(int i=0; i<3;i++){
            System.out.println("Sum of the elements at row "+ i + " is "+
                 sumRow(sum, i));
        } //end loop
    }//end main method

    public static double sumColumn(double[][] m, int columnIndex) {
        double total = 0;
        for (double[] m1 : m) {
            total += m1[columnIndex];
        } //end for each loop
        return total;
    }//end method sumColumn

    public static double sumRow(double[][] m, int rowIndex) {
        double total = 0;
        for (int column = 0; column < m[rowIndex].length; column++) {
            total += m[rowIndex][column];
        }//end for loop
        return total;
    }//end method rowIndex
}//end class



