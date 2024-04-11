// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationPolicyDataSourceRoute extends com.pulumi.resources.InvokeArgs {

    public static final NotificationPolicyDataSourceRoute Empty = new NotificationPolicyDataSourceRoute();

    @Import(name="notifiers")
    private @Nullable List<String> notifiers;

    public Optional<List<String>> notifiers() {
        return Optional.ofNullable(this.notifiers);
    }

    @Import(name="repeatInterval")
    private @Nullable String repeatInterval;

    public Optional<String> repeatInterval() {
        return Optional.ofNullable(this.repeatInterval);
    }

    @Import(name="severity", required=true)
    private String severity;

    public String severity() {
        return this.severity;
    }

    private NotificationPolicyDataSourceRoute() {}

    private NotificationPolicyDataSourceRoute(NotificationPolicyDataSourceRoute $) {
        this.notifiers = $.notifiers;
        this.repeatInterval = $.repeatInterval;
        this.severity = $.severity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationPolicyDataSourceRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationPolicyDataSourceRoute $;

        public Builder() {
            $ = new NotificationPolicyDataSourceRoute();
        }

        public Builder(NotificationPolicyDataSourceRoute defaults) {
            $ = new NotificationPolicyDataSourceRoute(Objects.requireNonNull(defaults));
        }

        public Builder notifiers(@Nullable List<String> notifiers) {
            $.notifiers = notifiers;
            return this;
        }

        public Builder notifiers(String... notifiers) {
            return notifiers(List.of(notifiers));
        }

        public Builder repeatInterval(@Nullable String repeatInterval) {
            $.repeatInterval = repeatInterval;
            return this;
        }

        public Builder severity(String severity) {
            $.severity = severity;
            return this;
        }

        public NotificationPolicyDataSourceRoute build() {
            $.severity = Objects.requireNonNull($.severity, "expected parameter 'severity' to be non-null");
            return $;
        }
    }

}
