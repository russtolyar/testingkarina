package com.solvd.testingkarina;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

 public class AutorisationTest {

    @Test
    public void verifyMyAccountTest() {
        GetMyProfile getMyProfile = new GetMyProfile();
        getMyProfile.setHeaders("Authorization=token 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");
        getMyProfile.expectResponseStatus(HttpResponseStatusType.OK_200);

        getMyProfile.callAPI();
        getMyProfile.validateResponse(JSONCompareMode.LENIENT);
    }
}
