package ma.cigma.pfe;

import ma.cigma.pfe.models.client;

import ma.cigma.pfe.presentation.clientcontroller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

org.springframework.context.support.ClassPathXmlApplicationContext;
public class applicationrunner {
	public static void main(String[] args) {
		ApplicationContext context =new
				ClassPathXmlApplicationContext("spring.xml");
				clientcontroller ctrl = (clientcontroller)
				context.getBean("idCtrl");
				// Test save use case for three clients
				ctrl.save(new client("omar"));
				ctrl.save(new client("SIHAM"));
				ctrl.save(new client("AHMED"));
				ctrl.save(new client("FARAH"));
				// Test modify use case for client with id==1
				ctrl.modify(new client(1,"new Name"));
				// Test remove use case for client with id==1
				ctrl.removeById(1L);

				
				}
	

}
