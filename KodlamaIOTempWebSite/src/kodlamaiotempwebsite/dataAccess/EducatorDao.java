package kodlamaiotempwebsite.dataAccess;

import kodlamaiotempwebsite.entities.Educator;

public interface EducatorDao {
    public void add(Educator educator);
    public void delete(Educator educator);
    public void update(Educator educator);
}
