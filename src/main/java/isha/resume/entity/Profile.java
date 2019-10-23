package isha.resume.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

@Entity
public class Profile  implements Serializable {

    private long id;

    private String login;

    private String pasword;

    private String firstName;

    private String lastName;

    private String midleName;

    private String email;

    private short phone;

    private String uid;

    private String coutry;

    private String city;

    private String summary;

    private String objective;

    private String largePhoto;

    private String smallPhoto;

    private String info;

    private boolean comleted;

    private Time created;

    private String vkontakte;

    private String skype;

    private String facebook;

    private String github;

    private String stackoverflow;

    private Date birthDay;

    private List<Certificate> certificates;

    private List<Education> educations ;

    private List<Course> courses ;

    private List<Hobby> hobbies ;

    private List<Language> language ;

    private List<Practic> practics ;

    private List<Skill> skills ;

    @OneToMany(mappedBy = "profile",fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    @OneToMany(mappedBy = "profile",fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @OrderBy("beginYear DESC ,finishYaer DESC,id DESC ")
    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    @OneToMany(mappedBy = "profile",fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @OrderBy("finishDate desc ")
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @OneToMany(mappedBy = "profile",fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @OrderBy("name ASC ")
    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    @OneToMany(mappedBy = "profile",fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    public List<Language> getLanguage() {
        return language;
    }

    public void setLanguage(List<Language> language) {
        this.language = language;
    }

    @OneToMany(mappedBy = "profile",fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @OrderBy("finishDate DESC ")
    public List<Practic> getPractics() {
        return practics;
    }

    public void setPractics(List<Practic> practics) {
        this.practics = practics;
    }

    @OneToMany(mappedBy = "profile",fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @OrderBy("id ASC ")
    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    @Id
    @SequenceGenerator(name = "profile_seq" ,schema = "profile_id_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "profile_seq")
    @Column(name = "id",unique = true,nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "pasword")
    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "midle_name")
    public String getMidleName() {
        return midleName;
    }

    public void setMidleName(String midleName) {
        this.midleName = midleName;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone")
    public short getPhone() {
        return phone;
    }

    public void setPhone(short phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "uid")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "coutry")
    public String getCoutry() {
        return coutry;
    }

    public void setCoutry(String coutry) {
        this.coutry = coutry;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Basic
    @Column(name = "objective")
    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    @Basic
    @Column(name = "large_photo")
    public String getLargePhoto() {
        return largePhoto;
    }

    public void setLargePhoto(String largePhoto) {
        this.largePhoto = largePhoto;
    }

    @Basic
    @Column(name = "small_photo")
    public String getSmallPhoto() {
        return smallPhoto;
    }

    public void setSmallPhoto(String smallPhoto) {
        this.smallPhoto = smallPhoto;
    }

    @Basic
    @Column(name = "info")
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Basic
    @Column(name = "comleted")
    public boolean isComleted() {
        return comleted;
    }

    public void setComleted(boolean comleted) {
        this.comleted = comleted;
    }

    @Basic
    @Column(name = "created")
    public Time getCreated() {
        return created;
    }

    public void setCreated(Time created) {
        this.created = created;
    }

    @Basic
    @Column(name = "vkontakte")
    public String getVkontakte() {
        return vkontakte;
    }

    public void setVkontakte(String vkontakte) {
        this.vkontakte = vkontakte;
    }

    @Basic
    @Column(name = "skype")
    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    @Basic
    @Column(name = "facebook")
    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Basic
    @Column(name = "github")
    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    @Basic
    @Column(name = "stackoverflow")
    public String getStackoverflow() {
        return stackoverflow;
    }

    public void setStackoverflow(String stackoverflow) {
        this.stackoverflow = stackoverflow;
    }

    @Basic
    @Column(name = "birth_day")
    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return id == profile.id &&
                phone == profile.phone &&
                uid == profile.uid &&
                comleted == profile.comleted &&
                Objects.equals(login, profile.login) &&
                Objects.equals(pasword, profile.pasword) &&
                Objects.equals(firstName, profile.firstName) &&
                Objects.equals(lastName, profile.lastName) &&
                Objects.equals(midleName, profile.midleName) &&
                Objects.equals(email, profile.email) &&
                Objects.equals(coutry, profile.coutry) &&
                Objects.equals(city, profile.city) &&
                Objects.equals(summary, profile.summary) &&
                Objects.equals(objective, profile.objective) &&
                Objects.equals(largePhoto, profile.largePhoto) &&
                Objects.equals(smallPhoto, profile.smallPhoto) &&
                Objects.equals(info, profile.info) &&
                Objects.equals(created, profile.created) &&
                Objects.equals(vkontakte, profile.vkontakte) &&
                Objects.equals(skype, profile.skype) &&
                Objects.equals(facebook, profile.facebook) &&
                Objects.equals(github, profile.github) &&
                Objects.equals(stackoverflow, profile.stackoverflow) &&
                Objects.equals(birthDay, profile.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, pasword, firstName, lastName, midleName, email, phone, uid, coutry, city, summary, objective, largePhoto, smallPhoto, info, comleted, created, vkontakte, skype, facebook, github, stackoverflow, birthDay);
    }

}
