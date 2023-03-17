package org.example.exam.ex2;

public class Main {

    public static void main(String[] args) throws Exception {
        //BankAccount obj1 = new BankAccount("345", "Sona", 11);
//        System.out.println(obj1.deposit(5));
//        System.out.println(obj1.withdraw(20));
        Bank bank = new Bank();
        bank.openNewAcc("5", "Sona", 500);
        bank.openNewAcc("6", "Ani", 500);
        bank.openNewAcc("2", "Mariam", 500);
        bank.depositMoney("10", 5);
        System.out.println(bank.depositMoney("5", 20));
        System.out.println(bank.getTotalBalance());
    }
}
