/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.apimgt.gateway.cli.model.rest.policy;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.wso2.apimgt.gateway.cli.hashing.Hash;

/**
 * Data mapper for WSO2 APIM application throttle policy.
 */
public class ApplicationThrottlePolicyDTO extends ThrottlePolicyDTO {

    private ThrottleLimitDTO defaultLimit = null;

    @Hash
    @JsonProperty("defaultLimit")
    public ThrottleLimitDTO getDefaultLimit() {
        return defaultLimit;
    }

    public void setDefaultLimit(ThrottleLimitDTO defaultLimit) {
        this.defaultLimit = defaultLimit;
    }

}
