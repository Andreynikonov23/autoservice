package ru.sapteh.Model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table (name = "client")


public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;

    @Column(name = "FirstName")
    @NonNull
    private String firstName;

    @Column(name = "LastName")
    @NonNull
    private String lastName;

    @Column(name = "Patronymic")
    @NonNull
    private String patronymic;

    @Column(name = "Birthday")
    @NonNull
    private Date birthday;

    @Column(name = "RegistrationDate")
    @NonNull
    private Date registrationDate;

    @Column(name = "Email")
    @NonNull
    private String email;

    @Column(name = "Phone")
    @NonNull
    private String phone;

    @Column(name = "PhotoPath")
    private String photoPath;

    @ManyToOne(fetch =FetchType.EAGER)
    @JoinColumn(name ="GenderCode")
    private Gender gender;


    @OneToMany(mappedBy = "client")
    Set<ClientService> clientServices;



    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday=" + birthday +
                ", registrationDate=" + registrationDate +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", photoPath='" + photoPath + '\'' +
                ", gender=" + gender +
                '}';
    }

}
