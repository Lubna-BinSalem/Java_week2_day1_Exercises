public class Test {
    public static void main(String[] args) {
        Customer c=new Customer(874424, "lubna",5);
        Invoice i=new Invoice(23232, c, 3000);

        System.out.println(i.toString());
        System.out.println(i.getCustomerDiscount());
        System.out.println(i.getAmountAfterDiscount());

    }
}
