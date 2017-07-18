package cn.wj.pptshow.entity;

/**
 * Created by WangJing on 2017/4/1.
 */
public class Img {

    private Integer id;
    private String link;
    private Integer weight;
    private Integer hight;

    public Img(Integer id, String link, Integer weight, Integer hight) {
        this.id = id;
        this.link = link;
        this.weight = weight;
        this.hight = hight;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHight() {
        return hight;
    }

    public void setHight(Integer hight) {
        this.hight = hight;
    }
}
