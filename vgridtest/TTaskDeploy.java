/*
 * Created on Sep 13, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package vgridtest;

import vgrid.VgridException;
import vgrid.util.*;
import vgrid.task.*;
import java.io.*;

/**
 * @author wolfi
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class TTaskDeploy {
	
	private void run() {
		try {
			generate(createServer());
			writeMessage("Finished "+this.getClass().getName());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	private WrappedServer createServer() throws IOException {
		String host ="localhost";
		String port = "8080";
		String app = "vgrid";
		
		return new WrappedServer(new LocalServerProxy(host, port, app));
	}
	private void generate(WrappedServer srv) throws IOException {
		int i = 0;
		String groupId = createUniqueGroupId();
		for (int j = 0; j < 10; j++) {
			String name = "TT_" + groupId + "_" + i;
			try {
				Task task = new TTask(name, 100, 100);
				addTaskToServer(srv, name, task);
				pause(500);
				i++;
			} catch (Exception e) {
				writeMessage("Could not generate " + name + " because " + e.toString());
				e.printStackTrace();
			}
		}
	}
	private String createUniqueGroupId() {
		java.util.Date date = new java.util.Date(System.currentTimeMillis());
		return new java.text.SimpleDateFormat("hhmmssSSS").format(date);
	}

	private void addTaskToServer(WrappedServer srv, String name, Task task)
		throws IOException, VgridException {
		srv.receiveUnfinishedTask(task);
		writeMessage("Generated " + name + " for " + srv.getServer().toDescriptionString());
	}

	private void writeMessage(String msg) {
		System.out.println(">>> "+msg);
	}
	
	private synchronized void pause(int ms) {
		try {
			this.wait(ms);
		} catch (java.lang.InterruptedException ex) {}
	}
	
	

	public static void main(String[] args) {
		TTaskDeploy dep = new TTaskDeploy();
		dep.run();
	}
}
