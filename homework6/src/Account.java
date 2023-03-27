public class Account {
    Client client;
    int balance;
    int id;

    public Account(Client client, int id) {
        this.client = client;
        this.id = id;
    }

    public static Client getClient(Account account) {
        return account.client;
    }

    @Override
    public String toString() {
        return "Account {" + client +
                ", balance=" + balance +
                 ", id=" + id + "}";
    }
}
