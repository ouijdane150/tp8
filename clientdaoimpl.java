package ma.cigma.pfe.dao;
import ma.cigma.pfe.models.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
public class clientdaoimpl {
	EntityManagerFactory emf=
			Persistence.createEntityManagerFactory("unit_clients");
			EntityManager em=emf.createEntityManager();
			@Override
			public client save(client c) {
			em.getTransaction().begin();
			em.persist(c);
			em.getTransaction().commit();
			return null;
			}
			@Override
			public client update(client newclient) {
			em.getTransaction().begin();
			client currentClient =
			em.find(client.class,newclient.getId());
			currentClient.setName(newclient.getName());
			em.persist(currentClient);
			em.getTransaction().commit();
			return null;
			}
			@Override
			public void deleteById(long idclient) {
			em.getTransaction().begin();
			client clientInDataBase = em.find(client.class,idclient);
			em.remove(clientInDataBase);
			em.getTransaction().commit();
			@Override
			public Client findById(long idClient) {
			return em.find(Client.class,idClient);
			}

}
