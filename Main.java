package homeworkLesson4;

class Main {

    public static void main(String[] args) {
        WordsArray wordsArray = new WordsArray(createArrayWords());
        wordsArray.doArrayWords();
        System.out.println(" ");
        doPhoneBook();
    }
    // 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).

    private static String[] createArrayWords() {
        String[] strings = new String[15];
        strings[0] = "zero";
        strings[1] = "one";
        strings[2] = "two";
        strings[3] = "two";
        strings[4] = "one";
        strings[5] = "all";
        strings[6] = "start";
        strings[7] = "finish";
        strings[8] = "four";
        strings[9] = "five";
        strings[10] = "life";
        strings[11] = "three";
        strings[12] = "tree";
        strings[13] = "free";
        strings[14] = "they";
        return strings;
    }

    // 2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
    // В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.

     private static void doPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addElementPhoneBook("Mr.Smith", "+79001234567");
        phoneBook.addElementPhoneBook("Mr.Smith", "+79001234568");
        phoneBook.addElementPhoneBook("Mr.Smith", "+79001234569");

        phoneBook.addElementPhoneBook("Mrs.Adams", "+79997777777");
        phoneBook.addElementPhoneBook("Mrs.Adams", "+7(999)777-77-77");
        phoneBook.addElementPhoneBook("Mrs.Adams", "+79997777777 ");
        phoneBook.addElementPhoneBook("Mrs.Adams", "+79997777777   ");
        phoneBook.addElementPhoneBook("Mrs.Adams", "+7 999 777 77 77 ");
        phoneBook.addElementPhoneBook("Mrs.Adams", "+ 7 9 9 9 7777777     ");

        System.out.println("Smith: " + phoneBook.getPhonesByName("Mr.Smith"));
        System.out.println("Mrs.Adams: " + phoneBook.getPhonesByName("Mrs.Adams"));
        System.out.println("Mr.Iwan: " + phoneBook.getPhonesByName("Mr.Iwan"));
        System.out.println("Mr.X: " + phoneBook.getPhonesByName("Mr.X"));
    }
}
