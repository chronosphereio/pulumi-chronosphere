// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package chronosphere

import (
	"context"
	"reflect"

	"errors"
	"github.com/chronosphereio/pulumi-chronosphere/sdk/go/chronosphere/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type OpsgenieAlertNotifier struct {
	pulumi.CustomResourceState

	ApiKey                pulumi.StringOutput                       `pulumi:"apiKey"`
	ApiUrl                pulumi.StringPtrOutput                    `pulumi:"apiUrl"`
	BasicAuthPassword     pulumi.StringPtrOutput                    `pulumi:"basicAuthPassword"`
	BasicAuthUsername     pulumi.StringPtrOutput                    `pulumi:"basicAuthUsername"`
	BearerToken           pulumi.StringPtrOutput                    `pulumi:"bearerToken"`
	Description           pulumi.StringPtrOutput                    `pulumi:"description"`
	Details               pulumi.StringMapOutput                    `pulumi:"details"`
	Message               pulumi.StringPtrOutput                    `pulumi:"message"`
	Name                  pulumi.StringOutput                       `pulumi:"name"`
	Note                  pulumi.StringPtrOutput                    `pulumi:"note"`
	Priority              pulumi.StringPtrOutput                    `pulumi:"priority"`
	ProxyUrl              pulumi.StringPtrOutput                    `pulumi:"proxyUrl"`
	Responders            OpsgenieAlertNotifierResponderArrayOutput `pulumi:"responders"`
	SendResolved          pulumi.BoolPtrOutput                      `pulumi:"sendResolved"`
	Slug                  pulumi.StringOutput                       `pulumi:"slug"`
	Source                pulumi.StringPtrOutput                    `pulumi:"source"`
	Tags                  pulumi.StringArrayOutput                  `pulumi:"tags"`
	TlsInsecureSkipVerify pulumi.BoolPtrOutput                      `pulumi:"tlsInsecureSkipVerify"`
}

// NewOpsgenieAlertNotifier registers a new resource with the given unique name, arguments, and options.
func NewOpsgenieAlertNotifier(ctx *pulumi.Context,
	name string, args *OpsgenieAlertNotifierArgs, opts ...pulumi.ResourceOption) (*OpsgenieAlertNotifier, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiKey == nil {
		return nil, errors.New("invalid value for required argument 'ApiKey'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.ApiKey != nil {
		args.ApiKey = pulumi.ToSecret(args.ApiKey).(pulumi.StringInput)
	}
	if args.BasicAuthPassword != nil {
		args.BasicAuthPassword = pulumi.ToSecret(args.BasicAuthPassword).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"apiKey",
		"basicAuthPassword",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OpsgenieAlertNotifier
	err := ctx.RegisterResource("chronosphere:index/opsgenieAlertNotifier:OpsgenieAlertNotifier", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOpsgenieAlertNotifier gets an existing OpsgenieAlertNotifier resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOpsgenieAlertNotifier(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OpsgenieAlertNotifierState, opts ...pulumi.ResourceOption) (*OpsgenieAlertNotifier, error) {
	var resource OpsgenieAlertNotifier
	err := ctx.ReadResource("chronosphere:index/opsgenieAlertNotifier:OpsgenieAlertNotifier", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OpsgenieAlertNotifier resources.
type opsgenieAlertNotifierState struct {
	ApiKey                *string                          `pulumi:"apiKey"`
	ApiUrl                *string                          `pulumi:"apiUrl"`
	BasicAuthPassword     *string                          `pulumi:"basicAuthPassword"`
	BasicAuthUsername     *string                          `pulumi:"basicAuthUsername"`
	BearerToken           *string                          `pulumi:"bearerToken"`
	Description           *string                          `pulumi:"description"`
	Details               map[string]string                `pulumi:"details"`
	Message               *string                          `pulumi:"message"`
	Name                  *string                          `pulumi:"name"`
	Note                  *string                          `pulumi:"note"`
	Priority              *string                          `pulumi:"priority"`
	ProxyUrl              *string                          `pulumi:"proxyUrl"`
	Responders            []OpsgenieAlertNotifierResponder `pulumi:"responders"`
	SendResolved          *bool                            `pulumi:"sendResolved"`
	Slug                  *string                          `pulumi:"slug"`
	Source                *string                          `pulumi:"source"`
	Tags                  []string                         `pulumi:"tags"`
	TlsInsecureSkipVerify *bool                            `pulumi:"tlsInsecureSkipVerify"`
}

type OpsgenieAlertNotifierState struct {
	ApiKey                pulumi.StringPtrInput
	ApiUrl                pulumi.StringPtrInput
	BasicAuthPassword     pulumi.StringPtrInput
	BasicAuthUsername     pulumi.StringPtrInput
	BearerToken           pulumi.StringPtrInput
	Description           pulumi.StringPtrInput
	Details               pulumi.StringMapInput
	Message               pulumi.StringPtrInput
	Name                  pulumi.StringPtrInput
	Note                  pulumi.StringPtrInput
	Priority              pulumi.StringPtrInput
	ProxyUrl              pulumi.StringPtrInput
	Responders            OpsgenieAlertNotifierResponderArrayInput
	SendResolved          pulumi.BoolPtrInput
	Slug                  pulumi.StringPtrInput
	Source                pulumi.StringPtrInput
	Tags                  pulumi.StringArrayInput
	TlsInsecureSkipVerify pulumi.BoolPtrInput
}

func (OpsgenieAlertNotifierState) ElementType() reflect.Type {
	return reflect.TypeOf((*opsgenieAlertNotifierState)(nil)).Elem()
}

type opsgenieAlertNotifierArgs struct {
	ApiKey                string                           `pulumi:"apiKey"`
	ApiUrl                *string                          `pulumi:"apiUrl"`
	BasicAuthPassword     *string                          `pulumi:"basicAuthPassword"`
	BasicAuthUsername     *string                          `pulumi:"basicAuthUsername"`
	BearerToken           *string                          `pulumi:"bearerToken"`
	Description           *string                          `pulumi:"description"`
	Details               map[string]string                `pulumi:"details"`
	Message               *string                          `pulumi:"message"`
	Name                  string                           `pulumi:"name"`
	Note                  *string                          `pulumi:"note"`
	Priority              *string                          `pulumi:"priority"`
	ProxyUrl              *string                          `pulumi:"proxyUrl"`
	Responders            []OpsgenieAlertNotifierResponder `pulumi:"responders"`
	SendResolved          *bool                            `pulumi:"sendResolved"`
	Slug                  *string                          `pulumi:"slug"`
	Source                *string                          `pulumi:"source"`
	Tags                  []string                         `pulumi:"tags"`
	TlsInsecureSkipVerify *bool                            `pulumi:"tlsInsecureSkipVerify"`
}

// The set of arguments for constructing a OpsgenieAlertNotifier resource.
type OpsgenieAlertNotifierArgs struct {
	ApiKey                pulumi.StringInput
	ApiUrl                pulumi.StringPtrInput
	BasicAuthPassword     pulumi.StringPtrInput
	BasicAuthUsername     pulumi.StringPtrInput
	BearerToken           pulumi.StringPtrInput
	Description           pulumi.StringPtrInput
	Details               pulumi.StringMapInput
	Message               pulumi.StringPtrInput
	Name                  pulumi.StringInput
	Note                  pulumi.StringPtrInput
	Priority              pulumi.StringPtrInput
	ProxyUrl              pulumi.StringPtrInput
	Responders            OpsgenieAlertNotifierResponderArrayInput
	SendResolved          pulumi.BoolPtrInput
	Slug                  pulumi.StringPtrInput
	Source                pulumi.StringPtrInput
	Tags                  pulumi.StringArrayInput
	TlsInsecureSkipVerify pulumi.BoolPtrInput
}

func (OpsgenieAlertNotifierArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*opsgenieAlertNotifierArgs)(nil)).Elem()
}

type OpsgenieAlertNotifierInput interface {
	pulumi.Input

	ToOpsgenieAlertNotifierOutput() OpsgenieAlertNotifierOutput
	ToOpsgenieAlertNotifierOutputWithContext(ctx context.Context) OpsgenieAlertNotifierOutput
}

func (*OpsgenieAlertNotifier) ElementType() reflect.Type {
	return reflect.TypeOf((**OpsgenieAlertNotifier)(nil)).Elem()
}

func (i *OpsgenieAlertNotifier) ToOpsgenieAlertNotifierOutput() OpsgenieAlertNotifierOutput {
	return i.ToOpsgenieAlertNotifierOutputWithContext(context.Background())
}

func (i *OpsgenieAlertNotifier) ToOpsgenieAlertNotifierOutputWithContext(ctx context.Context) OpsgenieAlertNotifierOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OpsgenieAlertNotifierOutput)
}

// OpsgenieAlertNotifierArrayInput is an input type that accepts OpsgenieAlertNotifierArray and OpsgenieAlertNotifierArrayOutput values.
// You can construct a concrete instance of `OpsgenieAlertNotifierArrayInput` via:
//
//	OpsgenieAlertNotifierArray{ OpsgenieAlertNotifierArgs{...} }
type OpsgenieAlertNotifierArrayInput interface {
	pulumi.Input

	ToOpsgenieAlertNotifierArrayOutput() OpsgenieAlertNotifierArrayOutput
	ToOpsgenieAlertNotifierArrayOutputWithContext(context.Context) OpsgenieAlertNotifierArrayOutput
}

type OpsgenieAlertNotifierArray []OpsgenieAlertNotifierInput

func (OpsgenieAlertNotifierArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OpsgenieAlertNotifier)(nil)).Elem()
}

func (i OpsgenieAlertNotifierArray) ToOpsgenieAlertNotifierArrayOutput() OpsgenieAlertNotifierArrayOutput {
	return i.ToOpsgenieAlertNotifierArrayOutputWithContext(context.Background())
}

func (i OpsgenieAlertNotifierArray) ToOpsgenieAlertNotifierArrayOutputWithContext(ctx context.Context) OpsgenieAlertNotifierArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OpsgenieAlertNotifierArrayOutput)
}

// OpsgenieAlertNotifierMapInput is an input type that accepts OpsgenieAlertNotifierMap and OpsgenieAlertNotifierMapOutput values.
// You can construct a concrete instance of `OpsgenieAlertNotifierMapInput` via:
//
//	OpsgenieAlertNotifierMap{ "key": OpsgenieAlertNotifierArgs{...} }
type OpsgenieAlertNotifierMapInput interface {
	pulumi.Input

	ToOpsgenieAlertNotifierMapOutput() OpsgenieAlertNotifierMapOutput
	ToOpsgenieAlertNotifierMapOutputWithContext(context.Context) OpsgenieAlertNotifierMapOutput
}

type OpsgenieAlertNotifierMap map[string]OpsgenieAlertNotifierInput

func (OpsgenieAlertNotifierMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OpsgenieAlertNotifier)(nil)).Elem()
}

func (i OpsgenieAlertNotifierMap) ToOpsgenieAlertNotifierMapOutput() OpsgenieAlertNotifierMapOutput {
	return i.ToOpsgenieAlertNotifierMapOutputWithContext(context.Background())
}

func (i OpsgenieAlertNotifierMap) ToOpsgenieAlertNotifierMapOutputWithContext(ctx context.Context) OpsgenieAlertNotifierMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OpsgenieAlertNotifierMapOutput)
}

type OpsgenieAlertNotifierOutput struct{ *pulumi.OutputState }

func (OpsgenieAlertNotifierOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OpsgenieAlertNotifier)(nil)).Elem()
}

func (o OpsgenieAlertNotifierOutput) ToOpsgenieAlertNotifierOutput() OpsgenieAlertNotifierOutput {
	return o
}

func (o OpsgenieAlertNotifierOutput) ToOpsgenieAlertNotifierOutputWithContext(ctx context.Context) OpsgenieAlertNotifierOutput {
	return o
}

func (o OpsgenieAlertNotifierOutput) ApiKey() pulumi.StringOutput {
	return o.ApplyT(func(v *OpsgenieAlertNotifier) pulumi.StringOutput { return v.ApiKey }).(pulumi.StringOutput)
}

func (o OpsgenieAlertNotifierOutput) ApiUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OpsgenieAlertNotifier) pulumi.StringPtrOutput { return v.ApiUrl }).(pulumi.StringPtrOutput)
}

func (o OpsgenieAlertNotifierOutput) BasicAuthPassword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OpsgenieAlertNotifier) pulumi.StringPtrOutput { return v.BasicAuthPassword }).(pulumi.StringPtrOutput)
}

func (o OpsgenieAlertNotifierOutput) BasicAuthUsername() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OpsgenieAlertNotifier) pulumi.StringPtrOutput { return v.BasicAuthUsername }).(pulumi.StringPtrOutput)
}

func (o OpsgenieAlertNotifierOutput) BearerToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OpsgenieAlertNotifier) pulumi.StringPtrOutput { return v.BearerToken }).(pulumi.StringPtrOutput)
}

func (o OpsgenieAlertNotifierOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OpsgenieAlertNotifier) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

func (o OpsgenieAlertNotifierOutput) Details() pulumi.StringMapOutput {
	return o.ApplyT(func(v *OpsgenieAlertNotifier) pulumi.StringMapOutput { return v.Details }).(pulumi.StringMapOutput)
}

func (o OpsgenieAlertNotifierOutput) Message() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OpsgenieAlertNotifier) pulumi.StringPtrOutput { return v.Message }).(pulumi.StringPtrOutput)
}

func (o OpsgenieAlertNotifierOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OpsgenieAlertNotifier) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o OpsgenieAlertNotifierOutput) Note() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OpsgenieAlertNotifier) pulumi.StringPtrOutput { return v.Note }).(pulumi.StringPtrOutput)
}

func (o OpsgenieAlertNotifierOutput) Priority() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OpsgenieAlertNotifier) pulumi.StringPtrOutput { return v.Priority }).(pulumi.StringPtrOutput)
}

func (o OpsgenieAlertNotifierOutput) ProxyUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OpsgenieAlertNotifier) pulumi.StringPtrOutput { return v.ProxyUrl }).(pulumi.StringPtrOutput)
}

func (o OpsgenieAlertNotifierOutput) Responders() OpsgenieAlertNotifierResponderArrayOutput {
	return o.ApplyT(func(v *OpsgenieAlertNotifier) OpsgenieAlertNotifierResponderArrayOutput { return v.Responders }).(OpsgenieAlertNotifierResponderArrayOutput)
}

func (o OpsgenieAlertNotifierOutput) SendResolved() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OpsgenieAlertNotifier) pulumi.BoolPtrOutput { return v.SendResolved }).(pulumi.BoolPtrOutput)
}

func (o OpsgenieAlertNotifierOutput) Slug() pulumi.StringOutput {
	return o.ApplyT(func(v *OpsgenieAlertNotifier) pulumi.StringOutput { return v.Slug }).(pulumi.StringOutput)
}

func (o OpsgenieAlertNotifierOutput) Source() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OpsgenieAlertNotifier) pulumi.StringPtrOutput { return v.Source }).(pulumi.StringPtrOutput)
}

func (o OpsgenieAlertNotifierOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OpsgenieAlertNotifier) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

func (o OpsgenieAlertNotifierOutput) TlsInsecureSkipVerify() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OpsgenieAlertNotifier) pulumi.BoolPtrOutput { return v.TlsInsecureSkipVerify }).(pulumi.BoolPtrOutput)
}

type OpsgenieAlertNotifierArrayOutput struct{ *pulumi.OutputState }

func (OpsgenieAlertNotifierArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OpsgenieAlertNotifier)(nil)).Elem()
}

func (o OpsgenieAlertNotifierArrayOutput) ToOpsgenieAlertNotifierArrayOutput() OpsgenieAlertNotifierArrayOutput {
	return o
}

func (o OpsgenieAlertNotifierArrayOutput) ToOpsgenieAlertNotifierArrayOutputWithContext(ctx context.Context) OpsgenieAlertNotifierArrayOutput {
	return o
}

func (o OpsgenieAlertNotifierArrayOutput) Index(i pulumi.IntInput) OpsgenieAlertNotifierOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OpsgenieAlertNotifier {
		return vs[0].([]*OpsgenieAlertNotifier)[vs[1].(int)]
	}).(OpsgenieAlertNotifierOutput)
}

type OpsgenieAlertNotifierMapOutput struct{ *pulumi.OutputState }

func (OpsgenieAlertNotifierMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OpsgenieAlertNotifier)(nil)).Elem()
}

func (o OpsgenieAlertNotifierMapOutput) ToOpsgenieAlertNotifierMapOutput() OpsgenieAlertNotifierMapOutput {
	return o
}

func (o OpsgenieAlertNotifierMapOutput) ToOpsgenieAlertNotifierMapOutputWithContext(ctx context.Context) OpsgenieAlertNotifierMapOutput {
	return o
}

func (o OpsgenieAlertNotifierMapOutput) MapIndex(k pulumi.StringInput) OpsgenieAlertNotifierOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OpsgenieAlertNotifier {
		return vs[0].(map[string]*OpsgenieAlertNotifier)[vs[1].(string)]
	}).(OpsgenieAlertNotifierOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OpsgenieAlertNotifierInput)(nil)).Elem(), &OpsgenieAlertNotifier{})
	pulumi.RegisterInputType(reflect.TypeOf((*OpsgenieAlertNotifierArrayInput)(nil)).Elem(), OpsgenieAlertNotifierArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OpsgenieAlertNotifierMapInput)(nil)).Elem(), OpsgenieAlertNotifierMap{})
	pulumi.RegisterOutputType(OpsgenieAlertNotifierOutput{})
	pulumi.RegisterOutputType(OpsgenieAlertNotifierArrayOutput{})
	pulumi.RegisterOutputType(OpsgenieAlertNotifierMapOutput{})
}
