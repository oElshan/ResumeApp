package isha.resume.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Education {
    private long id;
    private String summary;
    private int beginYear;
    private Integer finishYaer;
    private String university;
    private String faculty;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "begin_year")
    public int getBeginYear() {
        return beginYear;
    }

    public void setBeginYear(int beginYear) {
        this.beginYear = beginYear;
    }

    @Basic
    @Column(name = "finish_yaer")
    public Integer getFinishYaer() {
        return finishYaer;
    }

    public void setFinishYaer(Integer finishYaer) {
        this.finishYaer = finishYaer;
    }

    @Basic
    @Column(name = "university")
    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Basic
    @Column(name = "faculty")
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Education education = (Education) o;
        return id == education.id &&
                beginYear == education.beginYear &&
                Objects.equals(summary, education.summary) &&
                Objects.equals(finishYaer, education.finishYaer) &&
                Objects.equals(university, education.university) &&
                Objects.equals(faculty, education.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, summary, beginYear, finishYaer, university, faculty);
    }
}
