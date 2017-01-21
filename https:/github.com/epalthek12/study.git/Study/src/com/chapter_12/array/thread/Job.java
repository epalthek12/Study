/**
 * 
 */
package com.chapter_12.array.thread;

import java.util.ArrayList;

import com.chapter_12.array.jobIF.Run;
import com.chapter_12.array.main.Util;

/**
 * @author KimMinHo
 * @since 2017. 1. 11.
 * <p>
 * 
 * </p>
 */
public class Job implements Run{
	
	private int arraySize;
	private int workCnt;
	private int endIdx;
	private ArrayList<Worker> arrayList;
	private Integer[] array;
	
	public Job(int arraySize, int workCnt) {
		this.arraySize = arraySize;
		this.workCnt = workCnt;
		this.endIdx = arraySize / workCnt;
		this.arrayList = new ArrayList<Worker>();
		
	}

	
	public void execute() {
		
		array = new Integer[arraySize];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * arraySize); 
		}
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < workCnt; i++) {
			
			Worker work = new Worker(array, i * endIdx, (i * endIdx) + endIdx);
			work.start();
			arrayList.add(work);
		}
		long end = System.currentTimeMillis();
		
		
		System.out.println("job excute Time : " + ((Math.abs(start - end)) /1000.0f) + "초");
	}
	
	public Integer[] getResult(){
		int idx = 0;
		Integer[] result = new Integer[arraySize];
		long start = System.currentTimeMillis();
		for (int i = 0; i < arrayList.size(); i++) {
			Worker worker = arrayList.get(i);
			
			while (worker.getIsRunning()) {}
			
//			System.out.println(i + " worker time : " + (worker.getTime() /1000.0f) + "초");
			
			Integer[] workerArray = worker.getResult();
			for (int j = 0; j < workerArray.length; j++) {
				result[idx] = workerArray[j];
				idx++;
			}
		}
		Integer[] tmp = Util.optimizationArray(result, idx);
		long end = System.currentTimeMillis();
		System.out.println("job time : " + ((Math.abs(start - end)) /1000.0f) + "초");
		return tmp;
	}
}
