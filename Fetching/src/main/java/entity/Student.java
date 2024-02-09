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

    @OneToMany(mappedBy = "student",fetch = FetchType.EAGER)
    private List<Laptop> laptops;
}
