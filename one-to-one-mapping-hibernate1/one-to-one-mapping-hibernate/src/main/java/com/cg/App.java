package com.cg;

import java.io.IOException;
import java.util.Scanner;

import com.cg.entity.Employee;
import com.cg.util.CRUDOperations;
import com.cg.util.JPAUtil;

import jakarta.persistence.EntityManager;

public class App {
	public static void main(String[] args) throws IOException {	
		CRUDOperations crud=new CRUDOperations();
				//crud.insertEntity();
				crud.findEntity();
			//	crud.updateEntity();
				//crud.removeEntity();
				EntityManager entityManager=JPAUtil.getEntityManagerFactory().createEntityManager();
				
				
		
}
}
