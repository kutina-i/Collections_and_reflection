import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class Refl {
    @Test
    public void listObjTest(){
        //1. Дан список объектов произвольных типов. Найдите количество элементов списка,
        // которые являются объектами типа Human или его подтипами.
        List<Object> list = new ArrayList<>();
        Human human1 = new Human();
        Human human2 = new Human();
        Cat cat = new Cat();
        list.add(human1);
        list.add(human2);
        list.add(cat);
        ReflectionDemo r = new ReflectionDemo();
        assertEquals(2, r.listObj(list));
    }

    @Test
    public void listNamesTest() throws NoSuchMethodException {
        //2. Для объекта получить список имен его открытых методов.
        List<Method> list = new ArrayList<>();
        Cat cat = new Cat();
        Class<Cat> c = (Class<Cat>) cat.getClass();
        list.add(c.getMethod("getName"));
        list.add(c.getMethod("getAge"));
        ReflectionDemo r = new ReflectionDemo();
        assertEquals(list, r.listNames(cat));
    }

    @Test
    public void listNamesSTest(){
        //3. Для объекта получить список (в виде списка строк) имен всех его суперклассов до класса Object включительно
        Human human = new Human();
        List<String> res = new ArrayList<>();
        res.add((Human.class).toString());
        res.add((Object.class).toString());
        ReflectionDemo r = new ReflectionDemo();
        assertEquals(r.listNamesS(human), res);

    }


}
