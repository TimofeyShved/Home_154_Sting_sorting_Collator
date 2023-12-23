package com.company;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Создаём массив строк
        List<String> list = new ArrayList<>(3);
        list.add("Bi");
        list.add("cc");
        list.add("bb");
        list.add("бД"); // это было написано (русскими)
        list.add("bD");
        list.add("AA");
        list.add("aa");

        // создаём правило сортировки
        Collator collator = Collator.getInstance();
        // правила сортировки
        //collator.setStrength(Collator.PRIMARY); // B=б В=в
        //collator.setStrength(Collator.SECONDARY); // B!=б В=в
        //collator.setStrength(Collator.TERTIARY); // B!=б В!=в

        // На самом деле с (русскими) буквами не работает, так как много различий,
        // но вот (анг) и (нем) отлично приравнивает
        
        // сортируем
        Collections.sort(list, collator);

        // вывод
        for (String s: list){
            System.out.println(s);
        }
    }
}
