/*
 * Created on Sep 13, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package vgridtest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author wolfi
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class TTask implements vgrid.task.Task {

	protected int count = 0;
	private String id = null;
	private int pause = 0;
	private int maxSteps = 0;
	private String executionHistory = "";

	public TTask() {
	}
	public TTask(String id, int pause, int maxSteps) {
		this();
		this.id = id;
		this.pause = pause;
		this.maxSteps = maxSteps;
	}

	public String getId() {
		return id;
	}
    
	public boolean isFinished() {
		return count >= maxSteps;
	}
    
	public void serealize(OutputStream s) throws IOException {
		DataOutputStream out = new DataOutputStream(s);
		out.writeInt(count);
		out.writeInt(pause);
		out.writeInt(maxSteps);
	}
    
	public void deserialize(InputStream s) throws IOException {
		DataInputStream in = new DataInputStream(s);
		count = in.readInt();
		pause = in.readInt();
		maxSteps = in.readInt();
	}
    
	public void setId(String id) {
		this.id = id;
	}
    
	public String toStateString() {
		StringBuffer sb = new StringBuffer();
		sb.append("TestTask id <"+id+"> class: "+this.getClass().getName());
		sb.append('\n');
		sb.append("A test task that increases a counter every "+pause+" ms.");
		sb.append('\n');
		sb.append("It finishes after "+maxSteps+" steps.");
		sb.append('\n');
		sb.append("It is used for testing vgrid.");
		sb.append('\n');
		sb.append("The current count is "+this.count);
		sb.append('\n');
		return sb.toString();
	}
    
	public void takeOneStep() {
		pause(pause);
		count++;
	}
	private synchronized void pause(int ms) {
		try {
			this.wait(ms);
		} catch (java.lang.InterruptedException ex) {}
	}
	public int getCount() {
		return count;
	}

	public String getExecutionHistory() {
		return this.executionHistory;
	}

	/* (non-Javadoc)
	 * @see vgrid.task.Task#setExecutionHistory(java.lang.String)
	 */
	public void setExecutionHistory(String executionHistory) {
		this.executionHistory = executionHistory;
	}
}
