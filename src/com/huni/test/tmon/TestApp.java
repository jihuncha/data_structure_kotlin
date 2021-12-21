package com.huni.test.tmon;

import java.util.*;

//penpineapple
//applepen

public class TestApp {
    static HashMap<String, Integer> myHash = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstString = sc.next();
        String secondString = sc.next();

        System.out.println(firstString);
        System.out.println(secondString);

        //hash 생성 -> 첫 스트링으로
        for (int i = 0; i < firstString.length(); i++) {
            String temp = "";

            for (int j = i; j < firstString.length(); j++) {
                temp += firstString.substring(j, j+1);
                System.out.println(temp);
                if (temp.length() > 1) {
                    myHash.put(temp, 1);
                }
            }
        }

        // 두번째 string 으로 중복 비교
        for (int i = 0; i < secondString.length(); i++) {
            String temp = "";

            for (int j = i; j < secondString.length(); j++) {
                temp += secondString.substring(j, j+1);
                if (myHash.containsKey(temp)) {
                    int count = myHash.get(temp);
                    myHash.put(temp, count += 1);
                } else {
                    //생각안해도된다.
                }
            }
        }

        Map<String, Integer> result = sortMapByValue(myHash);

        String resultString = (String)result.keySet().toArray()[0];

        System.out.println(resultString.length() + " " + resultString);
    }

    //정렬
    public static LinkedHashMap<String, Integer> sortMapByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());

        Comparator<Map.Entry<String, Integer>> sort = new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                if (o1.getValue() > o2.getValue()) {
                    System.out.println(o1.getValue() + " - " + o2.getValue());
                    return -1;
                } else if (o1.getValue() == o2.getValue()) {
                    if (o1.getKey().length() > o2.getKey().length()) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else {
                    return 1;
                }
            }
        };

        Collections.sort(entries, sort);
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
