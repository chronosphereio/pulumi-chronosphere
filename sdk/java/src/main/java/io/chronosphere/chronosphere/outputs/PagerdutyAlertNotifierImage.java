// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PagerdutyAlertNotifierImage {
    private @Nullable String alt;
    private @Nullable String href;
    private String src;

    private PagerdutyAlertNotifierImage() {}
    public Optional<String> alt() {
        return Optional.ofNullable(this.alt);
    }
    public Optional<String> href() {
        return Optional.ofNullable(this.href);
    }
    public String src() {
        return this.src;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PagerdutyAlertNotifierImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String alt;
        private @Nullable String href;
        private String src;
        public Builder() {}
        public Builder(PagerdutyAlertNotifierImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alt = defaults.alt;
    	      this.href = defaults.href;
    	      this.src = defaults.src;
        }

        @CustomType.Setter
        public Builder alt(@Nullable String alt) {
            this.alt = alt;
            return this;
        }
        @CustomType.Setter
        public Builder href(@Nullable String href) {
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder src(String src) {
            this.src = Objects.requireNonNull(src);
            return this;
        }
        public PagerdutyAlertNotifierImage build() {
            final var o = new PagerdutyAlertNotifierImage();
            o.alt = alt;
            o.href = href;
            o.src = src;
            return o;
        }
    }
}
