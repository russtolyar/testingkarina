package com.solvd.testingkarina;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class UserTest {

    @Test
    public void verifyUserGetTest () {
        GetUserMethod getUserMethod = new GetUserMethod();
        getUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getUserMethod.callAPI();
        getUserMethod.validateResponse(JSONCompareMode.LENIENT);
    }
}
