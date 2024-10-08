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

    public sealed class LogscaleActionSlackPostMessageActionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("apiToken", required: true)]
        public Input<string> ApiToken { get; set; } = null!;

        [Input("channels", required: true)]
        private InputList<string>? _channels;
        public InputList<string> Channels
        {
            get => _channels ?? (_channels = new InputList<string>());
            set => _channels = value;
        }

        [Input("fields")]
        private InputMap<string>? _fields;
        public InputMap<string> Fields
        {
            get => _fields ?? (_fields = new InputMap<string>());
            set => _fields = value;
        }

        [Input("useProxy")]
        public Input<bool>? UseProxy { get; set; }

        public LogscaleActionSlackPostMessageActionGetArgs()
        {
        }
        public static new LogscaleActionSlackPostMessageActionGetArgs Empty => new LogscaleActionSlackPostMessageActionGetArgs();
    }
}
