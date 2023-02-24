package org.example.entity;

import javax.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.example.base.PersistentObject;

import java.util.List;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "services")
public class Service extends PersistentObject {
    @Column(name = "name", nullable = false)
    String name;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    User user;
}
