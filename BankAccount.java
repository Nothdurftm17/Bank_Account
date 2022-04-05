
public class BankAccount{

    private double checkingBal;
    private double savingsBal;

    // Need to track total amount of accounts
    static int numOfAccounts;

    // Need to track all the money stored in every account
    public static double centralBank;

    public BankAccount(){
        // Track all accounts as they are created
        numOfAccounts ++;
    }
    // Setter for the checking balance
    public void setCheckingBal(double amt){
        this.checkingBal = amt;

    }
    // Setter for the savings balance
    public void setSavingsBal(double amt){
        this.savingsBal = amt;
    }

    // Getter for the checking balance
    public double getCheckingBal(){
        System.out.println("Checking account balance: " + this.checkingBal);
        return this.checkingBal;
    }
    // Getter for the savings balance
    public double getSavingsBalance(){
        System.out.println("Savings account balance: " + this.savingsBal);
        return this.savingsBal;
    }

    // Method for transaction in either the checking or savings account
    public void transaction(String type, String account, int amt){
        if(type=="deposit"){
            if(account == "checking"){
                this.checkingBal += amt;
                this.centralBank += amt;
                System.out.println("===============================================================================================================================================");
                System.out.println("You have made a deposit to your checking account in the amount of $" + amt + ". Your current checking balance is now $" + this.checkingBal + ". the Central Bank balance is " + this.centralBank + ".");
    
            }
            else if (account =="savings"){
                this.savingsBal += amt;
                this.centralBank += amt;
                System.out.println("===============================================================================================================================================");
                System.out.println("You have made a deposit to your savings account in the amount of $" + amt + ". Your current savings balance is now $" + this.savingsBal + ". the Central Bank balance is " + this.centralBank + ".");
    
            }
            else {
                System.out.println("===============================================================================================================================================");
                System.out.println("Must enter either checking or savings to make a deposit");
            }
        }
        else if(type == "withdraw"){
                if(account == "checking"){
                    if(this.checkingBal < amt){
                        System.out.println("SIKE! Ya Broke");
                        return;
                    }
                    this.checkingBal -= amt;
                    this.centralBank -= amt;
                    System.out.println("===============================================================================================================================================");
                    System.out.println("You have made a withdrawal to your checking account in the amount of $" + amt + ". Your current checking balance is now $" + this.checkingBal + ". the Central Bank balance is " + this.centralBank + ".");
        
                }
                else if (account =="savings"){
                    if(this.checkingBal < amt){
                        System.out.println("SIKE! Ya Broke");
                        return;
                    }
                    this.savingsBal -= amt;
                    this.centralBank -= amt;
                    System.out.println("===============================================================================================================================================");
                    System.out.println("You have made a withdrawal to your savings account in the amount of $" + amt + ". Your current savings balance is now $" + this.savingsBal + ". the Central Bank balance is " + this.centralBank + ".");
        
                }
                else {
                    System.out.println("===============================================================================================================================================");
                    System.out.println("Must enter either checking or savings to make a deposit");
                }
            }
        }

    // Method to see both checking and savings balances
    public void allBal(){
        double all = this.checkingBal+this.savingsBal;
        System.out.println("===============================================================================================================================================");
        System.out.println("Total balance from Checking and Saving: " + all);
    }

}