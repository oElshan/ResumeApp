package isha.resume.repository;


import isha.resume.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

    Profile findProfileByFirstName(String name);
    Profile findProfileByUid(String name);
    Profile findAllById(Long id);
}
