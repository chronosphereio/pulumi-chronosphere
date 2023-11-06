// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class Collection extends pulumi.CustomResource {
    /**
     * Get an existing Collection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CollectionState, opts?: pulumi.CustomResourceOptions): Collection {
        return new Collection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'chronosphere:index/collection:Collection';

    /**
     * Returns true if the given object is an instance of Collection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Collection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Collection.__pulumiType;
    }

    public readonly description!: pulumi.Output<string | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly notificationPolicyId!: pulumi.Output<string | undefined>;
    public readonly slug!: pulumi.Output<string>;
    public readonly teamId!: pulumi.Output<string | undefined>;

    /**
     * Create a Collection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CollectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CollectionArgs | CollectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CollectionState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notificationPolicyId"] = state ? state.notificationPolicyId : undefined;
            resourceInputs["slug"] = state ? state.slug : undefined;
            resourceInputs["teamId"] = state ? state.teamId : undefined;
        } else {
            const args = argsOrState as CollectionArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["notificationPolicyId"] = args ? args.notificationPolicyId : undefined;
            resourceInputs["slug"] = args ? args.slug : undefined;
            resourceInputs["teamId"] = args ? args.teamId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Collection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Collection resources.
 */
export interface CollectionState {
    description?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    notificationPolicyId?: pulumi.Input<string>;
    slug?: pulumi.Input<string>;
    teamId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Collection resource.
 */
export interface CollectionArgs {
    description?: pulumi.Input<string>;
    name: pulumi.Input<string>;
    notificationPolicyId?: pulumi.Input<string>;
    slug?: pulumi.Input<string>;
    teamId?: pulumi.Input<string>;
}
