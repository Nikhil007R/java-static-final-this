public class BankAccount {

    // common to all among objects of bankAccount
    private static String bankName = "Central Bank";

    private static int totalCounts = 0; // static counter for total accounts
    private String bankHolderName;
    private final int accountNumber;    // final variable connot be changed

//    constructor
    public BankAccount(String bankHolderName, int accountNumber){
        this.bankHolderName = bankHolderName;
        this.accountNumber = accountNumber;
        totalCounts++;
    }

//    printing totalCounts for all the accounts
    public static void totalCounts(){
        System.out.println("Total number of accounts are: " + totalCounts);
    }

    public void bankDetails(){
        System.out.println("==== Bank Details are as follows ====");
        System.out.println("BankName: " + bankName);
        System.out.println("BankHolder Name: " + bankHolderName);
        System.out.println("AccountNumber: " + accountNumber);
        System.out.println("Total count till now " + totalCounts);
    }

    public static void main(String[] args) {

//        creating an object of bankAccount class
        BankAccount obj1 = new BankAccount("Nikhil Rawat", 101);
        obj1.bankDetails();
        BankAccount obj2 = new BankAccount("Keshav Kumar", 105);
        obj2.bankDetails();

//        displaying the  totalcounts
        BankAccount.totalCounts();

        BankAccount obj3 = new BankAccount("Ayush Negi", 125);
//        displaying the details of the accounts
        obj3.bankDetails();

        BankAccount.totalCounts();

    }
}
