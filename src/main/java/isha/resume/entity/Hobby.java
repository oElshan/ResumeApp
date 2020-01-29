package isha.resume.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "hobby")
public class Hobby implements Serializable {
    private long id;
    private String name;
    private Profile profile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profile",nullable = false)
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    // TODO: 18/09/2019 добавить @Transient поле selected boolean для отображения выбранных хобби
    // TODO: 18/09/2019 добавить Comparable интерфейс
    @Id
    @SequenceGenerator(name = "hobby_seq" ,sequenceName = "hobby_id_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "hobby_seq")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hobby hobby = (Hobby) o;
        return id == hobby.id &&
                Objects.equals(name, hobby.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
