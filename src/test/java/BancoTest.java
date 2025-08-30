import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.Banco;

public class BancoTest {

    Banco b;

    @BeforeEach
    public void setUp(){
        b = new Banco("123", 1000);
    }

    @Test
    public void saldoNovaContaTest(){
        assertEquals(1000, b.getBalance());
    }

    @Test
    public void depositoValidoTest(){
        b.deposit(100);
        assertEquals(1100, b.getBalance());
    }

    @Test
    public void depositoInvalidoTest(){
        b.deposit(-100);
        assertEquals(1000, b.getBalance());
    }

    @Test
    public void saqueValidoTest(){
        Boolean ret = b.withdraw(100);
        assertTrue(ret);
        assertEquals(900, b.getBalance());
    }
    
}
