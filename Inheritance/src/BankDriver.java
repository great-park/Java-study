import java.util.ArrayList;

public class BankDriver {
    public static void main(String[] args){
        BankAccount ba = new BankAccount(); // 부모를 맨 위로
        MinimumBalanceAccount mba = new MinimumBalanceAccount();
        SavingAccount sa = new SavingAccount();

        ba.deposit(1000);
        mba.deposit(1000);
        sa.deposit(1000);

        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(ba);
        accounts.add(mba);
        accounts.add(sa);

        for(BankAccount account : accounts){
            account.deposit(1000);
            if(account instanceof SavingAccount) {  //account가 SavingAccount의 인스턴스 인 경우만
                ((SavingAccount) account).addInterest();
            }
        }


//        //업 캐스팅 = 자식 인스턴스를 부모 클래스로 형변환
//
//        BankAccount sa2 = new SavingAccount();
//        BankAccount sa3 = sa;
//
//        sa.addInterest();
//        //다운 캐스팅 = 부모 클래스로 선언된 인스턴스를 자식 클래스로 변환
//        ((SavingAccount) sa3).addInterest();


    }
}
