package ma.cigma.pfe.presentation;
import ma.cigma.pfe.models.client;;
import ma.cigma.pfe.service.iclientservice;
public class clientcontroller {
private iclientservice service;
public void setService(iclientservice service) {
this.service = service;
}
public void save(client c){
service.save(c);
}
public void modify(client c){
service.modify(c);


}
public void removeById(long id){
service.removeById(id);
}
public void modify(client c){
service.modify(c);
}
public void removeById(long id){
service.removeById(id);
}
public client getById(long id){
return service.getById(id);
}

}
