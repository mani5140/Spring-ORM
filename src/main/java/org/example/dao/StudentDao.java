package org.example.dao;

import org.example.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class StudentDao {


    private HibernateTemplate hibernateTemplate;

    @Transactional
    public int insert(Student student){
        int result = (int) this.hibernateTemplate.save(student);
        return result;
    }

    public Student getStudent(int sid){
        Student student = this.hibernateTemplate.get(Student.class, sid);
        return student;
    }

    public List<Student> getAllStudents(){
        return this.hibernateTemplate.loadAll(Student.class);
    }

    @Transactional
    public void deleteStudent(int sid){
        Student student = this.hibernateTemplate.get(Student.class,sid);
        this.hibernateTemplate.delete(student);
    }

    @Transactional
    public void updateStudent(Student student){
        this.hibernateTemplate.update(student);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }


}
