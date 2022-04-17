package com.modules;

import java.time.LocalDate;

public class Connection {
	private long connectionId;
	private long consumerNumber;
	private LocalDate applicationDate;
	private LocalDate connectionDate;
	private  boolean connectionStatus;
	private Address ConnectionAddress;
	private ConnectionType ConnectionType;
	public Connection() {
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
public Address getConnectionAddress() {
	return ConnectionAddress;
}
public void setConnectionAddress(Address connectionAddress) {
	ConnectionAddress = connectionAddress;
}
public ConnectionType getConnectionType() {
	return ConnectionType;
}
public void setConnectionType(ConnectionType connectionType) {
	ConnectionType = connectionType;
}

public Connection(long connectionId, long consumerNumber, LocalDate applicationDate, LocalDate connectionDate,
		boolean connectionStatus, Address connectionAddress, com.modules.ConnectionType connectionType) {
	super();
	this.connectionId = connectionId;
	this.consumerNumber = consumerNumber;
	this.applicationDate = applicationDate;
	this.connectionDate = connectionDate;
	this.connectionStatus = connectionStatus;
	ConnectionAddress = connectionAddress;
	ConnectionType = connectionType;
}

@Override
public String toString() {
	return "Connection [connectionId=" + connectionId + ", consumerNumber=" + consumerNumber + ", applicationDate="
			+ applicationDate + ", connectionDate=" + connectionDate + ", connectionStatus=" + connectionStatus
			+ ", ConnectionAddress=" + ConnectionAddress + ", ConnectionType=" + ConnectionType + "]";
}


	

}
