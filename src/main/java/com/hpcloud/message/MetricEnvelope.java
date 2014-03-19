package com.hpcloud.message;

import com.google.common.base.Preconditions;

import java.util.Map;

public class MetricEnvelope {
    public MetricMessage metric;
    public Map<String, Object> meta;

    protected MetricEnvelope() {
    }

    public MetricEnvelope(MetricMessage metric) {
        Preconditions.checkNotNull(metric, "metric");
        this.metric = metric;
    }

    public MetricEnvelope(MetricMessage metric, Map<String, Object> meta) {
        Preconditions.checkNotNull(metric, "metric");
        Preconditions.checkNotNull(meta, "meta");
        this.metric = metric;
        this.meta = meta;
    }

    @Override
    public String toString() {
        return "MetricEnvelope{" +
                "metric=" + metric +
                ", meta=" + meta +
                '}';
    }
}