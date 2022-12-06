/*
Написать метод, который переведет число из римского формата записи в арабский.
Например, MCMII = 2022
http://graecolatini.bsu.by/htm-different/num-converter-roman.htm
I = 1; V = 5; X = 10; L = 50; C = 100; D = 500; M = 1000
1987 = MCMLXXXVII жесть)

 */

import java.util.*;

public class task3 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число:  ");
//        Map<Character, Integer> res = new HashMap<>();
//        char[] input = scanner.nextLine().toLowerCase().toCharArray();
//        char sumbol = ' ';
//        char[] shablon = new char[]{'i', 'v', 'x', 'l', 'c', 'd', 'm'};
//        for (char s : input
//        ) {
////            if ((sumbol != ' ') && (Arrays.asList(shablon).indexOf(s) <=  Arrays.asList(shablon).indexOf(sumbol))) {
////
////            }
//
//            if ((sumbol != ' ') && (Arrays.asList(shablon).indexOf(s) > Arrays.asList(shablon).indexOf(sumbol))) {
//                res.put(sumbol, -1);
//            }
//            if (res.containsKey(s)) {
//                res.put(s, res.get(s) + 1);
//            } else res.put(s, 1);
//            sumbol = s;
//
//            System.out.println(res);
//            int answer = 0;
//            for (Character e : res.keySet()
//            ) {
//                if (e == 'm') answer += res.get(e) * 1000;
//                else if (e == 'x') {
//                    answer += res.get(e) * 10;
//                } else if (e == 'i') {
//                    answer += res.get(e);
//                }
//            }
//            System.out.println(answer);
//        }
//    }
//public static void task03(){
    String str = "IMMX";
    HashMap<Character, Integer> map = new HashMap<>();
    map.put('M', 1000);
    map.put('C', 100);
    map.put('X', 10);
    map.put('V', 5);
    map.put('I', 1);
    Integer res = map.get(str.charAt(0));
    Deque<Integer> deque = new LinkedList<>();
    deque.add(map.get(str.charAt(0)));

    for (int i = 1; i < str.length(); i++){

        if (map.get(str.charAt(i)) > deque.getLast()){
            res = map.get(str.charAt(i)) - res;
//                System.out.println(res);
        }
        else {
            res += map.get(str.charAt(i));
//                System.out.println(res);
        }
        deque.add(map.get(str.charAt(i)));

    }

    System.out.println(res);

}
}
