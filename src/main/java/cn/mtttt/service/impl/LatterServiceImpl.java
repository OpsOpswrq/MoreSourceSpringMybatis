package cn.mtttt.service.impl;

import cn.mtttt.bean.SchoolRoll;
import cn.mtttt.mapper.Latter.LatterMapper;
import cn.mtttt.mapper.Origin.OriginMapper;
import cn.mtttt.service.LatterService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class LatterServiceImpl implements LatterService {
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<SchoolRoll> selectSchoolRoll() {
        LatterMapper mapper = sqlSessionTemplate.getMapper(LatterMapper.class);
        List<SchoolRoll> schoolRolls = mapper.selectSchoolRoll();
        return schoolRolls;
    }

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSessionTemplate = sqlSession;
    }
}
