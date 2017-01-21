/**
 * 
 */
package com.chapter_12.array.main;

/**
 * @author KimMinHo
 * @since 2017. 1. 19.
 * <p>
 * 
 * </p>
 */
public class Util {

	public static Integer[] optimizationArray(Integer[] array, int idx){
		Integer[] result = new Integer[idx];
		for (int i = 0; i < result.length; i++) {
			result[i] = array[i];
		}
		return result;
	}
}
