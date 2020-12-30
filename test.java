package phone;

public class test {

    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("s9", 99, "Verizon", "Ring Ring Ring");
        IPhone Iphone10 = new IPhone("IPhone10", 100, "AT&T", "zing");

        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());
        Iphone10.displayInfo();
        System.out.println(Iphone10.ring());
        System.out.println(Iphone10.unlock());

    }

}
