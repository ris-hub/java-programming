import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Matrixinfytq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        ArrayList matrix = new ArrayList();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {

               if(j < c-3)
               {
                   if(mat[i][j]==mat[i][j+1] && mat[i][j+1]==mat[i][j+2] && mat[i][j+2]==mat[i][j+3])
                        matrix.add(mat[i][j]);
               }
               if(i < r-3)
               {
                   if(mat[i][j]==mat[i+1][j] && mat[i+1][j]==mat[i+2][j] && mat[i+2][j]==mat[i+3][j])
                       matrix.add(mat[i][j]);
               }
               if(i <r-3 && j<c-3)
               {
                   if(mat[i][j]==mat[i+1][j+1] && mat[i+1][j+1]==mat[i+2][j+2] && mat[i+2][j+2]==mat[i+3][j+3])
                       matrix.add(mat[i][j]);
               }
                if(i <r-3 && j>=3)
                {
                    if(mat[i][j]==mat[i+1][j-1] && mat[i+1][j-1]==mat[i+2][j-2] && mat[i+2][j-2]==mat[i+3][j-3])
                        matrix.add(mat[i][j]);
                }
            }
        }
        if(matrix ==null)
            System.out.println(-1);
        else
            System.out.println(Collections.min(matrix));
    }
}
