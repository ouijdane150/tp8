package ma.cigma.pfe.dao;
import ma.cigma.pfe.models.client;

public class iclientdao {
	client save(client c);
	client update(client c);
	void deleteById(long idclient);
	client findById(long idClient);
}
