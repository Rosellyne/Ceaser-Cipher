import org.junit.Test;
import static org.junit.Assert.*;

public class DecryptTest {
    @Test
    public void newDecrypt_instantiesCorrectly_boolean() {
        Decrypt testDecrypt = new Decrypt("fine", 2);
        assertTrue(testDecrypt instanceof Decrypt);
    }

    @Test
    public void newDecrypt_getmName_String() {
        Decrypt testDecrypt = new Decrypt("fine", 2);
        assertEquals("fine", testDecrypt.getmName());

    }

    @Test
    public void newDecrypt_getmKey_int() {
        Decrypt testDecrypt = new Decrypt("fine", 2);
        assertEquals(2, testDecrypt.getmKey());

    }

    @Test
    public void newDecrypt_isDecrypt__String() {
        Decrypt testDecrypt = new Decrypt("hkpg", 2);
        assertEquals("fine", testDecrypt.isDecrypt());

    }

    @Test
    public void newDecrypt_keyValid__String() {
        Decrypt testDecrypt = new Decrypt("hkpg", 2);
        assertEquals(true, testDecrypt.keyValid());
    }
}

