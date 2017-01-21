package com.observer.main;

import com.observer.info.Information;
import com.observer.listener.ListenerA;
import com.observer.listener.ListenerB;
import com.observer.listener.ListenerC;
import com.observer.listener.ListenerD;

public class Main {
	public static void main(String[] args) {
		Information info = new Information();
		ListenerA a = new ListenerA(info);
		ListenerB b = new ListenerB(info);
		ListenerC c = new ListenerC(info);
		ListenerD d = new ListenerD(info);
		
		info.addListener(a, b, c, d);
		
		info.inputData("김민호", "31살", "남자", "스터디중");
		
		System.out.println(info.outPrint());
		
	}
}
