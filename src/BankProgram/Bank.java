package BankProgram;

import java.util.ArrayList;

/*

 */
public class Bank {


    private ArrayList<Account> accounts;
    private int totalAccount;

    Bank() {
        this.accounts = new ArrayList<Account>();
        this.totalAccount = 0;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    //계좌목록을 본다
    public void seeAccounts() {
        System.out.println("=전체 계좌 목록=");

        for (Account ac : accounts) {
            System.out.println(ac);
        }
    }

    // 총계좌수 반환
    public int getTotalAccount() {
        totalAccount = accounts.size();
        return totalAccount;
    }

    //계좌 생성
    public void addAcccount(String accountNo, String name) {  //소환된 Account의 객체를 가져다가 사용??
        accounts.add(new Account(accountNo, name));
    }

    //계좌 찾기 - 계좌번호로
    public Account getAccount(String accountNo) {  //Account클래스 값을 return

        System.out.println("=해당 계좌정보의 계좌 정보=");

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNo().equals(accountNo)) {
                System.out.println(accounts.get(i));
                System.out.println("===================");
                return accounts.get(i);  //[계좌번호 : 000000, 소유자명 : ABC, 잔액 : 10000]
            }
        }
        return null;
    }

    //계좌 찾기 - 소유자명으로
    public Account findAccounts(String name) {

        System.out.println("=해당 소유자명의 계좌 정보=");

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getName().equals(name)) {
                System.out.println(accounts.get(i));
                System.out.println();
                return accounts.get(i);
            }
        }
        return null;

    }

}




























