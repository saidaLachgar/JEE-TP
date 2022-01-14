package cigma.pfe;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APPLICATIONRUNNER {
    public static void main(String[] args) {
        /*ClientController ctrl1 = new ClientController();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Client client = new Client(1, "testing");
        ctrl1.save(client);*/

        ApplicationContext context= new
                ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController)
                context.getBean("controller");
        Client clt = new Client("testing");
        ctrl.save(clt);
    }
}
