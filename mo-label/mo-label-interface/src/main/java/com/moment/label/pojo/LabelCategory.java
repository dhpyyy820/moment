package com.moment.label.pojo;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name="label_category")
public class LabelCategory{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String level;
    
    private String type;
    
    private String name;
    
    private String description;
    
    private Long parent;
    
    private Date insertime;
    
    public Long getId() {
       return id;
    }
    
    public void setId(Long id) {
       this.id = id;
    }

    public String getLevel() {
       return level;
    }
    
    public void setLevel(String level) {
       this.level = level;
    }

    public String getType() {
       return type;
    }
    
    public void setType(String type) {
       this.type = type;
    }

    public String getName() {
       return name;
    }
    
    public void setName(String name) {
       this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getParent() {
       return parent;
    }
    
    public void setParent(Long parent) {
       this.parent = parent;
    }

    public Date getInsertime() {
       return insertime;
    }
    
    public void setInsertime(Date insertime) {
       this.insertime = insertime;
    }

}
