package com.solvd.testingkarina;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

import java.io.File;
import java.io.IOException;


public class PatchRepoTest {

    private static final Logger LOGGER = LogManager.getLogger(PatchRepoTest.class);

    @Test
    public void verifyPatchRepoTest() {

        PatchRepository patchRepository = new PatchRepository();

        File file = new File("src/test/resources/api.users/patch/rq.json");
        try {
            patchRepository.setBodyContent(Files.readFile(file));
        } catch (IOException e) {
            throw new RuntimeException("Cannot Update repo " + e);
        }

        patchRepository.expectResponseStatus(HttpResponseStatusType.OK_200);
        patchRepository.setHeaders("Authorization=token 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");

        patchRepository.callAPI();
        patchRepository.validateResponse(JSONCompareMode.LENIENT);
    }
}
