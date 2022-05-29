package com.cubic.domain;

import java.util.Calendar;
import java.util.Objects;

public class Greeting {
	private String message;
	private String time;
	
	public Greeting() {
		this.time = Calendar.getInstance().getTime().toString();
	}

	public Greeting(String message) {
		this(message, Calendar.getInstance().getTime().toString());
	}

	public Greeting(String message, String time) {
		this.message = message;
		this.time = time;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(message, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Greeting other = (Greeting) obj;
		return Objects.equals(message, other.message) && Objects.equals(time, other.time);
	}

	@Override
	public String toString() {
		return "Greeting: (" + this.message + ", @ " + this.time + ")";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	

}
