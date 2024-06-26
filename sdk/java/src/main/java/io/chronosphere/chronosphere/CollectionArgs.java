// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CollectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CollectionArgs Empty = new CollectionArgs();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="notificationPolicyId")
    private @Nullable Output<String> notificationPolicyId;

    public Optional<Output<String>> notificationPolicyId() {
        return Optional.ofNullable(this.notificationPolicyId);
    }

    @Import(name="slug")
    private @Nullable Output<String> slug;

    public Optional<Output<String>> slug() {
        return Optional.ofNullable(this.slug);
    }

    @Import(name="teamId")
    private @Nullable Output<String> teamId;

    public Optional<Output<String>> teamId() {
        return Optional.ofNullable(this.teamId);
    }

    private CollectionArgs() {}

    private CollectionArgs(CollectionArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.notificationPolicyId = $.notificationPolicyId;
        this.slug = $.slug;
        this.teamId = $.teamId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CollectionArgs $;

        public Builder() {
            $ = new CollectionArgs();
        }

        public Builder(CollectionArgs defaults) {
            $ = new CollectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder notificationPolicyId(@Nullable Output<String> notificationPolicyId) {
            $.notificationPolicyId = notificationPolicyId;
            return this;
        }

        public Builder notificationPolicyId(String notificationPolicyId) {
            return notificationPolicyId(Output.of(notificationPolicyId));
        }

        public Builder slug(@Nullable Output<String> slug) {
            $.slug = slug;
            return this;
        }

        public Builder slug(String slug) {
            return slug(Output.of(slug));
        }

        public Builder teamId(@Nullable Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        public CollectionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
