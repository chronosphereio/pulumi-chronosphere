// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebhookAlertNotifierArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebhookAlertNotifierArgs Empty = new WebhookAlertNotifierArgs();

    @Import(name="basicAuthPassword")
    private @Nullable Output<String> basicAuthPassword;

    public Optional<Output<String>> basicAuthPassword() {
        return Optional.ofNullable(this.basicAuthPassword);
    }

    @Import(name="basicAuthUsername")
    private @Nullable Output<String> basicAuthUsername;

    public Optional<Output<String>> basicAuthUsername() {
        return Optional.ofNullable(this.basicAuthUsername);
    }

    @Import(name="bearerToken")
    private @Nullable Output<String> bearerToken;

    public Optional<Output<String>> bearerToken() {
        return Optional.ofNullable(this.bearerToken);
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="proxyUrl")
    private @Nullable Output<String> proxyUrl;

    public Optional<Output<String>> proxyUrl() {
        return Optional.ofNullable(this.proxyUrl);
    }

    @Import(name="sendResolved")
    private @Nullable Output<Boolean> sendResolved;

    public Optional<Output<Boolean>> sendResolved() {
        return Optional.ofNullable(this.sendResolved);
    }

    @Import(name="slug")
    private @Nullable Output<String> slug;

    public Optional<Output<String>> slug() {
        return Optional.ofNullable(this.slug);
    }

    @Import(name="tlsInsecureSkipVerify")
    private @Nullable Output<Boolean> tlsInsecureSkipVerify;

    public Optional<Output<Boolean>> tlsInsecureSkipVerify() {
        return Optional.ofNullable(this.tlsInsecureSkipVerify);
    }

    @Import(name="url", required=true)
    private Output<String> url;

    public Output<String> url() {
        return this.url;
    }

    private WebhookAlertNotifierArgs() {}

    private WebhookAlertNotifierArgs(WebhookAlertNotifierArgs $) {
        this.basicAuthPassword = $.basicAuthPassword;
        this.basicAuthUsername = $.basicAuthUsername;
        this.bearerToken = $.bearerToken;
        this.name = $.name;
        this.proxyUrl = $.proxyUrl;
        this.sendResolved = $.sendResolved;
        this.slug = $.slug;
        this.tlsInsecureSkipVerify = $.tlsInsecureSkipVerify;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebhookAlertNotifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebhookAlertNotifierArgs $;

        public Builder() {
            $ = new WebhookAlertNotifierArgs();
        }

        public Builder(WebhookAlertNotifierArgs defaults) {
            $ = new WebhookAlertNotifierArgs(Objects.requireNonNull(defaults));
        }

        public Builder basicAuthPassword(@Nullable Output<String> basicAuthPassword) {
            $.basicAuthPassword = basicAuthPassword;
            return this;
        }

        public Builder basicAuthPassword(String basicAuthPassword) {
            return basicAuthPassword(Output.of(basicAuthPassword));
        }

        public Builder basicAuthUsername(@Nullable Output<String> basicAuthUsername) {
            $.basicAuthUsername = basicAuthUsername;
            return this;
        }

        public Builder basicAuthUsername(String basicAuthUsername) {
            return basicAuthUsername(Output.of(basicAuthUsername));
        }

        public Builder bearerToken(@Nullable Output<String> bearerToken) {
            $.bearerToken = bearerToken;
            return this;
        }

        public Builder bearerToken(String bearerToken) {
            return bearerToken(Output.of(bearerToken));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder proxyUrl(@Nullable Output<String> proxyUrl) {
            $.proxyUrl = proxyUrl;
            return this;
        }

        public Builder proxyUrl(String proxyUrl) {
            return proxyUrl(Output.of(proxyUrl));
        }

        public Builder sendResolved(@Nullable Output<Boolean> sendResolved) {
            $.sendResolved = sendResolved;
            return this;
        }

        public Builder sendResolved(Boolean sendResolved) {
            return sendResolved(Output.of(sendResolved));
        }

        public Builder slug(@Nullable Output<String> slug) {
            $.slug = slug;
            return this;
        }

        public Builder slug(String slug) {
            return slug(Output.of(slug));
        }

        public Builder tlsInsecureSkipVerify(@Nullable Output<Boolean> tlsInsecureSkipVerify) {
            $.tlsInsecureSkipVerify = tlsInsecureSkipVerify;
            return this;
        }

        public Builder tlsInsecureSkipVerify(Boolean tlsInsecureSkipVerify) {
            return tlsInsecureSkipVerify(Output.of(tlsInsecureSkipVerify));
        }

        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public WebhookAlertNotifierArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
