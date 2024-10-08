// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DatasetConfigurationLogDatasetMatchCriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetConfigurationLogDatasetMatchCriteriaArgs Empty = new DatasetConfigurationLogDatasetMatchCriteriaArgs();

    @Import(name="query", required=true)
    private Output<String> query;

    public Output<String> query() {
        return this.query;
    }

    private DatasetConfigurationLogDatasetMatchCriteriaArgs() {}

    private DatasetConfigurationLogDatasetMatchCriteriaArgs(DatasetConfigurationLogDatasetMatchCriteriaArgs $) {
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetConfigurationLogDatasetMatchCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetConfigurationLogDatasetMatchCriteriaArgs $;

        public Builder() {
            $ = new DatasetConfigurationLogDatasetMatchCriteriaArgs();
        }

        public Builder(DatasetConfigurationLogDatasetMatchCriteriaArgs defaults) {
            $ = new DatasetConfigurationLogDatasetMatchCriteriaArgs(Objects.requireNonNull(defaults));
        }

        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        public Builder query(String query) {
            return query(Output.of(query));
        }

        public DatasetConfigurationLogDatasetMatchCriteriaArgs build() {
            $.query = Objects.requireNonNull($.query, "expected parameter 'query' to be non-null");
            return $;
        }
    }

}
