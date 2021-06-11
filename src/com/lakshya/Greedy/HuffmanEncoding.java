package com.lakshya.Greedy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.ArrayList;

public class HuffmanEncoding {
	static class HuffmanNode {
		int data;
		char c;
		
		HuffmanNode left;
		HuffmanNode right;
		
		public HuffmanNode(int data, char c, HuffmanNode left, HuffmanNode right) {
			this.data = data;
			this.c = c;
			this.left = left;
			this.right = right;
		}

		public HuffmanNode(int data, char c) {
			this.data = data;
			this.c = c;
			
			left = null;
			right = null;
		}
		
		public HuffmanNode() {}
	}
	
	static class Solution {
		ArrayList<String> result = new ArrayList<>();
		
		public void addCodeInArrayList(HuffmanNode root, String code) {
			if (root.left == null &&
				root.right == null &&
				Character.isLetter(root.c)) {
				
				result.add(code);
				return;
			}
			
			addCodeInArrayList(root.left, code + "0");
			addCodeInArrayList(root.right, code + "1");
		}
		
		public ArrayList<String> huffmanCodes(String S, int f[], int N) {
	        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>(N /** N is the size of the priorityQueue */,
	        		(x, y) -> x.data - y.data);
			
	        for (int i = 0; i < N; i++) {
	        	HuffmanNode huffmanNode = new HuffmanNode(f[i], S.charAt(i));
	        
	        	priorityQueue.add(huffmanNode);
	        }
	        
	        HuffmanNode root =  null;
	        
	        while (priorityQueue.size() > 1 /** Because we need 2 smallest frequency element */) {
	        	HuffmanNode x = priorityQueue.poll();
	        	HuffmanNode y = priorityQueue.poll();
	        	
//	        	HuffmanNode node = new HuffmanNode(x.data + y.data, '-');
//	        	
//	        	node.left = x;
//	        	node.right = y;
	        	
	        	HuffmanNode node = new HuffmanNode((x.data + y.data), '-', x, y);
	        	root = node;
	        	
	        	// Add the node in the priorityQueue
	        	priorityQueue.add(root);
	        }
	        
			addCodeInArrayList(root, "");
			
			return result;
	    }
	}
	
	public static void main(String[] args) {
		String str = "abcdef";
		int n = str.length();
		int[] f = {5, 9, 12, 13, 16, 45};
		
		Solution solution = new Solution();
		System.out.println(solution.huffmanCodes(str, f, n));
	}
}
