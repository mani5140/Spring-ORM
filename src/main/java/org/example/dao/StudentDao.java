package org.example.dao;

import org.example.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDao {
    private HibernateTemplate hibernateTemplate;
    public int insert(Student student){
        int result = (int) this.hibernateTemplate.save(student);
        return result;
    }
}
