package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.CloudNativeSourceRbacNode;
import com.hummerrisk.base.domain.CloudNativeSourceRbacNodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CloudNativeSourceRbacNodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_rbac_node
     *
     * @mbg.generated Sat Jan 14 04:15:49 CST 2023
     */
    long countByExample(CloudNativeSourceRbacNodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_rbac_node
     *
     * @mbg.generated Sat Jan 14 04:15:49 CST 2023
     */
    int deleteByExample(CloudNativeSourceRbacNodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_rbac_node
     *
     * @mbg.generated Sat Jan 14 04:15:49 CST 2023
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_rbac_node
     *
     * @mbg.generated Sat Jan 14 04:15:49 CST 2023
     */
    int insert(CloudNativeSourceRbacNode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_rbac_node
     *
     * @mbg.generated Sat Jan 14 04:15:49 CST 2023
     */
    int insertSelective(CloudNativeSourceRbacNode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_rbac_node
     *
     * @mbg.generated Sat Jan 14 04:15:49 CST 2023
     */
    List<CloudNativeSourceRbacNode> selectByExample(CloudNativeSourceRbacNodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_rbac_node
     *
     * @mbg.generated Sat Jan 14 04:15:49 CST 2023
     */
    CloudNativeSourceRbacNode selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_rbac_node
     *
     * @mbg.generated Sat Jan 14 04:15:49 CST 2023
     */
    int updateByExampleSelective(@Param("record") CloudNativeSourceRbacNode record, @Param("example") CloudNativeSourceRbacNodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_rbac_node
     *
     * @mbg.generated Sat Jan 14 04:15:49 CST 2023
     */
    int updateByExample(@Param("record") CloudNativeSourceRbacNode record, @Param("example") CloudNativeSourceRbacNodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_rbac_node
     *
     * @mbg.generated Sat Jan 14 04:15:49 CST 2023
     */
    int updateByPrimaryKeySelective(CloudNativeSourceRbacNode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_source_rbac_node
     *
     * @mbg.generated Sat Jan 14 04:15:49 CST 2023
     */
    int updateByPrimaryKey(CloudNativeSourceRbacNode record);
}