import com.designpatterns.compoundstrategy.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompoundStrategyTest {

    @Test
    public void domesticDuck() {
        IFlyStrategy fly = new DomesticFlyStrategy();
        IQuackStrategy quack = new DomesticQuackStrategy();
        DuckContext duckContext = new DuckContext(quack, fly);

        Assertions.assertEquals(false, duckContext.fly());
        Assertions.assertEquals(true, duckContext.quack());
    }

    @Test
    public void wildDuck() {
        IFlyStrategy fly = new WildFlyStrategy();
        IQuackStrategy quack = new WildQuackStrategy();
        DuckContext duckContext = new DuckContext(quack, fly);

        Assertions.assertEquals(true, duckContext.fly());
        Assertions.assertEquals(false, duckContext.quack());
    }

    @Test
    public void hybridDuck() {
        IFlyStrategy fly = new WildFlyStrategy();
        IQuackStrategy quack = new DomesticQuackStrategy();
        DuckContext duckContext = new DuckContext(quack, fly);

        Assertions.assertEquals(true, duckContext.fly());
        Assertions.assertEquals(true, duckContext.quack());
    }
}
