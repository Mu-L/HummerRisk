package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.CloudNativeConfigRule;
import com.hummerrisk.base.domain.CloudNativeConfigRuleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CloudNativeConfigRuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_config_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    long countByExample(CloudNativeConfigRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_config_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int deleteByExample(CloudNativeConfigRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_config_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_config_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int insert(CloudNativeConfigRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_config_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int insertSelective(CloudNativeConfigRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_config_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    List<CloudNativeConfigRule> selectByExampleWithBLOBs(CloudNativeConfigRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_config_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    List<CloudNativeConfigRule> selectByExample(CloudNativeConfigRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_config_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    CloudNativeConfigRule selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_config_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int updateByExampleSelective(@Param("record") CloudNativeConfigRule record, @Param("example") CloudNativeConfigRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_config_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") CloudNativeConfigRule record, @Param("example") CloudNativeConfigRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_config_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int updateByExample(@Param("record") CloudNativeConfigRule record, @Param("example") CloudNativeConfigRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_config_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int updateByPrimaryKeySelective(CloudNativeConfigRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_config_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(CloudNativeConfigRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_config_rule
     *
     * @mbg.generated Thu Sep 08 05:19:20 CST 2022
     */
    int updateByPrimaryKey(CloudNativeConfigRule record);
}