import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void newEncrypt_instantiesCorrectly_boolean() {
        Encrypt testEncrypt = new Encrypt("fine", 2);
        assertTrue(testEncrypt instanceof Encrypt);
    }

    @Test
    public void newEncrypt_getmName_String() {
        Encrypt testEncrypt = new Encrypt("fine", 2);
        assertEquals("fine", testEncrypt.getmName());

    }

    @Test
    public void newEncrypt_getmKey_int() {
        Encrypt testEncrypt = new Encrypt("fine", 2);
        assertEquals(2, testEncrypt.getmKey());

    }

    @Test
    public void newEncrypt_isEncrypt__String() {
        Encrypt testEncrypt = new Encrypt("fine", 2);
        assertEquals("hkpg", testEncrypt.isEncrypt());

    }

    @Test
    public void newEncrypt_keyValid__boolean() {
        Encrypt testEncrypt = new Encrypt("fine", 2);
        assertEquals(true, testEncrypt.keyValid());
    }
}