/**
 * 
 */
package com.chapter_12.array.main;

import com.chapter_12.array.thread.Job;

/**
 * @author KimMinHo
 * @since 2017. 1. 11.
 * <p>
 * 
 * </p>
 */
public class Main {
	
	public static void main(String[] args) {
	
		long start = System.currentTimeMillis();
		
		Job job = new Job(10000, 10000);
		job.execute();
		
		Integer[] result = job.getResult();
		
		long end = System.currentTimeMillis();
		
		System.out.println("main time : " + ((Math.abs(start - end)) /1000.0f) + "초");
		
		for (int i = 0; i < result.length; i++) {
			System.out.printf("%d, ", result[i]);
		}
	}
}
