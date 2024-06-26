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

type ClassicDashboard struct {
	pulumi.CustomResourceState

	BucketId      pulumi.StringPtrOutput `pulumi:"bucketId"`
	CollectionId  pulumi.StringPtrOutput `pulumi:"collectionId"`
	DashboardJson pulumi.StringOutput    `pulumi:"dashboardJson"`
}

// NewClassicDashboard registers a new resource with the given unique name, arguments, and options.
func NewClassicDashboard(ctx *pulumi.Context,
	name string, args *ClassicDashboardArgs, opts ...pulumi.ResourceOption) (*ClassicDashboard, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DashboardJson == nil {
		return nil, errors.New("invalid value for required argument 'DashboardJson'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ClassicDashboard
	err := ctx.RegisterResource("chronosphere:index/classicDashboard:ClassicDashboard", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClassicDashboard gets an existing ClassicDashboard resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClassicDashboard(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClassicDashboardState, opts ...pulumi.ResourceOption) (*ClassicDashboard, error) {
	var resource ClassicDashboard
	err := ctx.ReadResource("chronosphere:index/classicDashboard:ClassicDashboard", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClassicDashboard resources.
type classicDashboardState struct {
	BucketId      *string `pulumi:"bucketId"`
	CollectionId  *string `pulumi:"collectionId"`
	DashboardJson *string `pulumi:"dashboardJson"`
}

type ClassicDashboardState struct {
	BucketId      pulumi.StringPtrInput
	CollectionId  pulumi.StringPtrInput
	DashboardJson pulumi.StringPtrInput
}

func (ClassicDashboardState) ElementType() reflect.Type {
	return reflect.TypeOf((*classicDashboardState)(nil)).Elem()
}

type classicDashboardArgs struct {
	BucketId      *string `pulumi:"bucketId"`
	CollectionId  *string `pulumi:"collectionId"`
	DashboardJson string  `pulumi:"dashboardJson"`
}

// The set of arguments for constructing a ClassicDashboard resource.
type ClassicDashboardArgs struct {
	BucketId      pulumi.StringPtrInput
	CollectionId  pulumi.StringPtrInput
	DashboardJson pulumi.StringInput
}

func (ClassicDashboardArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*classicDashboardArgs)(nil)).Elem()
}

type ClassicDashboardInput interface {
	pulumi.Input

	ToClassicDashboardOutput() ClassicDashboardOutput
	ToClassicDashboardOutputWithContext(ctx context.Context) ClassicDashboardOutput
}

func (*ClassicDashboard) ElementType() reflect.Type {
	return reflect.TypeOf((**ClassicDashboard)(nil)).Elem()
}

func (i *ClassicDashboard) ToClassicDashboardOutput() ClassicDashboardOutput {
	return i.ToClassicDashboardOutputWithContext(context.Background())
}

func (i *ClassicDashboard) ToClassicDashboardOutputWithContext(ctx context.Context) ClassicDashboardOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClassicDashboardOutput)
}

// ClassicDashboardArrayInput is an input type that accepts ClassicDashboardArray and ClassicDashboardArrayOutput values.
// You can construct a concrete instance of `ClassicDashboardArrayInput` via:
//
//	ClassicDashboardArray{ ClassicDashboardArgs{...} }
type ClassicDashboardArrayInput interface {
	pulumi.Input

	ToClassicDashboardArrayOutput() ClassicDashboardArrayOutput
	ToClassicDashboardArrayOutputWithContext(context.Context) ClassicDashboardArrayOutput
}

type ClassicDashboardArray []ClassicDashboardInput

func (ClassicDashboardArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClassicDashboard)(nil)).Elem()
}

func (i ClassicDashboardArray) ToClassicDashboardArrayOutput() ClassicDashboardArrayOutput {
	return i.ToClassicDashboardArrayOutputWithContext(context.Background())
}

func (i ClassicDashboardArray) ToClassicDashboardArrayOutputWithContext(ctx context.Context) ClassicDashboardArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClassicDashboardArrayOutput)
}

// ClassicDashboardMapInput is an input type that accepts ClassicDashboardMap and ClassicDashboardMapOutput values.
// You can construct a concrete instance of `ClassicDashboardMapInput` via:
//
//	ClassicDashboardMap{ "key": ClassicDashboardArgs{...} }
type ClassicDashboardMapInput interface {
	pulumi.Input

	ToClassicDashboardMapOutput() ClassicDashboardMapOutput
	ToClassicDashboardMapOutputWithContext(context.Context) ClassicDashboardMapOutput
}

type ClassicDashboardMap map[string]ClassicDashboardInput

func (ClassicDashboardMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClassicDashboard)(nil)).Elem()
}

func (i ClassicDashboardMap) ToClassicDashboardMapOutput() ClassicDashboardMapOutput {
	return i.ToClassicDashboardMapOutputWithContext(context.Background())
}

func (i ClassicDashboardMap) ToClassicDashboardMapOutputWithContext(ctx context.Context) ClassicDashboardMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClassicDashboardMapOutput)
}

type ClassicDashboardOutput struct{ *pulumi.OutputState }

func (ClassicDashboardOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClassicDashboard)(nil)).Elem()
}

func (o ClassicDashboardOutput) ToClassicDashboardOutput() ClassicDashboardOutput {
	return o
}

func (o ClassicDashboardOutput) ToClassicDashboardOutputWithContext(ctx context.Context) ClassicDashboardOutput {
	return o
}

func (o ClassicDashboardOutput) BucketId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClassicDashboard) pulumi.StringPtrOutput { return v.BucketId }).(pulumi.StringPtrOutput)
}

func (o ClassicDashboardOutput) CollectionId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClassicDashboard) pulumi.StringPtrOutput { return v.CollectionId }).(pulumi.StringPtrOutput)
}

func (o ClassicDashboardOutput) DashboardJson() pulumi.StringOutput {
	return o.ApplyT(func(v *ClassicDashboard) pulumi.StringOutput { return v.DashboardJson }).(pulumi.StringOutput)
}

type ClassicDashboardArrayOutput struct{ *pulumi.OutputState }

func (ClassicDashboardArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClassicDashboard)(nil)).Elem()
}

func (o ClassicDashboardArrayOutput) ToClassicDashboardArrayOutput() ClassicDashboardArrayOutput {
	return o
}

func (o ClassicDashboardArrayOutput) ToClassicDashboardArrayOutputWithContext(ctx context.Context) ClassicDashboardArrayOutput {
	return o
}

func (o ClassicDashboardArrayOutput) Index(i pulumi.IntInput) ClassicDashboardOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClassicDashboard {
		return vs[0].([]*ClassicDashboard)[vs[1].(int)]
	}).(ClassicDashboardOutput)
}

type ClassicDashboardMapOutput struct{ *pulumi.OutputState }

func (ClassicDashboardMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClassicDashboard)(nil)).Elem()
}

func (o ClassicDashboardMapOutput) ToClassicDashboardMapOutput() ClassicDashboardMapOutput {
	return o
}

func (o ClassicDashboardMapOutput) ToClassicDashboardMapOutputWithContext(ctx context.Context) ClassicDashboardMapOutput {
	return o
}

func (o ClassicDashboardMapOutput) MapIndex(k pulumi.StringInput) ClassicDashboardOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClassicDashboard {
		return vs[0].(map[string]*ClassicDashboard)[vs[1].(string)]
	}).(ClassicDashboardOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClassicDashboardInput)(nil)).Elem(), &ClassicDashboard{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClassicDashboardArrayInput)(nil)).Elem(), ClassicDashboardArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClassicDashboardMapInput)(nil)).Elem(), ClassicDashboardMap{})
	pulumi.RegisterOutputType(ClassicDashboardOutput{})
	pulumi.RegisterOutputType(ClassicDashboardArrayOutput{})
	pulumi.RegisterOutputType(ClassicDashboardMapOutput{})
}
