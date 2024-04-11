# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .blackhole_alert_notifier import *
from .bucket import *
from .bucket_data_source import *
from .classic_dashboard import *
from .collection import *
from .dashboard import *
from .derived_label import *
from .derived_metric import *
from .drop_rule import *
from .email_alert_notifier import *
from .gcp_metrics_integration import *
from .grafana_dashboard import *
from .mapping_rule import *
from .monitor import *
from .notification_policy import *
from .notification_policy_data_source import *
from .opsgenie_alert_notifier import *
from .pagerduty_alert_notifier import *
from .provider import *
from .recording_rule import *
from .resource_pools_config import *
from .rollup_rule import *
from .service_account import *
from .service_data_source import *
from .slack_alert_notifier import *
from .team import *
from .trace_jaeger_remote_sampling_strategy import *
from .trace_metrics_rule import *
from .trace_tail_sampling_rules import *
from .victorops_alert_notifier import *
from .webhook_alert_notifier import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import chronosphereio_chronosphere.config as __config
    config = __config
else:
    config = _utilities.lazy_import('chronosphereio_chronosphere.config')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "chronosphere",
  "mod": "index/blackholeAlertNotifier",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/blackholeAlertNotifier:BlackholeAlertNotifier": "BlackholeAlertNotifier"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/bucket",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/bucket:Bucket": "Bucket"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/classicDashboard",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/classicDashboard:ClassicDashboard": "ClassicDashboard"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/collection",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/collection:Collection": "Collection"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/dashboard",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/dashboard:Dashboard": "Dashboard"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/derivedLabel",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/derivedLabel:DerivedLabel": "DerivedLabel"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/derivedMetric",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/derivedMetric:DerivedMetric": "DerivedMetric"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/dropRule",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/dropRule:DropRule": "DropRule"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/emailAlertNotifier",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/emailAlertNotifier:EmailAlertNotifier": "EmailAlertNotifier"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/gcpMetricsIntegration",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/gcpMetricsIntegration:GcpMetricsIntegration": "GcpMetricsIntegration"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/grafanaDashboard",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/grafanaDashboard:GrafanaDashboard": "GrafanaDashboard"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/mappingRule",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/mappingRule:MappingRule": "MappingRule"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/monitor",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/monitor:Monitor": "Monitor"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/notificationPolicy",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/notificationPolicy:NotificationPolicy": "NotificationPolicy"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/opsgenieAlertNotifier",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/opsgenieAlertNotifier:OpsgenieAlertNotifier": "OpsgenieAlertNotifier"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/pagerdutyAlertNotifier",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/pagerdutyAlertNotifier:PagerdutyAlertNotifier": "PagerdutyAlertNotifier"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/recordingRule",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/recordingRule:RecordingRule": "RecordingRule"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/resourcePoolsConfig",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/resourcePoolsConfig:ResourcePoolsConfig": "ResourcePoolsConfig"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/rollupRule",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/rollupRule:RollupRule": "RollupRule"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/serviceAccount",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/serviceAccount:ServiceAccount": "ServiceAccount"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/slackAlertNotifier",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/slackAlertNotifier:SlackAlertNotifier": "SlackAlertNotifier"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/team",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/team:Team": "Team"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/traceJaegerRemoteSamplingStrategy",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/traceJaegerRemoteSamplingStrategy:TraceJaegerRemoteSamplingStrategy": "TraceJaegerRemoteSamplingStrategy"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/traceMetricsRule",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/traceMetricsRule:TraceMetricsRule": "TraceMetricsRule"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/traceTailSamplingRules",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/traceTailSamplingRules:TraceTailSamplingRules": "TraceTailSamplingRules"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/victoropsAlertNotifier",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/victoropsAlertNotifier:VictoropsAlertNotifier": "VictoropsAlertNotifier"
  }
 },
 {
  "pkg": "chronosphere",
  "mod": "index/webhookAlertNotifier",
  "fqn": "chronosphereio_chronosphere",
  "classes": {
   "chronosphere:index/webhookAlertNotifier:WebhookAlertNotifier": "WebhookAlertNotifier"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "chronosphere",
  "token": "pulumi:providers:chronosphere",
  "fqn": "chronosphereio_chronosphere",
  "class": "Provider"
 }
]
"""
)
