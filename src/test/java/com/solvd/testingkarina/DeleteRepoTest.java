package com.solvd.testingkarina;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class DeleteRepoTest {

    @Test
    public void verifyDeleteRepoTest() {
        DeleteRepository deleteRepository = new DeleteRepository();
        deleteRepository.setHeaders("Authorization=token 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");
        deleteRepository.expectResponseStatus(HttpResponseStatusType.NO_CONTENT_204);
        deleteRepository.callAPI();
    }
}
