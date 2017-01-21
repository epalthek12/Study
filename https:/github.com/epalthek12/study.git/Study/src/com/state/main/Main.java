package com.state.main;

import com.state.impl.Cola;
import com.state.machine.Machine;

public class Main {
	public static void main(String[] args) {
		Machine machine = new Machine("1000", new Cola());
		machine.doAction();
		machine.doAction();
		machine.doAction();
	}
}
