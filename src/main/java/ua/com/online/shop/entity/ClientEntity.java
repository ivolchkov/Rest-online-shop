package ua.com.online.shop.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "clients")
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Integer id;

    @Column(name = "client_name", nullable = false, length = 45)
    private String name;

    @Column(name = "client_surname", nullable = false, length = 45)
    private String surname;

    @Column(name = "client_balance")
    private Double balance;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductEntity> products;

    protected ClientEntity() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Double getBalance() {
        return balance;
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ClientEntity that = (ClientEntity) o;

        return Objects.equals(id, that.id) &&
                name.equals(that.name) &&
                surname.equals(that.surname) &&
                balance.equals(that.balance) &&
                Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, balance);
    }
}
