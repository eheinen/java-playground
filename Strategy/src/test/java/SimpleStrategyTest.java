import com.designpatterns.simplestrategy.CompressionContext;
import com.designpatterns.simplestrategy.RarCompressionStrategy;
import com.designpatterns.simplestrategy.ZipCompressionStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SimpleStrategyTest {

    @Test
    public void compressTo_RAR() {
        CompressionContext compressionContext = new CompressionContext();
        compressionContext.setCompressionStrategy(new RarCompressionStrategy());
        String compressed = compressionContext.compressFiles(new ArrayList<>());

        Assertions.assertEquals("Compressed using RAR", compressed);
    }

    @Test
    public void compressTo_ZIP() {
        CompressionContext compressionContext = new CompressionContext();
        compressionContext.setCompressionStrategy(new ZipCompressionStrategy());
        String compressed = compressionContext.compressFiles(new ArrayList<>());

        Assertions.assertEquals("Compressed using ZIP", compressed);
    }

}
