package example.greendao.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import example.bean.TestGreenBean;

import example.greendao.dao.TestGreenBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig testGreenBeanDaoConfig;

    private final TestGreenBeanDao testGreenBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        testGreenBeanDaoConfig = daoConfigMap.get(TestGreenBeanDao.class).clone();
        testGreenBeanDaoConfig.initIdentityScope(type);

        testGreenBeanDao = new TestGreenBeanDao(testGreenBeanDaoConfig, this);

        registerDao(TestGreenBean.class, testGreenBeanDao);
    }
    
    public void clear() {
        testGreenBeanDaoConfig.clearIdentityScope();
    }

    public TestGreenBeanDao getTestGreenBeanDao() {
        return testGreenBeanDao;
    }

}
