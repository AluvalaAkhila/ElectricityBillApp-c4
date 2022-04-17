package com.modules;

import java.time.LocalDate;

public class Connection {
	private long connectionId;
	private long consumerNumber;
	private LocalDate applicationDate;
	private LocalDate connectionDate;
	private  boolean connectionStatus;
	private Address address;
	private ConnectionType connectiontype;
	public Connection() {
	}
	
	public ConnectionType getConnectiontype() {
		return connectiontype;
	}
	public void setConnectiontype(ConnectionType connectiontype) {
		this.connectiontype = connectiontype;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public long getConnectionId() {
		return connectionId;
	}
	public void setConnectionId(long connectionId) {
		this.connectionId = connectionId;
	}
	public long getConsumerNumber() {
		return consumerNumber;
	}
	public void setConsumerNumber(long consumerNumber) {
		this.consumerNumber = consumerNumber;
	}
	public LocalDate getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}
	public LocalDate getConnectionDate() {
		return connectionDate;
	}
	public void setConnectionDate(LocalDate connectionDate) {
		this.connectionDate = connectionDate;
	}
	public boolean isConnectionStatus() {
		return connectionStatus;
	}
	public void setConnectionStatus(boolean connectionStatus) {
		this.connectionStatus = connectionStatus;
	}

	public Connection(long connectionId, long consumerNumber, LocalDate applicationDate, LocalDate connectionDate,
			boolean connectionStatus, Address address, ConnectionType connectiontype) {
		this.connectionId = connectionId;
		this.consumerNumber = consumerNumber;
		this.applicationDate = applicationDate;
		this.connectionDate = connectionDate;
		this.connectionStatus = connectionStatus;
		this.address = address;
		this.connectiontype = connectiontype;
	}

}
