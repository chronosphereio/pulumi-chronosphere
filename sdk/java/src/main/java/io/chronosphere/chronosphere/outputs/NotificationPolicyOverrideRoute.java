// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import io.chronosphere.chronosphere.outputs.NotificationPolicyOverrideRouteGroupBy;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotificationPolicyOverrideRoute {
    private @Nullable NotificationPolicyOverrideRouteGroupBy groupBy;
    private @Nullable List<String> notifiers;
    private @Nullable String repeatInterval;
    private String severity;

    private NotificationPolicyOverrideRoute() {}
    public Optional<NotificationPolicyOverrideRouteGroupBy> groupBy() {
        return Optional.ofNullable(this.groupBy);
    }
    public List<String> notifiers() {
        return this.notifiers == null ? List.of() : this.notifiers;
    }
    public Optional<String> repeatInterval() {
        return Optional.ofNullable(this.repeatInterval);
    }
    public String severity() {
        return this.severity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationPolicyOverrideRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable NotificationPolicyOverrideRouteGroupBy groupBy;
        private @Nullable List<String> notifiers;
        private @Nullable String repeatInterval;
        private String severity;
        public Builder() {}
        public Builder(NotificationPolicyOverrideRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupBy = defaults.groupBy;
    	      this.notifiers = defaults.notifiers;
    	      this.repeatInterval = defaults.repeatInterval;
    	      this.severity = defaults.severity;
        }

        @CustomType.Setter
        public Builder groupBy(@Nullable NotificationPolicyOverrideRouteGroupBy groupBy) {
            this.groupBy = groupBy;
            return this;
        }
        @CustomType.Setter
        public Builder notifiers(@Nullable List<String> notifiers) {
            this.notifiers = notifiers;
            return this;
        }
        public Builder notifiers(String... notifiers) {
            return notifiers(List.of(notifiers));
        }
        @CustomType.Setter
        public Builder repeatInterval(@Nullable String repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        @CustomType.Setter
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public NotificationPolicyOverrideRoute build() {
            final var o = new NotificationPolicyOverrideRoute();
            o.groupBy = groupBy;
            o.notifiers = notifiers;
            o.repeatInterval = repeatInterval;
            o.severity = severity;
            return o;
        }
    }
}
