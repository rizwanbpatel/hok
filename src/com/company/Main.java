package com.company;

import com.company.graph.Graph;

import java.io.BufferedInputStream;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedInputStream(System.in));
        int N = s.nextInt();
        //System.out.println(N);
        int Q = s.nextInt();
        Graph graph = new Graph(N);
        int[] nodeWeight = new int[N];
        for (int i = 0; i < N; i++) {
            nodeWeight[i] = s.nextInt();
        }
        for (int k = 0; k < N - 1; k++) {
            graph.addEdge(s.nextInt(), s.nextInt());
        }

//        for (int i = 0; i<N;i++){
//            System.out.println(graph.adj(i+1));
//        }

        for (int l = 0; l < Q; l++) {
            int startNode = s.nextInt();
            int weight = s.nextInt();

            getWeightFromStartNode(startNode, graph, nodeWeight, weight);
        }
    }

    private static void getWeightFromStartNode(int startNode, Graph graph, int[] nodeWeight, int weight) {

        int sum = 0;
        sum += nodeWeight[startNode - 1];

        List<Integer> adjNodes = graph.adj(startNode);
        for (Integer wt : adjNodes) {
            sum += nodeWeight[wt - 1];
        }

        if (sum < weight) {
            System.out.println("-1");
        }
    }
}
