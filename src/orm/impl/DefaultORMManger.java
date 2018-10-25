package orm.impl;

import orm.ORMManager;

public class DefaultORMManger implements ORMManager {
    @Override
    public int insert(final Class entity) {
        return 0;
    }

    @Override
    public int remove(final Class entity, final String[] conditions) {
        return 0;
    }

    @Override
    public int update(final Class entity, final String[] conditions) {
        return 0;
    }

    @Override
    public int find(final Class[] entities, final String[] conditions) {
        return 0;
    }
}
