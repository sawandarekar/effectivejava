package effectivejava.chapter3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

class Item3HashCodeTest {

    @Before
    public void before(){

    }

    @Test
    public void testHashCode(){
        Item3HashCode item3HashCode = new Item3HashCode();
        Assert.assertNotNull(item3HashCode.hashCode());
    }
}