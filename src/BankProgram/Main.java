package BankProgram;

/*

 */
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAcccount("1234", "박상준");
        bank.addAcccount("32312", "박상준");
        bank.addAcccount("11111", "남현준");
        bank.addAcccount("33333", "양하영");
        bank.addAcccount("22222", "김윤정");

        System.out.println(bank.getTotalAccount());
        bank.getAccount("1234").deposit(2000);
        bank.getAccount("11111").withdraw(30000);
        bank.getAccount("1234").withdraw(1000);


        bank.findAccounts("박상준");
        System.out.println("---------------------------------------------------------------");
        System.out.println(bank.findAccounts("박상준").getTransactions());


    }

}

























