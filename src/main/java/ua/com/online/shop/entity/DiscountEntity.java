package ua.com.online.shop.entity;

import javax.persistence.*;

@Entity
@Table(name = "discounts")
public class DiscountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "discount_id")
    private Integer id;

    @Column(name = "discount_value")
    private float value;

    @OneToOne(mappedBy = "discount")
    private ProductEntity product;
}
