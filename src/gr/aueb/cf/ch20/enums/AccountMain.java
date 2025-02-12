package gr.aueb.cf.ch20.enums;

public class AccountMain {
    public static void main(String[] args) {
        AccountType accountType = AccountType.CURRENT;

        //enum to string
        String strAccountType = accountType.name(); // epistrefei string
        System.out.println(strAccountType);

        //string to enum
        AccountType accountType1 = AccountType.valueOf(strAccountType);

        for (AccountType accValue : AccountType.values()) {
            System.out.print(accValue.name() + " ");           //string
            System.out.println(accValue.ordinal());            //ordinal
        }
    }
}
