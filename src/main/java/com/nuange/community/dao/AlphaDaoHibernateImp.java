package com.nuange.community.dao;

import org.springframework.stereotype.Repository;

@Repository("AlphaDaoHibernate")
public class AlphaDaoHibernateImp implements AlphaDao {
    @Override
    public String select() {
        return "hibernate";
    }
}
