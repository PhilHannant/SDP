/**
 * Created by philhannant on 18/01/2016.
 */
public class Driver {
    public static void main(String[] args) {
        Storage<BankAccount> aStorage = new Storage<>();
        Storage<String> sStorage = new Storage<>();

        Class<BankAccount> baCls = BankAccount.class;
        try {
            BankAccount myAccount = (BankAccount) baCls.newInstance();
            aStorage.setValue(myAccount);
            System.out.println( aStorage.getValue().showBalance() );
            if( aStorage.getClass() == sStorage.getClass() ) {
                System.out.println( "EQUAL" );
            } else {
                System.out.println( "NOT EQUAL" );
            }
// Deposit
            myAccount.deposit(15);
        }
        catch ( InstantiationException e ) {
// ...
        }
        catch ( IllegalAccessException e ) {
// ...
        }


    }
}
