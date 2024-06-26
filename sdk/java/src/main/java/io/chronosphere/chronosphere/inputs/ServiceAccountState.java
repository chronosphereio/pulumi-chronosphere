// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.ServiceAccountRestrictionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceAccountState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAccountState Empty = new ServiceAccountState();

    @Import(name="email")
    private @Nullable Output<String> email;

    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="restriction")
    private @Nullable Output<ServiceAccountRestrictionArgs> restriction;

    public Optional<Output<ServiceAccountRestrictionArgs>> restriction() {
        return Optional.ofNullable(this.restriction);
    }

    @Import(name="slug")
    private @Nullable Output<String> slug;

    public Optional<Output<String>> slug() {
        return Optional.ofNullable(this.slug);
    }

    @Import(name="token")
    private @Nullable Output<String> token;

    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    @Import(name="unrestricted")
    private @Nullable Output<Boolean> unrestricted;

    public Optional<Output<Boolean>> unrestricted() {
        return Optional.ofNullable(this.unrestricted);
    }

    private ServiceAccountState() {}

    private ServiceAccountState(ServiceAccountState $) {
        this.email = $.email;
        this.name = $.name;
        this.restriction = $.restriction;
        this.slug = $.slug;
        this.token = $.token;
        this.unrestricted = $.unrestricted;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAccountState $;

        public Builder() {
            $ = new ServiceAccountState();
        }

        public Builder(ServiceAccountState defaults) {
            $ = new ServiceAccountState(Objects.requireNonNull(defaults));
        }

        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        public Builder email(String email) {
            return email(Output.of(email));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder restriction(@Nullable Output<ServiceAccountRestrictionArgs> restriction) {
            $.restriction = restriction;
            return this;
        }

        public Builder restriction(ServiceAccountRestrictionArgs restriction) {
            return restriction(Output.of(restriction));
        }

        public Builder slug(@Nullable Output<String> slug) {
            $.slug = slug;
            return this;
        }

        public Builder slug(String slug) {
            return slug(Output.of(slug));
        }

        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        public Builder token(String token) {
            return token(Output.of(token));
        }

        public Builder unrestricted(@Nullable Output<Boolean> unrestricted) {
            $.unrestricted = unrestricted;
            return this;
        }

        public Builder unrestricted(Boolean unrestricted) {
            return unrestricted(Output.of(unrestricted));
        }

        public ServiceAccountState build() {
            return $;
        }
    }

}
