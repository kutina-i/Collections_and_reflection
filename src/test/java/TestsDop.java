import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestsDop {
    @Test
    public void Test1(){
        Human h1 = new Human("Асаевич", "Никитка", "Сергеевна", 27);
        PhoneBook pb1 = new PhoneBook();
        assertNull(pb1.getListNumbers(h1));

    }


    @Test
    //добавить телефон
    public void  addNumberTest1(){
        Human h1 = new Human("Асаевич", "Никитка", "Сергеевна", 27);
        Human h2 = new Human("Асаевич", "Никитосик", "Сергеевич", 14);
        Human h3 = new Human("Ассссаевич", "Кит", "Сергеевич", 29);
        List<String> numbersH1 = new ArrayList<>();
        numbersH1.add("89320981359");
        numbersH1.add("89320984896");
        List<String> numbersH2 = new ArrayList<>();
        numbersH2.add("89123980359");
        List<String> numbersH3 = new ArrayList<>();
        numbersH3.add("87124980352");

        PhoneBook pb1 = new PhoneBook();
        pb1.addNewListNumbers(h1, numbersH1);
        pb1.addNewListNumbers(h2, numbersH2);
        pb1.addNewListNumbers(h3, numbersH3);

        List<String> numbersH11 = new ArrayList<>();
        numbersH11.add("89320981359");
        numbersH11.add("89320984896");
        numbersH11.add("87524981352");

        PhoneBook pb11 = new PhoneBook();
        pb11.addNewListNumbers(h1, numbersH11);
        pb11.addNewListNumbers(h2, numbersH2);
        pb11.addNewListNumbers(h3, numbersH3);

        pb1.addNumber(h1, "87524981352");

        assertArrayEquals(pb11.getListNumbers(h1).toArray(), pb1.getListNumbers(h1).toArray());
    }

    @Test
    //удалить телефон
    public void  deleteNumberTest1() {
        Human h1 = new Human("Асаевич", "Никитка", "Сергеевна", 27);
        Human h2 = new Human("Асаевич", "Никитосик", "Сергеевич", 14);
        Human h3 = new Human("Ассссаевич", "Кит", "Сергеевич", 29);
        List<String> numbersH1 = new ArrayList<>();
        numbersH1.add("89320981359");
        numbersH1.add("89320984896");
        List<String> numbersH2 = new ArrayList<>();
        numbersH2.add("89123980359");
        List<String> numbersH3 = new ArrayList<>();
        numbersH3.add("87124980352");

        PhoneBook pb1 = new PhoneBook();
        pb1.addNewListNumbers(h1, numbersH1);
        pb1.addNewListNumbers(h2, numbersH2);
        pb1.addNewListNumbers(h3, numbersH3);

        List<String> numbersH11 = new ArrayList<>();
        numbersH11.add("89320981359");

        PhoneBook pb11 = new PhoneBook();
        pb11.addNewListNumbers(h1, numbersH11);
        pb11.addNewListNumbers(h2, numbersH2);
        pb11.addNewListNumbers(h3, numbersH3);

        pb1.deleteNumber(h1, "89320984896");
        assertArrayEquals(pb11.getListNumbers(h1).toArray(), pb1.getListNumbers(h1).toArray());
    }

    @Test
    //получить список телефонов по человеку
    public void  getListNumbersTest1() {
        Human h1 = new Human("Асаевич", "Никитка", "Сергеевна", 27);
        Human h2 = new Human("Асаевич", "Никитосик", "Сергеевич", 14);
        Human h3 = new Human("Ассссаевич", "Кит", "Сергеевич", 29);
        List<String> numbersH1 = new ArrayList<>();
        numbersH1.add("89320981359");
        numbersH1.add("89320984896");
        List<String> numbersH2 = new ArrayList<>();
        numbersH2.add("89123980359");
        List<String> numbersH3 = new ArrayList<>();
        numbersH3.add("87124980352");

        PhoneBook pb1 = new PhoneBook();
        pb1.addNewListNumbers(h1, numbersH1);
        pb1.addNewListNumbers(h2, numbersH2);
        pb1.addNewListNumbers(h3, numbersH3);

        assertArrayEquals(pb1.getListNumbers(h1).toArray(), numbersH1.toArray());
    }

    @Test
    //найти человека по номеру телефона
    public void findHumanTest1() {
        Human h1 = new Human("Асаевич", "Никитка", "Сергеевна", 27);
        Human h2 = new Human("Асаевич", "Никитосик", "Сергеевич", 14);
        Human h3 = new Human("Ассссаевич", "Кит", "Сергеевич", 29);
        List<String> numbersH1 = new ArrayList<>();
        numbersH1.add("89320981359");
        numbersH1.add("89320984896");
        List<String> numbersH2 = new ArrayList<>();
        numbersH2.add("89123980359");
        List<String> numbersH3 = new ArrayList<>();
        numbersH3.add("87124980352");

        PhoneBook pb1 = new PhoneBook();
        pb1.addNewListNumbers(h1, numbersH1);
        pb1.addNewListNumbers(h2, numbersH2);
        pb1.addNewListNumbers(h3, numbersH3);

        assertEquals(h2, pb1.findHuman("89123980359"));
    }

    @Test
    //найти всех людей с их телефонами по началу фамилии человека (результат – новое отображение такой же структуры, но содержащее только отобранные записи)
    public void findAllHumansTest1(){
        Human h1 = new Human("Асаевич", "Никитка", "Сергеевна", 27);
        Human h2 = new Human("Асаевич", "Никитосик", "Сергеевич", 14);
        Human h3 = new Human("Ассссаевич", "Кит", "Сергеевич", 29);
        List<String> numbersH1 = new ArrayList<>();
        numbersH1.add("89320981359");
        numbersH1.add("89320984896");
        List<String> numbersH2 = new ArrayList<>();
        numbersH2.add("89123980359");
        List<String> numbersH3 = new ArrayList<>();
        numbersH3.add("87124980352");

        PhoneBook pb1 = new PhoneBook();
        pb1.addNewListNumbers(h1, numbersH1);
        pb1.addNewListNumbers(h2, numbersH2);
        pb1.addNewListNumbers(h3, numbersH3);

        PhoneBook pb11 = new PhoneBook();
        pb11.addNewListNumbers(h1, numbersH1);
        pb11.addNewListNumbers(h2, numbersH2);

        assertArrayEquals(pb11.getListNumbers(h1).toArray(), pb1.findAllHumans("Аса").getListNumbers(h1).toArray());
        assertArrayEquals(pb11.getListNumbers(h2).toArray(), pb1.findAllHumans("Аса").getListNumbers(h2).toArray());

    }



}
