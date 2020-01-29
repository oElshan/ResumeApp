package isha.resume.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

// TODO: 18/09/2019 создать тип атрибуты lavel и type через enum
@Entity
@Table(name = "language")
public class Language implements Serializable {
    private long id;
    private String name;
    private String level;
    private String type;
    private  Profile profile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profile",nullable = false)
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Id
    @SequenceGenerator(name = "language_seq" ,sequenceName = "language_id_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "language_seq")
    @Column(name = "id",unique = true,nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Language language = (Language) o;
        return id == language.id &&
                Objects.equals(name, language.name) &&
                Objects.equals(level, language.level) &&
                Objects.equals(type, language.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level, type);
    }
}
