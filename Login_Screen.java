public class Login_Screen {
    public boolean Sign_In(String User_name, String Password) {
        // Hardcoded these for future uses subject to change
        String correctUser = "admin";
        String correctPass = "password123";

        if (User_name != null && User_name.equals(correctUser) && Password != null && Password.equals(correctPass)) {
            System.out.println("Login Successful!");
            return true;
        } else {
            System.out.println("Invalid Username or Password.");
            return false;
        }
    }
}
