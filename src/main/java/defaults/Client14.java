package defaults;

public class Client14 implements Interface1, Interface4{
    //when we are implementing more than one interface
    //and they both have same default method then we have
    //to override that method.
    @Override
    public void methodA() {
        System.out.println("Inside method A" + Client14.class);
    }

    static void main(String[] args) {
        Client14 client14 = new Client14();
        client14.methodA();
    }
}
