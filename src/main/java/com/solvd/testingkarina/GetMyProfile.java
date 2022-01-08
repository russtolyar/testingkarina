package com.solvd.testingkarina;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetMyProfile extends AbstractApiMethodV2 {

    public GetMyProfile() {
        super(null,"api.users/get/myprofile.json",
                "api.users/myprofile.properties");

        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));

    }
}