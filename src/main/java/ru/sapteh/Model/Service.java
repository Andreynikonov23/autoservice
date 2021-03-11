package ru.sapteh.Model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "Service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idService;

    @Column
    private  String title;

    @Column
    private double cost;

    @Column
    private int durationInSeconds;

    @Column
    private String description;

    @Column
    private double discount;

    @OneToMany(mappedBy = "service")
    Set<ClientService> setClient;

    @Override
    public String toString() {
        return "Service{" +
                "idService=" + idService +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                ", durationInSeconds=" + durationInSeconds +
                ", description='" + description + '\'' +
                ", discount=" + discount +
                '}';
    }
}
