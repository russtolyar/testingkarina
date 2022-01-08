package com.solvd.testingkarina;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class DeleteRepository extends AbstractApiMethodV2 {

    public DeleteRepository() {
        super(null,null,"api.users/deleterepo.properties");

        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        replaceUrlPlaceholder("username", Configuration.getEnvArg("username"));
        replaceUrlPlaceholder("reponame2", Configuration.getEnvArg("reponame2"));
    }
}
