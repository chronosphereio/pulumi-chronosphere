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
public final class LogscaleActionVictorOpsAction {
    private String messageType;
    private String notifyUrl;
    private @Nullable Boolean useProxy;

    private LogscaleActionVictorOpsAction() {}
    public String messageType() {
        return this.messageType;
    }
    public String notifyUrl() {
        return this.notifyUrl;
    }
    public Optional<Boolean> useProxy() {
        return Optional.ofNullable(this.useProxy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogscaleActionVictorOpsAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String messageType;
        private String notifyUrl;
        private @Nullable Boolean useProxy;
        public Builder() {}
        public Builder(LogscaleActionVictorOpsAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageType = defaults.messageType;
    	      this.notifyUrl = defaults.notifyUrl;
    	      this.useProxy = defaults.useProxy;
        }

        @CustomType.Setter
        public Builder messageType(String messageType) {
            this.messageType = Objects.requireNonNull(messageType);
            return this;
        }
        @CustomType.Setter
        public Builder notifyUrl(String notifyUrl) {
            this.notifyUrl = Objects.requireNonNull(notifyUrl);
            return this;
        }
        @CustomType.Setter
        public Builder useProxy(@Nullable Boolean useProxy) {
            this.useProxy = useProxy;
            return this;
        }
        public LogscaleActionVictorOpsAction build() {
            final var o = new LogscaleActionVictorOpsAction();
            o.messageType = messageType;
            o.notifyUrl = notifyUrl;
            o.useProxy = useProxy;
            return o;
        }
    }
}