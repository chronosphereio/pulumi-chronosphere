// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.TraceMetricsRuleGroupByArgs;
import io.chronosphere.chronosphere.inputs.TraceMetricsRuleTraceFilterArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TraceMetricsRuleState extends com.pulumi.resources.ResourceArgs {

    public static final TraceMetricsRuleState Empty = new TraceMetricsRuleState();

    @Import(name="groupBies")
    private @Nullable Output<List<TraceMetricsRuleGroupByArgs>> groupBies;

    public Optional<Output<List<TraceMetricsRuleGroupByArgs>>> groupBies() {
        return Optional.ofNullable(this.groupBies);
    }

    @Import(name="histogramBucketsSeconds")
    private @Nullable Output<List<Double>> histogramBucketsSeconds;

    public Optional<Output<List<Double>>> histogramBucketsSeconds() {
        return Optional.ofNullable(this.histogramBucketsSeconds);
    }

    @Import(name="metricLabels")
    private @Nullable Output<Map<String,String>> metricLabels;

    public Optional<Output<Map<String,String>>> metricLabels() {
        return Optional.ofNullable(this.metricLabels);
    }

    @Import(name="metricName")
    private @Nullable Output<String> metricName;

    public Optional<Output<String>> metricName() {
        return Optional.ofNullable(this.metricName);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="slug")
    private @Nullable Output<String> slug;

    public Optional<Output<String>> slug() {
        return Optional.ofNullable(this.slug);
    }

    @Import(name="traceFilter")
    private @Nullable Output<TraceMetricsRuleTraceFilterArgs> traceFilter;

    public Optional<Output<TraceMetricsRuleTraceFilterArgs>> traceFilter() {
        return Optional.ofNullable(this.traceFilter);
    }

    private TraceMetricsRuleState() {}

    private TraceMetricsRuleState(TraceMetricsRuleState $) {
        this.groupBies = $.groupBies;
        this.histogramBucketsSeconds = $.histogramBucketsSeconds;
        this.metricLabels = $.metricLabels;
        this.metricName = $.metricName;
        this.name = $.name;
        this.slug = $.slug;
        this.traceFilter = $.traceFilter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TraceMetricsRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TraceMetricsRuleState $;

        public Builder() {
            $ = new TraceMetricsRuleState();
        }

        public Builder(TraceMetricsRuleState defaults) {
            $ = new TraceMetricsRuleState(Objects.requireNonNull(defaults));
        }

        public Builder groupBies(@Nullable Output<List<TraceMetricsRuleGroupByArgs>> groupBies) {
            $.groupBies = groupBies;
            return this;
        }

        public Builder groupBies(List<TraceMetricsRuleGroupByArgs> groupBies) {
            return groupBies(Output.of(groupBies));
        }

        public Builder groupBies(TraceMetricsRuleGroupByArgs... groupBies) {
            return groupBies(List.of(groupBies));
        }

        public Builder histogramBucketsSeconds(@Nullable Output<List<Double>> histogramBucketsSeconds) {
            $.histogramBucketsSeconds = histogramBucketsSeconds;
            return this;
        }

        public Builder histogramBucketsSeconds(List<Double> histogramBucketsSeconds) {
            return histogramBucketsSeconds(Output.of(histogramBucketsSeconds));
        }

        public Builder histogramBucketsSeconds(Double... histogramBucketsSeconds) {
            return histogramBucketsSeconds(List.of(histogramBucketsSeconds));
        }

        public Builder metricLabels(@Nullable Output<Map<String,String>> metricLabels) {
            $.metricLabels = metricLabels;
            return this;
        }

        public Builder metricLabels(Map<String,String> metricLabels) {
            return metricLabels(Output.of(metricLabels));
        }

        public Builder metricName(@Nullable Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder slug(@Nullable Output<String> slug) {
            $.slug = slug;
            return this;
        }

        public Builder slug(String slug) {
            return slug(Output.of(slug));
        }

        public Builder traceFilter(@Nullable Output<TraceMetricsRuleTraceFilterArgs> traceFilter) {
            $.traceFilter = traceFilter;
            return this;
        }

        public Builder traceFilter(TraceMetricsRuleTraceFilterArgs traceFilter) {
            return traceFilter(Output.of(traceFilter));
        }

        public TraceMetricsRuleState build() {
            return $;
        }
    }

}
