package ru.otus.homework.hm6;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Bank {
    private Map<Client, HashSet<Account>> clientHashSetMap = new HashMap<>();

    public void addClient(Client client, HashSet<Account> account){
        clientHashSetMap.put(client, account);
    }
    public HashSet<Account> getAccount(Client client){
        return clientHashSetMap.get(client);
    }
    public Client getClient(Account account){
        for (Map.Entry <Client, HashSet<Account>> entry : clientHashSetMap.entrySet()){
            for (int i =0; i < entry.getValue().size(); i++){
                if (entry.getValue().contains(account)){
                    return entry.getKey();
                }
            }
        }
        return null;

    }


    public void showAll(){
        clientHashSetMap.forEach( (k, v) ->  System.out.printf("%s:%s\n ", k, v));
    }



}