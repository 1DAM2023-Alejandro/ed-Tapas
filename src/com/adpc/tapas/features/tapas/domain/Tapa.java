package com.adpc.tapas.features.tapas.domain;


public class Tapa {

    private String id;
    private String name;
    private String establishment;
    private String score;
    private int vote;
    private int mediaVotes;
    private String participantId;
    private String ingredients;

    public Tapa(String id, String name, String establishment, String score, int vote, int mediaVotes, String participantId, String ingredients) {
        this.id = id;
        this.name = name;
        this.establishment = establishment;
        this.score = score;
        this.vote = vote;
        this.mediaVotes = mediaVotes;
        this.participantId = participantId;
        this.ingredients = ingredients;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEstablishment() {
        return establishment;
    }

    public void setEstablishment(String establishment) {
        this.establishment = establishment;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public int getMediaVotes() {
        return mediaVotes;
    }

    public void setMediaVotes(int mediaVotes) {
        this.mediaVotes = mediaVotes;
    }

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}