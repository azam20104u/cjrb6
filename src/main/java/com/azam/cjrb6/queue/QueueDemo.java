package com.azam.cjrb6.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Candidate> queue  = new PriorityQueue<Candidate>();
		queue.add(new Candidate("Faizal", 2));
		queue.add(new Candidate("Ahmad", 1));
		queue.add(new Candidate("Muhammad", 4));
		while (queue.size()>0) {
			System.out.println(queue.poll());
		}
	}
}
