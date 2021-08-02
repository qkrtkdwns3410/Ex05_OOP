package BankProgram;

import java.util.ArrayList;

/*

 */
public class Account {
    private String accountNo;
    private String name;
    private long balance;

    private ArrayList<Transaction> transactions;


    //------------------------------------------------------------------
    public Account(String accountNo, String name) {
        this(accountNo, name, 0, new ArrayList<>());
    }

    public Account(String accountNo, String name, long balance, ArrayList<Transaction> transactions) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        this.transactions = transactions;
    }


    //------------------------------------------------------------------
    void deposit(long amount) {
        this.balance += amount;
        transactions.add(new Transaction("입금", amount, this.balance));
        System.out.println(amount + "원을 예금하셨습니다.");
        System.out.println("현재 잔액은 " + this.balance + "원 입니다.");

    }


    //------------------------------------------------------------------
    void withdraw(long amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다");
        } else {
            this.balance -= amount;
            transactions.add(new Transaction("출금", amount, this.balance));
            System.out.println(amount + "원을 출금하셨습니다.");
            System.out.println("현재 잔액은 " + this.balance + "원 입니다 .");
        }
    }


    //------------------------------------------------------------------
    public long getBalance() {
        return balance;
    }


    //------------------------------------------------------------------
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }




    //------------------------------------------------------------------

    @Override
    public String toString() {
        return "Account{" +
                "accountNo='" + accountNo + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

}

























