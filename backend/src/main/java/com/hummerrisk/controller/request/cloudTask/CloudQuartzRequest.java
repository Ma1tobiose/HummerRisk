package com.hummerrisk.controller.request.cloudTask;


import com.hummerrisk.base.domain.CloudAccountQuartzTask;

import java.util.Map;

public class CloudQuartzRequest extends CloudAccountQuartzTask {

    private Map<String, Object> combine;

    public Map<String, Object> getCombine() {
        return combine;
    }

    public void setCombine(Map<String, Object> combine) {
        this.combine = combine;
    }
}