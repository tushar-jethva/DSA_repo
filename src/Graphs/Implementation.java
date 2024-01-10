package Graphs;

import java.util.*;

class Pair{
    int v;
    int w;
    Pair(int v,int w){
        this.v = v;
        this.w = w;
    }

    int getFirst(){
        return v;
    }
    int getSecond(){
        return w;
    }
}

class GraphWeighted{

    // working
    ArrayList<ArrayList<Pair>> list = new ArrayList<>();
    int vertex;
    GraphWeighted(int v){
        this.vertex = v;
        for (int i = 0; i < vertex; i++) {
            list.add(new ArrayList<>());
        }
    }

    void addEdge(int u,int v, int weight, boolean isDirected){
        list.get(u).add(new Pair(v,weight));

        if(!isDirected){
            list.get(v).add(new Pair(u,weight));
        }
    }

    void printAdjacencyList(){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i+"->");
            for (int j = 0; j < list.get(i).size(); j++) {

                    System.out.print("("+list.get(i).get(j).getFirst()+",");
                    System.out.print(list.get(i).get(j).getSecond()+")");


            }
            System.out.println();
        }
    }


}
class Graph{
    ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();
    int vertex;
    Graph(int v){
        this.vertex = v;
        for (int i = 0; i < vertex; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }
    void addEdge(int u,int v,boolean isDirected){
        adjacencyList.get(u).add(v);
        if(!isDirected){
            adjacencyList.get(v).add(u);
        }
    }
    
    void printAdjacencyList(){
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.print(i+"->");
            for (int j = 0; j < adjacencyList.get(i).size(); j++) {
                System.out.print(adjacencyList.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    void bfs(int src){
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer,Boolean> visited = new HashMap<Integer, Boolean>();
        q.add(src);
        visited.put(src,true);

        while (!q.isEmpty()){
            int ele = q.poll();
            System.out.print(ele+"->");
             for (int i = 0; i < adjacencyList.get(ele).size(); i++) {
                int e = adjacencyList.get(ele).get(i);
                if(!visited.containsKey(e)){
                    q.add(e);
                    visited.put(e,true);
                }
            }
        }
        System.out.println("bfs");
    }

    void dfs(int src,HashMap<Integer,Boolean> visited){
        System.out.print(src+"->");
        visited.put(src,true);
        for (int i = 0; i < adjacencyList.get(src).size(); i++) {
            int e = adjacencyList.get(src).get(i);
            if(!visited.containsKey(e)){
                dfs(e,visited);
            }
        }
    }

    //For undirected graph both bfs dfs below given
    String checkIsCycleWithDFS(int src,HashMap<Integer,Boolean> visited,int p){
        visited.put(src,true);

        for (int i = 0; i < adjacencyList.get(src).size(); i++) {
            int e = adjacencyList.get(src).get(i);
            if(visited.containsKey(e)){
                if(p != e){
                    return "Cycle found";
                }
            }
            if(!visited.containsKey(e)){
               String ans =  checkIsCycleWithDFS(e,visited,src);
               if(ans.equals("Cycle found")){
                   return "Cycle found";
               }
            }
        }
        return "Cycle not found";
    }

    String checkIsCycleWithBFS(int src,HashMap<Integer,Boolean> visited){
        HashMap<Integer,Integer> parent = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visited.put(src,true);
        parent.put(src,-1);

        while (!q.isEmpty()){
            int e = q.poll();
            for (int i = 0; i < adjacencyList.get(e).size(); i++) {
                int ele = adjacencyList.get(e).get(i);
                //we can do like following but no need as we do in below below condition
//                if(!parent.containsKey(ele)){
//                    parent.put(ele,e);
//                }
                if(visited.containsKey(ele)){
                    if(parent.get(e)!=ele){
                        return "Cycle is found!";
                    }
                }
                if(!visited.containsKey(ele)){
                    q.add(ele);
                    visited.put(ele,true);
                    parent.put(ele,e);
                }


            }
        }
     return "Cycle not found!";
    }

    //for directed graph
    String cycleFoundInDirectedDFS(int src,HashMap<Integer,Boolean> visited,HashMap<Integer,Boolean> recCall){
        visited.put(src,true);
        recCall.put(src,true);
        for (int i = 0; i < adjacencyList.get(src).size(); i++) {
            int ele = adjacencyList.get(src).get(i);
            if(visited.containsKey(ele)){
                if(recCall.get(ele)){
                    return "Cycle found";
                }
            }
            if(!visited.containsKey(ele)){
                String ans =  cycleFoundInDirectedDFS(ele,visited,recCall);
                if(Objects.equals(ans, "Cycle found")){
                    return "Cycle found";
                }
            }
        }
        //yaha hi galti hoti hai dynan rakho
        recCall.put(src,false);
        return "Cycle not found";
    }

}

public class Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Adjacency Matrix
//        System.out.println("Enter nodes:");
//        int n = sc.nextInt();
//        System.out.println("Enter vertex");
//        int t = sc.nextInt();
//
//        int[][] adjacencyMatrix = new int[n][n];
//        for (int i = 0; i < t; i++) {
//            int u = sc.nextInt();
//            int v = sc.nextInt();
//            adjacencyMatrix[u][v] = 1;
//        }
//
//        for (int i = 0; i < adjacencyMatrix.length; i++) {
//            for (int j = 0; j < adjacencyMatrix.length; j++) {
//                System.out.print(adjacencyMatrix[i][j]+" ");
//            }
//            System.out.println();
//        }


        //Adjacency List
//        Graph g = new Graph(8);
//        g.addEdge(0,1,false);
//        g.addEdge(1,2,false);
//        g.addEdge(1,3,false);
//        g.addEdge(3,5,false);
//        g.addEdge(3,7,false);
//        g.addEdge(7,6,false);
//        g.addEdge(7,4,false);

        Graph g = new Graph(8);
        g.addEdge(0,1,true);
        g.addEdge(1,2,true);
        g.addEdge(2,3,true);
        g.addEdge(1,3,true);
        g.addEdge(1,4,true);
        g.addEdge(4,5,true);
        g.addEdge(4,7,true);
        g.addEdge(5,6,true);
        g.addEdge(6,4,true);



//        g.addEdge(2,0,false);
//        g.addEdge(2,4,false);

        g.printAdjacencyList();
        g.bfs(0);


        //undirected graph cycle found
//        HashMap<Integer,Boolean> map = new HashMap<>();
//
//        System.out.println(g.checkIsCycleWithDFS(0,map,-1));
//        System.out.println(g.checkIsCycleWithBFS(0,map));

         //directed graph cuycle found

        HashMap<Integer,Boolean> visited = new HashMap<>();
        HashMap<Integer,Boolean> recCall = new HashMap<>();
        System.out.println(g.cycleFoundInDirectedDFS(0,visited,recCall));







        //here 8 is vertex
        //this is for loop for disconnected graph written in book
        //this for loop not harm our flow wheather it is connected or disconnected graph
//        for (int i = 0; i < 5; i++) {
//            if(!map.containsKey(i)){
//                g.dfs(i,map);
//            }
//        }
//        System.out.println("dfs");
//        GraphWeighted g = new GraphWeighted(3);
//        g.addEdge(0,1,3,false);
//        g.addEdge(1,2,5,false);
//        g.addEdge(0,2,8,false);
//        g.printAdjacencyList();
    }
}
