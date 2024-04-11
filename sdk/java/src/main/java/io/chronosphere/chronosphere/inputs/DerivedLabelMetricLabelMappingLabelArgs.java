// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.DerivedLabelMetricLabelMappingLabelNameMappingArgs;
import io.chronosphere.chronosphere.inputs.DerivedLabelMetricLabelMappingLabelValueMappingArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DerivedLabelMetricLabelMappingLabelArgs extends com.pulumi.resources.ResourceArgs {

    public static final DerivedLabelMetricLabelMappingLabelArgs Empty = new DerivedLabelMetricLabelMappingLabelArgs();

    @Import(name="nameMappings")
    private @Nullable Output<List<DerivedLabelMetricLabelMappingLabelNameMappingArgs>> nameMappings;

    public Optional<Output<List<DerivedLabelMetricLabelMappingLabelNameMappingArgs>>> nameMappings() {
        return Optional.ofNullable(this.nameMappings);
    }

    @Import(name="valueMappings")
    private @Nullable Output<List<DerivedLabelMetricLabelMappingLabelValueMappingArgs>> valueMappings;

    public Optional<Output<List<DerivedLabelMetricLabelMappingLabelValueMappingArgs>>> valueMappings() {
        return Optional.ofNullable(this.valueMappings);
    }

    private DerivedLabelMetricLabelMappingLabelArgs() {}

    private DerivedLabelMetricLabelMappingLabelArgs(DerivedLabelMetricLabelMappingLabelArgs $) {
        this.nameMappings = $.nameMappings;
        this.valueMappings = $.valueMappings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DerivedLabelMetricLabelMappingLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DerivedLabelMetricLabelMappingLabelArgs $;

        public Builder() {
            $ = new DerivedLabelMetricLabelMappingLabelArgs();
        }

        public Builder(DerivedLabelMetricLabelMappingLabelArgs defaults) {
            $ = new DerivedLabelMetricLabelMappingLabelArgs(Objects.requireNonNull(defaults));
        }

        public Builder nameMappings(@Nullable Output<List<DerivedLabelMetricLabelMappingLabelNameMappingArgs>> nameMappings) {
            $.nameMappings = nameMappings;
            return this;
        }

        public Builder nameMappings(List<DerivedLabelMetricLabelMappingLabelNameMappingArgs> nameMappings) {
            return nameMappings(Output.of(nameMappings));
        }

        public Builder nameMappings(DerivedLabelMetricLabelMappingLabelNameMappingArgs... nameMappings) {
            return nameMappings(List.of(nameMappings));
        }

        public Builder valueMappings(@Nullable Output<List<DerivedLabelMetricLabelMappingLabelValueMappingArgs>> valueMappings) {
            $.valueMappings = valueMappings;
            return this;
        }

        public Builder valueMappings(List<DerivedLabelMetricLabelMappingLabelValueMappingArgs> valueMappings) {
            return valueMappings(Output.of(valueMappings));
        }

        public Builder valueMappings(DerivedLabelMetricLabelMappingLabelValueMappingArgs... valueMappings) {
            return valueMappings(List.of(valueMappings));
        }

        public DerivedLabelMetricLabelMappingLabelArgs build() {
            return $;
        }
    }

}
