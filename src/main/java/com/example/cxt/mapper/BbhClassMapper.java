package com.example.cxt.mapper;

import com.example.cxt.entity.BbhClass;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface BbhClassMapper {
    /**
     * 查询
     * @param bbh
     * @return
     */
    List<BbhClass> bbhlist(BbhClass bbh);

    /**
     * 根据编号删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加班级
     * @param bbh
     * @return
     */
    int insert(BbhClass bbh);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbh_class
     *
     * @mbggenerated
     */
    int insertSelective(BbhClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbh_class
     *
     * @mbggenerated
     */
    BbhClass selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbh_class
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BbhClass record);

    /**
     * 根据编号修改该班级信息
     * @param bbh
     * @return
     */
    int updateByPrimaryKey(BbhClass bbh);

    /**
     * 根据班级名查询
     * @param name
     * @return
     */
    BbhClass selectByname(String name);
}