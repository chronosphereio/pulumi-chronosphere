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

type SLO struct {
	pulumi.CustomResourceState

	Annotations          pulumi.StringMapOutput `pulumi:"annotations"`
	CollectionId         pulumi.StringOutput    `pulumi:"collectionId"`
	Definition           SLODefinitionOutput    `pulumi:"definition"`
	Description          pulumi.StringPtrOutput `pulumi:"description"`
	Labels               pulumi.StringMapOutput `pulumi:"labels"`
	Name                 pulumi.StringOutput    `pulumi:"name"`
	NotificationPolicyId pulumi.StringPtrOutput `pulumi:"notificationPolicyId"`
	SignalGrouping       pulumi.StringPtrOutput `pulumi:"signalGrouping"`
	Sli                  SLOSliOutput           `pulumi:"sli"`
	Slug                 pulumi.StringOutput    `pulumi:"slug"`
}

// NewSLO registers a new resource with the given unique name, arguments, and options.
func NewSLO(ctx *pulumi.Context,
	name string, args *SLOArgs, opts ...pulumi.ResourceOption) (*SLO, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CollectionId == nil {
		return nil, errors.New("invalid value for required argument 'CollectionId'")
	}
	if args.Definition == nil {
		return nil, errors.New("invalid value for required argument 'Definition'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Sli == nil {
		return nil, errors.New("invalid value for required argument 'Sli'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SLO
	err := ctx.RegisterResource("chronosphere:index/sLO:SLO", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSLO gets an existing SLO resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSLO(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SLOState, opts ...pulumi.ResourceOption) (*SLO, error) {
	var resource SLO
	err := ctx.ReadResource("chronosphere:index/sLO:SLO", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SLO resources.
type sloState struct {
	Annotations          map[string]string `pulumi:"annotations"`
	CollectionId         *string           `pulumi:"collectionId"`
	Definition           *SLODefinition    `pulumi:"definition"`
	Description          *string           `pulumi:"description"`
	Labels               map[string]string `pulumi:"labels"`
	Name                 *string           `pulumi:"name"`
	NotificationPolicyId *string           `pulumi:"notificationPolicyId"`
	SignalGrouping       *string           `pulumi:"signalGrouping"`
	Sli                  *SLOSli           `pulumi:"sli"`
	Slug                 *string           `pulumi:"slug"`
}

type SLOState struct {
	Annotations          pulumi.StringMapInput
	CollectionId         pulumi.StringPtrInput
	Definition           SLODefinitionPtrInput
	Description          pulumi.StringPtrInput
	Labels               pulumi.StringMapInput
	Name                 pulumi.StringPtrInput
	NotificationPolicyId pulumi.StringPtrInput
	SignalGrouping       pulumi.StringPtrInput
	Sli                  SLOSliPtrInput
	Slug                 pulumi.StringPtrInput
}

func (SLOState) ElementType() reflect.Type {
	return reflect.TypeOf((*sloState)(nil)).Elem()
}

type sloArgs struct {
	Annotations          map[string]string `pulumi:"annotations"`
	CollectionId         string            `pulumi:"collectionId"`
	Definition           SLODefinition     `pulumi:"definition"`
	Description          *string           `pulumi:"description"`
	Labels               map[string]string `pulumi:"labels"`
	Name                 string            `pulumi:"name"`
	NotificationPolicyId *string           `pulumi:"notificationPolicyId"`
	SignalGrouping       *string           `pulumi:"signalGrouping"`
	Sli                  SLOSli            `pulumi:"sli"`
	Slug                 *string           `pulumi:"slug"`
}

// The set of arguments for constructing a SLO resource.
type SLOArgs struct {
	Annotations          pulumi.StringMapInput
	CollectionId         pulumi.StringInput
	Definition           SLODefinitionInput
	Description          pulumi.StringPtrInput
	Labels               pulumi.StringMapInput
	Name                 pulumi.StringInput
	NotificationPolicyId pulumi.StringPtrInput
	SignalGrouping       pulumi.StringPtrInput
	Sli                  SLOSliInput
	Slug                 pulumi.StringPtrInput
}

func (SLOArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sloArgs)(nil)).Elem()
}

type SLOInput interface {
	pulumi.Input

	ToSLOOutput() SLOOutput
	ToSLOOutputWithContext(ctx context.Context) SLOOutput
}

func (*SLO) ElementType() reflect.Type {
	return reflect.TypeOf((**SLO)(nil)).Elem()
}

func (i *SLO) ToSLOOutput() SLOOutput {
	return i.ToSLOOutputWithContext(context.Background())
}

func (i *SLO) ToSLOOutputWithContext(ctx context.Context) SLOOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SLOOutput)
}

// SLOArrayInput is an input type that accepts SLOArray and SLOArrayOutput values.
// You can construct a concrete instance of `SLOArrayInput` via:
//
//	SLOArray{ SLOArgs{...} }
type SLOArrayInput interface {
	pulumi.Input

	ToSLOArrayOutput() SLOArrayOutput
	ToSLOArrayOutputWithContext(context.Context) SLOArrayOutput
}

type SLOArray []SLOInput

func (SLOArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SLO)(nil)).Elem()
}

func (i SLOArray) ToSLOArrayOutput() SLOArrayOutput {
	return i.ToSLOArrayOutputWithContext(context.Background())
}

func (i SLOArray) ToSLOArrayOutputWithContext(ctx context.Context) SLOArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SLOArrayOutput)
}

// SLOMapInput is an input type that accepts SLOMap and SLOMapOutput values.
// You can construct a concrete instance of `SLOMapInput` via:
//
//	SLOMap{ "key": SLOArgs{...} }
type SLOMapInput interface {
	pulumi.Input

	ToSLOMapOutput() SLOMapOutput
	ToSLOMapOutputWithContext(context.Context) SLOMapOutput
}

type SLOMap map[string]SLOInput

func (SLOMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SLO)(nil)).Elem()
}

func (i SLOMap) ToSLOMapOutput() SLOMapOutput {
	return i.ToSLOMapOutputWithContext(context.Background())
}

func (i SLOMap) ToSLOMapOutputWithContext(ctx context.Context) SLOMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SLOMapOutput)
}

type SLOOutput struct{ *pulumi.OutputState }

func (SLOOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SLO)(nil)).Elem()
}

func (o SLOOutput) ToSLOOutput() SLOOutput {
	return o
}

func (o SLOOutput) ToSLOOutputWithContext(ctx context.Context) SLOOutput {
	return o
}

func (o SLOOutput) Annotations() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SLO) pulumi.StringMapOutput { return v.Annotations }).(pulumi.StringMapOutput)
}

func (o SLOOutput) CollectionId() pulumi.StringOutput {
	return o.ApplyT(func(v *SLO) pulumi.StringOutput { return v.CollectionId }).(pulumi.StringOutput)
}

func (o SLOOutput) Definition() SLODefinitionOutput {
	return o.ApplyT(func(v *SLO) SLODefinitionOutput { return v.Definition }).(SLODefinitionOutput)
}

func (o SLOOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SLO) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

func (o SLOOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SLO) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

func (o SLOOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SLO) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o SLOOutput) NotificationPolicyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SLO) pulumi.StringPtrOutput { return v.NotificationPolicyId }).(pulumi.StringPtrOutput)
}

func (o SLOOutput) SignalGrouping() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SLO) pulumi.StringPtrOutput { return v.SignalGrouping }).(pulumi.StringPtrOutput)
}

func (o SLOOutput) Sli() SLOSliOutput {
	return o.ApplyT(func(v *SLO) SLOSliOutput { return v.Sli }).(SLOSliOutput)
}

func (o SLOOutput) Slug() pulumi.StringOutput {
	return o.ApplyT(func(v *SLO) pulumi.StringOutput { return v.Slug }).(pulumi.StringOutput)
}

type SLOArrayOutput struct{ *pulumi.OutputState }

func (SLOArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SLO)(nil)).Elem()
}

func (o SLOArrayOutput) ToSLOArrayOutput() SLOArrayOutput {
	return o
}

func (o SLOArrayOutput) ToSLOArrayOutputWithContext(ctx context.Context) SLOArrayOutput {
	return o
}

func (o SLOArrayOutput) Index(i pulumi.IntInput) SLOOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SLO {
		return vs[0].([]*SLO)[vs[1].(int)]
	}).(SLOOutput)
}

type SLOMapOutput struct{ *pulumi.OutputState }

func (SLOMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SLO)(nil)).Elem()
}

func (o SLOMapOutput) ToSLOMapOutput() SLOMapOutput {
	return o
}

func (o SLOMapOutput) ToSLOMapOutputWithContext(ctx context.Context) SLOMapOutput {
	return o
}

func (o SLOMapOutput) MapIndex(k pulumi.StringInput) SLOOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SLO {
		return vs[0].(map[string]*SLO)[vs[1].(string)]
	}).(SLOOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SLOInput)(nil)).Elem(), &SLO{})
	pulumi.RegisterInputType(reflect.TypeOf((*SLOArrayInput)(nil)).Elem(), SLOArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SLOMapInput)(nil)).Elem(), SLOMap{})
	pulumi.RegisterOutputType(SLOOutput{})
	pulumi.RegisterOutputType(SLOArrayOutput{})
	pulumi.RegisterOutputType(SLOMapOutput{})
}