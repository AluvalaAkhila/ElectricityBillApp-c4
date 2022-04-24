package com.capgemini.modules;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.Id;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;


@Entity

public class Connection {
	@Id
	private long connectionId;
	private long consumerNumber;
	private LocalDate applicationDate;
	private LocalDate connectionDate;
	private  boolean connectionStatus;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "addressId" , name="addressid")
	private Address connectionAddress;
	
	@Autowired
	private ConnectionType connectionType;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "customerId" ,name="customerid")
	private Customer customerConnection;
	
	public Connection() {
	}

	public Connection(long connectionId, long consumerNumber, LocalDate applicationDate, LocalDate connectionDate,
			boolean connectionStatus, Address connectionAddress, ConnectionType connectionType,
			Customer customerConnection) {
		this.connectionId = connectionId;
		this.consumerNumber = consumerNumber;
		this.applicationDate = applicationDate;
		this.connectionDate = connectionDate;
		this.connectionStatus = connectionStatus;
		this.connectionAddress = connectionAddress;
		this.connectionType = connectionType;
		this.customerConnection = customerConnection;
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

	public Address getConnectionAddress() {
		return connectionAddress;
	}

	public void setConnectionAddress(Address connectionAddress) {
		this.connectionAddress = connectionAddress;
	}

	public ConnectionType getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(ConnectionType connectionType) {
		this.connectionType = connectionType;
	}

	public Customer getCustomerConnection() {
		return customerConnection;
	}

	public void setCustomerConnection(Customer customerConnection) {
		this.customerConnection = customerConnection;
	}

	public boolean isConnectionStatus() {
		return connectionStatus;
	}

	public void setConnectionStatus(boolean connectionStatus) {
		this.connectionStatus = connectionStatus;
	}

	@Override
	public String toString() {
		return "Connection [connectionId=" + connectionId + ", consumerNumber=" + consumerNumber + ", applicationDate="
				+ applicationDate + ", connectionDate=" + connectionDate + ", connectionStatus=" + connectionStatus
				+ ", connectionAddress=" + connectionAddress + ", connectionType=" + connectionType
				+ ", customerConnection=" + customerConnection + "]";
	}
	
	



}
