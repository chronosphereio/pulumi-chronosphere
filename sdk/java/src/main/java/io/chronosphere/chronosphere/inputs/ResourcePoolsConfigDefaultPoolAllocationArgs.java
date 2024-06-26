// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


public final class ResourcePoolsConfigDefaultPoolAllocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePoolsConfigDefaultPoolAllocationArgs Empty = new ResourcePoolsConfigDefaultPoolAllocationArgs();

    @Import(name="percentOfLicense", required=true)
    private Output<Double> percentOfLicense;

    public Output<Double> percentOfLicense() {
        return this.percentOfLicense;
    }

    private ResourcePoolsConfigDefaultPoolAllocationArgs() {}

    private ResourcePoolsConfigDefaultPoolAllocationArgs(ResourcePoolsConfigDefaultPoolAllocationArgs $) {
        this.percentOfLicense = $.percentOfLicense;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePoolsConfigDefaultPoolAllocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePoolsConfigDefaultPoolAllocationArgs $;

        public Builder() {
            $ = new ResourcePoolsConfigDefaultPoolAllocationArgs();
        }

        public Builder(ResourcePoolsConfigDefaultPoolAllocationArgs defaults) {
            $ = new ResourcePoolsConfigDefaultPoolAllocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder percentOfLicense(Output<Double> percentOfLicense) {
            $.percentOfLicense = percentOfLicense;
            return this;
        }

        public Builder percentOfLicense(Double percentOfLicense) {
            return percentOfLicense(Output.of(percentOfLicense));
        }

        public ResourcePoolsConfigDefaultPoolAllocationArgs build() {
            $.percentOfLicense = Objects.requireNonNull($.percentOfLicense, "expected parameter 'percentOfLicense' to be non-null");
            return $;
        }
    }

}
