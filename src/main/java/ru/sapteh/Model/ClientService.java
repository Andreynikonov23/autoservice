package ru.sapteh.Model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ClienService")
public class ClientService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClientService;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client")

    private Client client;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "service")
    private Service service;

    @Column
    @NonNull
    private String startTime;

    @Column
    private String comment;


    @Override
    public String toString() {
        return "ClientService{" +
                "idClientService=" + idClientService +
                ", client=" + client +
                ", service=" + service +
                ", startTime='" + startTime + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
