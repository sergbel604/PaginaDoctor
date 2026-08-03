package com.portfolio.model;

import java.util.List;

public class Person {
    private String name;
    private String title;
    private String about;
    private String email;
    private String github;
    private String linkedin;
    private List<Skill> skills;
    private List<Experience> experiences;
    private List<Project> projects;

    public Person() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAbout() { return about; }
    public void setAbout(String about) { this.about = about; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getGithub() { return github; }
    public void setGithub(String github) { this.github = github; }

    public String getLinkedin() { return linkedin; }
    public void setLinkedin(String linkedin) { this.linkedin = linkedin; }

    public List<Skill> getSkills() { return skills; }
    public void setSkills(List<Skill> skills) { this.skills = skills; }

    public List<Experience> getExperiences() { return experiences; }
    public void setExperiences(List<Experience> experiences) { this.experiences = experiences; }

    public List<Project> getProjects() { return projects; }
    public void setProjects(List<Project> projects) { this.projects = projects; }
}
