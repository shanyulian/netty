package java.com.haro.netty.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class IotMachineInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IotMachineInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andInfoIdIsNull() {
            addCriterion("info_id is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("info_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(Integer value) {
            addCriterion("info_id =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(Integer value) {
            addCriterion("info_id <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(Integer value) {
            addCriterion("info_id >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("info_id >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(Integer value) {
            addCriterion("info_id <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("info_id <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<Integer> values) {
            addCriterion("info_id in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<Integer> values) {
            addCriterion("info_id not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("info_id between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("info_id not between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andTempStatusIsNull() {
            addCriterion("temp_status is null");
            return (Criteria) this;
        }

        public Criteria andTempStatusIsNotNull() {
            addCriterion("temp_status is not null");
            return (Criteria) this;
        }

        public Criteria andTempStatusEqualTo(String value) {
            addCriterion("temp_status =", value, "tempStatus");
            return (Criteria) this;
        }

        public Criteria andTempStatusNotEqualTo(String value) {
            addCriterion("temp_status <>", value, "tempStatus");
            return (Criteria) this;
        }

        public Criteria andTempStatusGreaterThan(String value) {
            addCriterion("temp_status >", value, "tempStatus");
            return (Criteria) this;
        }

        public Criteria andTempStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_status >=", value, "tempStatus");
            return (Criteria) this;
        }

        public Criteria andTempStatusLessThan(String value) {
            addCriterion("temp_status <", value, "tempStatus");
            return (Criteria) this;
        }

        public Criteria andTempStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_status <=", value, "tempStatus");
            return (Criteria) this;
        }

        public Criteria andTempStatusLike(String value) {
            addCriterion("temp_status like", value, "tempStatus");
            return (Criteria) this;
        }

        public Criteria andTempStatusNotLike(String value) {
            addCriterion("temp_status not like", value, "tempStatus");
            return (Criteria) this;
        }

        public Criteria andTempStatusIn(List<String> values) {
            addCriterion("temp_status in", values, "tempStatus");
            return (Criteria) this;
        }

        public Criteria andTempStatusNotIn(List<String> values) {
            addCriterion("temp_status not in", values, "tempStatus");
            return (Criteria) this;
        }

        public Criteria andTempStatusBetween(String value1, String value2) {
            addCriterion("temp_status between", value1, value2, "tempStatus");
            return (Criteria) this;
        }

        public Criteria andTempStatusNotBetween(String value1, String value2) {
            addCriterion("temp_status not between", value1, value2, "tempStatus");
            return (Criteria) this;
        }

        public Criteria andTwoelLengthIsNull() {
            addCriterion("twoel_length is null");
            return (Criteria) this;
        }

        public Criteria andTwoelLengthIsNotNull() {
            addCriterion("twoel_length is not null");
            return (Criteria) this;
        }

        public Criteria andTwoelLengthEqualTo(String value) {
            addCriterion("twoel_length =", value, "twoelLength");
            return (Criteria) this;
        }

        public Criteria andTwoelLengthNotEqualTo(String value) {
            addCriterion("twoel_length <>", value, "twoelLength");
            return (Criteria) this;
        }

        public Criteria andTwoelLengthGreaterThan(String value) {
            addCriterion("twoel_length >", value, "twoelLength");
            return (Criteria) this;
        }

        public Criteria andTwoelLengthGreaterThanOrEqualTo(String value) {
            addCriterion("twoel_length >=", value, "twoelLength");
            return (Criteria) this;
        }

        public Criteria andTwoelLengthLessThan(String value) {
            addCriterion("twoel_length <", value, "twoelLength");
            return (Criteria) this;
        }

        public Criteria andTwoelLengthLessThanOrEqualTo(String value) {
            addCriterion("twoel_length <=", value, "twoelLength");
            return (Criteria) this;
        }

        public Criteria andTwoelLengthLike(String value) {
            addCriterion("twoel_length like", value, "twoelLength");
            return (Criteria) this;
        }

        public Criteria andTwoelLengthNotLike(String value) {
            addCriterion("twoel_length not like", value, "twoelLength");
            return (Criteria) this;
        }

        public Criteria andTwoelLengthIn(List<String> values) {
            addCriterion("twoel_length in", values, "twoelLength");
            return (Criteria) this;
        }

        public Criteria andTwoelLengthNotIn(List<String> values) {
            addCriterion("twoel_length not in", values, "twoelLength");
            return (Criteria) this;
        }

        public Criteria andTwoelLengthBetween(String value1, String value2) {
            addCriterion("twoel_length between", value1, value2, "twoelLength");
            return (Criteria) this;
        }

        public Criteria andTwoelLengthNotBetween(String value1, String value2) {
            addCriterion("twoel_length not between", value1, value2, "twoelLength");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusIsNull() {
            addCriterion("alarm_status is null");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusIsNotNull() {
            addCriterion("alarm_status is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusEqualTo(String value) {
            addCriterion("alarm_status =", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusNotEqualTo(String value) {
            addCriterion("alarm_status <>", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusGreaterThan(String value) {
            addCriterion("alarm_status >", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_status >=", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusLessThan(String value) {
            addCriterion("alarm_status <", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusLessThanOrEqualTo(String value) {
            addCriterion("alarm_status <=", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusLike(String value) {
            addCriterion("alarm_status like", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusNotLike(String value) {
            addCriterion("alarm_status not like", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusIn(List<String> values) {
            addCriterion("alarm_status in", values, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusNotIn(List<String> values) {
            addCriterion("alarm_status not in", values, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusBetween(String value1, String value2) {
            addCriterion("alarm_status between", value1, value2, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusNotBetween(String value1, String value2) {
            addCriterion("alarm_status not between", value1, value2, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andTempModelIsNull() {
            addCriterion("temp_model is null");
            return (Criteria) this;
        }

        public Criteria andTempModelIsNotNull() {
            addCriterion("temp_model is not null");
            return (Criteria) this;
        }

        public Criteria andTempModelEqualTo(String value) {
            addCriterion("temp_model =", value, "tempModel");
            return (Criteria) this;
        }

        public Criteria andTempModelNotEqualTo(String value) {
            addCriterion("temp_model <>", value, "tempModel");
            return (Criteria) this;
        }

        public Criteria andTempModelGreaterThan(String value) {
            addCriterion("temp_model >", value, "tempModel");
            return (Criteria) this;
        }

        public Criteria andTempModelGreaterThanOrEqualTo(String value) {
            addCriterion("temp_model >=", value, "tempModel");
            return (Criteria) this;
        }

        public Criteria andTempModelLessThan(String value) {
            addCriterion("temp_model <", value, "tempModel");
            return (Criteria) this;
        }

        public Criteria andTempModelLessThanOrEqualTo(String value) {
            addCriterion("temp_model <=", value, "tempModel");
            return (Criteria) this;
        }

        public Criteria andTempModelLike(String value) {
            addCriterion("temp_model like", value, "tempModel");
            return (Criteria) this;
        }

        public Criteria andTempModelNotLike(String value) {
            addCriterion("temp_model not like", value, "tempModel");
            return (Criteria) this;
        }

        public Criteria andTempModelIn(List<String> values) {
            addCriterion("temp_model in", values, "tempModel");
            return (Criteria) this;
        }

        public Criteria andTempModelNotIn(List<String> values) {
            addCriterion("temp_model not in", values, "tempModel");
            return (Criteria) this;
        }

        public Criteria andTempModelBetween(String value1, String value2) {
            addCriterion("temp_model between", value1, value2, "tempModel");
            return (Criteria) this;
        }

        public Criteria andTempModelNotBetween(String value1, String value2) {
            addCriterion("temp_model not between", value1, value2, "tempModel");
            return (Criteria) this;
        }

        public Criteria andTotalTwoelNumIsNull() {
            addCriterion("total_twoel_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalTwoelNumIsNotNull() {
            addCriterion("total_twoel_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTwoelNumEqualTo(Integer value) {
            addCriterion("total_twoel_num =", value, "totalTwoelNum");
            return (Criteria) this;
        }

        public Criteria andTotalTwoelNumNotEqualTo(Integer value) {
            addCriterion("total_twoel_num <>", value, "totalTwoelNum");
            return (Criteria) this;
        }

        public Criteria andTotalTwoelNumGreaterThan(Integer value) {
            addCriterion("total_twoel_num >", value, "totalTwoelNum");
            return (Criteria) this;
        }

        public Criteria andTotalTwoelNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_twoel_num >=", value, "totalTwoelNum");
            return (Criteria) this;
        }

        public Criteria andTotalTwoelNumLessThan(Integer value) {
            addCriterion("total_twoel_num <", value, "totalTwoelNum");
            return (Criteria) this;
        }

        public Criteria andTotalTwoelNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_twoel_num <=", value, "totalTwoelNum");
            return (Criteria) this;
        }

        public Criteria andTotalTwoelNumIn(List<Integer> values) {
            addCriterion("total_twoel_num in", values, "totalTwoelNum");
            return (Criteria) this;
        }

        public Criteria andTotalTwoelNumNotIn(List<Integer> values) {
            addCriterion("total_twoel_num not in", values, "totalTwoelNum");
            return (Criteria) this;
        }

        public Criteria andTotalTwoelNumBetween(Integer value1, Integer value2) {
            addCriterion("total_twoel_num between", value1, value2, "totalTwoelNum");
            return (Criteria) this;
        }

        public Criteria andTotalTwoelNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_twoel_num not between", value1, value2, "totalTwoelNum");
            return (Criteria) this;
        }

        public Criteria andNewTotalNumIsNull() {
            addCriterion("new_total_num is null");
            return (Criteria) this;
        }

        public Criteria andNewTotalNumIsNotNull() {
            addCriterion("new_total_num is not null");
            return (Criteria) this;
        }

        public Criteria andNewTotalNumEqualTo(Integer value) {
            addCriterion("new_total_num =", value, "newTotalNum");
            return (Criteria) this;
        }

        public Criteria andNewTotalNumNotEqualTo(Integer value) {
            addCriterion("new_total_num <>", value, "newTotalNum");
            return (Criteria) this;
        }

        public Criteria andNewTotalNumGreaterThan(Integer value) {
            addCriterion("new_total_num >", value, "newTotalNum");
            return (Criteria) this;
        }

        public Criteria andNewTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_total_num >=", value, "newTotalNum");
            return (Criteria) this;
        }

        public Criteria andNewTotalNumLessThan(Integer value) {
            addCriterion("new_total_num <", value, "newTotalNum");
            return (Criteria) this;
        }

        public Criteria andNewTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("new_total_num <=", value, "newTotalNum");
            return (Criteria) this;
        }

        public Criteria andNewTotalNumIn(List<Integer> values) {
            addCriterion("new_total_num in", values, "newTotalNum");
            return (Criteria) this;
        }

        public Criteria andNewTotalNumNotIn(List<Integer> values) {
            addCriterion("new_total_num not in", values, "newTotalNum");
            return (Criteria) this;
        }

        public Criteria andNewTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("new_total_num between", value1, value2, "newTotalNum");
            return (Criteria) this;
        }

        public Criteria andNewTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("new_total_num not between", value1, value2, "newTotalNum");
            return (Criteria) this;
        }

        public Criteria andSurplusIsNull() {
            addCriterion("surplus is null");
            return (Criteria) this;
        }

        public Criteria andSurplusIsNotNull() {
            addCriterion("surplus is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusEqualTo(Integer value) {
            addCriterion("surplus =", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotEqualTo(Integer value) {
            addCriterion("surplus <>", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusGreaterThan(Integer value) {
            addCriterion("surplus >", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusGreaterThanOrEqualTo(Integer value) {
            addCriterion("surplus >=", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusLessThan(Integer value) {
            addCriterion("surplus <", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusLessThanOrEqualTo(Integer value) {
            addCriterion("surplus <=", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusIn(List<Integer> values) {
            addCriterion("surplus in", values, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotIn(List<Integer> values) {
            addCriterion("surplus not in", values, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusBetween(Integer value1, Integer value2) {
            addCriterion("surplus between", value1, value2, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotBetween(Integer value1, Integer value2) {
            addCriterion("surplus not between", value1, value2, "surplus");
            return (Criteria) this;
        }

        public Criteria andWaterCapacityIsNull() {
            addCriterion("water_capacity is null");
            return (Criteria) this;
        }

        public Criteria andWaterCapacityIsNotNull() {
            addCriterion("water_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andWaterCapacityEqualTo(String value) {
            addCriterion("water_capacity =", value, "waterCapacity");
            return (Criteria) this;
        }

        public Criteria andWaterCapacityNotEqualTo(String value) {
            addCriterion("water_capacity <>", value, "waterCapacity");
            return (Criteria) this;
        }

        public Criteria andWaterCapacityGreaterThan(String value) {
            addCriterion("water_capacity >", value, "waterCapacity");
            return (Criteria) this;
        }

        public Criteria andWaterCapacityGreaterThanOrEqualTo(String value) {
            addCriterion("water_capacity >=", value, "waterCapacity");
            return (Criteria) this;
        }

        public Criteria andWaterCapacityLessThan(String value) {
            addCriterion("water_capacity <", value, "waterCapacity");
            return (Criteria) this;
        }

        public Criteria andWaterCapacityLessThanOrEqualTo(String value) {
            addCriterion("water_capacity <=", value, "waterCapacity");
            return (Criteria) this;
        }

        public Criteria andWaterCapacityLike(String value) {
            addCriterion("water_capacity like", value, "waterCapacity");
            return (Criteria) this;
        }

        public Criteria andWaterCapacityNotLike(String value) {
            addCriterion("water_capacity not like", value, "waterCapacity");
            return (Criteria) this;
        }

        public Criteria andWaterCapacityIn(List<String> values) {
            addCriterion("water_capacity in", values, "waterCapacity");
            return (Criteria) this;
        }

        public Criteria andWaterCapacityNotIn(List<String> values) {
            addCriterion("water_capacity not in", values, "waterCapacity");
            return (Criteria) this;
        }

        public Criteria andWaterCapacityBetween(String value1, String value2) {
            addCriterion("water_capacity between", value1, value2, "waterCapacity");
            return (Criteria) this;
        }

        public Criteria andWaterCapacityNotBetween(String value1, String value2) {
            addCriterion("water_capacity not between", value1, value2, "waterCapacity");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIsNull() {
            addCriterion("water_source is null");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIsNotNull() {
            addCriterion("water_source is not null");
            return (Criteria) this;
        }

        public Criteria andWaterSourceEqualTo(String value) {
            addCriterion("water_source =", value, "waterSource");
            return (Criteria) this;
        }

        public Criteria andWaterSourceNotEqualTo(String value) {
            addCriterion("water_source <>", value, "waterSource");
            return (Criteria) this;
        }

        public Criteria andWaterSourceGreaterThan(String value) {
            addCriterion("water_source >", value, "waterSource");
            return (Criteria) this;
        }

        public Criteria andWaterSourceGreaterThanOrEqualTo(String value) {
            addCriterion("water_source >=", value, "waterSource");
            return (Criteria) this;
        }

        public Criteria andWaterSourceLessThan(String value) {
            addCriterion("water_source <", value, "waterSource");
            return (Criteria) this;
        }

        public Criteria andWaterSourceLessThanOrEqualTo(String value) {
            addCriterion("water_source <=", value, "waterSource");
            return (Criteria) this;
        }

        public Criteria andWaterSourceLike(String value) {
            addCriterion("water_source like", value, "waterSource");
            return (Criteria) this;
        }

        public Criteria andWaterSourceNotLike(String value) {
            addCriterion("water_source not like", value, "waterSource");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIn(List<String> values) {
            addCriterion("water_source in", values, "waterSource");
            return (Criteria) this;
        }

        public Criteria andWaterSourceNotIn(List<String> values) {
            addCriterion("water_source not in", values, "waterSource");
            return (Criteria) this;
        }

        public Criteria andWaterSourceBetween(String value1, String value2) {
            addCriterion("water_source between", value1, value2, "waterSource");
            return (Criteria) this;
        }

        public Criteria andWaterSourceNotBetween(String value1, String value2) {
            addCriterion("water_source not between", value1, value2, "waterSource");
            return (Criteria) this;
        }

        public Criteria andPhIsNull() {
            addCriterion("ph is null");
            return (Criteria) this;
        }

        public Criteria andPhIsNotNull() {
            addCriterion("ph is not null");
            return (Criteria) this;
        }

        public Criteria andPhEqualTo(String value) {
            addCriterion("ph =", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotEqualTo(String value) {
            addCriterion("ph <>", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThan(String value) {
            addCriterion("ph >", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThanOrEqualTo(String value) {
            addCriterion("ph >=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThan(String value) {
            addCriterion("ph <", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThanOrEqualTo(String value) {
            addCriterion("ph <=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLike(String value) {
            addCriterion("ph like", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotLike(String value) {
            addCriterion("ph not like", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhIn(List<String> values) {
            addCriterion("ph in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotIn(List<String> values) {
            addCriterion("ph not in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhBetween(String value1, String value2) {
            addCriterion("ph between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotBetween(String value1, String value2) {
            addCriterion("ph not between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andTotalCoinsIsNull() {
            addCriterion("total_coins is null");
            return (Criteria) this;
        }

        public Criteria andTotalCoinsIsNotNull() {
            addCriterion("total_coins is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCoinsEqualTo(Integer value) {
            addCriterion("total_coins =", value, "totalCoins");
            return (Criteria) this;
        }

        public Criteria andTotalCoinsNotEqualTo(Integer value) {
            addCriterion("total_coins <>", value, "totalCoins");
            return (Criteria) this;
        }

        public Criteria andTotalCoinsGreaterThan(Integer value) {
            addCriterion("total_coins >", value, "totalCoins");
            return (Criteria) this;
        }

        public Criteria andTotalCoinsGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_coins >=", value, "totalCoins");
            return (Criteria) this;
        }

        public Criteria andTotalCoinsLessThan(Integer value) {
            addCriterion("total_coins <", value, "totalCoins");
            return (Criteria) this;
        }

        public Criteria andTotalCoinsLessThanOrEqualTo(Integer value) {
            addCriterion("total_coins <=", value, "totalCoins");
            return (Criteria) this;
        }

        public Criteria andTotalCoinsIn(List<Integer> values) {
            addCriterion("total_coins in", values, "totalCoins");
            return (Criteria) this;
        }

        public Criteria andTotalCoinsNotIn(List<Integer> values) {
            addCriterion("total_coins not in", values, "totalCoins");
            return (Criteria) this;
        }

        public Criteria andTotalCoinsBetween(Integer value1, Integer value2) {
            addCriterion("total_coins between", value1, value2, "totalCoins");
            return (Criteria) this;
        }

        public Criteria andTotalCoinsNotBetween(Integer value1, Integer value2) {
            addCriterion("total_coins not between", value1, value2, "totalCoins");
            return (Criteria) this;
        }

        public Criteria andMobilePayIsNull() {
            addCriterion("mobile_pay is null");
            return (Criteria) this;
        }

        public Criteria andMobilePayIsNotNull() {
            addCriterion("mobile_pay is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePayEqualTo(Integer value) {
            addCriterion("mobile_pay =", value, "mobilePay");
            return (Criteria) this;
        }

        public Criteria andMobilePayNotEqualTo(Integer value) {
            addCriterion("mobile_pay <>", value, "mobilePay");
            return (Criteria) this;
        }

        public Criteria andMobilePayGreaterThan(Integer value) {
            addCriterion("mobile_pay >", value, "mobilePay");
            return (Criteria) this;
        }

        public Criteria andMobilePayGreaterThanOrEqualTo(Integer value) {
            addCriterion("mobile_pay >=", value, "mobilePay");
            return (Criteria) this;
        }

        public Criteria andMobilePayLessThan(Integer value) {
            addCriterion("mobile_pay <", value, "mobilePay");
            return (Criteria) this;
        }

        public Criteria andMobilePayLessThanOrEqualTo(Integer value) {
            addCriterion("mobile_pay <=", value, "mobilePay");
            return (Criteria) this;
        }

        public Criteria andMobilePayIn(List<Integer> values) {
            addCriterion("mobile_pay in", values, "mobilePay");
            return (Criteria) this;
        }

        public Criteria andMobilePayNotIn(List<Integer> values) {
            addCriterion("mobile_pay not in", values, "mobilePay");
            return (Criteria) this;
        }

        public Criteria andMobilePayBetween(Integer value1, Integer value2) {
            addCriterion("mobile_pay between", value1, value2, "mobilePay");
            return (Criteria) this;
        }

        public Criteria andMobilePayNotBetween(Integer value1, Integer value2) {
            addCriterion("mobile_pay not between", value1, value2, "mobilePay");
            return (Criteria) this;
        }

        public Criteria andPayCardIsNull() {
            addCriterion("pay_card is null");
            return (Criteria) this;
        }

        public Criteria andPayCardIsNotNull() {
            addCriterion("pay_card is not null");
            return (Criteria) this;
        }

        public Criteria andPayCardEqualTo(Integer value) {
            addCriterion("pay_card =", value, "payCard");
            return (Criteria) this;
        }

        public Criteria andPayCardNotEqualTo(Integer value) {
            addCriterion("pay_card <>", value, "payCard");
            return (Criteria) this;
        }

        public Criteria andPayCardGreaterThan(Integer value) {
            addCriterion("pay_card >", value, "payCard");
            return (Criteria) this;
        }

        public Criteria andPayCardGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_card >=", value, "payCard");
            return (Criteria) this;
        }

        public Criteria andPayCardLessThan(Integer value) {
            addCriterion("pay_card <", value, "payCard");
            return (Criteria) this;
        }

        public Criteria andPayCardLessThanOrEqualTo(Integer value) {
            addCriterion("pay_card <=", value, "payCard");
            return (Criteria) this;
        }

        public Criteria andPayCardIn(List<Integer> values) {
            addCriterion("pay_card in", values, "payCard");
            return (Criteria) this;
        }

        public Criteria andPayCardNotIn(List<Integer> values) {
            addCriterion("pay_card not in", values, "payCard");
            return (Criteria) this;
        }

        public Criteria andPayCardBetween(Integer value1, Integer value2) {
            addCriterion("pay_card between", value1, value2, "payCard");
            return (Criteria) this;
        }

        public Criteria andPayCardNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_card not between", value1, value2, "payCard");
            return (Criteria) this;
        }

        public Criteria andDeviceSnIsNull() {
            addCriterion("device_sn is null");
            return (Criteria) this;
        }

        public Criteria andDeviceSnIsNotNull() {
            addCriterion("device_sn is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceSnEqualTo(String value) {
            addCriterion("device_sn =", value, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnNotEqualTo(String value) {
            addCriterion("device_sn <>", value, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnGreaterThan(String value) {
            addCriterion("device_sn >", value, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnGreaterThanOrEqualTo(String value) {
            addCriterion("device_sn >=", value, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnLessThan(String value) {
            addCriterion("device_sn <", value, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnLessThanOrEqualTo(String value) {
            addCriterion("device_sn <=", value, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnLike(String value) {
            addCriterion("device_sn like", value, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnNotLike(String value) {
            addCriterion("device_sn not like", value, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnIn(List<String> values) {
            addCriterion("device_sn in", values, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnNotIn(List<String> values) {
            addCriterion("device_sn not in", values, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnBetween(String value1, String value2) {
            addCriterion("device_sn between", value1, value2, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnNotBetween(String value1, String value2) {
            addCriterion("device_sn not between", value1, value2, "deviceSn");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}