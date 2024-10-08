// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import io.chronosphere.chronosphere.outputs.DatasetConfigurationLogDataset;
import io.chronosphere.chronosphere.outputs.DatasetConfigurationTraceDataset;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatasetConfiguration {
    private @Nullable DatasetConfigurationLogDataset logDataset;
    private @Nullable DatasetConfigurationTraceDataset traceDataset;
    private String type;

    private DatasetConfiguration() {}
    public Optional<DatasetConfigurationLogDataset> logDataset() {
        return Optional.ofNullable(this.logDataset);
    }
    public Optional<DatasetConfigurationTraceDataset> traceDataset() {
        return Optional.ofNullable(this.traceDataset);
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DatasetConfigurationLogDataset logDataset;
        private @Nullable DatasetConfigurationTraceDataset traceDataset;
        private String type;
        public Builder() {}
        public Builder(DatasetConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logDataset = defaults.logDataset;
    	      this.traceDataset = defaults.traceDataset;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder logDataset(@Nullable DatasetConfigurationLogDataset logDataset) {
            this.logDataset = logDataset;
            return this;
        }
        @CustomType.Setter
        public Builder traceDataset(@Nullable DatasetConfigurationTraceDataset traceDataset) {
            this.traceDataset = traceDataset;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public DatasetConfiguration build() {
            final var o = new DatasetConfiguration();
            o.logDataset = logDataset;
            o.traceDataset = traceDataset;
            o.type = type;
            return o;
        }
    }
}
