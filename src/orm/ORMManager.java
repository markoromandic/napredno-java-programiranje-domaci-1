package orm;

public interface ORMManager {
    int insert(final Class entity);

    int remove(final Class entity, final String[] conditions);

    int update(final Class entity, final String[] conditions);

    int find(final Class[] entities, final String[] conditions);
}
