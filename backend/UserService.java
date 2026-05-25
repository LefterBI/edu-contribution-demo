public class UserService {

    public String getUserRole(String email) {
        if (email == null || email.isBlank()) {
            return "UNKNOWN";
        }

        return "STUDENT";
    }
}
