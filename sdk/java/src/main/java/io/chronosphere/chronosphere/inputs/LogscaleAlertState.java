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


public final class LogscaleAlertState extends com.pulumi.resources.ResourceArgs {

    public static final LogscaleAlertState Empty = new LogscaleAlertState();

    @Import(name="actionIds")
    private @Nullable Output<List<String>> actionIds;

    public Optional<Output<List<String>>> actionIds() {
        return Optional.ofNullable(this.actionIds);
    }

    @Import(name="alertType")
    private @Nullable Output<String> alertType;

    public Optional<Output<String>> alertType() {
        return Optional.ofNullable(this.alertType);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="query")
    private @Nullable Output<String> query;

    public Optional<Output<String>> query() {
        return Optional.ofNullable(this.query);
    }

    @Import(name="repository")
    private @Nullable Output<String> repository;

    public Optional<Output<String>> repository() {
        return Optional.ofNullable(this.repository);
    }

    /**
     * Email of the user that the alert runs on behalf of
     * 
     */
    @Import(name="runAsUser")
    private @Nullable Output<String> runAsUser;

    /**
     * @return Email of the user that the alert runs on behalf of
     * 
     */
    public Optional<Output<String>> runAsUser() {
        return Optional.ofNullable(this.runAsUser);
    }

    @Import(name="slug")
    private @Nullable Output<String> slug;

    public Optional<Output<String>> slug() {
        return Optional.ofNullable(this.slug);
    }

    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Required for STANDARD type alerts, optional for FILTER type alerts
     * 
     */
    @Import(name="throttleDuration")
    private @Nullable Output<String> throttleDuration;

    /**
     * @return Required for STANDARD type alerts, optional for FILTER type alerts
     * 
     */
    public Optional<Output<String>> throttleDuration() {
        return Optional.ofNullable(this.throttleDuration);
    }

    @Import(name="throttleField")
    private @Nullable Output<String> throttleField;

    public Optional<Output<String>> throttleField() {
        return Optional.ofNullable(this.throttleField);
    }

    /**
     * Required for STANDARD type alerts, ignored for FILTER type alerts
     * 
     */
    @Import(name="timeWindow")
    private @Nullable Output<String> timeWindow;

    /**
     * @return Required for STANDARD type alerts, ignored for FILTER type alerts
     * 
     */
    public Optional<Output<String>> timeWindow() {
        return Optional.ofNullable(this.timeWindow);
    }

    private LogscaleAlertState() {}

    private LogscaleAlertState(LogscaleAlertState $) {
        this.actionIds = $.actionIds;
        this.alertType = $.alertType;
        this.description = $.description;
        this.disabled = $.disabled;
        this.name = $.name;
        this.query = $.query;
        this.repository = $.repository;
        this.runAsUser = $.runAsUser;
        this.slug = $.slug;
        this.tags = $.tags;
        this.throttleDuration = $.throttleDuration;
        this.throttleField = $.throttleField;
        this.timeWindow = $.timeWindow;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogscaleAlertState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogscaleAlertState $;

        public Builder() {
            $ = new LogscaleAlertState();
        }

        public Builder(LogscaleAlertState defaults) {
            $ = new LogscaleAlertState(Objects.requireNonNull(defaults));
        }

        public Builder actionIds(@Nullable Output<List<String>> actionIds) {
            $.actionIds = actionIds;
            return this;
        }

        public Builder actionIds(List<String> actionIds) {
            return actionIds(Output.of(actionIds));
        }

        public Builder actionIds(String... actionIds) {
            return actionIds(List.of(actionIds));
        }

        public Builder alertType(@Nullable Output<String> alertType) {
            $.alertType = alertType;
            return this;
        }

        public Builder alertType(String alertType) {
            return alertType(Output.of(alertType));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder query(@Nullable Output<String> query) {
            $.query = query;
            return this;
        }

        public Builder query(String query) {
            return query(Output.of(query));
        }

        public Builder repository(@Nullable Output<String> repository) {
            $.repository = repository;
            return this;
        }

        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        /**
         * @param runAsUser Email of the user that the alert runs on behalf of
         * 
         * @return builder
         * 
         */
        public Builder runAsUser(@Nullable Output<String> runAsUser) {
            $.runAsUser = runAsUser;
            return this;
        }

        /**
         * @param runAsUser Email of the user that the alert runs on behalf of
         * 
         * @return builder
         * 
         */
        public Builder runAsUser(String runAsUser) {
            return runAsUser(Output.of(runAsUser));
        }

        public Builder slug(@Nullable Output<String> slug) {
            $.slug = slug;
            return this;
        }

        public Builder slug(String slug) {
            return slug(Output.of(slug));
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param throttleDuration Required for STANDARD type alerts, optional for FILTER type alerts
         * 
         * @return builder
         * 
         */
        public Builder throttleDuration(@Nullable Output<String> throttleDuration) {
            $.throttleDuration = throttleDuration;
            return this;
        }

        /**
         * @param throttleDuration Required for STANDARD type alerts, optional for FILTER type alerts
         * 
         * @return builder
         * 
         */
        public Builder throttleDuration(String throttleDuration) {
            return throttleDuration(Output.of(throttleDuration));
        }

        public Builder throttleField(@Nullable Output<String> throttleField) {
            $.throttleField = throttleField;
            return this;
        }

        public Builder throttleField(String throttleField) {
            return throttleField(Output.of(throttleField));
        }

        /**
         * @param timeWindow Required for STANDARD type alerts, ignored for FILTER type alerts
         * 
         * @return builder
         * 
         */
        public Builder timeWindow(@Nullable Output<String> timeWindow) {
            $.timeWindow = timeWindow;
            return this;
        }

        /**
         * @param timeWindow Required for STANDARD type alerts, ignored for FILTER type alerts
         * 
         * @return builder
         * 
         */
        public Builder timeWindow(String timeWindow) {
            return timeWindow(Output.of(timeWindow));
        }

        public LogscaleAlertState build() {
            return $;
        }
    }

}
