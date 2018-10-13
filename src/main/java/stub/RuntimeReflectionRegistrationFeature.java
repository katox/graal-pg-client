package stub;

import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.Feature;
import org.graalvm.nativeimage.RuntimeReflection;

@AutomaticFeature
class RuntimeReflectionRegistrationFeature implements Feature {
    public void beforeAnalysis(BeforeAnalysisAccess access) {
            RuntimeReflection.register(java.sql.Statement[].class);
    }
}