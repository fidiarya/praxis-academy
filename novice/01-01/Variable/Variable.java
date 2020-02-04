public class Variable {

    public String nama = "doni";

    public void hitung() {
        int a = 2, b = 4;
        int c = a + b;
        System.out.println("helo nama saya " + nama + " hasil penjumlahan a+b=" + c);
    }

    public static void main(String[] args) {
        Variable variable = new Variable();
        variable.hitung();
    }
}