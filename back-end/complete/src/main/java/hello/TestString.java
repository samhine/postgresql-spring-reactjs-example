package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TestString {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String tStr;

    protected TestString() {}

    public TestString(String str) {
        this.tStr = str;
    }

    public String getStr() {
        return this.tStr;
    }

    public void setStr(String tStr) {
        this.tStr = tStr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
