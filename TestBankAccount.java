public class TestBankAccount {
    
    public static void main(String[] args){

        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        // =====================================DEPOSITS=====================================

        acc1.transaction("deposit", "checking", 500);
        acc1.transaction("deposit", "savings", 500);

        acc2.transaction("deposit", "checking", 600);
        acc2.transaction("deposit", "savings", 600);

        // ======================================WITHDRAWS====================================

        acc1.transaction("withdraw", "savings", 100);
        acc1.transaction("withdraw", "savings", 100);

        // ====================================TOTAL BALANCES=================================
        
        acc1.allBal();
        acc2.allBal();

        // ===================================================================================
        System.out.println("===============================================================================================================================================");
        System.out.println("New account has been created, there are now " + BankAccount.numOfAccounts + " accounts total.");

        System.out.println("===============================================================================================================================================");
        System.out.println("Central Bank balance: " + BankAccount.centralBank + ".");



    }
}
