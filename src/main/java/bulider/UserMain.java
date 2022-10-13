package bulider;

public class UserMain {

    public static void main(String[] args) {
        // 자기 주소를 리턴
        User user = User.UserBuilder.UserBuilder()
                        .username("junil")
                        .password("1234")
                        .email("email")

                        .bulid();
        System.out.println(user);
    }
}
