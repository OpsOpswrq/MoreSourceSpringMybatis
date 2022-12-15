package cn.mtttt.service.impl;

import cn.mtttt.bean.SchoolRoll;
import cn.mtttt.mapper.Latter.LatterMapper;
import cn.mtttt.mapper.Origin.OriginMapper;
import cn.mtttt.service.OriginService;
import lombok.Data;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Data
public class OriginServiceImpl implements OriginService {
    private SqlSessionTemplate sqlSessionTemplate;
    @Override
    public List<SchoolRoll> selectSchoolRoll() {
        OriginMapper mapper = sqlSessionTemplate.getMapper(OriginMapper.class);
        List<SchoolRoll> schoolRolls = mapper.selectSchoolRoll();
        return schoolRolls;
    }
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSessionTemplate = sqlSession;
    }
}
