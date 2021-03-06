package io.quarkuscoffeeshop.homeoffice.viewmodels;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkuscoffeeshop.homeoffice.domain.Item;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name="ItemSales")
public class ItemSales extends PanacheEntity {

    @Enumerated(EnumType.STRING)
    public Item item;

    public long salesTotal;

    public Instant date;

    public BigDecimal revenue;

    public ItemSales(){

    }

    public ItemSales(Item item, long salesTotal, BigDecimal revenue){
        this.item = item;
        this.salesTotal = salesTotal;
        this.revenue = revenue;
    }

    public ItemSales(Item item, long salesTotal, BigDecimal revenue, Instant date){
        this.item = item;
        this.salesTotal = salesTotal;
        this.date = date;
        this.revenue = revenue;
    }
}
