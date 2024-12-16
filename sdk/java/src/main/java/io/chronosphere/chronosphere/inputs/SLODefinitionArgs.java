// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.SLODefinitionReportingWindowArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SLODefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SLODefinitionArgs Empty = new SLODefinitionArgs();

    @Import(name="lowVolume")
    private @Nullable Output<Boolean> lowVolume;

    public Optional<Output<Boolean>> lowVolume() {
        return Optional.ofNullable(this.lowVolume);
    }

    @Import(name="objective", required=true)
    private Output<Double> objective;

    public Output<Double> objective() {
        return this.objective;
    }

    @Import(name="reportingWindows", required=true)
    private Output<List<SLODefinitionReportingWindowArgs>> reportingWindows;

    public Output<List<SLODefinitionReportingWindowArgs>> reportingWindows() {
        return this.reportingWindows;
    }

    private SLODefinitionArgs() {}

    private SLODefinitionArgs(SLODefinitionArgs $) {
        this.lowVolume = $.lowVolume;
        this.objective = $.objective;
        this.reportingWindows = $.reportingWindows;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SLODefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SLODefinitionArgs $;

        public Builder() {
            $ = new SLODefinitionArgs();
        }

        public Builder(SLODefinitionArgs defaults) {
            $ = new SLODefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder lowVolume(@Nullable Output<Boolean> lowVolume) {
            $.lowVolume = lowVolume;
            return this;
        }

        public Builder lowVolume(Boolean lowVolume) {
            return lowVolume(Output.of(lowVolume));
        }

        public Builder objective(Output<Double> objective) {
            $.objective = objective;
            return this;
        }

        public Builder objective(Double objective) {
            return objective(Output.of(objective));
        }

        public Builder reportingWindows(Output<List<SLODefinitionReportingWindowArgs>> reportingWindows) {
            $.reportingWindows = reportingWindows;
            return this;
        }

        public Builder reportingWindows(List<SLODefinitionReportingWindowArgs> reportingWindows) {
            return reportingWindows(Output.of(reportingWindows));
        }

        public Builder reportingWindows(SLODefinitionReportingWindowArgs... reportingWindows) {
            return reportingWindows(List.of(reportingWindows));
        }

        public SLODefinitionArgs build() {
            $.objective = Objects.requireNonNull($.objective, "expected parameter 'objective' to be non-null");
            $.reportingWindows = Objects.requireNonNull($.reportingWindows, "expected parameter 'reportingWindows' to be non-null");
            return $;
        }
    }

}