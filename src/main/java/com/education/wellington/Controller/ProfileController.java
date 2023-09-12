package com.education.wellington.Controller;

import com.education.wellington.Entity.Profile;
import com.education.wellington.Service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @Autowired
    private ProfileService profileService;
    @PostMapping("/addProfile")
    public Profile addProfile(@RequestBody Profile profile){
        return profileService.addProfile(profile);
    }

    @PutMapping("/updateProfile")
    public Profile updateProfile(Profile profile){
        return profileService.updateProfile(profile);
    }
}
