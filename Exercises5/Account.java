public class Account {
    private int id;
    private Customer customer;
    private double balance=0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString(){
        return customer.toString()+"balance=$"+Math.round(this.getBalance());
    }
    public String getCustomerName(){
        return this.customer.getName();
    }
    public Account deposit(double amount){
        Account acc = new Account(this.id, this.customer,this.getBalance()+amount );
        return acc;
    }
    public Account withdraw(double amount) {
        if (balance >= amount) {
            return new Account(this.id, this.customer, this.getBalance() - amount);
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
            return new Account(this.id, this.customer, this.getBalance());

        }
    }

}
