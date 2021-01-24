package com.example.dockerdemojdbc.model;

/**
 * @author huskyui
 */
public class User {
    private Integer id;
    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", count=" + count +
                '}';
    }
}
