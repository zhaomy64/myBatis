package newfile;

import beans.Test;

/**
 * Created by James on 2018-04-01.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public class Entry {
    public static void main(String[] args) {
        SqlSession sqlSession = new SqlSession(new Configuration(),
                new SimpleExecutor());
        TestMapper mapper = sqlSession.getMapper(TestMapper.class);
        Test test = mapper.selectByPrimaryKey(1);
        System.out.println(test.toString());
    }
}
