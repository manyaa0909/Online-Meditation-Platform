package com.example.meditation;

public class medi {
    private int id; // Unique identifier for the session
    private int userId; // User who participated in the session
    private String sessionType; // Type of meditation (e.g., "Guided", "Deep Breathing")
    private double duration; // Duration of the session in minutes
    private String notes; // Optional notes about the session (user feedback or comments)

    // Constructor with required fields
    public medi(int userId, String sessionType, double duration) {
        this.userId = userId;
        this.sessionType = sessionType;
        this.duration = duration;
    }

    // Getters and setters for the fields
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "MeditationSession{" +
               "id=" + id +
               ", userId=" + userId +
               ", sessionType='" + sessionType + '\'' +
               ", duration=" + duration +
               ", notes='" + notes + '\'' +
               '}';
    }
}
