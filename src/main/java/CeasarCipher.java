
public class CeasarCipher {
    private String mName;
    private int mKey;
    
    public int getmKey() {
        return mKey;
    }

    public String getmName() {
        return mName;
    }


    }
    public String Encrypt( String fine,int key) {
        mName = fine;
        mKey = key;
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
