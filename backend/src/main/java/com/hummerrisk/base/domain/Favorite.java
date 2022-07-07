package com.hummerrisk.base.domain;

import java.io.Serializable;

public class Favorite implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favorite.id
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favorite.resource_id
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    private String resourceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favorite.resource_type
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    private String resourceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favorite.resource_name
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    private String resourceName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favorite.resource_icon
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    private String resourceIcon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favorite.create_time
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favorite.update_time
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    private Long updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favorite.creator
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    private String creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favorite.creator_name
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    private String creatorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table favorite
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorite.id
     *
     * @return the value of favorite.id
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorite.id
     *
     * @param id the value for favorite.id
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorite.resource_id
     *
     * @return the value of favorite.resource_id
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorite.resource_id
     *
     * @param resourceId the value for favorite.resource_id
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorite.resource_type
     *
     * @return the value of favorite.resource_type
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorite.resource_type
     *
     * @param resourceType the value for favorite.resource_type
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorite.resource_name
     *
     * @return the value of favorite.resource_name
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorite.resource_name
     *
     * @param resourceName the value for favorite.resource_name
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorite.resource_icon
     *
     * @return the value of favorite.resource_icon
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    public String getResourceIcon() {
        return resourceIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorite.resource_icon
     *
     * @param resourceIcon the value for favorite.resource_icon
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    public void setResourceIcon(String resourceIcon) {
        this.resourceIcon = resourceIcon == null ? null : resourceIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorite.create_time
     *
     * @return the value of favorite.create_time
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorite.create_time
     *
     * @param createTime the value for favorite.create_time
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorite.update_time
     *
     * @return the value of favorite.update_time
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorite.update_time
     *
     * @param updateTime the value for favorite.update_time
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorite.creator
     *
     * @return the value of favorite.creator
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorite.creator
     *
     * @param creator the value for favorite.creator
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorite.creator_name
     *
     * @return the value of favorite.creator_name
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorite.creator_name
     *
     * @param creatorName the value for favorite.creator_name
     *
     * @mbg.generated Thu Jul 07 20:11:05 CST 2022
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }
}