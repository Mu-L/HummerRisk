package com.hummer.common.mapper.domain;

import java.io.Serializable;

public class CloudNativeSourceImage implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source_image.id
     *
     * @mbg.generated Sat Nov 12 19:52:36 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source_image.source_id
     *
     * @mbg.generated Sat Nov 12 19:52:36 CST 2022
     */
    private String sourceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source_image.create_time
     *
     * @mbg.generated Sat Nov 12 19:52:36 CST 2022
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_native_source_image.image
     *
     * @mbg.generated Sat Nov 12 19:52:36 CST 2022
     */
    private String image;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_native_source_image
     *
     * @mbg.generated Sat Nov 12 19:52:36 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source_image.id
     *
     * @return the value of cloud_native_source_image.id
     *
     * @mbg.generated Sat Nov 12 19:52:36 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source_image.id
     *
     * @param id the value for cloud_native_source_image.id
     *
     * @mbg.generated Sat Nov 12 19:52:36 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source_image.source_id
     *
     * @return the value of cloud_native_source_image.source_id
     *
     * @mbg.generated Sat Nov 12 19:52:36 CST 2022
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source_image.source_id
     *
     * @param sourceId the value for cloud_native_source_image.source_id
     *
     * @mbg.generated Sat Nov 12 19:52:36 CST 2022
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source_image.create_time
     *
     * @return the value of cloud_native_source_image.create_time
     *
     * @mbg.generated Sat Nov 12 19:52:36 CST 2022
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source_image.create_time
     *
     * @param createTime the value for cloud_native_source_image.create_time
     *
     * @mbg.generated Sat Nov 12 19:52:36 CST 2022
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_native_source_image.image
     *
     * @return the value of cloud_native_source_image.image
     *
     * @mbg.generated Sat Nov 12 19:52:36 CST 2022
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_native_source_image.image
     *
     * @param image the value for cloud_native_source_image.image
     *
     * @mbg.generated Sat Nov 12 19:52:36 CST 2022
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }
}