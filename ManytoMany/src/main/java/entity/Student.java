package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    @Id
    private int id;
    private String name;
    private String address;

//    ManyToMany relation
    @ManyToMany
    private List<Laptop> laptop;
}
