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
