class Test {
    static int x = 10;

    Test() {
        x++;
    }

    public static void main(String[] args) {
        new Test();
        new Test();
        System.out.println(x);
    }
}
