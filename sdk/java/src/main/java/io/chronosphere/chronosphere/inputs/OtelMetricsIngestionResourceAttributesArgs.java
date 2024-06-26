// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OtelMetricsIngestionResourceAttributesArgs extends com.pulumi.resources.ResourceArgs {

    public static final OtelMetricsIngestionResourceAttributesArgs Empty = new OtelMetricsIngestionResourceAttributesArgs();

    @Import(name="excludeKeys")
    private @Nullable Output<List<String>> excludeKeys;

    public Optional<Output<List<String>>> excludeKeys() {
        return Optional.ofNullable(this.excludeKeys);
    }

    @Import(name="filterMode")
    private @Nullable Output<String> filterMode;

    public Optional<Output<String>> filterMode() {
        return Optional.ofNullable(this.filterMode);
    }

    @Import(name="flattenMode")
    private @Nullable Output<String> flattenMode;

    public Optional<Output<String>> flattenMode() {
        return Optional.ofNullable(this.flattenMode);
    }

    @Import(name="generateTargetInfo")
    private @Nullable Output<Boolean> generateTargetInfo;

    public Optional<Output<Boolean>> generateTargetInfo() {
        return Optional.ofNullable(this.generateTargetInfo);
    }

    private OtelMetricsIngestionResourceAttributesArgs() {}

    private OtelMetricsIngestionResourceAttributesArgs(OtelMetricsIngestionResourceAttributesArgs $) {
        this.excludeKeys = $.excludeKeys;
        this.filterMode = $.filterMode;
        this.flattenMode = $.flattenMode;
        this.generateTargetInfo = $.generateTargetInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OtelMetricsIngestionResourceAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OtelMetricsIngestionResourceAttributesArgs $;

        public Builder() {
            $ = new OtelMetricsIngestionResourceAttributesArgs();
        }

        public Builder(OtelMetricsIngestionResourceAttributesArgs defaults) {
            $ = new OtelMetricsIngestionResourceAttributesArgs(Objects.requireNonNull(defaults));
        }

        public Builder excludeKeys(@Nullable Output<List<String>> excludeKeys) {
            $.excludeKeys = excludeKeys;
            return this;
        }

        public Builder excludeKeys(List<String> excludeKeys) {
            return excludeKeys(Output.of(excludeKeys));
        }

        public Builder excludeKeys(String... excludeKeys) {
            return excludeKeys(List.of(excludeKeys));
        }

        public Builder filterMode(@Nullable Output<String> filterMode) {
            $.filterMode = filterMode;
            return this;
        }

        public Builder filterMode(String filterMode) {
            return filterMode(Output.of(filterMode));
        }

        public Builder flattenMode(@Nullable Output<String> flattenMode) {
            $.flattenMode = flattenMode;
            return this;
        }

        public Builder flattenMode(String flattenMode) {
            return flattenMode(Output.of(flattenMode));
        }

        public Builder generateTargetInfo(@Nullable Output<Boolean> generateTargetInfo) {
            $.generateTargetInfo = generateTargetInfo;
            return this;
        }

        public Builder generateTargetInfo(Boolean generateTargetInfo) {
            return generateTargetInfo(Output.of(generateTargetInfo));
        }

        public OtelMetricsIngestionResourceAttributesArgs build() {
            return $;
        }
    }

}
