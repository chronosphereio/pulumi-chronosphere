// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PagerdutyAlertNotifierImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final PagerdutyAlertNotifierImageArgs Empty = new PagerdutyAlertNotifierImageArgs();

    @Import(name="alt")
    private @Nullable Output<String> alt;

    public Optional<Output<String>> alt() {
        return Optional.ofNullable(this.alt);
    }

    @Import(name="href")
    private @Nullable Output<String> href;

    public Optional<Output<String>> href() {
        return Optional.ofNullable(this.href);
    }

    @Import(name="src", required=true)
    private Output<String> src;

    public Output<String> src() {
        return this.src;
    }

    private PagerdutyAlertNotifierImageArgs() {}

    private PagerdutyAlertNotifierImageArgs(PagerdutyAlertNotifierImageArgs $) {
        this.alt = $.alt;
        this.href = $.href;
        this.src = $.src;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PagerdutyAlertNotifierImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PagerdutyAlertNotifierImageArgs $;

        public Builder() {
            $ = new PagerdutyAlertNotifierImageArgs();
        }

        public Builder(PagerdutyAlertNotifierImageArgs defaults) {
            $ = new PagerdutyAlertNotifierImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder alt(@Nullable Output<String> alt) {
            $.alt = alt;
            return this;
        }

        public Builder alt(String alt) {
            return alt(Output.of(alt));
        }

        public Builder href(@Nullable Output<String> href) {
            $.href = href;
            return this;
        }

        public Builder href(String href) {
            return href(Output.of(href));
        }

        public Builder src(Output<String> src) {
            $.src = src;
            return this;
        }

        public Builder src(String src) {
            return src(Output.of(src));
        }

        public PagerdutyAlertNotifierImageArgs build() {
            $.src = Objects.requireNonNull($.src, "expected parameter 'src' to be non-null");
            return $;
        }
    }

}
