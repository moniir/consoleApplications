package com.graphs.adjacencylinkedlist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Graph {
    Vertex[] adjLists;

    public Graph(String file) throws FileNotFoundException{
        Scanner sc =new Scanner(new File(file));
        String graphType=sc.next();
        boolean undirected=true;
        if(graphType.equals("directed")){
            undirected=false;
        }
        adjLists=new Vertex[sc.nextInt()];
        for(int i=0;i<adjLists.length;i++){
            adjLists[i]=new Vertex(sc.next(),null);
        }
        while (sc.hasNext()){
            int v1=indexForName(sc.next());
            int v2=indexForName(sc.next());
            adjLists[v1].adjList= new Neighbor(v2,adjLists[v1].adjList);
            if (undirected) {
                adjLists[v2].adjList = new Neighbor(v1, adjLists[v2].adjList);
            }
        }
    }
    int indexForName(String name){
        for(int i=0;i<adjLists.length;i++){
            if(adjLists[i].name.equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void print() {
        System.out.println();
        for (int v=0; v < adjLists.length; v++) {
            System.out.print(adjLists[v].name);
            for (Neighbor nbr=adjLists[v].adjList; nbr != null;nbr=nbr.next) {
                System.out.print(" --> " + adjLists[nbr.vertexNum].name);
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter graph input file name: ");
        String file = sc.nextLine();
        Graph graph = new Graph(file);
        graph.print();

    }
}
