package com.solvd.testingkarina;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetUserMethod extends AbstractApiMethodV2 {

    public GetUserMethod() {
        super(null,"api.users/get/rs.json",
                "api.users/user.properties");

        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));

    }
}
