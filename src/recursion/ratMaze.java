package recursion;
import java.util.*;
public class ratMaze {
    static List<String> maze(int[][] maze){
        List<String> pile=new ArrayList<>();
        List<Character> ls=new ArrayList<>();
        if(maze[0][0]==1)
            findPath(maze,0,0,ls,pile);



        return pile;
    }
    static void findPath(int[][] maze,int row,int col,List<Character>ls,List<String>pile){
        if(row==maze.length-1 && col==maze[0].length-1){
            pile.add(ls.toString());
            return;
        }
        if(row<0 ||col<0||row>=maze.length||col>=maze[0].length||maze[row][col]!=1)return;
        //up
        ls.add('U');
        maze[row][col]=0;
        findPath(maze,row-1,col,ls,pile);

        ls.remove(ls.size()-1);
        //down
        ls.add('D');
        findPath(maze,row+1,col,ls,pile);
        ls.remove(ls.size()-1);
        //right
        ls.add('R');
        findPath(maze,row,col+1,ls,pile);
        ls.remove(ls.size()-1);
        //left
        ls.add('L');
        findPath(maze,row-1,col,ls,pile);
        ls.remove(ls.size()-1);
        maze[row][col]=1;
    }
    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };
        System.out.println(maze(maze));
    }
}