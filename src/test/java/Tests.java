import java.util.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class Tests {
    @Test
    public void  NumberOfRowsTest1(){
        List<String> l = new ArrayList<>();
        l.add("apple");
        l.add("box");
        l.add("action");
        l.add("nine");
        CollectionsDemo test = new CollectionsDemo();
        assertEquals(test.NumberOfRows(l, 'a'), 2);
    }

    @Test
    public void  NumberOfRowsTest2(){
        List<String> l = new ArrayList<>();
        l.add("apple");
        l.add("box");
        l.add("Action");
        l.add("nine");
        CollectionsDemo test = new CollectionsDemo();
        assertEquals(test.NumberOfRows(l, 'a'), 2);
    }

    @Test
    public void  NumberOfRowsTest3(){
        List<String> l = new ArrayList<>();
        l.add("apple");
        l.add("box");
        l.add("Action");
        l.add("nine");
        CollectionsDemo test = new CollectionsDemo();
        assertEquals(test.NumberOfRows(l, 'd'), 0);
    }

    @Test
    public void  ListDemoTest1(){
        Human h = new Human("Асаевич", "Никита", "Сергеевич", 19);
        Human h1 = new Human("Асаевич", "Некит", "Сергей", 18);
        Human h2 = new Human("Асаевич", "Никитка", "Сергеевна", 27);
        Human h3 = new Human("Асаевич", "Кит", "Сергеев", 22);
        Human h4 = new Human("Асаевич", "Никитосик", "Сергеевич", 14);
        Human h5 = new Human("Ассссаевич", "Кит", "Сергеевич", 29);
        List<Human> l = new ArrayList();
        l.add(h1);
        l.add(h2);
        l.add(h3);
        l.add(h4);
        l.add(h5);
        List<Human> l_res = new ArrayList();
        l_res.add(h1);
        l_res.add(h2);
        l_res.add(h3);
        l_res.add(h4);
        assertThat(Arrays.asList(h.ListDemo(l, h)), is(Arrays.asList(l_res)));
    }

    @Test
    public void  CopyListTest1(){
        Human h = new Human("Асаевич", "Никита", "Сергеевич", 19);
        Human h1 = new Human("Асаевич", "Некит", "Сергей", 18);
        Human h2 = new Human("Асаевич", "Никитка", "Сергеевна", 27);
        Human h3 = new Human("Асаевич", "Кит", "Сергеев", 22);
        Human h4 = new Human("Асаевич", "Никитосик", "Сергеевич", 14);
        Human h5 = new Human("Ассссаевич", "Кит", "Сергеевич", 29);
        List<Human> l = new ArrayList();
        l.add(h);
        l.add(h1);
        l.add(h2);
        l.add(h3);
        l.add(h4);
        l.add(h5);
        List<Human> l_res = new ArrayList();
        l_res.add(h1);
        l_res.add(h2);
        l_res.add(h3);
        l_res.add(h4);
        l_res.add(h5);
        assertThat(Arrays.asList(h.CopyList(l, h)), is(Arrays.asList(l_res)));
    }

    @Test
    public void  listOfListTest1(){
        Set<Integer> t1 = new HashSet<>();
        t1.add(2);
        t1.add(1);
        t1.add(8);
        t1.add(14);
        t1.add(21);
        t1.add(22);
        Set<Integer> t2 = new HashSet<>();
        t2.add(6);
        t2.add(20);
        t2.add(62);
        t2.add(8);
        t2.add(1);

        List<Set<Integer>> list = new ArrayList<>(2);
        list.add(t1);
        list.add(t2);

        Set<Integer> t = new HashSet<>();
        t.add(1);
        t.add(7);
        t.add(14);
        t.add(21);
        t.add(12);

        List<Set<Integer>> list_res = new ArrayList<>();

        CollectionsDemo test = new CollectionsDemo();

        assertThat(Arrays.asList(test.listOfList(list, t)), is(Arrays.asList(list_res)));
    }

    @Test
    public void listOfListTest2(){
        Set<Integer> t1 = new HashSet<>();
        t1.add(2);
        t1.add(1);
        t1.add(8);
        t1.add(14);
        t1.add(21);
        t1.add(22);
        Set<Integer> t2 = new HashSet<>();
        t2.add(6);
        t2.add(20);
        t2.add(62);
        t2.add(8);
        t2.add(1);

        List<Set<Integer>> list = new ArrayList<>(2);
        list.add(t1);
        list.add(t2);

        Set<Integer> t = new HashSet<>();
        t.add(5);
        t.add(7);
        t.add(14);
        t.add(21);
        t.add(12);

        List<Set<Integer>> list_res = new ArrayList<>();
        list_res.add(t2);

        CollectionsDemo test = new CollectionsDemo();

        assertThat(Arrays.asList(test.listOfList(list, t)), is(Arrays.asList(list_res)));
    }

    @Test
    public void setOfMaxAgeHumanTest1(){
        Human h = new Human("Асаевич", "Никита", "Сергеевич", 29);
        Student s = new Student("ИМИТ", h);
        Human h2 = new Human("Асаевич", "Никитка", "Сергеевна", 27);
        Human h3 = new Human("Асаевич", "Кит", "Сергеев", 29);
        Human h4 = new Human("Асаевич", "Никитосик", "Сергеевич", 14);
        Human h5 = new Human("Ассссаевич", "Кит", "Сергеевич", 29);
        List <Human> list = new ArrayList<Human>();
        list.add(s);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        list.add(h5);

        Set<Human> res = new HashSet<Human>();
        res.add(s);
        res.add(h3);
        res.add(h5);
        CollectionsDemo test = new CollectionsDemo();

        assertEquals(res.equals(test.setOfMaxAgeHuman(list)), true);
    }

    @Test
    public void setOfHumanTest1(){
        Human h2 = new Human("Асаевич", "Никитка", "Сергеевна", 27);
        Human h3 = new Human("Асаевич", "Кит", "Сергеев", 29);
        Human h4 = new Human("Асаевич", "Никитосик", "Сергеевич", 14);
        Human h5 = new Human("Ассссаевич", "Кит", "Сергеевич", 29);
        Map<Integer, Human> map = new HashMap<>();
        map.put(12, h2);
        map.put(41, h3);
        map.put(40, h4);
        map.put(22, h5);
        Set<Integer> intNumbers = new HashSet<>();
        intNumbers.add(41);
        intNumbers.add(40);

        Set<Human> newSet = new HashSet<Human>();
        newSet.add(h3);
        newSet.add(h4);
        CollectionsDemo test = new CollectionsDemo();

        assertEquals(newSet.equals(test.setOfHuman(map, intNumbers)), true);
    }

    @Test
    public void setOfHumanNoLess18Test1(){
        Human h2 = new Human("Асаевич", "Никитка", "Сергеевна", 27);
        Human h3 = new Human("Асаевич", "Кит", "Сергеев", 29);
        Human h4 = new Human("Асаевич", "Никитосик", "Сергеевич", 14);
        Human h5 = new Human("Ассссаевич", "Кит", "Сергеевич", 29);
        Map<Integer, Human> map = new HashMap<>();
        map.put(12, h2);
        map.put(41, h3);
        map.put(40, h4);
        map.put(22, h5);
        Set<Integer> intNumbers = new HashSet<>();
        intNumbers.add(41);
        intNumbers.add(40);

        Set<Human> newSet = new HashSet<Human>();
        newSet.add(h3);
        CollectionsDemo test = new CollectionsDemo();

        assertEquals(newSet.equals(test.setOfHumanNoLess18(map, intNumbers)), true);
    }


    @Test
    public void mapOfAgeTest1(){
        Human h2 = new Human("Асаевич", "Никитка", "Сергеевна", 27);
        Human h3 = new Human("Асаевич", "Кит", "Сергеев", 29);
        Human h4 = new Human("Асаевич", "Никитосик", "Сергеевич", 14);
        Human h5 = new Human("Ассссаевич", "Кит", "Сергеевич", 29);
        Map<Integer, Human> map = new HashMap<>();
        map.put(12, h2);
        map.put(41, h3);
        map.put(40, h4);
        map.put(22, h5);
        CollectionsDemo test = new CollectionsDemo();

        Map<Integer, Integer> res = new HashMap<>();

        res.put(12, 27);
        res.put(41, 29);
        res.put(40, 14);
        res.put(22, 29);

        assertEquals(res.equals(test.mapOfAge(map)), true);
    }

    @Test
    public void mapOfHumansTest1(){
        Human h2 = new Human("Асаевич", "Никитка", "Сергеевна", 27);
        Human h3 = new Human("Асаевич", "Кит", "Сергеев", 29);
        Human h4 = new Human("Асаевич", "Никитосик", "Сергеевич", 14);
        Human h5 = new Human("Ассссаевич", "Кит", "Сергеевич", 29);

        Set<Human> setOfH = new HashSet<>();
        setOfH.add(h2);
        setOfH.add(h3);
        setOfH.add(h4);
        setOfH.add(h5);

        CollectionsDemo test = new CollectionsDemo();
        List<Human> l1 = new ArrayList<>();
        List<Human> l2 = new ArrayList<>();
        List<Human> l3 = new ArrayList<>();
        l1.add(h2);
        l2.add(h4);
        l3.add(h3);
        l3.add(h5);
        Map<Integer, List> res = new HashMap<>();
        res.put(27, l1);
        res.put(14, l2);
        res.put(29, l3);

        assertEquals(res.equals(test.mapOfHumans(setOfH)), true);
    }





}
