package cigma.pfe;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.CarteFidelio;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.models.Promotion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {

        /* ClientController ctrl1 = new ClientController();*/

        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("controller");

        Client clt = new Client("OMAR");

        List<Facture> factures = Arrays.asList(
                new Facture("1500.0","facture1", clt),
                new Facture("2000.0","facture2", clt)
        );
        clt.setFactures(factures);

        List<Promotion> promotions=Arrays.asList(
                new Promotion("remise 10%"),
                new Promotion("solde 40%")
        );
        clt.setPromotions(promotions);

        CarteFidelio carteFidelio = new CarteFidelio("A29930489");
        carteFidelio.setClient(clt);
        clt.setCarteFidelio(carteFidelio);

        ctrl.save(clt);
    }
}
