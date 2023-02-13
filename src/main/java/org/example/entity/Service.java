package org.example.entity;

import jakarta.persistence.*;
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
    @Column(name = "name")
    String name;
//    @OneToMany
//    @JoinColumn(name = "rel_services_subjects_id", nullable = false)
//    List<ServiceSubject> serviceSubjectId;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    User user;
}
