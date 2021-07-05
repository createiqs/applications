package com.createiq.quaries;

public interface Queries {
	String INSERT = "INSERT INTO PRODUCT VALUES(?,?,?)";
	String UPDATE = "UPDATE PRODUCT SET PNAME = ?, PCOST = ? WHERE PID = ?";
	String DELETE_BY_ID = "DELETE FROM PRODUCT WHERE PID = ?";
	String FIND_BY_ID = "SELECT * FROM PRODUCT WHERE PID = ?";
	String FIND_ALL = "SELECT * FROM PRODUCT";
}
