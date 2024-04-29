// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import io.chronosphere.chronosphere.outputs.DerivedLabelMetricLabelConstructedLabelValueDefinition;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DerivedLabelMetricLabelConstructedLabel {
    private List<DerivedLabelMetricLabelConstructedLabelValueDefinition> valueDefinitions;

    private DerivedLabelMetricLabelConstructedLabel() {}
    public List<DerivedLabelMetricLabelConstructedLabelValueDefinition> valueDefinitions() {
        return this.valueDefinitions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DerivedLabelMetricLabelConstructedLabel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<DerivedLabelMetricLabelConstructedLabelValueDefinition> valueDefinitions;
        public Builder() {}
        public Builder(DerivedLabelMetricLabelConstructedLabel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.valueDefinitions = defaults.valueDefinitions;
        }

        @CustomType.Setter
        public Builder valueDefinitions(List<DerivedLabelMetricLabelConstructedLabelValueDefinition> valueDefinitions) {
            this.valueDefinitions = Objects.requireNonNull(valueDefinitions);
            return this;
        }
        public Builder valueDefinitions(DerivedLabelMetricLabelConstructedLabelValueDefinition... valueDefinitions) {
            return valueDefinitions(List.of(valueDefinitions));
        }
        public DerivedLabelMetricLabelConstructedLabel build() {
            final var o = new DerivedLabelMetricLabelConstructedLabel();
            o.valueDefinitions = valueDefinitions;
            return o;
        }
    }
}