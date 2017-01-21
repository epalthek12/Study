/**
 * 
 */
package com.chapter_12.deadlock;

/**
 * @author KimMinHo
 * @since 2017. 1. 9.
 * <p>
 * 
 * </p>
 */
public class DeadLock {
	static class Friend {
		private final String name;
		public Friend(String name) {
			this.name = name;
		}
		public String getName() {
			return this.name;
		}
		public synchronized void bow(Friend bower) {
			System.out.format("%s: %s" + "  has bowed to me!%n", this.name, bower.getName());
			bower.bowBack(this);
		}
		public synchronized void bowBack(Friend bower) {
			System.out.format("%s: %s" + " has bowed back to me!%n", this.name, bower.getName());
		}
	}

	public static void main(String[] args) {
		final Friend alphonse = new Friend("Alphonse");
		final Friend gaston = new Friend("Gaston");
		final Friend jane = new Friend("Jane");
		final Friend tom = new Friend("Tom");
		new Thread(new Runnable() {
			public void run() { 
				alphonse.bow(gaston); 
			}
		}).start();
		new Thread(new Runnable() {
			public void run() { 
				gaston.bow(jane); 
			}
		}).start();
		new Thread(new Runnable() {
			public void run() { 
				jane.bow(tom); 
			}
		}).start();
		new Thread(new Runnable() {
			public void run() { 
				tom.bow(alphonse); 
			}
		}).start();
	}
}
