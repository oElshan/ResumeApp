package isha.resume.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

// TODO: 18/09/2019  нужны дополнительные поля @Transient для обоработки форм при считывания данных из  страницы

@Entity
public class Practic   {
    private long id;
    private String position;
    private String company;
    private Date beginDate;
    private Date finishDate;
    private String respontibilities;
    private String demo;
    private String src;
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
    @SequenceGenerator(name = "practic_seq" ,schema = "practic_id_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "practic_seq")
    @Column(name = "id",unique = true,nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "company")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name = "begin_date")
    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    @Basic
    @Column(name = "finish_date")
    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    @Basic
    @Column(name = "respontibilities")
    public String getRespontibilities() {
        return respontibilities;
    }

    public void setRespontibilities(String respontibilities) {
        this.respontibilities = respontibilities;
    }

    @Basic
    @Column(name = "demo")
    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    @Basic
    @Column(name = "src")
    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Practic practic = (Practic) o;
        return id == practic.id &&
                Objects.equals(position, practic.position) &&
                Objects.equals(company, practic.company) &&
                Objects.equals(beginDate, practic.beginDate) &&
                Objects.equals(finishDate, practic.finishDate) &&
                Objects.equals(respontibilities, practic.respontibilities) &&
                Objects.equals(demo, practic.demo) &&
                Objects.equals(src, practic.src);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, position, company, beginDate, finishDate, respontibilities, demo, src);
    }
}
