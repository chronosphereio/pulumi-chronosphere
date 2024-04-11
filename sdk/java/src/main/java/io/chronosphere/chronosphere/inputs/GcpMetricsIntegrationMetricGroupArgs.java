// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GcpMetricsIntegrationMetricGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final GcpMetricsIntegrationMetricGroupArgs Empty = new GcpMetricsIntegrationMetricGroupArgs();

    @Import(name="prefixes")
    private @Nullable Output<List<String>> prefixes;

    public Optional<Output<List<String>>> prefixes() {
        return Optional.ofNullable(this.prefixes);
    }

    @Import(name="projectId", required=true)
    private Output<String> projectId;

    public Output<String> projectId() {
        return this.projectId;
    }

    private GcpMetricsIntegrationMetricGroupArgs() {}

    private GcpMetricsIntegrationMetricGroupArgs(GcpMetricsIntegrationMetricGroupArgs $) {
        this.prefixes = $.prefixes;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcpMetricsIntegrationMetricGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcpMetricsIntegrationMetricGroupArgs $;

        public Builder() {
            $ = new GcpMetricsIntegrationMetricGroupArgs();
        }

        public Builder(GcpMetricsIntegrationMetricGroupArgs defaults) {
            $ = new GcpMetricsIntegrationMetricGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder prefixes(@Nullable Output<List<String>> prefixes) {
            $.prefixes = prefixes;
            return this;
        }

        public Builder prefixes(List<String> prefixes) {
            return prefixes(Output.of(prefixes));
        }

        public Builder prefixes(String... prefixes) {
            return prefixes(List.of(prefixes));
        }

        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GcpMetricsIntegrationMetricGroupArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
