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
