/**
 * 
 */
package com.chapter_12.array.thread;


import com.chapter_12.array.main.Util;

/**
 * @author KimMinHo
 * @since 2017. 1. 13.
 * <p>
 * 
 * </p>
 */
public class Worker extends Thread{
	
	private Integer[] array;
	private int startIdx;
	private int endIdx;
	private boolean isRunning;
	private Integer[] result;
	private int idx;
	private long time;
	
	public Worker(Integer[] array, int startIdx, int endIdx) {
		this.array = array;
		this.startIdx = startIdx;
		this.endIdx = endIdx;
		this.result = new Integer[array.length];
	}

	@Override
	public void run() {
		isRunning = true;
		long start = System.currentTimeMillis();
		for (int i = startIdx; i < endIdx; i++) {
			if(checkEven(array[i])){
				result[idx] = array[i];
				idx++;
			}
		}
		long end = System.currentTimeMillis();
		time = Math.abs(start - end);
		isRunning = false;
	}
	
	public boolean getIsRunning(){
		return isRunning;
	}
	
	public long getTime(){
		return time;
	}
	
	public Integer[] getResult(){
		return Util.optimizationArray(result, idx);
	}
	
	private boolean checkEven(int num){
		return num % 2 == 0;
	}
}
