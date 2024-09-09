// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogscaleActionPagerDutyActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogscaleActionPagerDutyActionArgs Empty = new LogscaleActionPagerDutyActionArgs();

    @Import(name="routingKey", required=true)
    private Output<String> routingKey;

    public Output<String> routingKey() {
        return this.routingKey;
    }

    @Import(name="severity", required=true)
    private Output<String> severity;

    public Output<String> severity() {
        return this.severity;
    }

    @Import(name="useProxy")
    private @Nullable Output<Boolean> useProxy;

    public Optional<Output<Boolean>> useProxy() {
        return Optional.ofNullable(this.useProxy);
    }

    private LogscaleActionPagerDutyActionArgs() {}

    private LogscaleActionPagerDutyActionArgs(LogscaleActionPagerDutyActionArgs $) {
        this.routingKey = $.routingKey;
        this.severity = $.severity;
        this.useProxy = $.useProxy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogscaleActionPagerDutyActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogscaleActionPagerDutyActionArgs $;

        public Builder() {
            $ = new LogscaleActionPagerDutyActionArgs();
        }

        public Builder(LogscaleActionPagerDutyActionArgs defaults) {
            $ = new LogscaleActionPagerDutyActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder routingKey(Output<String> routingKey) {
            $.routingKey = routingKey;
            return this;
        }

        public Builder routingKey(String routingKey) {
            return routingKey(Output.of(routingKey));
        }

        public Builder severity(Output<String> severity) {
            $.severity = severity;
            return this;
        }

        public Builder severity(String severity) {
            return severity(Output.of(severity));
        }

        public Builder useProxy(@Nullable Output<Boolean> useProxy) {
            $.useProxy = useProxy;
            return this;
        }

        public Builder useProxy(Boolean useProxy) {
            return useProxy(Output.of(useProxy));
        }

        public LogscaleActionPagerDutyActionArgs build() {
            $.routingKey = Objects.requireNonNull($.routingKey, "expected parameter 'routingKey' to be non-null");
            $.severity = Objects.requireNonNull($.severity, "expected parameter 'severity' to be non-null");
            return $;
        }
    }

}