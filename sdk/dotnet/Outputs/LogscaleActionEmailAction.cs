// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Chronosphere.Pulumi.Outputs
{

    [OutputType]
    public sealed class LogscaleActionEmailAction
    {
        public readonly bool? AttachCsv;
        public readonly string? BodyTemplate;
        public readonly ImmutableArray<string> Recipients;
        public readonly string? SubjectTemplate;
        public readonly bool? UseProxy;

        [OutputConstructor]
        private LogscaleActionEmailAction(
            bool? attachCsv,

            string? bodyTemplate,

            ImmutableArray<string> recipients,

            string? subjectTemplate,

            bool? useProxy)
        {
            AttachCsv = attachCsv;
            BodyTemplate = bodyTemplate;
            Recipients = recipients;
            SubjectTemplate = subjectTemplate;
            UseProxy = useProxy;
        }
    }
}
