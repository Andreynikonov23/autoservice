package ru.sapteh.Model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "Gender")

public class Gender {
    @Id
    @Column(name = "Code")
    private char code;
    @Column
    private String Name;

    @OneToMany(mappedBy = "gender")
    Set<Client> clients;

    @Override
    public String toString() {
        return "Gender{" +
                "code='" + code + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
