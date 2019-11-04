

// File generated by OpenXava: Mon Nov 04 09:58:11 CET 2019
// Archivo generado por OpenXava: Mon Nov 04 09:58:11 CET 2019

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: WorkInvoice		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IWorkInvoice  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_number = "number"; 	
	int getNumber() throws RemoteException; 	
	public static final String PROPERTY_hours = "hours"; 
	int getHours() throws RemoteException;
	void setHours(int hours) throws RemoteException; 	
	public static final String PROPERTY_total = "total"; 
	java.math.BigDecimal getTotal() throws RemoteException;
	void setTotal(java.math.BigDecimal total) throws RemoteException; 	
	public static final String PROPERTY_vatPercentage = "vatPercentage"; 
	int getVatPercentage() throws RemoteException;
	void setVatPercentage(int vatPercentage) throws RemoteException; 	
	public static final String PROPERTY_tripCost = "tripCost"; 
	java.math.BigDecimal getTripCost() throws RemoteException;
	void setTripCost(java.math.BigDecimal tripCost) throws RemoteException; 	
	public static final String PROPERTY_description = "description"; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException; 	
	public static final String PROPERTY_discount = "discount"; 
	java.math.BigDecimal getDiscount() throws RemoteException;
	void setDiscount(java.math.BigDecimal discount) throws RemoteException;		

	// References/Referencias 

	// Worker : Reference/Referencia
	
	org.openxava.test.model.IWorker getWorker() throws RemoteException;
	void setWorker(org.openxava.test.model.IWorker newWorker) throws RemoteException;

	// Methods 


}