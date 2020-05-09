import com.IncubyteExample.IncubyteExample;
import org.junit.Test;

public class IncubyteExampleTest {


    @Test
    public void checkAllDivisibleBy4NotLeapYear() {
        IncubyteExample incubyteExample = new IncubyteExample();
        incubyteExample.checkLeapYear(1800);

    }

    @Test
    public void checkAllDivisibleBy100ButDivisible400NotLeapYear() {
        IncubyteExample incubyteExample = new IncubyteExample();
        incubyteExample.checkLeapYear(1700);
        incubyteExample.checkLeapYear(1800);
        incubyteExample.checkLeapYear(2100);
    }
}
