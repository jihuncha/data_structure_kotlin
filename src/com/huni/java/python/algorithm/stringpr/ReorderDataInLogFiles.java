package com.huni.java.python.algorithm.stringpr;

//https://leetcode.com/problems/reorder-data-in-log-files/
//You are given an array of logs. Each log is a space-delimited string of words, where the first word is the identifier.

//There are two types of logs:
//
//        Letter-logs: All words (except the identifier) consist of lowercase English letters.
//        Digit-logs: All words (except the identifier) consist of digits.
//        Reorder these logs so that:
//
//        The letter-logs come before all digit-logs.
//        The letter-logs are sorted lexicographically by their contents.
//        If their contents are the same, then sort them lexicographically by their identifiers.
//        The digit-logs maintain their relative ordering.
//        Return the final order of the logs.

//Example 1:
//
//        Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
//        Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
//        Explanation:
//        The letter-log contents are all different, so their ordering is "art can", "art zero", "own kit dig".
//        The digit-logs have a relative order of "dig1 8 1 5 1", "dig2 3 6".
//        Example 2:
//
//        Input: logs = ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
//        Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]

import java.util.*;

public class ReorderDataInLogFiles {
    public static void main(String[] args) {
        String[] temp = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
//        String[] temp = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};

        reorderLogFiles(temp);

        System.out.println(Arrays.toString(temp));
    }

    public static String[] reorderLogFiles(String[] logs) {

//        System.out.println(logs[0].split(" ", 2)[0] + " - " + logs[0].split(" ", 2)[1] );

        Comparator<String> myComp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //TODO split에 limit 이 존재함 (나눌수있는 최대값)
                String[] split1 = o1.split(" ", 2);
                String[] split2 = o2.split(" ", 2);

                //TODO Chracter에 한해서 isdigit 사용하면 편할듯!!
                boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
                boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

                if (!isDigit1 && !isDigit2) {
                    int cmp = split1[1].compareTo(split2[1]);

                    if (cmp != 0) {
                        return cmp;
                    }

                    return split1[0].compareTo(split2[0]);
                }

                // 음수면 앞에게 앞으로
                if (!isDigit1 && isDigit2){
                    return -1;
                    //양수면 뒤에게 앞으로가네
                } else if (isDigit1 && !isDigit2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        Arrays.sort(logs, myComp);
        return logs;

//        List<String> letterLog = new ArrayList<String>();
//        List<String> digitLog = new ArrayList<String>();
//
//        for (int i = 0; i < logs.length; i++) {
//            //limit 하면 앞뒤로 그만큼맛 split한다!!
//            String tempCheck = logs[i].split(" ", 2)[1];
//
//            if (('0' <= tempCheck.charAt(0) && tempCheck.charAt(0) <= '9')) {
//                digitLog.add(logs[i]);
//            } else {
//                letterLog.add(logs[i]);
//            }
//
//            System.out.println(letterLog.toString()  + " - " + digitLog.toString());
//        }
//
//        Collections.sort(letterLog);
//
//        Collections.sort(digitLog, Collections.reverseOrder());
//
//
//        System.out.println(letterLog.toString()  + " - " + digitLog.toString());
    }
}


//class Solution {
//
//}