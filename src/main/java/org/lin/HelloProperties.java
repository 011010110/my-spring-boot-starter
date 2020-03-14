package org.lin;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description TODO
 * @Author li.linhua
 * @Date 2019/12/29
 * @Version 1.0
 */
@ConfigurationProperties(prefix = "org.jiang.hello")
public class HelloProperties {

    private String name;
    private String value;
    private String test;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "HelloProperties{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", test='" + test + '\'' +
                '}';
    }
}
