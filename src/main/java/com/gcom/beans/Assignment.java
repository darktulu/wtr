package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "e_assignment")
public class Assignment implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Users user;
    private Date startDay;
    private Date endDay;
    private Project project;

    public Assignment() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "start_day", nullable = false, length = 10)
    public Date getStartDay() {
        return this.startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "end_day", nullable = false, length = 10)
    public Date getEndDay() {
        return this.endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "username", nullable = false)
    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", nullable = false)
    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
