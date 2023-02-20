package org.simplilearn.lms.Service;

import java.util.List;


import org.simplilearn.lms.entity.Subject;

public interface Subjectservice {
void addsubject(Subject subject);
void deletesubject(Subject subject);
List<Subject> getsubjects();
void updatesubject(Subject subject);

}
