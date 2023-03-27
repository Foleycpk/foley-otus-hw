import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Client, List<Account>> clientsAccounts = new HashMap<>();
        fillMap(clientsAccounts);

        Client petrov = new Client("Petrov", 30);
        Account petrovsAccount = new Account(petrov, 123);

        System.out.println("===Поиск счетов клиента===");
        List<Account> mySearch = getAccounts(petrov, clientsAccounts);
        for (Account account : mySearch) {
            System.out.println(account.toString());
        }
        System.out.println();

        System.out.println("===Поиск клиента по счету===");
        System.out.println(Account.getClient(petrovsAccount));


    }
    private static List<Account> getAccounts(Client client, Map<Client, List<Account>> clientsAccounts) {
        return clientsAccounts.get(client);
    }
    private static void fillMap(Map<Client, List<Account>> clientAccounts) {
        Client petrov = new Client("Petrov", 30);
        Client ivanov = new Client("Ivanov", 33);

        Account account1 = new Account(petrov, 123);
        Account account2 = new Account(petrov, 234);
        Account account3 = new Account(ivanov, 345);

        List<Account> petrovsList = new LinkedList<>();
        petrovsList.add(account1);
        petrovsList.add(account2);

        List<Account> ivanovsList = new LinkedList<>();
        ivanovsList.add(account3);

        clientAccounts.put(petrov, petrovsList);
        clientAccounts.put(ivanov, ivanovsList);
    }
}