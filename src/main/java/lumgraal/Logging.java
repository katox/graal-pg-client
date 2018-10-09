package lumgraal;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Logging {

    public static void setupLogging() {
        OneLineFormatter formatter = new OneLineFormatter();
        Logger rootLogger = LogManager.getLogManager().getLogger("");
        rootLogger.setLevel(Level.FINEST);

        for (Handler handler : rootLogger.getHandlers()) {
            handler.setLevel(Level.FINEST);
            handler.setFormatter(formatter);
        }
    }

}
