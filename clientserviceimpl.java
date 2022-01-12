package ma.cigma.pfe.service;
import ma.cigma.pfe.dao.iclientdao;
import ma.cigma.pfe.models.client;

public class clientserviceimpl  implements iclientservice{
	private iclientdao dao;
	public void setDao(iclientdao dao) {
	this.dao = dao;
	}
	@Override
	public client save(client c) {
	return dao.save(c);
	}
	@Override
	public client modify(client c) {
	return dao.update(c);
	@Override
	public void removeById(long id) {
	dao.deleteById(id);
	}
	@Override
	public Client getById(long id) {
	return dao.findById(id);

}
