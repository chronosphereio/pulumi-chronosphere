// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebhookAlertNotifierState extends com.pulumi.resources.ResourceArgs {

    public static final WebhookAlertNotifierState Empty = new WebhookAlertNotifierState();

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

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * @deprecated
     * custom proxy URLs are not supported
     * 
     */
    @Deprecated /* custom proxy URLs are not supported */
    @Import(name="proxyUrl")
    private @Nullable Output<String> proxyUrl;

    /**
     * @deprecated
     * custom proxy URLs are not supported
     * 
     */
    @Deprecated /* custom proxy URLs are not supported */
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

    @Import(name="url")
    private @Nullable Output<String> url;

    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private WebhookAlertNotifierState() {}

    private WebhookAlertNotifierState(WebhookAlertNotifierState $) {
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
    public static Builder builder(WebhookAlertNotifierState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebhookAlertNotifierState $;

        public Builder() {
            $ = new WebhookAlertNotifierState();
        }

        public Builder(WebhookAlertNotifierState defaults) {
            $ = new WebhookAlertNotifierState(Objects.requireNonNull(defaults));
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

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * custom proxy URLs are not supported
         * 
         */
        @Deprecated /* custom proxy URLs are not supported */
        public Builder proxyUrl(@Nullable Output<String> proxyUrl) {
            $.proxyUrl = proxyUrl;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * custom proxy URLs are not supported
         * 
         */
        @Deprecated /* custom proxy URLs are not supported */
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

        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public WebhookAlertNotifierState build() {
            return $;
        }
    }

}
