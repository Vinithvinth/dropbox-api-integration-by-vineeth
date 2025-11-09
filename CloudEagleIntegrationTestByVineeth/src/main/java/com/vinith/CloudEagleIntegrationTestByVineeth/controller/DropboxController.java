package com.vinith.CloudEagleIntegrationTestByVineeth.controller;

import com.vinith.CloudEagleIntegrationTestByVineeth.Service.DropboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dropbox")
public class DropboxController {

    @Autowired
    private DropboxService dropboxService;

    @GetMapping("/team-info")
    public String getTeamInfo() {
        // Call service and return its response
        return dropboxService.getTeamInfo();
    }
}
