package edu.projeto.bank.domain.model;

import java.util.List;

import jakarta.persistence.*;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> feature;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    public List<Feature> getFeature() {
        return feature;
    }
    public void setFeature(List<Feature> feature) {
        this.feature = feature;
    }
    public List<News> getNews() {
        return news;
    }
    public void setNews(List<News> news) {
        this.news = news;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }
  
}
