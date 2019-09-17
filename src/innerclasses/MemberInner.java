package innerclasses;

public class MemberInner {

    private String password="123456";

    class CheckMemberInner{

        public String getPassword(){
            return password;
        }

    }

    public static void main(String[] args) {

        MemberInner innerClass=new MemberInner();
        MemberInner.CheckMemberInner checkMemberInner=innerClass.new CheckMemberInner();
        System.out.println("password======>"+checkMemberInner.getPassword());

    }

}
