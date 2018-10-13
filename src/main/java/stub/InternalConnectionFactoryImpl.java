package stub;

import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;
import org.postgresql.core.PGStream;
import org.postgresql.sspi.ISSPIClient;

@TargetClass(org.postgresql.core.v3.ConnectionFactoryImpl.class)
final public class InternalConnectionFactoryImpl {

    @Substitute
        private ISSPIClient createSSPI(PGStream pgStream,
                                   String spnServiceClass,
                                   boolean enableNegotiate) {
        throw new IllegalStateException("Unable to load org.postgresql.sspi.SSPIClient.");
    }

}