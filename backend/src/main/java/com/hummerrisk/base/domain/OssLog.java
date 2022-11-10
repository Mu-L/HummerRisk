package com.hummerrisk.base.domain;

import java.io.Serializable;

public class OssLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oss_log.id
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oss_log.oss_id
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    private String ossId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oss_log.region_id
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    private String regionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oss_log.region_name
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    private String regionName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oss_log.create_time
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oss_log.operator
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oss_log.result
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    private Boolean result;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oss_log.sum
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    private Integer sum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oss_log
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_log.id
     *
     * @return the value of oss_log.id
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_log.id
     *
     * @param id the value for oss_log.id
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_log.oss_id
     *
     * @return the value of oss_log.oss_id
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    public String getOssId() {
        return ossId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_log.oss_id
     *
     * @param ossId the value for oss_log.oss_id
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    public void setOssId(String ossId) {
        this.ossId = ossId == null ? null : ossId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_log.region_id
     *
     * @return the value of oss_log.region_id
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_log.region_id
     *
     * @param regionId the value for oss_log.region_id
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId == null ? null : regionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_log.region_name
     *
     * @return the value of oss_log.region_name
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_log.region_name
     *
     * @param regionName the value for oss_log.region_name
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_log.create_time
     *
     * @return the value of oss_log.create_time
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_log.create_time
     *
     * @param createTime the value for oss_log.create_time
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_log.operator
     *
     * @return the value of oss_log.operator
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_log.operator
     *
     * @param operator the value for oss_log.operator
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_log.result
     *
     * @return the value of oss_log.result
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    public Boolean getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_log.result
     *
     * @param result the value for oss_log.result
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    public void setResult(Boolean result) {
        this.result = result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_log.sum
     *
     * @return the value of oss_log.sum
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    public Integer getSum() {
        return sum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_log.sum
     *
     * @param sum the value for oss_log.sum
     *
     * @mbg.generated Fri Nov 11 05:19:37 CST 2022
     */
    public void setSum(Integer sum) {
        this.sum = sum;
    }
}