package isha.resume.services.impl;

import isha.resume.entity.Profile;
import isha.resume.repository.ProfileRepository;
import isha.resume.services.FindProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class FindProfileServiceImp implements FindProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public Profile findProfileByEmail(String email) {
        return null;
    }

    @Override
    public Profile findProfileByUid(String uid) {
        return profileRepository.findProfileByUid(uid);
    }

    @Override
    public List<Profile> findAll() {
        List<Profile> profilesList = profileRepository.findAll();
        return profilesList;
    }

    @Override
    public Profile findProfileById(Long id) {
        return profileRepository.findAllById(id);
    }

}
