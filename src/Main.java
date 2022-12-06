import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void task01(){

        HashMap<Character, Character> map = new HashMap<>();
        String str1 = "value";
        String str2 = "false";
        boolean res = true;

        if (str1.length() != str2.length()){
            res = false;
        }
        for (int i = 0; i < str1.length(); i++){
            if (map.containsValue(str2.charAt(i))){
                res = false;
            } else {
                map.putIfAbsent(str1.charAt(i), str2.charAt(i));
            }

        }
        System.out.println(res);

    }

}