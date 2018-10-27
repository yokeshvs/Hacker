package com.interview.prep;

import java.util.HashMap;
import java.util.Map;

class GraphNode {
	String val;
	GraphNode next;
	Map<GraphNode, Integer> neighbours = new HashMap<>();

	public GraphNode(String x) {
		this.val = x;
	}
}

public class DjikstraAlgorithm {

	public static void main(String[] args) {
		GraphNode aNode = new GraphNode("A");
		GraphNode bNode = new GraphNode("B");
		GraphNode cNode = new GraphNode("C");
		GraphNode dNode = new GraphNode("D");
		GraphNode eNode = new GraphNode("E");
		aNode.neighbours.put(bNode, 6);
		aNode.neighbours.put(dNode, 1);
		dNode.neighbours.put(aNode, 1);
		dNode.neighbours.put(bNode, 2);
		dNode.neighbours.put(eNode, 1);
		bNode.neighbours.put(dNode, 2);
		bNode.neighbours.put(eNode, 2);
		bNode.neighbours.put(cNode, 5);
		eNode.neighbours.put(dNode, 1);
		eNode.neighbours.put(bNode, 2);
		eNode.neighbours.put(cNode, 5);

		System.out.println("Shortest distance between A and C: " + getShortestDistance(aNode, cNode));
	}

	public static Integer getShortestDistance(GraphNode node1, GraphNode node2) {
		return null;

	}

}
