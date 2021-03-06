package isha.resume.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "profile_restore", schema = "public", catalog = "resume")
public class ProfileRestore {
    private long id;
    private String token;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "token")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfileRestore that = (ProfileRestore) o;
        return id == that.id &&
                Objects.equals(token, that.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, token);
    }
}
