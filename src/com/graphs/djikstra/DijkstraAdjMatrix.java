package com.graphs.djikstra;

import java.util.Scanner;

public class DijkstraAdjMatrix {

    public static void dijkstra(int[][] adjmatrix){
        int length=adjmatrix.length;
        boolean visited[]=new boolean[length];
        int distance[]=new int[length];

        distance[0]=0;  //first vertex to zero
        for(int i=1;i<length;i++){          //others are infinite value
            distance[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<length-1;i++){
            //find minimum distance vertex
            int minVertex= findMinVertex(distance,visited);
            visited[minVertex]=true;
            //explore neighbour for current vertex
            for(int j=0;j<length;j++){
                if(adjmatrix[minVertex][j]!=0&& !visited[j]&& distance[minVertex]!=Integer.MAX_VALUE){
                    int newDist=distance[minVertex]+adjmatrix[minVertex][j];
                    if(newDist<distance[j]){
                        distance[j]=newDist;
                    }
                }
            }
        }
        //print distance
        for(int i=0;i<length;i++){
            System.out.println(i+" "+distance[i]);
        }
    }
    private static int findMinVertex(int[] distance, boolean[] visited){
        int minVertex=-1;
        for(int i=0;i<distance.length;i++){
            if(!visited[i] && (minVertex==-1 || distance[i]<distance[minVertex])){
                minVertex=i;
            }
        }
        return minVertex;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int vertex=sc.nextInt();
        int edge=sc.nextInt();
        int adjMatrix[][]=new int[vertex][vertex];

        for(int i=0;i<edge;i++){
            int vertex1=sc.nextInt();
            int vertex2=sc.nextInt();
            int weight=sc.nextInt();
            adjMatrix[vertex1][vertex2]=weight;
            adjMatrix[vertex2][vertex1]=weight;
        }
        dijkstra(adjMatrix);
    }
}
