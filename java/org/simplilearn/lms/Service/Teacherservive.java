package org.simplilearn.lms.Service;


import org.simplilearn.lms.entity.Teacher;

public interface Teacherservive {
 void addTeacher(Teacher teacher);
 Teacher getTeacher(String Name);
 void deleteTeacher(Teacher teacher);
 void updateTeacher(Teacher teacher);
 
}
