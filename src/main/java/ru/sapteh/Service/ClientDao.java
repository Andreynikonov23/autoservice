package ru.sapteh.Service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.sapteh.Dao.DAO;
import ru.sapteh.Model.Client;

import java.util.List;

public class ClientDao implements DAO<Client,Integer> {
    SessionFactory factory;


    @Override
    public Client read(Integer integer) {
        try (Session session = factory.openSession())
        return ;
    }

    @Override
    public List<Client> findByAll() {
        return null;
    }

    @Override
    public void create(Client client) {
        try(Session session = factory.openSession()) {
            session.beginTransaction();
            session.save(client);
            session.getTransaction().commit();
        }

    }

    @Override
    public void update(Client client) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.update(client);
            session.getTransaction().commit();
        }

    }

    @Override
    public void delete(Client client) {
        try (Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(client);
            session.getTransaction().commit();

        }

    }
}
