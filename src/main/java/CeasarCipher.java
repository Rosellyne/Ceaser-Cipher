
public class CeasarCipher {
    public String Encrypt( String fine,int key) {
        String result = "";
        for (int counter = 0; counter < fine.length(); counter++) {
            char text = fine.charAt(counter);
            char shifted = (char) (text + key);
            result += shifted;
        }
        return result;
    }

    public   String Decrypt( String fine,int key) {
        String result = "";
        for (int counter = 0; counter < fine.length(); counter++) {
            char text = fine.charAt(counter);
            char shifted = (char) (text - key);
            result += shifted;
        }
        return result;
    }


}
