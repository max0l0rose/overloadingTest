import java.util.List;

public class Main {


    // ERROR
//    public static void printList(List<Object> list) {
//    }
//
//    public static void printList(List<?> list) {
//    }

    static void func(int a) {
        a++;
    }

    // unlimited func params
    static void func(int... a) { // OK
        a[0]++;
    }

    // ERROR
//    static int func(int a) {
//        return a++;
//    }


    public static void main(String[] args) {
        func(1);
    }
}
