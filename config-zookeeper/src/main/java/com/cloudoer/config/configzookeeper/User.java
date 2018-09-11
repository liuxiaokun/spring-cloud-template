package com.cloudoer.config.configzookeeper;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author liuxiaokun
 * @version 0.0.1
 * @since 2018/9/11
 * when zookeeper node data changed, this can be change automatically.
 */
@ConfigurationProperties(prefix = "com.cloudoer")
@Component
public class User {

    private String name;

    private String note;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
