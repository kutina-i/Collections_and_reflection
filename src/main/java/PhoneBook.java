import java.util.*;
import java.util.List;

public class PhoneBook {
private Map <Human, List<String>> mapOfNumbers;

public PhoneBook(){
mapOfNumbers = new HashMap<>();
}
public void addNewListNumbers(Human human, List<String> numbers){
mapOfNumbers.put(human, numbers);
}

public void addNumber(Human human, String number){
    mapOfNumbers.get(human).add(number);
}

public void deleteNumber(Human human, String number){
    mapOfNumbers.get(human).remove(number);
}

public List<String> getListNumbers(Human human){

   return mapOfNumbers.get(human);

}

public Human findHuman(String number){
    for(Human human: mapOfNumbers.keySet()){
        if(mapOfNumbers.get(human).contains(number)){
            return human;
        }
    }
    return null;
}

//найти всех людей с их телефонами по началу фамилии человека (результат – новое отображение такой же структуры, но содержащее только отобранные записи)
public PhoneBook findAllHumans(String h){
    PhoneBook newPhoneBook = new PhoneBook();
    boolean flag = true;
    for(Human human: mapOfNumbers.keySet()){
        for(int i = 0; i < h.length(); i++){
            if((flag == true)&&(Character.isLowerCase(h.charAt(i)) == Character.isLowerCase(human.getSurname().charAt(i)))){
                flag = true;
            }else{
               flag = false;
            }
        }
        if(flag == true){
            newPhoneBook.addNewListNumbers(human, mapOfNumbers.get(human));
        }
        flag = true;
    }
return newPhoneBook;
}

}
