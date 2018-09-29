/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.sdk.iot.provisioning.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for QueryEnrollmentGroups operation.
 */
public class QueryEnrollmentGroupsHeaders {
    /**
     * The continuation token for getting the next page of results.
     */
    @JsonProperty(value = "x-ms-continuation")
    private String xMsContinuation;

    /**
     * The maximum number of items returned in a page.
     */
    @JsonProperty(value = "x-ms-max-item-count")
    private Integer xMsMaxItemCount;

    /**
     * The query result type.
     */
    @JsonProperty(value = "x-ms-item-type")
    private String xMsItemType;

    /**
     * Get the continuation token for getting the next page of results.
     *
     * @return the xMsContinuation value
     */
    public String xMsContinuation() {
        return this.xMsContinuation;
    }

    /**
     * Set the continuation token for getting the next page of results.
     *
     * @param xMsContinuation the xMsContinuation value to set
     * @return the QueryEnrollmentGroupsHeaders object itself.
     */
    public QueryEnrollmentGroupsHeaders withXMsContinuation(String xMsContinuation) {
        this.xMsContinuation = xMsContinuation;
        return this;
    }

    /**
     * Get the maximum number of items returned in a page.
     *
     * @return the xMsMaxItemCount value
     */
    public Integer xMsMaxItemCount() {
        return this.xMsMaxItemCount;
    }

    /**
     * Set the maximum number of items returned in a page.
     *
     * @param xMsMaxItemCount the xMsMaxItemCount value to set
     * @return the QueryEnrollmentGroupsHeaders object itself.
     */
    public QueryEnrollmentGroupsHeaders withXMsMaxItemCount(Integer xMsMaxItemCount) {
        this.xMsMaxItemCount = xMsMaxItemCount;
        return this;
    }

    /**
     * Get the query result type.
     *
     * @return the xMsItemType value
     */
    public String xMsItemType() {
        return this.xMsItemType;
    }

    /**
     * Set the query result type.
     *
     * @param xMsItemType the xMsItemType value to set
     * @return the QueryEnrollmentGroupsHeaders object itself.
     */
    public QueryEnrollmentGroupsHeaders withXMsItemType(String xMsItemType) {
        this.xMsItemType = xMsItemType;
        return this;
    }

}