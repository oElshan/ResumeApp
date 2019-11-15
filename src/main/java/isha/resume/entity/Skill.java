package isha.resume.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Skill  {
    private long id;
    private String value;
    private Profile profile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profile",nullable = false)
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Id
    @SequenceGenerator(name = "skill_seq" ,sequenceName = "skill_id_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "skill_seq")
    @Column(name = "id",unique = true,nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return id == skill.id &&
                Objects.equals(value, skill.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }
}
