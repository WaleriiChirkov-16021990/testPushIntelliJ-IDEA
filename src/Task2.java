import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        char[] open = new char[] {'(', '{', '[', '<'};
        char[] close = new char[] {')', '}', ']', '>'};
        Scanner input = new Scanner(System.in);
        char[] inp = input.nextLine().toLowerCase().toCharArray();
        Deque<Object> opn = new LinkedList<>();
        boolean result = true;

        for (char s:inp
             ) { if (result) {
                for (int i = 0; i < open.length; i++) {
                    if (s == open[i]) {
                        opn.push(s);
                    } else if (s == close[i]) {
                        if ((char) opn.getFirst()  ==  open[i]) {
                            opn.remove();
                        } else {
                            result = false;
                            break;
                        }
                    }
                }
            } else break;
        }
        System.out.println(result);
    }
}
