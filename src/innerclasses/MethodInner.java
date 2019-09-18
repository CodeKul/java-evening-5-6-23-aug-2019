package innerclasses;

public class MethodInner {
    private String password="123456";

    public String getPassword(){

        class CheckMethodInner{

            public String getPasswordData(){
                return password;
            }

        }
       return new CheckMethodInner().getPasswordData();
    }

    public static void main(String[] args) {
        System.out.println("Password=========>"+new MethodInner().getPassword());
    }

}
