package isha.resume.services;


import isha.resume.entity.Profile;
import org.springframework.stereotype.Service;

@Service
public class NameService {

    public String getNameUid(Profile profile) {

        String uid =profile.getFirstName().toLowerCase()+"-"+profile.getLastName().toLowerCase();

        return uid;
    }

}
