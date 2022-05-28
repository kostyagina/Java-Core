package homeworkLesson4;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    // Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
    // тогда при запросе такой фамилии должны выводиться все телефоны.
    // Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д).
    // Консоль использовать только для вывода результатов проверки телефонного справочника.

    private HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

    public void addElementPhoneBook(String name, String phone) {
        HashSet<String> phones;
        if (phoneBook.containsKey(name)) {
            phones = phoneBook.get(name);
        }
        else {
            phones = new HashSet<>();
        }
        phones.add(phone.replaceAll(" ",""));

        phoneBook.put(name,phones);
    }

    public Set<String> getPhonesByName (String name){
        return phoneBook.get(name);
    }

}
