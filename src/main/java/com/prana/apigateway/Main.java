package com.prana.apigateway;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Main {
    public static void main(String[] args) {
        lexicalOrder("welcomejava", 3);
    }

    private static void updateList(List list) {
        list.add("Hello");
        list.add(20);
    }

    static void lexicalOrder(String str, int len) {
        String smallest = null;
        String largest = "";
        for (int i = 0; i <= str.length() - len; i++) {
            String sub = str.substring(i, i + len);
            smallest = smallest == null ? sub : smallest;
            smallest = smallest.compareTo(sub) < 0 ? smallest : sub;
            largest = largest.compareTo(sub) > 0 ? largest : sub;
        }
        log.info("Smallest: " + smallest);
        log.info("Largest: " + largest);
    }
}
