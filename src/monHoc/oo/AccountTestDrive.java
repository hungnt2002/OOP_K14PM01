package monHoc.oo;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account account;
        account = new Account(2121, 0);
        account.show();
        account.desposit();;
        account.withdraw();
        account.show();

    }
}
