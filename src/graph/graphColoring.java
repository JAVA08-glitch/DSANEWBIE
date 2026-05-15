package graph;
import java.util.*;
public class graphColoring {
    static boolean graphColor(int[][] edges, int m, int n) {
                int[] nodes=new int[n];
                 Arrays.fill(nodes,-1);
                 boolean[][] adjacency=new boolean[n][n];
                 for(int i=0;i<edges.length;i++){
                    int u=edges[i][0];
                    int v=edges[i][1];
                    adjacency[u][v]=true;
                    adjacency[v][u]=true;
                 }

                 return color(adjacency,nodes,m,0);

    }
    static boolean color(boolean[][] adj,int[] node,int color,int idx){
        if(idx==node.length)return true;
      for(int c=1;c<=color;c++){
          if(check(adj,node,idx,c)){
              node[idx]=c;
              if(color(adj,node,color,idx+1)){
                  return true;
              }
              node[idx]=-1;
          }
      }return false;

    }
    static boolean check(boolean[][] adj,int[] node,int row,int color){
      for(int i=0;i<adj.length;i++){
          if(adj[row][i] && node[i]==color)return false;
      }return true;
    }

}
