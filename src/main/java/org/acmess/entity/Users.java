package org.acmess.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "users")
public class Users extends PanacheEntity {
    public String email;
    public boolean status;
    public Instant created_at;
}
