package lumgraal;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Logging {

    public static void setupLogging() {
        Level loggingLevel = Level.FINE;
        OneLineFormatter formatter = new OneLineFormatter();
        Logger rootLogger = LogManager.getLogManager().getLogger("");
        rootLogger.setLevel(loggingLevel);

        for (Handler handler : rootLogger.getHandlers()) {
            handler.setLevel(loggingLevel);
            handler.setFormatter(formatter);
        }
    }

}
