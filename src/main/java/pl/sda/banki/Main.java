package pl.sda.banki;

/* - id:1, name:BankDlaBogatych, accountNumber: 5555, balance: 6555
- id:2, name:BankNowoczesny, accountNumber: 4444, balance: 6532455
- id:3, name:Bank, accountNumber: 3333, balance: 234234
- id:4, name:BigBank, accountNumber: 2222, balance: 2342
8*/

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user = new User("Jan", "Kowalski", 44);
        User user2 = new User("Marcin", "Nowak", 66);
        User user3 = new User("Katarzyna", "Dobron", 33);
        User user4 = new User("Ola", "Lewandowska", 33);

        BankAccount bankAccount = new BankAccount(1, "BankDlaBogatych", 5555, 6555);
        BankAccount bankAccount1 = new BankAccount(2, "BankNowoczesny", 4444, 6532455);
        BankAccount bankAccount2 = new BankAccount(3, "Bank", 3333, 234234);
        BankAccount bankAccount3 = new BankAccount(4, "BigBank", 2222, 2342);

        user.setBankAccount(bankAccount);
        user2.setBankAccount(bankAccount1);
        user3.setBankAccount(bankAccount2);
        user4.setBankAccount(bankAccount3);

        System.out.println(user.getBankAccount().getBalance());
        System.out.println(user2.getBankAccount().getBalance());
        System.out.println(user3.getBankAccount().getBalance());
        System.out.println(user4.getBankAccount().getBalance());

        List<User> users = new ArrayList<User>();
        users.add(user);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("users.json"), users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}