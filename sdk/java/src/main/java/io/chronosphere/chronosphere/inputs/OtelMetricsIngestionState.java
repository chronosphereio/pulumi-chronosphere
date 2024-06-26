// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.OtelMetricsIngestionResourceAttributesArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OtelMetricsIngestionState extends com.pulumi.resources.ResourceArgs {

    public static final OtelMetricsIngestionState Empty = new OtelMetricsIngestionState();

    @Import(name="resourceAttributes")
    private @Nullable Output<OtelMetricsIngestionResourceAttributesArgs> resourceAttributes;

    public Optional<Output<OtelMetricsIngestionResourceAttributesArgs>> resourceAttributes() {
        return Optional.ofNullable(this.resourceAttributes);
    }

    private OtelMetricsIngestionState() {}

    private OtelMetricsIngestionState(OtelMetricsIngestionState $) {
        this.resourceAttributes = $.resourceAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OtelMetricsIngestionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OtelMetricsIngestionState $;

        public Builder() {
            $ = new OtelMetricsIngestionState();
        }

        public Builder(OtelMetricsIngestionState defaults) {
            $ = new OtelMetricsIngestionState(Objects.requireNonNull(defaults));
        }

        public Builder resourceAttributes(@Nullable Output<OtelMetricsIngestionResourceAttributesArgs> resourceAttributes) {
            $.resourceAttributes = resourceAttributes;
            return this;
        }

        public Builder resourceAttributes(OtelMetricsIngestionResourceAttributesArgs resourceAttributes) {
            return resourceAttributes(Output.of(resourceAttributes));
        }

        public OtelMetricsIngestionState build() {
            return $;
        }
    }

}
