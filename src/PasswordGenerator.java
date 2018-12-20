import java.util.Random;

class PasswordGenerator
{

    static char[] createPassword(int len)
    {
        String bigChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/€.?<>)";

        String allCharacters = bigChars + chars + numbers + symbols;

        Random rnd = new Random();

        int index = 0;
        char[] password = new char[len];
        for (int i = 0; i < len; i++)
            password[i] = allCharacters.charAt(rnd.nextInt(allCharacters.length()));
        return password;
    }
}