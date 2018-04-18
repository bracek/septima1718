import org.junit.Assert;
import java.util.ArrayList;
import org.junit.Test;

public class PersonTest {

    private static final String FIRST_NAME = "mka";

    @Test
    public void testFirstName(){
        Person p = new Person();
        p.setFirstName(FIRST_NAME);
        Assert.assertEquals(FIRST_NAME, p.getFirstName());

    }
    
        @Test
    public void testPredmety(){
        Person p = new Person();
        p.setPredmety(4);
        System.out.println("Po�et nav�tevovan�ch predmetov: " + p.getPredmety());

    }
          @Test
    public void testPohlavie(){
        Person p = new Person();
        p.setPohlavie(pohlavie.MU�);
        System.out.println("Pohlavie: " + p.getPohlavie());

    }
      
             @Test
    public void testRodneCislo(){
        Person p = new Person();
        p.setRodneCislo("991011/7407");
        System.out.println("Rodne ��slo: " + p.getRodneCislo());

    }
               @Test
    public void testJazyky(){
        Person p = new Person();
        ArrayList<String> al=new ArrayList<String>();
        al.add("Sloven��na-B2");
        al.add("Angli�tina-C2");
        al.add("�e�tina-A1");
        al.add("R�m�tina-C1");
        p.setJazyky(al);
        System.out.println("Jazyk: " + p.getJazyky());

    }
      
      
    
}
