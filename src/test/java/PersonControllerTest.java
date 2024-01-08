import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonControllerTest {

    @Test
    void PersonControllerTest() {
        PersonController personController = new PersonController();

        Assert.assertNotNull(personController);
    }


    @Test
    void createPersonTest() {
        PersonController personController = new PersonController();
        Person person = new Person();
        personController.createPerson(person);

        Assert.assertEquals(1, personController.getPersonList().size());

    }

@Test
    void getPersonTest(){
    PersonController personController = new PersonController();
    Person person = new Person("seth","fawlin",5);
    personController.createPerson(person);

    Assert.assertEquals(person, personController.getPerson(5));

}

@Test
    void getPersonListTest(){
    PersonController personController = new PersonController();
    Person person = new Person("Eartha","Lin",0);
    personController.createPerson(person);

    Integer actual = PersonController.getPersonList();
    Integer expected = 1;
    Assert.assertEquals(expected , actual);



}


@Test
    void updatePerson(){
//    PersonController personController = new PersonController();
//    Person person = new Person("Eartha","Lin",0);
//   // Person person2 = new Person("Lissa","Ballor",2);
//    personController.createPerson(person);
//    PersonController.updatePerson(person);
//
//    Person actual = ;
//    Person expeted = ;
//Assert.assertEquals(expeted, actual);
}



@Test
    void personDelete(){


}
}