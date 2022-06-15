import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Method;

public class ReflectionDemo {

//1. Дан список объектов произвольных типов. Найдите количество элементов списка, которые являются объектами типа Human или его подтипами.
//2. Для объекта получить список имен его открытых методов.
//3. Для объекта получить список (в виде списка строк) имен всех его суперклассов до класса Object включительно

public int listObj(List<?> list){
    int i = 0;
    for(Object l: list){
        if(l instanceof Human){
            i++;
        }
    }
    return i;
}

public List<Method> listNames(Object obj){
Class<Object> c = (Class<Object>) obj.getClass();
List<Method> list = new ArrayList<>(List.of(c.getDeclaredMethods()));
return list;
}

public List<String> listNamesS(Object obj){
List<String> list = new ArrayList<>();
Class<?> c = obj.getClass();
while (c != null){
    list.add(c.toString());
    c = c.getSuperclass();
    }
return list;
}


}
