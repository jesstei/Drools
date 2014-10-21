package org.hda.responseselection;

public class EventMessage {
	
	
	public static final int DDoS = 0;
    public static final int CuC = 1;

    private String message;

    private int status;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}