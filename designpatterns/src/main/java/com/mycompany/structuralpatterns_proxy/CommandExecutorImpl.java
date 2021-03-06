package com.mycompany.structuralpatterns_proxy;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor {

	public void runCommand(String cmd) throws IOException {
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
	}

}