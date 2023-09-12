package com.education.wellington.Service;

import com.education.wellington.Entity.Profile;
import com.education.wellington.Repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    public Profile addProfile(Profile profile){
        return profileRepository.save(profile);
    }

    public List<Profile> getProfiles(){
        return profileRepository.findAll();
    }

    public Profile getProfileById(Long id){
        return profileRepository.findById(id).orElse(null);
    }

    public Profile updateProfile(Profile profile){
        profileRepository.findById(profile.getId()).orElse(null);
        return profileRepository.save(profile);
    }
}
