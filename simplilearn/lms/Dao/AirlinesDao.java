package orgg.simplilearn.lms.Dao;


import java.util.List;

import orgg.simplilearn.lms.entity.Airlines;


public interface AirlinesDao {
void insert(Airlines airlines);
void delete(Airlines airlines);
void update(Airlines airlines);
public List<Airlines> getAll();
}
