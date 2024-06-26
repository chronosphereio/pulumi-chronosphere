// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SlackAlertNotifierField {
    private @Nullable Boolean short_;
    private @Nullable String title;
    private @Nullable String value;

    private SlackAlertNotifierField() {}
    public Optional<Boolean> short_() {
        return Optional.ofNullable(this.short_);
    }
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlackAlertNotifierField defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean short_;
        private @Nullable String title;
        private @Nullable String value;
        public Builder() {}
        public Builder(SlackAlertNotifierField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.short_ = defaults.short_;
    	      this.title = defaults.title;
    	      this.value = defaults.value;
        }

        @CustomType.Setter("short")
        public Builder short_(@Nullable Boolean short_) {
            this.short_ = short_;
            return this;
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public SlackAlertNotifierField build() {
            final var o = new SlackAlertNotifierField();
            o.short_ = short_;
            o.title = title;
            o.value = value;
            return o;
        }
    }
}
