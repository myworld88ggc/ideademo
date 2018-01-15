import org.junit.Test;

import java.util.UUID;

/**
 * Created by gao.guangcai on 2017-12-12.
 */

public class TestClass {
    @Test
    public  void  TestUUID(){
         String uuid=UUID.randomUUID().toString();
        System.out.println(uuid);
    }
}
