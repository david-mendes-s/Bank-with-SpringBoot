package edu.projeto.bank.domain.model;
import jakarta.persistence.*;

@Entity(name = "tb_news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    
    private String icon;
    private String description;

    public String getId() {
        return id;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
