package Task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import static java.util.Comparator.*;

public class TransactionRunner {
    public static void main(String[] args) {
        Trader trader1 = new Trader("Bob", "Cambridge");
        Trader trader2 = new Trader("Alex", "Cambridge");
        Trader trader3 = new Trader("Piter", "Cambridge");
        Trader trader4 = new Trader("Tedd", "New York");
        Trader trader5 = new Trader("Frank", "Los Angeles");
        Trader trader6 = new Trader("Hartman", "Detroit");
        Trader trader7 = new Trader("Alan", "Detroit");
        List<Transaction> listOfTransaction = new ArrayList<>();

        listOfTransaction.add(new Transaction(trader1, 2005, 15750));
        listOfTransaction.add(new Transaction(trader1, 2008, 12950));
        listOfTransaction.add(new Transaction(trader1, 2010, 9700));
        listOfTransaction.add(new Transaction(trader1, 2012, 11880));
        listOfTransaction.add(new Transaction(trader2, 2010, 1175));
        listOfTransaction.add(new Transaction(trader2, 2013, 3800));
        listOfTransaction.add(new Transaction(trader3, 2003, 2055));
        listOfTransaction.add(new Transaction(trader3, 2005, 3780));
        listOfTransaction.add(new Transaction(trader3, 2009, 7490));
        listOfTransaction.add(new Transaction(trader4, 2009, 78530));
        listOfTransaction.add(new Transaction(trader4, 2010, 113530));
        listOfTransaction.add(new Transaction(trader4, 2012, 186000));
        listOfTransaction.add(new Transaction(trader5, 2011, 25600));
        listOfTransaction.add(new Transaction(trader5, 2012, 16800));
        listOfTransaction.add(new Transaction(trader5, 2014, 7300));
        listOfTransaction.add(new Transaction(trader6, 2007, 7370));
        listOfTransaction.add(new Transaction(trader6, 2009, 8080));
        listOfTransaction.add(new Transaction(trader7, 2011, 8090));
        listOfTransaction.add(new Transaction(trader7, 2013, 4010));

        System.out.println("\n1. Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей к большей).\n");

        listOfTransaction.stream()
                .filter(year -> year.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("\n2. Вывести список неповторяющихся городов, в которых работают трейдеры.\n");

        listOfTransaction.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println("\n3. Найти всех трейдеров из Кембриджа и отсортировать их по именам.\n");

        listOfTransaction.stream()
                .map(Transaction::getTrader)
                .distinct()
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("\n4. Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном порядке.\n");

        List<String> allTraders = listOfTransaction.stream()
                .map(Transaction::getTrader)
                .distinct()
                .map(Trader::getName)
                .sorted()
                .toList();

        System.out.println(allTraders);

        System.out.println("\n5. Выяснить, существует ли хоть один трейдер из Милана.\n");

        boolean fromMilan = listOfTransaction.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(fromMilan ? "Кто-то торгует в Милане" : "Никто не торгует в Милане");

        System.out.println("\n6. Вывести суммы всех транзакций трейдеров из Кембриджа.\n");

        System.out.println(listOfTransaction.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .reduce(Integer::sum)
                .get()
        );

        System.out.println("\n7. Какова максимальная сумма среди всех транзакций?\n");

        System.out.println(listOfTransaction.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .getAsInt()
        );

        System.out.println("\n8. Найти транзакцию с минимальной суммой.\n");

        System.out.println(listOfTransaction.stream()
                .mapToInt(Transaction::getValue)
                .min()
                .getAsInt()
        );
    }
}
