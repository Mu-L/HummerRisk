package com.hummer.cloud.mapper;

import com.hummer.common.core.domain.MessageTask;
import com.hummer.common.core.domain.MessageTaskExample;
import com.hummer.common.core.domain.MessageTaskWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageTaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_task
     *
     * @mbg.generated Mon Dec 12 21:03:52 CST 2022
     */
    long countByExample(MessageTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_task
     *
     * @mbg.generated Mon Dec 12 21:03:52 CST 2022
     */
    int deleteByExample(MessageTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_task
     *
     * @mbg.generated Mon Dec 12 21:03:52 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_task
     *
     * @mbg.generated Mon Dec 12 21:03:52 CST 2022
     */
    int insert(MessageTaskWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_task
     *
     * @mbg.generated Mon Dec 12 21:03:52 CST 2022
     */
    int insertSelective(MessageTaskWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_task
     *
     * @mbg.generated Mon Dec 12 21:03:52 CST 2022
     */
    List<MessageTaskWithBLOBs> selectByExampleWithBLOBs(MessageTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_task
     *
     * @mbg.generated Mon Dec 12 21:03:52 CST 2022
     */
    List<MessageTask> selectByExample(MessageTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_task
     *
     * @mbg.generated Mon Dec 12 21:03:52 CST 2022
     */
    MessageTaskWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_task
     *
     * @mbg.generated Mon Dec 12 21:03:52 CST 2022
     */
    int updateByExampleSelective(@Param("record") MessageTaskWithBLOBs record, @Param("example") MessageTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_task
     *
     * @mbg.generated Mon Dec 12 21:03:52 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") MessageTaskWithBLOBs record, @Param("example") MessageTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_task
     *
     * @mbg.generated Mon Dec 12 21:03:52 CST 2022
     */
    int updateByExample(@Param("record") MessageTask record, @Param("example") MessageTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_task
     *
     * @mbg.generated Mon Dec 12 21:03:52 CST 2022
     */
    int updateByPrimaryKeySelective(MessageTaskWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_task
     *
     * @mbg.generated Mon Dec 12 21:03:52 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(MessageTaskWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_task
     *
     * @mbg.generated Mon Dec 12 21:03:52 CST 2022
     */
    int updateByPrimaryKey(MessageTask record);
}