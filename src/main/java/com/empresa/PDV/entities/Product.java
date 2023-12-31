package com.empresa.PDV.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;


@Entity
@Table(name = "tb_produto")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer qtd;
    private Double price;
    private Date lastSale;

    public Product() {
    }

    public Product(Long id, String name, Integer qtd, Double price, Date lastSale) {
        this.id = id;
        this.name = name;
        this.qtd = qtd;
        this.price = price;
        this.lastSale = lastSale;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getLastSale() {
        return lastSale;
    }

    public void setLastSale(Date lastSale) {
        this.lastSale = lastSale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
