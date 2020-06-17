package ua.com.online.shop.dto;

import ua.com.online.shop.entity.ProductEntity;

import java.util.List;
import java.util.Objects;

public class ClientDto {
    private Integer id;
    private String name;
    private String surname;
    private Double balance;
    private List<ProductEntity> products;

    public ClientDto(String name, String surname, Double balance) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    protected ClientDto() {
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

        ClientDto clientDto = (ClientDto) o;

        return Objects.equals(id, clientDto.id) &&
                name.equals(clientDto.name) &&
                surname.equals(clientDto.surname) &&
                balance.equals(clientDto.balance) &&
                Objects.equals(products, clientDto.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, balance, products);
    }
}
