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
    public sealed class MappingRuleStoragePolicy
    {
        public readonly string Resolution;
        public readonly string Retention;

        [OutputConstructor]
        private MappingRuleStoragePolicy(
            string resolution,

            string retention)
        {
            Resolution = resolution;
            Retention = retention;
        }
    }
}
