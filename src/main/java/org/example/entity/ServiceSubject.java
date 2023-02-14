package org.example.entity;

import javax.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.example.base.PersistentObject;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "rel_services_subjects")
public class ServiceSubject extends PersistentObject {
    @ManyToOne
    @JoinColumn(name = "service_id")
    Service service;
    @ManyToOne
    @JoinColumn(name = "subject_id")
    Subject subject;
}