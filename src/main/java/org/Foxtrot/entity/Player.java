package org.Foxtrot.entity;


import javax.persistence.*;

@Entity
@Table(name = "Player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "Id")
    private int Id;
    @Column(name = "player_name", length = 30)
    private String name;

    @Column(name ="surname", length = 30)
    private String surname;

    @Column(name = "nickname")
    private String nickname;

    @ManyToOne //denna kod gör relation mellan players och team dvs kopplar
    @JoinColumn(name = "team_id")
    private Team team;

    // Kod för lag
    @Entity
    @Table(name ="team")
    public class Team{
        @Id
        @GeneratedValue(strategy =GenerationType.IDENTITY)
        @Column(name = "team_namne")
        private String teamName;


    }

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(int id, String name) {
        Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
