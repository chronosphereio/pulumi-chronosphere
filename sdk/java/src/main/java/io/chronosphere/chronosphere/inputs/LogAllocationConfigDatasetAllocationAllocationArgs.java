// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


public final class LogAllocationConfigDatasetAllocationAllocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogAllocationConfigDatasetAllocationAllocationArgs Empty = new LogAllocationConfigDatasetAllocationAllocationArgs();

    @Import(name="percentOfLicense", required=true)
    private Output<Double> percentOfLicense;

    public Output<Double> percentOfLicense() {
        return this.percentOfLicense;
    }

    private LogAllocationConfigDatasetAllocationAllocationArgs() {}

    private LogAllocationConfigDatasetAllocationAllocationArgs(LogAllocationConfigDatasetAllocationAllocationArgs $) {
        this.percentOfLicense = $.percentOfLicense;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogAllocationConfigDatasetAllocationAllocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogAllocationConfigDatasetAllocationAllocationArgs $;

        public Builder() {
            $ = new LogAllocationConfigDatasetAllocationAllocationArgs();
        }

        public Builder(LogAllocationConfigDatasetAllocationAllocationArgs defaults) {
            $ = new LogAllocationConfigDatasetAllocationAllocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder percentOfLicense(Output<Double> percentOfLicense) {
            $.percentOfLicense = percentOfLicense;
            return this;
        }

        public Builder percentOfLicense(Double percentOfLicense) {
            return percentOfLicense(Output.of(percentOfLicense));
        }

        public LogAllocationConfigDatasetAllocationAllocationArgs build() {
            $.percentOfLicense = Objects.requireNonNull($.percentOfLicense, "expected parameter 'percentOfLicense' to be non-null");
            return $;
        }
    }

}
