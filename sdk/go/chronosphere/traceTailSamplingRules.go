// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package chronosphere

import (
	"context"
	"reflect"

	"github.com/chronosphereio/pulumi-chronosphere/sdk/go/chronosphere/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type TraceTailSamplingRules struct {
	pulumi.CustomResourceState

	DefaultSampleRate TraceTailSamplingRulesDefaultSampleRatePtrOutput `pulumi:"defaultSampleRate"`
	Rules             TraceTailSamplingRulesRuleArrayOutput            `pulumi:"rules"`
}

// NewTraceTailSamplingRules registers a new resource with the given unique name, arguments, and options.
func NewTraceTailSamplingRules(ctx *pulumi.Context,
	name string, args *TraceTailSamplingRulesArgs, opts ...pulumi.ResourceOption) (*TraceTailSamplingRules, error) {
	if args == nil {
		args = &TraceTailSamplingRulesArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TraceTailSamplingRules
	err := ctx.RegisterResource("chronosphere:index/traceTailSamplingRules:TraceTailSamplingRules", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTraceTailSamplingRules gets an existing TraceTailSamplingRules resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTraceTailSamplingRules(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TraceTailSamplingRulesState, opts ...pulumi.ResourceOption) (*TraceTailSamplingRules, error) {
	var resource TraceTailSamplingRules
	err := ctx.ReadResource("chronosphere:index/traceTailSamplingRules:TraceTailSamplingRules", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TraceTailSamplingRules resources.
type traceTailSamplingRulesState struct {
	DefaultSampleRate *TraceTailSamplingRulesDefaultSampleRate `pulumi:"defaultSampleRate"`
	Rules             []TraceTailSamplingRulesRule             `pulumi:"rules"`
}

type TraceTailSamplingRulesState struct {
	DefaultSampleRate TraceTailSamplingRulesDefaultSampleRatePtrInput
	Rules             TraceTailSamplingRulesRuleArrayInput
}

func (TraceTailSamplingRulesState) ElementType() reflect.Type {
	return reflect.TypeOf((*traceTailSamplingRulesState)(nil)).Elem()
}

type traceTailSamplingRulesArgs struct {
	DefaultSampleRate *TraceTailSamplingRulesDefaultSampleRate `pulumi:"defaultSampleRate"`
	Rules             []TraceTailSamplingRulesRule             `pulumi:"rules"`
}

// The set of arguments for constructing a TraceTailSamplingRules resource.
type TraceTailSamplingRulesArgs struct {
	DefaultSampleRate TraceTailSamplingRulesDefaultSampleRatePtrInput
	Rules             TraceTailSamplingRulesRuleArrayInput
}

func (TraceTailSamplingRulesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*traceTailSamplingRulesArgs)(nil)).Elem()
}

type TraceTailSamplingRulesInput interface {
	pulumi.Input

	ToTraceTailSamplingRulesOutput() TraceTailSamplingRulesOutput
	ToTraceTailSamplingRulesOutputWithContext(ctx context.Context) TraceTailSamplingRulesOutput
}

func (*TraceTailSamplingRules) ElementType() reflect.Type {
	return reflect.TypeOf((**TraceTailSamplingRules)(nil)).Elem()
}

func (i *TraceTailSamplingRules) ToTraceTailSamplingRulesOutput() TraceTailSamplingRulesOutput {
	return i.ToTraceTailSamplingRulesOutputWithContext(context.Background())
}

func (i *TraceTailSamplingRules) ToTraceTailSamplingRulesOutputWithContext(ctx context.Context) TraceTailSamplingRulesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TraceTailSamplingRulesOutput)
}

// TraceTailSamplingRulesArrayInput is an input type that accepts TraceTailSamplingRulesArray and TraceTailSamplingRulesArrayOutput values.
// You can construct a concrete instance of `TraceTailSamplingRulesArrayInput` via:
//
//	TraceTailSamplingRulesArray{ TraceTailSamplingRulesArgs{...} }
type TraceTailSamplingRulesArrayInput interface {
	pulumi.Input

	ToTraceTailSamplingRulesArrayOutput() TraceTailSamplingRulesArrayOutput
	ToTraceTailSamplingRulesArrayOutputWithContext(context.Context) TraceTailSamplingRulesArrayOutput
}

type TraceTailSamplingRulesArray []TraceTailSamplingRulesInput

func (TraceTailSamplingRulesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TraceTailSamplingRules)(nil)).Elem()
}

func (i TraceTailSamplingRulesArray) ToTraceTailSamplingRulesArrayOutput() TraceTailSamplingRulesArrayOutput {
	return i.ToTraceTailSamplingRulesArrayOutputWithContext(context.Background())
}

func (i TraceTailSamplingRulesArray) ToTraceTailSamplingRulesArrayOutputWithContext(ctx context.Context) TraceTailSamplingRulesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TraceTailSamplingRulesArrayOutput)
}

// TraceTailSamplingRulesMapInput is an input type that accepts TraceTailSamplingRulesMap and TraceTailSamplingRulesMapOutput values.
// You can construct a concrete instance of `TraceTailSamplingRulesMapInput` via:
//
//	TraceTailSamplingRulesMap{ "key": TraceTailSamplingRulesArgs{...} }
type TraceTailSamplingRulesMapInput interface {
	pulumi.Input

	ToTraceTailSamplingRulesMapOutput() TraceTailSamplingRulesMapOutput
	ToTraceTailSamplingRulesMapOutputWithContext(context.Context) TraceTailSamplingRulesMapOutput
}

type TraceTailSamplingRulesMap map[string]TraceTailSamplingRulesInput

func (TraceTailSamplingRulesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TraceTailSamplingRules)(nil)).Elem()
}

func (i TraceTailSamplingRulesMap) ToTraceTailSamplingRulesMapOutput() TraceTailSamplingRulesMapOutput {
	return i.ToTraceTailSamplingRulesMapOutputWithContext(context.Background())
}

func (i TraceTailSamplingRulesMap) ToTraceTailSamplingRulesMapOutputWithContext(ctx context.Context) TraceTailSamplingRulesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TraceTailSamplingRulesMapOutput)
}

type TraceTailSamplingRulesOutput struct{ *pulumi.OutputState }

func (TraceTailSamplingRulesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TraceTailSamplingRules)(nil)).Elem()
}

func (o TraceTailSamplingRulesOutput) ToTraceTailSamplingRulesOutput() TraceTailSamplingRulesOutput {
	return o
}

func (o TraceTailSamplingRulesOutput) ToTraceTailSamplingRulesOutputWithContext(ctx context.Context) TraceTailSamplingRulesOutput {
	return o
}

func (o TraceTailSamplingRulesOutput) DefaultSampleRate() TraceTailSamplingRulesDefaultSampleRatePtrOutput {
	return o.ApplyT(func(v *TraceTailSamplingRules) TraceTailSamplingRulesDefaultSampleRatePtrOutput {
		return v.DefaultSampleRate
	}).(TraceTailSamplingRulesDefaultSampleRatePtrOutput)
}

func (o TraceTailSamplingRulesOutput) Rules() TraceTailSamplingRulesRuleArrayOutput {
	return o.ApplyT(func(v *TraceTailSamplingRules) TraceTailSamplingRulesRuleArrayOutput { return v.Rules }).(TraceTailSamplingRulesRuleArrayOutput)
}

type TraceTailSamplingRulesArrayOutput struct{ *pulumi.OutputState }

func (TraceTailSamplingRulesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TraceTailSamplingRules)(nil)).Elem()
}

func (o TraceTailSamplingRulesArrayOutput) ToTraceTailSamplingRulesArrayOutput() TraceTailSamplingRulesArrayOutput {
	return o
}

func (o TraceTailSamplingRulesArrayOutput) ToTraceTailSamplingRulesArrayOutputWithContext(ctx context.Context) TraceTailSamplingRulesArrayOutput {
	return o
}

func (o TraceTailSamplingRulesArrayOutput) Index(i pulumi.IntInput) TraceTailSamplingRulesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TraceTailSamplingRules {
		return vs[0].([]*TraceTailSamplingRules)[vs[1].(int)]
	}).(TraceTailSamplingRulesOutput)
}

type TraceTailSamplingRulesMapOutput struct{ *pulumi.OutputState }

func (TraceTailSamplingRulesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TraceTailSamplingRules)(nil)).Elem()
}

func (o TraceTailSamplingRulesMapOutput) ToTraceTailSamplingRulesMapOutput() TraceTailSamplingRulesMapOutput {
	return o
}

func (o TraceTailSamplingRulesMapOutput) ToTraceTailSamplingRulesMapOutputWithContext(ctx context.Context) TraceTailSamplingRulesMapOutput {
	return o
}

func (o TraceTailSamplingRulesMapOutput) MapIndex(k pulumi.StringInput) TraceTailSamplingRulesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TraceTailSamplingRules {
		return vs[0].(map[string]*TraceTailSamplingRules)[vs[1].(string)]
	}).(TraceTailSamplingRulesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TraceTailSamplingRulesInput)(nil)).Elem(), &TraceTailSamplingRules{})
	pulumi.RegisterInputType(reflect.TypeOf((*TraceTailSamplingRulesArrayInput)(nil)).Elem(), TraceTailSamplingRulesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TraceTailSamplingRulesMapInput)(nil)).Elem(), TraceTailSamplingRulesMap{})
	pulumi.RegisterOutputType(TraceTailSamplingRulesOutput{})
	pulumi.RegisterOutputType(TraceTailSamplingRulesArrayOutput{})
	pulumi.RegisterOutputType(TraceTailSamplingRulesMapOutput{})
}
