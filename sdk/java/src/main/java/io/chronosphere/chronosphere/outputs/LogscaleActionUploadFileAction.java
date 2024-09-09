// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LogscaleActionUploadFileAction {
    private String fileName;

    private LogscaleActionUploadFileAction() {}
    public String fileName() {
        return this.fileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogscaleActionUploadFileAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String fileName;
        public Builder() {}
        public Builder(LogscaleActionUploadFileAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
        }

        @CustomType.Setter
        public Builder fileName(String fileName) {
            this.fileName = Objects.requireNonNull(fileName);
            return this;
        }
        public LogscaleActionUploadFileAction build() {
            final var o = new LogscaleActionUploadFileAction();
            o.fileName = fileName;
            return o;
        }
    }
}