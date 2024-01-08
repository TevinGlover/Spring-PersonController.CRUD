import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void PersonIsNotNull(){
        Person person = new Person();
        Assert.assertNotNull(person);
    }
    @org.junit.jupiter.api.Test
    void getFirstName() {
        String tev = "tev";
        String Glo = "Glo";
        Integer id = 3;


        Person person = new Person( tev,  Glo, id);
        Assert.assertEquals(tev, person.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {    String tev = "tev";
        String Glo = "Glo";
        Integer id = 3;
        Person person = new Person( tev,  Glo, id);
        person.setFirstName("Leona");

        Assert.assertEquals("Leona", person.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        String tev = "tev";
        String Glo = "Glo";
        Integer id = 3;


        Person person = new Person( tev,  Glo, id);
        Assert.assertEquals(Glo, person.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        String tev = "tev";
        String Glo = "Glo";
        Integer id = 3;


        Person person = new Person( tev,  Glo, id);
        person.setLastName("barn");

        Assert.assertEquals("barn", person.getLastName());
    }

    @org.junit.jupiter.api.Test
    void getId() {

        String tev = "tev";
        String Glo = "Glo";
        Integer id = 3;


        Person person = new Person( tev,  Glo, id);


        Assert.assertEquals(3, person.getId());
    }

    @org.junit.jupiter.api.Test
    void setId() {
        String tev = "tev";
        String Glo = "Glo";
        Integer id = 3;


        Person person = new Person( tev,  Glo, id);
        person.setId(5);

        Assert.assertEquals(5, person.getId());
    }
}