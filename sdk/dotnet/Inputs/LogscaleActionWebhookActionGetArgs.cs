// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Chronosphere.Pulumi.Inputs
{

    public sealed class LogscaleActionWebhookActionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("bodyTemplate")]
        public Input<string>? BodyTemplate { get; set; }

        [Input("headers")]
        private InputMap<string>? _headers;
        public InputMap<string> Headers
        {
            get => _headers ?? (_headers = new InputMap<string>());
            set => _headers = value;
        }

        [Input("ignoreSsl")]
        public Input<bool>? IgnoreSsl { get; set; }

        [Input("method", required: true)]
        public Input<string> Method { get; set; } = null!;

        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        [Input("useProxy")]
        public Input<bool>? UseProxy { get; set; }

        public LogscaleActionWebhookActionGetArgs()
        {
        }
        public static new LogscaleActionWebhookActionGetArgs Empty => new LogscaleActionWebhookActionGetArgs();
    }
}