package cn.hnust.yj.service;

import cn.hnust.yj.mapper.CourseMapper;
import cn.hnust.yj.pojo.Course;

import java.util.List;

public class CourseServiceImpl implements CourseService{
    private CourseMapper courseMapper;
    @Override
    public Course findByID(int id) {
        return this.courseMapper.findByID(id);
    }

    @Override
    public List<Course> findAllCourse() {
        return this.courseMapper.findAllCourse();
    }
    @Override
    public int updateByID(int id,int hours){
        return this.courseMapper.updateByID(id,hours);
    }
    @Override
    public int insertCourse(String name, int hours, int sid){
        return this.courseMapper.insertCourse(name,hours,sid);
    }
    @Override
    public List<Course> findAllCourseBySchool(int sid){
        return this.courseMapper.findAllCourseBySchool(sid);
    }


}
