package com.hummerrisk.base.domain;

import java.io.Serializable;

public class SbomVersion implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sbom_version.id
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sbom_version.sbom_id
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    private String sbomId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sbom_version.name
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sbom_version.description
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sbom_version.create_time
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sbom_version.update_time
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    private Long updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sbom_version
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sbom_version.id
     *
     * @return the value of sbom_version.id
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sbom_version.id
     *
     * @param id the value for sbom_version.id
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sbom_version.sbom_id
     *
     * @return the value of sbom_version.sbom_id
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    public String getSbomId() {
        return sbomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sbom_version.sbom_id
     *
     * @param sbomId the value for sbom_version.sbom_id
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    public void setSbomId(String sbomId) {
        this.sbomId = sbomId == null ? null : sbomId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sbom_version.name
     *
     * @return the value of sbom_version.name
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sbom_version.name
     *
     * @param name the value for sbom_version.name
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sbom_version.description
     *
     * @return the value of sbom_version.description
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sbom_version.description
     *
     * @param description the value for sbom_version.description
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sbom_version.create_time
     *
     * @return the value of sbom_version.create_time
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sbom_version.create_time
     *
     * @param createTime the value for sbom_version.create_time
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sbom_version.update_time
     *
     * @return the value of sbom_version.update_time
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sbom_version.update_time
     *
     * @param updateTime the value for sbom_version.update_time
     *
     * @mbg.generated Sun Aug 28 20:19:18 CST 2022
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}