package com.solvd.testingkarina;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PatchRepository extends AbstractApiMethodV2 {

    public PatchRepository() {
        super("api.users/patch/rq.json",
                "api.users/patch/rs.json",
                "api.users/patchrepo.properties");

        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        replaceUrlPlaceholder("username", Configuration.getEnvArg("username"));
        replaceUrlPlaceholder("reponame", Configuration.getEnvArg("reponame"));
    }
}