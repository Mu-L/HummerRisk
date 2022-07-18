package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.HistoryVulnTaskItemLog;
import com.hummerrisk.base.domain.HistoryVulnTaskItemLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HistoryVulnTaskItemLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item_log
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    long countByExample(HistoryVulnTaskItemLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item_log
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    int deleteByExample(HistoryVulnTaskItemLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item_log
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item_log
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    int insert(HistoryVulnTaskItemLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item_log
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    int insertSelective(HistoryVulnTaskItemLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item_log
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    List<HistoryVulnTaskItemLog> selectByExampleWithBLOBs(HistoryVulnTaskItemLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item_log
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    List<HistoryVulnTaskItemLog> selectByExample(HistoryVulnTaskItemLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item_log
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    HistoryVulnTaskItemLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item_log
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    int updateByExampleSelective(@Param("record") HistoryVulnTaskItemLog record, @Param("example") HistoryVulnTaskItemLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item_log
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") HistoryVulnTaskItemLog record, @Param("example") HistoryVulnTaskItemLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item_log
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    int updateByExample(@Param("record") HistoryVulnTaskItemLog record, @Param("example") HistoryVulnTaskItemLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item_log
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    int updateByPrimaryKeySelective(HistoryVulnTaskItemLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item_log
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(HistoryVulnTaskItemLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_vuln_task_item_log
     *
     * @mbg.generated Tue Jul 19 04:14:43 CST 2022
     */
    int updateByPrimaryKey(HistoryVulnTaskItemLog record);
}
