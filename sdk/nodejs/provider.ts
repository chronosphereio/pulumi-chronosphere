// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The provider type for the chronosphere package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 */
export class Provider extends pulumi.ProviderResource {
    /** @internal */
    public static readonly __pulumiType = 'chronosphere';

    /**
     * Returns true if the given object is an instance of Provider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Provider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === "pulumi:providers:" + Provider.__pulumiType;
    }

    public readonly apiToken!: pulumi.Output<string | undefined>;
    public readonly entityNamespace!: pulumi.Output<string | undefined>;
    public readonly org!: pulumi.Output<string | undefined>;

    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProviderArgs, opts?: pulumi.ResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        {
            resourceInputs["apiToken"] = (args?.apiToken ? pulumi.secret(args.apiToken) : undefined) ?? utilities.getEnv("CHRONOSPHERE_API_TOKEN");
            resourceInputs["disableDryrun"] = pulumi.output(args ? args.disableDryrun : undefined).apply(JSON.stringify);
            resourceInputs["entityNamespace"] = args ? args.entityNamespace : undefined;
            resourceInputs["org"] = (args ? args.org : undefined) ?? utilities.getEnv("CHRONOSPHERE_ORG", "CHRONOSPHERE_ORG_NAME");
            resourceInputs["unstable"] = pulumi.output(args ? args.unstable : undefined).apply(JSON.stringify);
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["apiToken"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Provider.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    apiToken?: pulumi.Input<string>;
    disableDryrun?: pulumi.Input<boolean>;
    entityNamespace?: pulumi.Input<string>;
    org?: pulumi.Input<string>;
    unstable?: pulumi.Input<boolean>;
}
