package com.solvd.testingkarina;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostNewRepository extends AbstractApiMethodV2 {

    public PostNewRepository() {
        super("api.users/post/rq.json",
                "api.users/post/rs.json",
                "api.users/createrepo.properties");

        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}