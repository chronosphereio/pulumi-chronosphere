// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.DatasetConfigurationLogDatasetMatchCriteriaArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetConfigurationLogDatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetConfigurationLogDatasetArgs Empty = new DatasetConfigurationLogDatasetArgs();

    @Import(name="matchCriteria")
    private @Nullable Output<DatasetConfigurationLogDatasetMatchCriteriaArgs> matchCriteria;

    public Optional<Output<DatasetConfigurationLogDatasetMatchCriteriaArgs>> matchCriteria() {
        return Optional.ofNullable(this.matchCriteria);
    }

    private DatasetConfigurationLogDatasetArgs() {}

    private DatasetConfigurationLogDatasetArgs(DatasetConfigurationLogDatasetArgs $) {
        this.matchCriteria = $.matchCriteria;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetConfigurationLogDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetConfigurationLogDatasetArgs $;

        public Builder() {
            $ = new DatasetConfigurationLogDatasetArgs();
        }

        public Builder(DatasetConfigurationLogDatasetArgs defaults) {
            $ = new DatasetConfigurationLogDatasetArgs(Objects.requireNonNull(defaults));
        }

        public Builder matchCriteria(@Nullable Output<DatasetConfigurationLogDatasetMatchCriteriaArgs> matchCriteria) {
            $.matchCriteria = matchCriteria;
            return this;
        }

        public Builder matchCriteria(DatasetConfigurationLogDatasetMatchCriteriaArgs matchCriteria) {
            return matchCriteria(Output.of(matchCriteria));
        }

        public DatasetConfigurationLogDatasetArgs build() {
            return $;
        }
    }

}
