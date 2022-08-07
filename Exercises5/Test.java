public class Test {
    public static void main(String[] args) {
        Customer c = new Customer(837449, "lubna", 'f');
        Account a=new Account(32930, c, 3000);
        System.out.println(a.withdraw(30).toString());

    }
}
