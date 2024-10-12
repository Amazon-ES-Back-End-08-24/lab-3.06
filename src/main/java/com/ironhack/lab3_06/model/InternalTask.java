package com.ironhack.lab3_06.model;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.Date;

@Entity
// al ser single table no hace falta @Table(name = "internal_tasks")
@DiscriminatorValue("INTERNAL_TASK")
public class InternalTask extends Task {

    public InternalTask(int id, String title, Date dueDate, boolean status) {
        super(id, title, dueDate, status);
    }

    public InternalTask() {
    }
}
