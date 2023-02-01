package ru.otus.homework.hm6;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Client obama = new Client("Obama", 40);
        HashSet<Account> hashAccountObama = new HashSet<>();
        Account accountObama = new Account(100);
        Account accountObama1 = new Account(99999);
        Account accountObama2 = new Account(32934885);
        hashAccountObama.add(accountObama);
        hashAccountObama.add(accountObama1);
        hashAccountObama.add(accountObama2);





        Client pupa = new Client("Pupa", 20);
        HashSet<Account> hashAccountPupa = new HashSet<>();
        Account accountPupa = new Account(100);
        Account accountPupa1 = new Account(4);
        hashAccountPupa.add(accountPupa);
        hashAccountPupa.add(accountPupa1);


        Client lupa = new Client("Lupa", 30);
        HashSet<Account> hashAccountLupa = new HashSet<>();
        Account accountLupa = new Account(40340);
        hashAccountLupa.add(accountLupa);




        Bank bank = new Bank();
        bank.addClient(obama, hashAccountObama);
        bank.addClient(pupa, hashAccountPupa);
        bank.addClient(lupa, hashAccountLupa);

        bank.showAll();
        System.out.println("_________________________________________");
        System.out.println("аккаунты обамы " + bank.getAccount(obama));
        System.out.println("находим обаму по его первому аккаунту " + bank.getClient(accountObama1));
        System.out.println("находим обаму по его второму аккаунту " + bank.getClient(accountObama2)); //выйдет тоже самое т.к.
        // у аккаунта может быть один клиент, но при этом у клиента может быть много аккаунтов.
        System.out.println("находим пупу по его аккаунту " + bank.getClient(accountPupa1));
        System.out.println("находим все аккаунты пупы " + bank.getAccount(pupa));

    }
}