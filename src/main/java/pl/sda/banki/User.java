package pl.sda.banki;

public class User {
    public String name;
    public String lastname;
    public int age;
    private BankAccount bankAccount;

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public User(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.bankAccount = getBankAccount();

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public BankAccount getBank() {
        return bankAccount;
    }
    public void setBank(BankAccount bank) {
        this.bankAccount = bankAccount;
    }
}
