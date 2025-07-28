package oop.intro;

public class Account {
    private String name;
    private String email;
    private double amount;
    private String account_no;

    public Account(String name, String email, double amount, String account_no) {
        this.name = name;
        this.email = email;
        this.amount = amount;
        this.account_no = account_no;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }


    public void printAccount(){
        System.out.println("Name :" + name + " Email :" + email + " Amount :" + amount + " Account No :" + account_no);
    }

    public double convert(){
        return amount * 3.25;
    }

}

