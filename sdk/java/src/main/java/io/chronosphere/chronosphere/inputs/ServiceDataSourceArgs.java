// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ServiceDataSourceArgs extends com.pulumi.resources.InvokeArgs {

    public static final ServiceDataSourceArgs Empty = new ServiceDataSourceArgs();

    @Import(name="slug", required=true)
    private Output<String> slug;

    public Output<String> slug() {
        return this.slug;
    }

    private ServiceDataSourceArgs() {}

    private ServiceDataSourceArgs(ServiceDataSourceArgs $) {
        this.slug = $.slug;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceDataSourceArgs $;

        public Builder() {
            $ = new ServiceDataSourceArgs();
        }

        public Builder(ServiceDataSourceArgs defaults) {
            $ = new ServiceDataSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder slug(Output<String> slug) {
            $.slug = slug;
            return this;
        }

        public Builder slug(String slug) {
            return slug(Output.of(slug));
        }

        public ServiceDataSourceArgs build() {
            $.slug = Objects.requireNonNull($.slug, "expected parameter 'slug' to be non-null");
            return $;
        }
    }

}
