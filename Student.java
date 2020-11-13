public class Student {
    private String name;
    double balance;
    int id = 1111;
    public Student(String name, int startingBalance){
        this.name = name;
        this.balance = startingBalance;
        this.id = id + 1;
        id += 1;
    }


    public double getBalance(){
        return balance;
    }
    public int getID(){
        return id;
    }

    public void addMoney(double money){
        balance += money;
    }


}
