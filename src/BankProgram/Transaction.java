package BankProgram;

import java.util.Calendar;

/*

 */
public class Transaction {

    private static Calendar cal = Calendar.getInstance();
    private  static String nowDate = cal.get(Calendar.YEAR)+"년 "+(cal.get(Calendar.MONTH)+1)+"월 "+cal.get(Calendar.DATE)+"일 ";
    private static String nowTime = cal.get(Calendar.HOUR)+"시 "+cal.get(Calendar.MINUTE)+"분 "+cal.get(Calendar.SECOND)+"초 ";

    private String transactionDate;
    private String transactionTime;
    private String kind;    //바뀔수있음 >> 입금 출금.
    private long amount;    //거래 대금
    private long balance;   //거래 잔액

    //------------------------------------------------------------------
    public Transaction(String kind, long amount, long balance) {
        this(nowDate, nowTime, kind, amount, balance);

    }

    //------------------------------------------------------------------
    public Transaction(String transactionDate, String transactionTime, String kind, long amount, long balance) {
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
        this.kind = kind;
        this.amount = amount;
        this.balance = balance;
    }

    //------------------------------------------------------------------
    @Override
    public String toString() {
        return "transactionDate='" + transactionDate + '\'' +
                ", transactionTime='" + transactionTime + '\'' +
                ", kind='" + kind + '\'' +
                ", amount=" + amount +
                ", balance=" + balance + '\n';
    }

}

























