package codeflow;

public class Flow {

    public void methodA(String input) {
        System.out.println("J");
        if (!input.equals("start")) {
            System.out.println("a");
            methodB("start");
        } else {
            System.out.println("v");
            System.out.println(methodC(input));
        }
        System.out.println("t");
    }

    public void methodB(String start) {
        System.out.println("e");
    }

    public int methodC(String input) {
        System.out.println("r");
        methodD(input.length());
        return input.length() * 2;
    }

    public void methodD(int number) {
        System.out.println("s");
        if (number > 5) {
            System.out.println("j");
        }
        System.out.println("o");
        System.out.println("v");
    }

    public static void main(String[] args) {
        Flow flow = new Flow();
        flow.methodA("test");
    }
}
