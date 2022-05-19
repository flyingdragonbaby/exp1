package cn.hnust.yj.mapper;

import cn.hnust.yj.pojo.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper {
    Course findByID(int id);
    List<Course> findAllCourse();
    int updateByID(@Param("id") int id, @Param("hours") int hours);
    int insertCourse(@Param("name") String name,@Param("hours") int hours,@Param("sid") int sid);
    List<Course> findAllCourseBySchool(int sid);
}
