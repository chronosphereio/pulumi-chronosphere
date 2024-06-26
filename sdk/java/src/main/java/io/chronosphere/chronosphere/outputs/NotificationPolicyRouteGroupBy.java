// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class NotificationPolicyRouteGroupBy {
    private @Nullable List<String> labelNames;

    private NotificationPolicyRouteGroupBy() {}
    public List<String> labelNames() {
        return this.labelNames == null ? List.of() : this.labelNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationPolicyRouteGroupBy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> labelNames;
        public Builder() {}
        public Builder(NotificationPolicyRouteGroupBy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelNames = defaults.labelNames;
        }

        @CustomType.Setter
        public Builder labelNames(@Nullable List<String> labelNames) {
            this.labelNames = labelNames;
            return this;
        }
        public Builder labelNames(String... labelNames) {
            return labelNames(List.of(labelNames));
        }
        public NotificationPolicyRouteGroupBy build() {
            final var o = new NotificationPolicyRouteGroupBy();
            o.labelNames = labelNames;
            return o;
        }
    }
}
