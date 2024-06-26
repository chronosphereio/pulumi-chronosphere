// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class TraceJaegerRemoteSamplingStrategy extends pulumi.CustomResource {
    /**
     * Get an existing TraceJaegerRemoteSamplingStrategy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TraceJaegerRemoteSamplingStrategyState, opts?: pulumi.CustomResourceOptions): TraceJaegerRemoteSamplingStrategy {
        return new TraceJaegerRemoteSamplingStrategy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'chronosphere:index/traceJaegerRemoteSamplingStrategy:TraceJaegerRemoteSamplingStrategy';

    /**
     * Returns true if the given object is an instance of TraceJaegerRemoteSamplingStrategy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TraceJaegerRemoteSamplingStrategy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TraceJaegerRemoteSamplingStrategy.__pulumiType;
    }

    public readonly appliedStrategy!: pulumi.Output<outputs.TraceJaegerRemoteSamplingStrategyAppliedStrategy>;
    public readonly name!: pulumi.Output<string>;
    public readonly serviceName!: pulumi.Output<string>;
    public readonly slug!: pulumi.Output<string>;

    /**
     * Create a TraceJaegerRemoteSamplingStrategy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TraceJaegerRemoteSamplingStrategyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TraceJaegerRemoteSamplingStrategyArgs | TraceJaegerRemoteSamplingStrategyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TraceJaegerRemoteSamplingStrategyState | undefined;
            resourceInputs["appliedStrategy"] = state ? state.appliedStrategy : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["serviceName"] = state ? state.serviceName : undefined;
            resourceInputs["slug"] = state ? state.slug : undefined;
        } else {
            const args = argsOrState as TraceJaegerRemoteSamplingStrategyArgs | undefined;
            if ((!args || args.appliedStrategy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appliedStrategy'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.serviceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceName'");
            }
            resourceInputs["appliedStrategy"] = args ? args.appliedStrategy : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["serviceName"] = args ? args.serviceName : undefined;
            resourceInputs["slug"] = args ? args.slug : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TraceJaegerRemoteSamplingStrategy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TraceJaegerRemoteSamplingStrategy resources.
 */
export interface TraceJaegerRemoteSamplingStrategyState {
    appliedStrategy?: pulumi.Input<inputs.TraceJaegerRemoteSamplingStrategyAppliedStrategy>;
    name?: pulumi.Input<string>;
    serviceName?: pulumi.Input<string>;
    slug?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TraceJaegerRemoteSamplingStrategy resource.
 */
export interface TraceJaegerRemoteSamplingStrategyArgs {
    appliedStrategy: pulumi.Input<inputs.TraceJaegerRemoteSamplingStrategyAppliedStrategy>;
    name: pulumi.Input<string>;
    serviceName: pulumi.Input<string>;
    slug?: pulumi.Input<string>;
}
