package isha.resume.services;

import isha.resume.entity.Profile;
import isha.resume.entity.Skill;

import java.util.List;
import java.util.Optional;

public interface FindProfileService {

    public List<Profile> findAll();

    public Profile findProfileByEmail(String email);

    public Profile findProfileByUid(String uid);

    public Profile findProfileById(Long id);




}
