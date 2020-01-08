package com.imooc.luckymoney;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Luckymoney {

    @Id
    @GeneratedValue

    private Integer id;
    private BigDecimal money;
    private String producer; //发钱人
    private String consumer; //收钱人

    public Luckymoney() {
    }

    public Luckymoney(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public String getProducer() {
        return producer;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }
}
