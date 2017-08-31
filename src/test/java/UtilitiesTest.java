
import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.WebArchive;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;


 @RunWith(Arquillian.class)
 
 
public class UtilitiesTest {
    
     @Deployment
     public static WebArchive desplegar(){
         WebArchive salida=ShrinKWrap.create(WebArchive.class)
                 .addclass(Utilities.class)
                 .addAsWebInfResource(EmplyAsset.INSTANCE,"beans.xml");
         System.out.println(salida.toString(true));
         return salida;
         
     }

     @Inject
     private Utilities utilidad;
     @Test
   Public void probar(){
       System.out.print(utilidad);
   
   }
    
    
     
}
