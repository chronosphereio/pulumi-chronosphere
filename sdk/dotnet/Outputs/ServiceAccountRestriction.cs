// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Outputs
{

    [OutputType]
    public sealed class ServiceAccountRestriction
    {
        public readonly ImmutableDictionary<string, string>? Labels;
        public readonly string Permission;

        [OutputConstructor]
        private ServiceAccountRestriction(
            ImmutableDictionary<string, string>? labels,

            string permission)
        {
            Labels = labels;
            Permission = permission;
        }
    }
}
