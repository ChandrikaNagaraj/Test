package SpringCoreAssignment.SpringCoreAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx =  new ClassPathXmlApplicationContext("SpringCoreAssignment/SpringCoreAssignment/config.xml");
        ShopingCart scart= (ShopingCart)ctx.getBean("scart");
        System.out.println(scart.getUsername());
        System.out.println(scart.getItms());
    }
}



