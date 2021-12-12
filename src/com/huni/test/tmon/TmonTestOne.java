package com.huni.test.tmon;

//penpineapple 와 applepen 두 문자열이 있다고 할 때, apple, pen, 등의 연속되는 부분문자열이 있으며,
// 이 중 최대의 길이를 갖는 부분문자열은apple이다.
//        두 줄에 각각의 스트링이 주어진다. 각 스트링의 길이는 4000이하이다.
//        첫 줄에 찾은 부분문자열의 길이, 둘째 줄에 가장 긴 공통의 부분문자열을 출력한다.

//[출력 예시]
//        5 apple

//penpineapple
//applepen

import java.util.*;

public class TmonTestOne {
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
                if (temp.length() > 1) {
                    myHash.put(temp, 1);
                }
            }
        }

//        System.out.println(myHash.toString());

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

//        System.out.println(myHash.toString());

        Map<String, Integer> result = sortMapByValue(myHash);
//        for (Map.Entry<String, Integer> entry : result.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", "
//                    + "Value: " + entry.getValue());
//        }

//        System.out.println(result.entrySet().);

        String resultString = (String)result.keySet().toArray()[0];

        System.out.println(resultString.length() + " " + resultString);
    }

    //정렬
    public static LinkedHashMap<String, Integer> sortMapByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());

        Comparator<Map.Entry<String, Integer>> sort = new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                if (o1.getValue() > o2.getValue()) {
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
