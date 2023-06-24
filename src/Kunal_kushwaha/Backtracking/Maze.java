package Kunal_kushwaha.Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(2, 2));
//        path("", 2, 2   );
//        System.out.println(pathRet("", 2, 2));
//        System.out.println(diagonalcount(3,3));
//        System.out.println(pathdiagRet("", 3,3));
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        pathRestrictions("", board, 0, 0);
    }
    public static void pathRestrictions(String p,boolean [][] maze,  int r, int c){
        if(r== maze.length-1 && c==maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
            return;
        if(r<maze.length-1)
            pathRestrictions(p+ 'D',maze, r+1, c);
        if(c<maze[0].length-1 )
            pathRestrictions(p+'R',maze, r, c+1);
    }
    public static int count(int r, int c){
        if(r==1 || c==1)
            return 1;
        //int s=0;
        int left=count(r-1, c);
        int right=count(r, c-1);
        return left + right;
    }
    public static void path(String p, int r, int c){
        if(r==1 && c==1) {
            System.out.println(p);
            return;
        }
        //int s=0;
        if(r>1)
            path(p+ 'D',r-1, c);
        if(c>1)
            path(p+'R',r, c-1);
    }
    public static ArrayList<String> pathRet(String p, int r, int c){
        if(r==1 && c==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        //int s=0;
        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        if(r>1)
            left.addAll(pathRet(p+ 'D',r-1, c));
        if(c>1)
            right.addAll(pathRet(p+'R',r, c-1));
        left.addAll(right);
        return left;
    }
    public static int diagonalcount(int r, int c){
        if(r==1 || c==1)
            return 1;
        //int s=0;
        int left=0, right=0, diagonal=0;
        if(r>1)
            left=diagonalcount(r-1, c);
        if(r>1 && c >1)
            diagonal = diagonalcount(r-1, c-1);
        if(c>1)
            right=diagonalcount(r, c-1);
        return left + right + diagonal;
    }
    public static ArrayList<String> pathdiagRet(String p, int r, int c){
        if(r==1 && c==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        //int s=0;
        ArrayList<String> list = new ArrayList<>();
        if(r>1)
            list.addAll(pathdiagRet(p+ 'V',r-1, c));
        if(r>1 && c>1)
            list.addAll(pathdiagRet(p+ 'D',r-1, c-1));
        if(c>1)
            list.addAll(pathdiagRet(p+'H',r, c-1));
        return list;
    }
}

