package com.portfolio.model;

public class Experience {
    private String role;
    private String company;
    private String duration;
    private String description;
    private String certificateUrl;

    public Experience() {}

    public Experience(String role, String company, String duration, String description, String certificateUrl) {
        this.role = role;
        this.company = company;
        this.duration = duration;
        this.description = description;
        this.certificateUrl = certificateUrl;
    }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getCertificateUrl() { return certificateUrl; }
    public void setCertificateUrl(String certificateUrl) { this.certificateUrl = certificateUrl; }
}
