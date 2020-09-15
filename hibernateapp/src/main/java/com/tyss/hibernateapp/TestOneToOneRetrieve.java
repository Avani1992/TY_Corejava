package com.tyss.hibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.hibernateapp.onetoone.VoterCard;

public class TestOneToOneRetrieve {
	public static void main(String[] args) {
	

	EntityManagerFactory factory=null;
	EntityManager manager=null;
	
	try {
	factory=Persistence.createEntityManagerFactory("test");
	 manager = factory.createEntityManager();
	 VoterCard card = manager.find(VoterCard.class, 101);
	 System.out.println("Card id= "+card.getVid());
	 System.out.println("User id= "+card.getUser().getUid());
	 System.out.println("User name= "+card.getUser().getName());
	
	
	}catch (Exception e) {
		// TODO: handle exception
	}
	manager.close();
	factory.close();
}// End of Method

}//End of class

