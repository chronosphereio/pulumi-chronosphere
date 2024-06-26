// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.OpsgenieAlertNotifierResponderArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OpsgenieAlertNotifierState extends com.pulumi.resources.ResourceArgs {

    public static final OpsgenieAlertNotifierState Empty = new OpsgenieAlertNotifierState();

    @Import(name="apiKey")
    private @Nullable Output<String> apiKey;

    public Optional<Output<String>> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }

    @Import(name="apiUrl")
    private @Nullable Output<String> apiUrl;

    public Optional<Output<String>> apiUrl() {
        return Optional.ofNullable(this.apiUrl);
    }

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

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="details")
    private @Nullable Output<Map<String,String>> details;

    public Optional<Output<Map<String,String>>> details() {
        return Optional.ofNullable(this.details);
    }

    @Import(name="message")
    private @Nullable Output<String> message;

    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="note")
    private @Nullable Output<String> note;

    public Optional<Output<String>> note() {
        return Optional.ofNullable(this.note);
    }

    @Import(name="priority")
    private @Nullable Output<String> priority;

    public Optional<Output<String>> priority() {
        return Optional.ofNullable(this.priority);
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

    @Import(name="responders")
    private @Nullable Output<List<OpsgenieAlertNotifierResponderArgs>> responders;

    public Optional<Output<List<OpsgenieAlertNotifierResponderArgs>>> responders() {
        return Optional.ofNullable(this.responders);
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

    @Import(name="source")
    private @Nullable Output<String> source;

    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tlsInsecureSkipVerify")
    private @Nullable Output<Boolean> tlsInsecureSkipVerify;

    public Optional<Output<Boolean>> tlsInsecureSkipVerify() {
        return Optional.ofNullable(this.tlsInsecureSkipVerify);
    }

    private OpsgenieAlertNotifierState() {}

    private OpsgenieAlertNotifierState(OpsgenieAlertNotifierState $) {
        this.apiKey = $.apiKey;
        this.apiUrl = $.apiUrl;
        this.basicAuthPassword = $.basicAuthPassword;
        this.basicAuthUsername = $.basicAuthUsername;
        this.bearerToken = $.bearerToken;
        this.description = $.description;
        this.details = $.details;
        this.message = $.message;
        this.name = $.name;
        this.note = $.note;
        this.priority = $.priority;
        this.proxyUrl = $.proxyUrl;
        this.responders = $.responders;
        this.sendResolved = $.sendResolved;
        this.slug = $.slug;
        this.source = $.source;
        this.tags = $.tags;
        this.tlsInsecureSkipVerify = $.tlsInsecureSkipVerify;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpsgenieAlertNotifierState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpsgenieAlertNotifierState $;

        public Builder() {
            $ = new OpsgenieAlertNotifierState();
        }

        public Builder(OpsgenieAlertNotifierState defaults) {
            $ = new OpsgenieAlertNotifierState(Objects.requireNonNull(defaults));
        }

        public Builder apiKey(@Nullable Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        public Builder apiUrl(@Nullable Output<String> apiUrl) {
            $.apiUrl = apiUrl;
            return this;
        }

        public Builder apiUrl(String apiUrl) {
            return apiUrl(Output.of(apiUrl));
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

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder details(@Nullable Output<Map<String,String>> details) {
            $.details = details;
            return this;
        }

        public Builder details(Map<String,String> details) {
            return details(Output.of(details));
        }

        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        public Builder message(String message) {
            return message(Output.of(message));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder note(@Nullable Output<String> note) {
            $.note = note;
            return this;
        }

        public Builder note(String note) {
            return note(Output.of(note));
        }

        public Builder priority(@Nullable Output<String> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(String priority) {
            return priority(Output.of(priority));
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

        public Builder responders(@Nullable Output<List<OpsgenieAlertNotifierResponderArgs>> responders) {
            $.responders = responders;
            return this;
        }

        public Builder responders(List<OpsgenieAlertNotifierResponderArgs> responders) {
            return responders(Output.of(responders));
        }

        public Builder responders(OpsgenieAlertNotifierResponderArgs... responders) {
            return responders(List.of(responders));
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

        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public Builder tlsInsecureSkipVerify(@Nullable Output<Boolean> tlsInsecureSkipVerify) {
            $.tlsInsecureSkipVerify = tlsInsecureSkipVerify;
            return this;
        }

        public Builder tlsInsecureSkipVerify(Boolean tlsInsecureSkipVerify) {
            return tlsInsecureSkipVerify(Output.of(tlsInsecureSkipVerify));
        }

        public OpsgenieAlertNotifierState build() {
            return $;
        }
    }

}
