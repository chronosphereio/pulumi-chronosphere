// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.SLOSliAdditionalPromqlFilterArgs;
import io.chronosphere.chronosphere.inputs.SLOSliCustomIndicatorArgs;
import io.chronosphere.chronosphere.inputs.SLOSliEndpointAvailabilityArgs;
import io.chronosphere.chronosphere.inputs.SLOSliEndpointLatencyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SLOSliArgs extends com.pulumi.resources.ResourceArgs {

    public static final SLOSliArgs Empty = new SLOSliArgs();

    @Import(name="additionalPromqlFilters")
    private @Nullable Output<List<SLOSliAdditionalPromqlFilterArgs>> additionalPromqlFilters;

    public Optional<Output<List<SLOSliAdditionalPromqlFilterArgs>>> additionalPromqlFilters() {
        return Optional.ofNullable(this.additionalPromqlFilters);
    }

    @Import(name="customDimensionLabels")
    private @Nullable Output<List<String>> customDimensionLabels;

    public Optional<Output<List<String>>> customDimensionLabels() {
        return Optional.ofNullable(this.customDimensionLabels);
    }

    @Import(name="customIndicator")
    private @Nullable Output<SLOSliCustomIndicatorArgs> customIndicator;

    public Optional<Output<SLOSliCustomIndicatorArgs>> customIndicator() {
        return Optional.ofNullable(this.customIndicator);
    }

    @Import(name="endpointAvailability")
    private @Nullable Output<SLOSliEndpointAvailabilityArgs> endpointAvailability;

    public Optional<Output<SLOSliEndpointAvailabilityArgs>> endpointAvailability() {
        return Optional.ofNullable(this.endpointAvailability);
    }

    @Import(name="endpointLabel")
    private @Nullable Output<String> endpointLabel;

    public Optional<Output<String>> endpointLabel() {
        return Optional.ofNullable(this.endpointLabel);
    }

    @Import(name="endpointLatency")
    private @Nullable Output<SLOSliEndpointLatencyArgs> endpointLatency;

    public Optional<Output<SLOSliEndpointLatencyArgs>> endpointLatency() {
        return Optional.ofNullable(this.endpointLatency);
    }

    @Import(name="lensTemplateIndicator")
    private @Nullable Output<String> lensTemplateIndicator;

    public Optional<Output<String>> lensTemplateIndicator() {
        return Optional.ofNullable(this.lensTemplateIndicator);
    }

    private SLOSliArgs() {}

    private SLOSliArgs(SLOSliArgs $) {
        this.additionalPromqlFilters = $.additionalPromqlFilters;
        this.customDimensionLabels = $.customDimensionLabels;
        this.customIndicator = $.customIndicator;
        this.endpointAvailability = $.endpointAvailability;
        this.endpointLabel = $.endpointLabel;
        this.endpointLatency = $.endpointLatency;
        this.lensTemplateIndicator = $.lensTemplateIndicator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SLOSliArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SLOSliArgs $;

        public Builder() {
            $ = new SLOSliArgs();
        }

        public Builder(SLOSliArgs defaults) {
            $ = new SLOSliArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalPromqlFilters(@Nullable Output<List<SLOSliAdditionalPromqlFilterArgs>> additionalPromqlFilters) {
            $.additionalPromqlFilters = additionalPromqlFilters;
            return this;
        }

        public Builder additionalPromqlFilters(List<SLOSliAdditionalPromqlFilterArgs> additionalPromqlFilters) {
            return additionalPromqlFilters(Output.of(additionalPromqlFilters));
        }

        public Builder additionalPromqlFilters(SLOSliAdditionalPromqlFilterArgs... additionalPromqlFilters) {
            return additionalPromqlFilters(List.of(additionalPromqlFilters));
        }

        public Builder customDimensionLabels(@Nullable Output<List<String>> customDimensionLabels) {
            $.customDimensionLabels = customDimensionLabels;
            return this;
        }

        public Builder customDimensionLabels(List<String> customDimensionLabels) {
            return customDimensionLabels(Output.of(customDimensionLabels));
        }

        public Builder customDimensionLabels(String... customDimensionLabels) {
            return customDimensionLabels(List.of(customDimensionLabels));
        }

        public Builder customIndicator(@Nullable Output<SLOSliCustomIndicatorArgs> customIndicator) {
            $.customIndicator = customIndicator;
            return this;
        }

        public Builder customIndicator(SLOSliCustomIndicatorArgs customIndicator) {
            return customIndicator(Output.of(customIndicator));
        }

        public Builder endpointAvailability(@Nullable Output<SLOSliEndpointAvailabilityArgs> endpointAvailability) {
            $.endpointAvailability = endpointAvailability;
            return this;
        }

        public Builder endpointAvailability(SLOSliEndpointAvailabilityArgs endpointAvailability) {
            return endpointAvailability(Output.of(endpointAvailability));
        }

        public Builder endpointLabel(@Nullable Output<String> endpointLabel) {
            $.endpointLabel = endpointLabel;
            return this;
        }

        public Builder endpointLabel(String endpointLabel) {
            return endpointLabel(Output.of(endpointLabel));
        }

        public Builder endpointLatency(@Nullable Output<SLOSliEndpointLatencyArgs> endpointLatency) {
            $.endpointLatency = endpointLatency;
            return this;
        }

        public Builder endpointLatency(SLOSliEndpointLatencyArgs endpointLatency) {
            return endpointLatency(Output.of(endpointLatency));
        }

        public Builder lensTemplateIndicator(@Nullable Output<String> lensTemplateIndicator) {
            $.lensTemplateIndicator = lensTemplateIndicator;
            return this;
        }

        public Builder lensTemplateIndicator(String lensTemplateIndicator) {
            return lensTemplateIndicator(Output.of(lensTemplateIndicator));
        }

        public SLOSliArgs build() {
            return $;
        }
    }

}
