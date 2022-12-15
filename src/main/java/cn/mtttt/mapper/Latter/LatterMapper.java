package cn.mtttt.mapper.Latter;

import cn.mtttt.bean.SchoolRoll;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface LatterMapper {
    List<SchoolRoll> selectSchoolRoll();
}
