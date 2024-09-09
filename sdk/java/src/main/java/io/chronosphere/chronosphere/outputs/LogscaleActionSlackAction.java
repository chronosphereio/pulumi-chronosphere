// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogscaleActionSlackAction {
    private @Nullable Map<String,String> fields;
    private String url;
    private @Nullable Boolean useProxy;

    private LogscaleActionSlackAction() {}
    public Map<String,String> fields() {
        return this.fields == null ? Map.of() : this.fields;
    }
    public String url() {
        return this.url;
    }
    public Optional<Boolean> useProxy() {
        return Optional.ofNullable(this.useProxy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogscaleActionSlackAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> fields;
        private String url;
        private @Nullable Boolean useProxy;
        public Builder() {}
        public Builder(LogscaleActionSlackAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
    	      this.url = defaults.url;
    	      this.useProxy = defaults.useProxy;
        }

        @CustomType.Setter
        public Builder fields(@Nullable Map<String,String> fields) {
            this.fields = fields;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        @CustomType.Setter
        public Builder useProxy(@Nullable Boolean useProxy) {
            this.useProxy = useProxy;
            return this;
        }
        public LogscaleActionSlackAction build() {
            final var o = new LogscaleActionSlackAction();
            o.fields = fields;
            o.url = url;
            o.useProxy = useProxy;
            return o;
        }
    }
}
