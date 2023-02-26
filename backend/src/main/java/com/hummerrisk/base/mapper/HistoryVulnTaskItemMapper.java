package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.HistoryVulnTaskItem;
import com.hummerrisk.base.domain.HistoryVulnTaskItemExample;
import com.hummerrisk.base.domain.HistoryVulnTaskItemWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HistoryVulnTaskItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    long countByExample(HistoryVulnTaskItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int deleteByExample(HistoryVulnTaskItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int insert(HistoryVulnTaskItemWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int insertSelective(HistoryVulnTaskItemWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    List<HistoryVulnTaskItemWithBLOBs> selectByExampleWithBLOBs(HistoryVulnTaskItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    List<HistoryVulnTaskItem> selectByExample(HistoryVulnTaskItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    HistoryVulnTaskItemWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int updateByExampleSelective(@Param("record") HistoryVulnTaskItemWithBLOBs record, @Param("example") HistoryVulnTaskItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") HistoryVulnTaskItemWithBLOBs record, @Param("example") HistoryVulnTaskItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int updateByExample(@Param("record") HistoryVulnTaskItem record, @Param("example") HistoryVulnTaskItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int updateByPrimaryKeySelective(HistoryVulnTaskItemWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(HistoryVulnTaskItemWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    int updateByPrimaryKey(HistoryVulnTaskItem record);
}