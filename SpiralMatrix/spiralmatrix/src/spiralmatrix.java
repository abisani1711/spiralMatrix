import java.util.Scanner;
public class spiralmatrix {
        public static int[][] generateMatrix(int input) 
    {
        int columnMinimum = 0;
        int rowMinimum = 0;
        int columnMaximum = input-1;
        int rowMaximum = input-1;
        int a;
        int currentNumber=1;
        int[][] spiral = new int[input][input];
        

        while (columnMinimum<=columnMaximum && rowMinimum<=rowMaximum) {
            //left to right fill
            for (a=columnMinimum;a<=columnMaximum;a++)
            {
                spiral[rowMinimum][a]= currentNumber;
                currentNumber++;
            }
            rowMinimum++;

            //top to bottom fill
            for(a=rowMinimum;a<=rowMaximum;a++)
            {
                spiral[a][columnMaximum]=currentNumber;
                currentNumber++;
            }
            columnMaximum--;

            //right to left fill
            for(a=columnMaximum;a>=columnMinimum;a--)
            {
                spiral[rowMaximum][a]=currentNumber;
                currentNumber++;
            }
            rowMaximum--;

            //bottom to top fill
            for(a=rowMaximum;a>=rowMinimum;a--)
            {
                spiral[a][columnMinimum]=currentNumber;
                currentNumber++;
            }
            columnMinimum++;
        }
      
        return spiral;
    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int input = sc.nextInt();
            int[][] spiral=generateMatrix(input);
            
            for(int i=0;i<input;i++)
            {
                for(int a=0;a<input;a++)
                {
                    System.out.printf("%2d ", spiral[i][a]);
                }
                System.out.println("");
            }
        }
        

        
    }
}
