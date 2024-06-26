// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DerivedLabelMetricLabelMappingLabelNameMappingValueMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final DerivedLabelMetricLabelMappingLabelNameMappingValueMappingArgs Empty = new DerivedLabelMetricLabelMappingLabelNameMappingValueMappingArgs();

    @Import(name="sourceValueGlobs", required=true)
    private Output<List<String>> sourceValueGlobs;

    public Output<List<String>> sourceValueGlobs() {
        return this.sourceValueGlobs;
    }

    @Import(name="targetValue", required=true)
    private Output<String> targetValue;

    public Output<String> targetValue() {
        return this.targetValue;
    }

    private DerivedLabelMetricLabelMappingLabelNameMappingValueMappingArgs() {}

    private DerivedLabelMetricLabelMappingLabelNameMappingValueMappingArgs(DerivedLabelMetricLabelMappingLabelNameMappingValueMappingArgs $) {
        this.sourceValueGlobs = $.sourceValueGlobs;
        this.targetValue = $.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DerivedLabelMetricLabelMappingLabelNameMappingValueMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DerivedLabelMetricLabelMappingLabelNameMappingValueMappingArgs $;

        public Builder() {
            $ = new DerivedLabelMetricLabelMappingLabelNameMappingValueMappingArgs();
        }

        public Builder(DerivedLabelMetricLabelMappingLabelNameMappingValueMappingArgs defaults) {
            $ = new DerivedLabelMetricLabelMappingLabelNameMappingValueMappingArgs(Objects.requireNonNull(defaults));
        }

        public Builder sourceValueGlobs(Output<List<String>> sourceValueGlobs) {
            $.sourceValueGlobs = sourceValueGlobs;
            return this;
        }

        public Builder sourceValueGlobs(List<String> sourceValueGlobs) {
            return sourceValueGlobs(Output.of(sourceValueGlobs));
        }

        public Builder sourceValueGlobs(String... sourceValueGlobs) {
            return sourceValueGlobs(List.of(sourceValueGlobs));
        }

        public Builder targetValue(Output<String> targetValue) {
            $.targetValue = targetValue;
            return this;
        }

        public Builder targetValue(String targetValue) {
            return targetValue(Output.of(targetValue));
        }

        public DerivedLabelMetricLabelMappingLabelNameMappingValueMappingArgs build() {
            $.sourceValueGlobs = Objects.requireNonNull($.sourceValueGlobs, "expected parameter 'sourceValueGlobs' to be non-null");
            $.targetValue = Objects.requireNonNull($.targetValue, "expected parameter 'targetValue' to be non-null");
            return $;
        }
    }

}
