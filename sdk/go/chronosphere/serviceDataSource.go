// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package chronosphere

import (
	"context"
	"reflect"

	"github.com/chronosphereio/pulumi-chronosphere/sdk/go/chronosphere/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func ServiceDataSource(ctx *pulumi.Context, args *ServiceDataSourceArgs, opts ...pulumi.InvokeOption) (*ServiceDataSourceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv ServiceDataSourceResult
	err := ctx.Invoke("chronosphere:index/serviceDataSource:ServiceDataSource", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking ServiceDataSource.
type ServiceDataSourceArgs struct {
	Slug string `pulumi:"slug"`
}

// A collection of values returned by ServiceDataSource.
type ServiceDataSourceResult struct {
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	Slug string `pulumi:"slug"`
}

func ServiceDataSourceOutput(ctx *pulumi.Context, args ServiceDataSourceOutputArgs, opts ...pulumi.InvokeOption) ServiceDataSourceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (ServiceDataSourceResult, error) {
			args := v.(ServiceDataSourceArgs)
			r, err := ServiceDataSource(ctx, &args, opts...)
			var s ServiceDataSourceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(ServiceDataSourceResultOutput)
}

// A collection of arguments for invoking ServiceDataSource.
type ServiceDataSourceOutputArgs struct {
	Slug pulumi.StringInput `pulumi:"slug"`
}

func (ServiceDataSourceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ServiceDataSourceArgs)(nil)).Elem()
}

// A collection of values returned by ServiceDataSource.
type ServiceDataSourceResultOutput struct{ *pulumi.OutputState }

func (ServiceDataSourceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ServiceDataSourceResult)(nil)).Elem()
}

func (o ServiceDataSourceResultOutput) ToServiceDataSourceResultOutput() ServiceDataSourceResultOutput {
	return o
}

func (o ServiceDataSourceResultOutput) ToServiceDataSourceResultOutputWithContext(ctx context.Context) ServiceDataSourceResultOutput {
	return o
}

func (o ServiceDataSourceResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v ServiceDataSourceResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o ServiceDataSourceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v ServiceDataSourceResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o ServiceDataSourceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v ServiceDataSourceResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o ServiceDataSourceResultOutput) Slug() pulumi.StringOutput {
	return o.ApplyT(func(v ServiceDataSourceResult) string { return v.Slug }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(ServiceDataSourceResultOutput{})
}
