package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.example.base.PersistentObject;


@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "subjects")
public class Subject  extends PersistentObject {
    // id название описание

    @Column(name = "Mathematics")
    String mathematics;
    @Column(name = "Physics")
    String physics;
    @Column(name = "Chemistry")
    String chemistry;
    @Column(name = "Biology")
    String biology;
    @Column(name = "History")
    String history;
    @Column(name = "Geography")
    String geography;
    @Column(name = "Economics")
    String economics;
    @Column(name = "Music")
    String music;
}