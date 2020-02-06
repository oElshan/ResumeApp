package isha.resume.util;

import isha.resume.dto.SignUpForm;
import org.apache.commons.lang.WordUtils;

import java.util.Random;

public class DataUtil {

    public static String normalizeName(String name) {
        return name.trim().toLowerCase();
    }

    public static String capitalizeName(String name) {
        return WordUtils.capitalize(normalizeName(name));
    }

    public static String generateProfileUid(SignUpForm profile) {
        return normalizeName(profile.getName()) + UID_DELIMETER + normalizeName(profile.getSecondName());
    }

    public static String regenerateUidWithRandomSuffix(String baseUid, String alphabet, int letterCount) {
        return baseUid + UID_DELIMETER + generateRandomSuffix(alphabet, letterCount);
    }

    public static String generateRandomSuffix(String alphabet, int letterCount) {
        Random r = new Random();
        StringBuilder uid = new StringBuilder();
        for (int i = 0; i < letterCount; i++) {
            uid.append(alphabet.charAt(r.nextInt(alphabet.length())));
        }
        return uid.toString();
    }

    private static final String UID_DELIMETER = "-";
}
