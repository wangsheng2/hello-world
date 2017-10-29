package com.autumnsinger.dal.model;

import java.math.BigDecimal;
import java.util.Date;

public class FundProductInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.id
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.product_code
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private String productCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.product_name
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.product_type
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private String productType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.net_worth
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private BigDecimal netWorth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.net_worth_date
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private String netWorthDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.grow_rate_daily
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private BigDecimal growRateDaily;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.grow_rate_weekly
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private BigDecimal growRateWeekly;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.grow_rate_1month
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private BigDecimal growRate1month;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.grow_rate_3month
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private BigDecimal growRate3month;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.grow_rate_6month
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private BigDecimal growRate6month;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.grow_rate_1year
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private BigDecimal growRate1year;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.grow_rate_2year
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private BigDecimal growRate2year;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.grow_rate_3year
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private BigDecimal growRate3year;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.grow_rate_this_year
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private BigDecimal growRateThisYear;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.grow_rate_from_born
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private BigDecimal growRateFromBorn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.fee_rate_buy_show
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private String feeRateBuyShow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.fee_rate_buy_real
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private String feeRateBuyReal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.fee_rate_redeem
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private String feeRateRedeem;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.min_buy_amount
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private String minBuyAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.create_time
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fund_product_info.update_time
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.id
     *
     * @return the value of fund_product_info.id
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.id
     *
     * @param id the value for fund_product_info.id
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.product_code
     *
     * @return the value of fund_product_info.product_code
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.product_code
     *
     * @param productCode the value for fund_product_info.product_code
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.product_name
     *
     * @return the value of fund_product_info.product_name
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.product_name
     *
     * @param productName the value for fund_product_info.product_name
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.product_type
     *
     * @return the value of fund_product_info.product_type
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public String getProductType() {
        return productType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.product_type
     *
     * @param productType the value for fund_product_info.product_type
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.net_worth
     *
     * @return the value of fund_product_info.net_worth
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public BigDecimal getNetWorth() {
        return netWorth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.net_worth
     *
     * @param netWorth the value for fund_product_info.net_worth
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setNetWorth(BigDecimal netWorth) {
        this.netWorth = netWorth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.net_worth_date
     *
     * @return the value of fund_product_info.net_worth_date
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public String getNetWorthDate() {
        return netWorthDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.net_worth_date
     *
     * @param netWorthDate the value for fund_product_info.net_worth_date
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setNetWorthDate(String netWorthDate) {
        this.netWorthDate = netWorthDate == null ? null : netWorthDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.grow_rate_daily
     *
     * @return the value of fund_product_info.grow_rate_daily
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public BigDecimal getGrowRateDaily() {
        return growRateDaily;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.grow_rate_daily
     *
     * @param growRateDaily the value for fund_product_info.grow_rate_daily
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setGrowRateDaily(BigDecimal growRateDaily) {
        this.growRateDaily = growRateDaily;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.grow_rate_weekly
     *
     * @return the value of fund_product_info.grow_rate_weekly
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public BigDecimal getGrowRateWeekly() {
        return growRateWeekly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.grow_rate_weekly
     *
     * @param growRateWeekly the value for fund_product_info.grow_rate_weekly
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setGrowRateWeekly(BigDecimal growRateWeekly) {
        this.growRateWeekly = growRateWeekly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.grow_rate_1month
     *
     * @return the value of fund_product_info.grow_rate_1month
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public BigDecimal getGrowRate1month() {
        return growRate1month;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.grow_rate_1month
     *
     * @param growRate1month the value for fund_product_info.grow_rate_1month
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setGrowRate1month(BigDecimal growRate1month) {
        this.growRate1month = growRate1month;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.grow_rate_3month
     *
     * @return the value of fund_product_info.grow_rate_3month
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public BigDecimal getGrowRate3month() {
        return growRate3month;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.grow_rate_3month
     *
     * @param growRate3month the value for fund_product_info.grow_rate_3month
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setGrowRate3month(BigDecimal growRate3month) {
        this.growRate3month = growRate3month;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.grow_rate_6month
     *
     * @return the value of fund_product_info.grow_rate_6month
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public BigDecimal getGrowRate6month() {
        return growRate6month;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.grow_rate_6month
     *
     * @param growRate6month the value for fund_product_info.grow_rate_6month
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setGrowRate6month(BigDecimal growRate6month) {
        this.growRate6month = growRate6month;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.grow_rate_1year
     *
     * @return the value of fund_product_info.grow_rate_1year
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public BigDecimal getGrowRate1year() {
        return growRate1year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.grow_rate_1year
     *
     * @param growRate1year the value for fund_product_info.grow_rate_1year
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setGrowRate1year(BigDecimal growRate1year) {
        this.growRate1year = growRate1year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.grow_rate_2year
     *
     * @return the value of fund_product_info.grow_rate_2year
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public BigDecimal getGrowRate2year() {
        return growRate2year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.grow_rate_2year
     *
     * @param growRate2year the value for fund_product_info.grow_rate_2year
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setGrowRate2year(BigDecimal growRate2year) {
        this.growRate2year = growRate2year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.grow_rate_3year
     *
     * @return the value of fund_product_info.grow_rate_3year
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public BigDecimal getGrowRate3year() {
        return growRate3year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.grow_rate_3year
     *
     * @param growRate3year the value for fund_product_info.grow_rate_3year
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setGrowRate3year(BigDecimal growRate3year) {
        this.growRate3year = growRate3year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.grow_rate_this_year
     *
     * @return the value of fund_product_info.grow_rate_this_year
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public BigDecimal getGrowRateThisYear() {
        return growRateThisYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.grow_rate_this_year
     *
     * @param growRateThisYear the value for fund_product_info.grow_rate_this_year
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setGrowRateThisYear(BigDecimal growRateThisYear) {
        this.growRateThisYear = growRateThisYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.grow_rate_from_born
     *
     * @return the value of fund_product_info.grow_rate_from_born
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public BigDecimal getGrowRateFromBorn() {
        return growRateFromBorn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.grow_rate_from_born
     *
     * @param growRateFromBorn the value for fund_product_info.grow_rate_from_born
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setGrowRateFromBorn(BigDecimal growRateFromBorn) {
        this.growRateFromBorn = growRateFromBorn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.fee_rate_buy_show
     *
     * @return the value of fund_product_info.fee_rate_buy_show
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public String getFeeRateBuyShow() {
        return feeRateBuyShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.fee_rate_buy_show
     *
     * @param feeRateBuyShow the value for fund_product_info.fee_rate_buy_show
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setFeeRateBuyShow(String feeRateBuyShow) {
        this.feeRateBuyShow = feeRateBuyShow == null ? null : feeRateBuyShow.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.fee_rate_buy_real
     *
     * @return the value of fund_product_info.fee_rate_buy_real
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public String getFeeRateBuyReal() {
        return feeRateBuyReal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.fee_rate_buy_real
     *
     * @param feeRateBuyReal the value for fund_product_info.fee_rate_buy_real
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setFeeRateBuyReal(String feeRateBuyReal) {
        this.feeRateBuyReal = feeRateBuyReal == null ? null : feeRateBuyReal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.fee_rate_redeem
     *
     * @return the value of fund_product_info.fee_rate_redeem
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public String getFeeRateRedeem() {
        return feeRateRedeem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.fee_rate_redeem
     *
     * @param feeRateRedeem the value for fund_product_info.fee_rate_redeem
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setFeeRateRedeem(String feeRateRedeem) {
        this.feeRateRedeem = feeRateRedeem == null ? null : feeRateRedeem.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.min_buy_amount
     *
     * @return the value of fund_product_info.min_buy_amount
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public String getMinBuyAmount() {
        return minBuyAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.min_buy_amount
     *
     * @param minBuyAmount the value for fund_product_info.min_buy_amount
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setMinBuyAmount(String minBuyAmount) {
        this.minBuyAmount = minBuyAmount == null ? null : minBuyAmount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.create_time
     *
     * @return the value of fund_product_info.create_time
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.create_time
     *
     * @param createTime the value for fund_product_info.create_time
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fund_product_info.update_time
     *
     * @return the value of fund_product_info.update_time
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fund_product_info.update_time
     *
     * @param updateTime the value for fund_product_info.update_time
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}