package com.gcom.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "task")
public class Task implements Serializable {
    private Integer idtask;
    private Project project;
    private String name;
    private Set<Usertimesheetline> usertimesheetlines = new HashSet(0);

    public Task() {
    }

    public Task(Project project) {
        this.project = project;
    }

    public Task(Project project, String name, Set<Usertimesheetline> usertimesheetlines) {
        this.project = project;
        this.name = name;
        this.usertimesheetlines = usertimesheetlines;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtask", unique = true, nullable = false)
    public Integer getIdtask() {
        return this.idtask;
    }

    public void setIdtask(Integer idtask) {
        this.idtask = idtask;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_idproject", nullable = false)
    public Project getProject() {
        return this.project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Column(name = "name", length = 999)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "task")
    public Set<Usertimesheetline> getUsertimesheetlines() {
        return this.usertimesheetlines;
    }

    public void setUsertimesheetlines(Set<Usertimesheetline> usertimesheetlines) {
        this.usertimesheetlines = usertimesheetlines;
    }
}
