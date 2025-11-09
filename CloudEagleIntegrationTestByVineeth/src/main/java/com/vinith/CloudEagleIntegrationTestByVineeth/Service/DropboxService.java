package com.vinith.CloudEagleIntegrationTestByVineeth.Service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@Service
public class DropboxService implements CommandLineRunner {

    private static final String TEAM_INFO_URL = "https://api.dropboxapi.com/2/team/members/list";

   
    private static final String ACCESS_TOKEN = "sl.u.AGFAuv96unqs4-S4JTVAfjOp6ZxwRs0G6_zZRvDSrdStZDL6V7c1bIQ639387OFZhhKnwrmcuu9tiUbEHkDyUfjNQXuAqPkfv-JuXSfJ_iTiQm5Ew3WIcmWa7yi_7JAYfPT5ZeI4q7Db-GXuMd6bLHThF2Eu6T2WNBy8qJNUop21pLfSd3DwGstOVoPCO22xLvC8PHh5BLusriL4uQ9FKSuHsWQ9J8NWkNFaGDlxUJ9f23sCq_v6WViUz6_k8n63FUwgFJmSQdY2eG97F3Ev2okW-si-7SOTjaopePCewr07_-JCDh4IBQDg3WetUY-jrBAAVkWnas0wQzEwCUdhmCUrWXApJPzo5oRbSsZm9rX1ll2lRybIKUdyE9tXnt32Pus5F_G_RDCeq9jvzEfblP77pW1qDangK6JnsryIpLAoa_lpXHr3alzmpEsYm9ViQd9XU9z5iris6SlNiATocCAv8M3YwRg70wHwzDvVc0RMtiDBskLBA3V4odWdvEmd8f9R4_omDqYGc306yqFCTek3e5c3_gUM_-sLwhO07aGCMDMo_5wLwiiQrksvjomn0IfAOIRKgVpk7dYntn-UmuzEdWJ1YLlj5lDW8T4sL6r-Fqe_3E8yDx0n4Xh7yvmeFTiWd0cEkra3XgIxafU4L4DmwV6VQPp7klerpN4U5C8chozN5a7lOUORVEhMZiAGU2D8RFpJsyZT6oEQE2ralaUlbDPPYTLXhVKvNAX09rryfz8gRNvwqah5UNBGxJ4ELlfEzqsCIjc0vrHAmMsPOCWhc6WfxhAfF04nHTNEHY7gODgx_jpshA5il-Q4FeMaIUEupnRPa7yDe3kqo-1CZ_pMhVHZxCdjJ2ceiMHgoWLCqoZE_swrY5xScZcXWYqX2AF7CbAIEcOESNklwY27rc683PpltGLCLHmDIyNQR1-QCMq1UBCqCiE9ikjSENaqJyZ41VB3SEOSgWFBfmqHdX63Yl5XddE9OlYhUT0SNCDRE96M-mSyB9jKs1jxu_weku74fZ8w0MKK5yG-DGWgm85QIzWd52Dxy3sVIekWcOdacEVwxWOcdxKf7_-6ZapnvXzUySeJHDJ97tpOoQPdohiPE65Yf5APuMZKa1iWGI6hsadJjMxvjOdpsyl6MFmg-Ng";
   
    public String getTeamInfo() {
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(TEAM_INFO_URL))
                    .header("Authorization", "Bearer " + ACCESS_TOKEN)
                    .POST(HttpRequest.BodyPublishers.noBody()) 
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

         
            System.out.println("Dropbox API Response: ");
            System.out.println(response.body());

            return response.body();

        } catch (Exception e) {
            e.printStackTrace();
            return "Error fetching team info: " + e.getMessage();
        }
    }

    
    @Override
    public void run(String... args) {
        System.out.println("Fetching Dropbox Team Info...");
        getTeamInfo();
    }
}
