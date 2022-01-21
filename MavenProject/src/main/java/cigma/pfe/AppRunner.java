package cigma.pfe;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.CarteFidelio;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
        /* ClientController ctrl1 = new ClientController(); */

        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("controller");

        Client clt = new Client("testing");

        /*List<Facture> factures = Arrays.asList(
                new Facture(1500.0,"facture1", clt),
                new Facture(2000.0,"facture2", clt)
        );
        clt.setFactures(factures);

        ctrl.save(clt);*/


        CarteFidelio carteFidelio = new CarteFidelio("A29930489");
        carteFidelio.setClient(client);
        clt.setCarteFidelio(carteFidelio);
        ctrl.save(client);
    }
}
