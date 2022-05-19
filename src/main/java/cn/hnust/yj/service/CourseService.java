package cn.hnust.yj.service;

import cn.hnust.yj.pojo.Course;

import java.util.List;

public interface CourseService {
    Course findByID(int id);
    List<Course> findAllCourse();
    int updateByID(int id,int hours);
    int insertCourse(String name,int hours,int sid);
    List<Course> findAllCourseBySchool(int sid);
}
