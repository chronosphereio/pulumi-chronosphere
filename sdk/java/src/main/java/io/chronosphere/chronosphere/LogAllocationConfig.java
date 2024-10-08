// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.chronosphere.chronosphere.LogAllocationConfigArgs;
import io.chronosphere.chronosphere.Utilities;
import io.chronosphere.chronosphere.inputs.LogAllocationConfigState;
import io.chronosphere.chronosphere.outputs.LogAllocationConfigDatasetAllocation;
import io.chronosphere.chronosphere.outputs.LogAllocationConfigDefaultDataset;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="chronosphere:index/logAllocationConfig:LogAllocationConfig")
public class LogAllocationConfig extends com.pulumi.resources.CustomResource {
    @Export(name="datasetAllocations", refs={List.class,LogAllocationConfigDatasetAllocation.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LogAllocationConfigDatasetAllocation>> datasetAllocations;

    public Output<Optional<List<LogAllocationConfigDatasetAllocation>>> datasetAllocations() {
        return Codegen.optional(this.datasetAllocations);
    }
    @Export(name="defaultDataset", refs={LogAllocationConfigDefaultDataset.class}, tree="[0]")
    private Output<LogAllocationConfigDefaultDataset> defaultDataset;

    public Output<LogAllocationConfigDefaultDataset> defaultDataset() {
        return this.defaultDataset;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogAllocationConfig(String name) {
        this(name, LogAllocationConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogAllocationConfig(String name, LogAllocationConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogAllocationConfig(String name, LogAllocationConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("chronosphere:index/logAllocationConfig:LogAllocationConfig", name, args == null ? LogAllocationConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogAllocationConfig(String name, Output<String> id, @Nullable LogAllocationConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("chronosphere:index/logAllocationConfig:LogAllocationConfig", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LogAllocationConfig get(String name, Output<String> id, @Nullable LogAllocationConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogAllocationConfig(name, id, state, options);
    }
}
