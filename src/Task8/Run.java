package Task8;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        Book book1 = new Book(195570, "Николай Метельский", "Удерживая маску");
        Book book2 = new Book(198411, "Дорничев Дмитрий", "Моё пространственное убежище. Книга 12. Приплыли");
        Book book3 = new Book(195567, "Николай Метельский", "Меняя маски");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        System.out.println(bookList);
        Collections.sort(bookList);
        System.out.println(bookList);

        Comparator<Book> byAuthor = new SortByAuthor();
        bookList.sort(byAuthor);
        System.out.println(bookList);

    }
}
