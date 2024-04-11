// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DerivedLabelMetricLabelMappingLabelNameMappingValueMapping {
    private List<String> sourceValueGlobs;
    private String targetValue;

    private DerivedLabelMetricLabelMappingLabelNameMappingValueMapping() {}
    public List<String> sourceValueGlobs() {
        return this.sourceValueGlobs;
    }
    public String targetValue() {
        return this.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DerivedLabelMetricLabelMappingLabelNameMappingValueMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> sourceValueGlobs;
        private String targetValue;
        public Builder() {}
        public Builder(DerivedLabelMetricLabelMappingLabelNameMappingValueMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceValueGlobs = defaults.sourceValueGlobs;
    	      this.targetValue = defaults.targetValue;
        }

        @CustomType.Setter
        public Builder sourceValueGlobs(List<String> sourceValueGlobs) {
            this.sourceValueGlobs = Objects.requireNonNull(sourceValueGlobs);
            return this;
        }
        public Builder sourceValueGlobs(String... sourceValueGlobs) {
            return sourceValueGlobs(List.of(sourceValueGlobs));
        }
        @CustomType.Setter
        public Builder targetValue(String targetValue) {
            this.targetValue = Objects.requireNonNull(targetValue);
            return this;
        }
        public DerivedLabelMetricLabelMappingLabelNameMappingValueMapping build() {
            final var o = new DerivedLabelMetricLabelMappingLabelNameMappingValueMapping();
            o.sourceValueGlobs = sourceValueGlobs;
            o.targetValue = targetValue;
            return o;
        }
    }
}
