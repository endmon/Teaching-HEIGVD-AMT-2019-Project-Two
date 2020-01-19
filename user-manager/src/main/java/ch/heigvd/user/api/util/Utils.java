package ch.heigvd.user.api.util;

import org.mindrot.jbcrypt.BCrypt;

public class Utils {

    public String hashPassword(String plainTextPassword) {
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
    }

    public boolean checkPassword(String plainTextPassword, String hashedPassword) {
        try {
            boolean correct = BCrypt.checkpw(plainTextPassword, hashedPassword);
            return correct;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args){
        JWTHelper jwtHelper = new JWTHelper();
        System.out.println(jwtHelper.createJWT("test@test.com",false));
    }

}
