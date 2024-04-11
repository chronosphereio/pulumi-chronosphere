// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


public final class DropRuleValueBasedDropArgs extends com.pulumi.resources.ResourceArgs {

    public static final DropRuleValueBasedDropArgs Empty = new DropRuleValueBasedDropArgs();

    @Import(name="targetDropValue", required=true)
    private Output<Double> targetDropValue;

    public Output<Double> targetDropValue() {
        return this.targetDropValue;
    }

    private DropRuleValueBasedDropArgs() {}

    private DropRuleValueBasedDropArgs(DropRuleValueBasedDropArgs $) {
        this.targetDropValue = $.targetDropValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DropRuleValueBasedDropArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DropRuleValueBasedDropArgs $;

        public Builder() {
            $ = new DropRuleValueBasedDropArgs();
        }

        public Builder(DropRuleValueBasedDropArgs defaults) {
            $ = new DropRuleValueBasedDropArgs(Objects.requireNonNull(defaults));
        }

        public Builder targetDropValue(Output<Double> targetDropValue) {
            $.targetDropValue = targetDropValue;
            return this;
        }

        public Builder targetDropValue(Double targetDropValue) {
            return targetDropValue(Output.of(targetDropValue));
        }

        public DropRuleValueBasedDropArgs build() {
            $.targetDropValue = Objects.requireNonNull($.targetDropValue, "expected parameter 'targetDropValue' to be non-null");
            return $;
        }
    }

}
