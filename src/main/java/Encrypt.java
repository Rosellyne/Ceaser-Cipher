public class Encrypt {
        private String mName;
        private int mKey;
    public  Encrypt(String fine,int key) {
        mName = fine;
        mKey = key;
    }

       public int getmKey() {
            return mKey;
        }
      public String getmName() {
           return mName;
        }
        public boolean keyValid(){
            return mKey>=1 && mKey<26;
        }

    public String isEncrypt() {

        String result = "";
        for (int counter = 0; counter < mName.length(); counter++) {
            char text = mName.charAt(counter);
            char shifted = (char) (text + mKey);
            result += shifted;
        }
        return result;
    }

        }


