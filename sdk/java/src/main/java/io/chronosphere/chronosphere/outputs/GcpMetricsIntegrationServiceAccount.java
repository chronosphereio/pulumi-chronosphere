// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GcpMetricsIntegrationServiceAccount {
    private String clientEmail;

    private GcpMetricsIntegrationServiceAccount() {}
    public String clientEmail() {
        return this.clientEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcpMetricsIntegrationServiceAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientEmail;
        public Builder() {}
        public Builder(GcpMetricsIntegrationServiceAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientEmail = defaults.clientEmail;
        }

        @CustomType.Setter
        public Builder clientEmail(String clientEmail) {
            this.clientEmail = Objects.requireNonNull(clientEmail);
            return this;
        }
        public GcpMetricsIntegrationServiceAccount build() {
            final var o = new GcpMetricsIntegrationServiceAccount();
            o.clientEmail = clientEmail;
            return o;
        }
    }
}
