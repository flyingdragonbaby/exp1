import cn.hnust.yj.mapper.CourseMapper;
import cn.hnust.yj.pojo.Course;
import cn.hnust.yj.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class CourseTest {
    @Test
    public void courseFindByIdTest() {
/*        //读取文件名
        String resources = "mybatis-config.xml";*/
        //利用MyBatisUtils.getSession()方法创建SqlSession实例
        SqlSession session = MyBatisUtils.getSession();
        //调用SqlSession.getMapper()方法，mybatis官方推荐通过mapper对象访问mybatis
        CourseMapper courseMapper = session.getMapper(CourseMapper.class);

        //传入参数查询，返回结果
        //子任务一
        System.out.println("任务一：查询 id=2 的课程信息");
        Course course1 = courseMapper.findByID(2);
        System.out.println(course1);

        //子任务二
        System.out.println("\n任务二：查询出所有计算机学院开设的课程信息");
        List<Course> courses = courseMapper.findAllCourse();
        for (Course course :courses){
            System.out.println(course);
        }

        //子任务三
        System.out.println("\n任务三：将 id=4 这门课程的课时数修改为 32+8=40");
        int course3 = courseMapper.updateByID(4,40);
        if (course3 > 0){
            session.commit();
        }
        course1 = courseMapper.findByID(4);
        System.out.println(course1);

        //子任务四
        System.out.println("\n任务四：插入一条新的课程记录： names=”大数据存储“，hours=32，schools =1");
        course3 = courseMapper.insertCourse("大数据存储",32,1);
        if (course3 > 0){
            session.commit();
        }
        courses = courseMapper.findAllCourse();
        for (Course course :courses){
            System.out.println(course);
        }

        //子任务五
        System.out.println("\n任务五：输出所有的学院开设的课程信息");
        System.out.println("\n计算机学院：");
        courses = courseMapper.findAllCourseBySchool(1);
        for (Course course :courses){
            System.out.println(course);
        }
        System.out.println("\n外国语学院：");
        List<Course> courses1 = courseMapper.findAllCourseBySchool(2);
        for (Course course :courses1){
            System.out.println(course);
        }

        //关闭session
        session.close();
    }
}

