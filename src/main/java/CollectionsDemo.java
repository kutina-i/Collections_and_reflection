import java.util.*;
import java.util.List;

public class CollectionsDemo {
    //1
    public int NumberOfRows(List<String> rows, char a){
       int i = 0;
        for(String row: rows){
            if(Character.toLowerCase(row.charAt(0)) == Character.toLowerCase(a)){
                i++;
            }
        }
       return i;
    }

    //4
    public List<Set<Integer>> listOfList(List<Set<Integer>> list, Set<Integer> set){
        List<Set<Integer>> newList = new ArrayList<>();
        boolean flag = false;
        for(Set<Integer> var: list){
            for(int v: var){
                if(set.contains(v)){
                    flag = true;
                }
            }
            if(flag == false){
                newList.add(var);
            }
            flag = false;
        }
        return newList;
    }

    //5
    public <T extends Human> Set<T> setOfMaxAgeHuman(List<T> humans){
    Set<T> newSet = new HashSet<T>();
    int maxAge = 0;
    for(T human: humans){
        if(human.getAge() > maxAge){
            maxAge = human.getAge();
        }
    }
    for(T human: humans){
        if(human.getAge() == maxAge){
            newSet.add(human);
        }
    }
    return newSet;
    }

    //7
    public Set<Human> setOfHuman(Map<Integer, Human> map, Set<Integer> intNumbers){
        Set<Human> newSet = new HashSet<Human>();
        for(int number: intNumbers){
            if(map.containsKey(number) == true) {
            newSet.add(map.get(number));
            }
        }
        return newSet;
    }

    //8
    public Set<Human> setOfHumanNoLess18(Map<Integer, Human> map, Set<Integer> intNumbers){
        Set<Human> newSet = new HashSet<Human>();
        for(int number: intNumbers){
            if((map.containsKey(number) == true) && (map.get(number).getAge() >=18)){
                newSet.add(map.get(number));
            }
        }
        return newSet;
    }

    //9
    public Map<Integer, Integer> mapOfAge(Map<Integer, Human> map){
        Map<Integer, Integer> newMap = new HashMap<>();
        for(Map.Entry<Integer, Human> entry: map.entrySet()) {
            newMap.put(entry.getKey(), entry.getValue().getAge());
        }
        return newMap;
    }

    //10
    public Map<Integer, List> mapOfHumans(Set<Human> humans){
        Map<Integer, List> newMap = new HashMap<>();
            for(Human human: humans) {
                newMap.putIfAbsent(human.getAge(), new ArrayList<>());
                newMap.get(human.getAge()).add(human);
            }
        return newMap;
    }

   /* //6
    public List<? extends Human> iteratorList(Set<? extends Human> set){

    }*/


}
