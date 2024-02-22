package com.azam.cjrb6.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("a");
		deque.add("b");
		deque.add("c");
		deque.addFirst("o");
		deque.addLast("l");
		System.out.println(deque);
	}
}
