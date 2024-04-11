// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClassicDashboardArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClassicDashboardArgs Empty = new ClassicDashboardArgs();

    @Import(name="bucketId")
    private @Nullable Output<String> bucketId;

    public Optional<Output<String>> bucketId() {
        return Optional.ofNullable(this.bucketId);
    }

    @Import(name="collectionId")
    private @Nullable Output<String> collectionId;

    public Optional<Output<String>> collectionId() {
        return Optional.ofNullable(this.collectionId);
    }

    @Import(name="dashboardJson", required=true)
    private Output<String> dashboardJson;

    public Output<String> dashboardJson() {
        return this.dashboardJson;
    }

    private ClassicDashboardArgs() {}

    private ClassicDashboardArgs(ClassicDashboardArgs $) {
        this.bucketId = $.bucketId;
        this.collectionId = $.collectionId;
        this.dashboardJson = $.dashboardJson;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClassicDashboardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClassicDashboardArgs $;

        public Builder() {
            $ = new ClassicDashboardArgs();
        }

        public Builder(ClassicDashboardArgs defaults) {
            $ = new ClassicDashboardArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketId(@Nullable Output<String> bucketId) {
            $.bucketId = bucketId;
            return this;
        }

        public Builder bucketId(String bucketId) {
            return bucketId(Output.of(bucketId));
        }

        public Builder collectionId(@Nullable Output<String> collectionId) {
            $.collectionId = collectionId;
            return this;
        }

        public Builder collectionId(String collectionId) {
            return collectionId(Output.of(collectionId));
        }

        public Builder dashboardJson(Output<String> dashboardJson) {
            $.dashboardJson = dashboardJson;
            return this;
        }

        public Builder dashboardJson(String dashboardJson) {
            return dashboardJson(Output.of(dashboardJson));
        }

        public ClassicDashboardArgs build() {
            $.dashboardJson = Objects.requireNonNull($.dashboardJson, "expected parameter 'dashboardJson' to be non-null");
            return $;
        }
    }

}
