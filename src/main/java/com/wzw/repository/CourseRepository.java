package com.wzw.repository;

import com.wzw.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wei
 * @Date 2021/6/22
 */
@Repository
public class CourseRepository {

    private Map<Integer, Course> courseMap;

    public CourseRepository() {
        this.courseMap = new HashMap<>();
        courseMap.put(1, new Course(1, "Java基础", Double.parseDouble("500")));
        courseMap.put(2, new Course(2, "Java⾼级", Double.parseDouble("600")));
        courseMap.put(3, new Course(3, "企业级框架", Double.parseDouble("700")));
    }

    public Collection<Course> findAll() {
        return courseMap.values();
    }

    public Course findById(Integer id) {
        return courseMap.get(id);
    }

    public void saveOrUpdate(Course course) {
        courseMap.put(course.getId(), course);
    }

    public void deleteById(Integer id) {
        courseMap.remove(id);
    }
}
