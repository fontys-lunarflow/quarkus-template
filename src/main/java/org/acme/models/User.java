package org.acme.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name="users")
public class User extends PanacheEntity {
    public String name;
}