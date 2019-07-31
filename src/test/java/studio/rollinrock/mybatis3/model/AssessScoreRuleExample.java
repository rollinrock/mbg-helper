package studio.rollinrock.mybatis3.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssessScoreRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssessScoreRuleExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAssessPeriodIsNull() {
            addCriterion("assess_period is null");
            return (Criteria) this;
        }

        public Criteria andAssessPeriodIsNotNull() {
            addCriterion("assess_period is not null");
            return (Criteria) this;
        }

        public Criteria andAssessPeriodEqualTo(String value) {
            addCriterion("assess_period =", value, "assessPeriod");
            return (Criteria) this;
        }

        public Criteria andAssessPeriodNotEqualTo(String value) {
            addCriterion("assess_period <>", value, "assessPeriod");
            return (Criteria) this;
        }

        public Criteria andAssessPeriodGreaterThan(String value) {
            addCriterion("assess_period >", value, "assessPeriod");
            return (Criteria) this;
        }

        public Criteria andAssessPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("assess_period >=", value, "assessPeriod");
            return (Criteria) this;
        }

        public Criteria andAssessPeriodLessThan(String value) {
            addCriterion("assess_period <", value, "assessPeriod");
            return (Criteria) this;
        }

        public Criteria andAssessPeriodLessThanOrEqualTo(String value) {
            addCriterion("assess_period <=", value, "assessPeriod");
            return (Criteria) this;
        }

        public Criteria andAssessPeriodLike(String value) {
            addCriterion("assess_period like", value, "assessPeriod");
            return (Criteria) this;
        }

        public Criteria andAssessPeriodNotLike(String value) {
            addCriterion("assess_period not like", value, "assessPeriod");
            return (Criteria) this;
        }

        public Criteria andAssessPeriodIn(List<String> values) {
            addCriterion("assess_period in", values, "assessPeriod");
            return (Criteria) this;
        }

        public Criteria andAssessPeriodNotIn(List<String> values) {
            addCriterion("assess_period not in", values, "assessPeriod");
            return (Criteria) this;
        }

        public Criteria andAssessPeriodBetween(String value1, String value2) {
            addCriterion("assess_period between", value1, value2, "assessPeriod");
            return (Criteria) this;
        }

        public Criteria andAssessPeriodNotBetween(String value1, String value2) {
            addCriterion("assess_period not between", value1, value2, "assessPeriod");
            return (Criteria) this;
        }

        public Criteria andIndicatorIsNull() {
            addCriterion("indicator is null");
            return (Criteria) this;
        }

        public Criteria andIndicatorIsNotNull() {
            addCriterion("indicator is not null");
            return (Criteria) this;
        }

        public Criteria andIndicatorEqualTo(Byte value) {
            addCriterion("indicator =", value, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorNotEqualTo(Byte value) {
            addCriterion("indicator <>", value, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorGreaterThan(Byte value) {
            addCriterion("indicator >", value, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorGreaterThanOrEqualTo(Byte value) {
            addCriterion("indicator >=", value, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorLessThan(Byte value) {
            addCriterion("indicator <", value, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorLessThanOrEqualTo(Byte value) {
            addCriterion("indicator <=", value, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorIn(List<Byte> values) {
            addCriterion("indicator in", values, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorNotIn(List<Byte> values) {
            addCriterion("indicator not in", values, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorBetween(Byte value1, Byte value2) {
            addCriterion("indicator between", value1, value2, "indicator");
            return (Criteria) this;
        }

        public Criteria andIndicatorNotBetween(Byte value1, Byte value2) {
            addCriterion("indicator not between", value1, value2, "indicator");
            return (Criteria) this;
        }

        public Criteria andGrantedScoreIsNull() {
            addCriterion("granted_score is null");
            return (Criteria) this;
        }

        public Criteria andGrantedScoreIsNotNull() {
            addCriterion("granted_score is not null");
            return (Criteria) this;
        }

        public Criteria andGrantedScoreEqualTo(Float value) {
            addCriterion("granted_score =", value, "grantedScore");
            return (Criteria) this;
        }

        public Criteria andGrantedScoreNotEqualTo(Float value) {
            addCriterion("granted_score <>", value, "grantedScore");
            return (Criteria) this;
        }

        public Criteria andGrantedScoreGreaterThan(Float value) {
            addCriterion("granted_score >", value, "grantedScore");
            return (Criteria) this;
        }

        public Criteria andGrantedScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("granted_score >=", value, "grantedScore");
            return (Criteria) this;
        }

        public Criteria andGrantedScoreLessThan(Float value) {
            addCriterion("granted_score <", value, "grantedScore");
            return (Criteria) this;
        }

        public Criteria andGrantedScoreLessThanOrEqualTo(Float value) {
            addCriterion("granted_score <=", value, "grantedScore");
            return (Criteria) this;
        }

        public Criteria andGrantedScoreIn(List<Float> values) {
            addCriterion("granted_score in", values, "grantedScore");
            return (Criteria) this;
        }

        public Criteria andGrantedScoreNotIn(List<Float> values) {
            addCriterion("granted_score not in", values, "grantedScore");
            return (Criteria) this;
        }

        public Criteria andGrantedScoreBetween(Float value1, Float value2) {
            addCriterion("granted_score between", value1, value2, "grantedScore");
            return (Criteria) this;
        }

        public Criteria andGrantedScoreNotBetween(Float value1, Float value2) {
            addCriterion("granted_score not between", value1, value2, "grantedScore");
            return (Criteria) this;
        }

        public Criteria andAssessedScoreIsNull() {
            addCriterion("assessed_score is null");
            return (Criteria) this;
        }

        public Criteria andAssessedScoreIsNotNull() {
            addCriterion("assessed_score is not null");
            return (Criteria) this;
        }

        public Criteria andAssessedScoreEqualTo(Float value) {
            addCriterion("assessed_score =", value, "assessedScore");
            return (Criteria) this;
        }

        public Criteria andAssessedScoreNotEqualTo(Float value) {
            addCriterion("assessed_score <>", value, "assessedScore");
            return (Criteria) this;
        }

        public Criteria andAssessedScoreGreaterThan(Float value) {
            addCriterion("assessed_score >", value, "assessedScore");
            return (Criteria) this;
        }

        public Criteria andAssessedScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("assessed_score >=", value, "assessedScore");
            return (Criteria) this;
        }

        public Criteria andAssessedScoreLessThan(Float value) {
            addCriterion("assessed_score <", value, "assessedScore");
            return (Criteria) this;
        }

        public Criteria andAssessedScoreLessThanOrEqualTo(Float value) {
            addCriterion("assessed_score <=", value, "assessedScore");
            return (Criteria) this;
        }

        public Criteria andAssessedScoreIn(List<Float> values) {
            addCriterion("assessed_score in", values, "assessedScore");
            return (Criteria) this;
        }

        public Criteria andAssessedScoreNotIn(List<Float> values) {
            addCriterion("assessed_score not in", values, "assessedScore");
            return (Criteria) this;
        }

        public Criteria andAssessedScoreBetween(Float value1, Float value2) {
            addCriterion("assessed_score between", value1, value2, "assessedScore");
            return (Criteria) this;
        }

        public Criteria andAssessedScoreNotBetween(Float value1, Float value2) {
            addCriterion("assessed_score not between", value1, value2, "assessedScore");
            return (Criteria) this;
        }

        public Criteria andExtraDynamicScoreIsNull() {
            addCriterion("extra_dynamic_score is null");
            return (Criteria) this;
        }

        public Criteria andExtraDynamicScoreIsNotNull() {
            addCriterion("extra_dynamic_score is not null");
            return (Criteria) this;
        }

        public Criteria andExtraDynamicScoreEqualTo(String value) {
            addCriterion("extra_dynamic_score =", value, "extraDynamicScore");
            return (Criteria) this;
        }

        public Criteria andExtraDynamicScoreNotEqualTo(String value) {
            addCriterion("extra_dynamic_score <>", value, "extraDynamicScore");
            return (Criteria) this;
        }

        public Criteria andExtraDynamicScoreGreaterThan(String value) {
            addCriterion("extra_dynamic_score >", value, "extraDynamicScore");
            return (Criteria) this;
        }

        public Criteria andExtraDynamicScoreGreaterThanOrEqualTo(String value) {
            addCriterion("extra_dynamic_score >=", value, "extraDynamicScore");
            return (Criteria) this;
        }

        public Criteria andExtraDynamicScoreLessThan(String value) {
            addCriterion("extra_dynamic_score <", value, "extraDynamicScore");
            return (Criteria) this;
        }

        public Criteria andExtraDynamicScoreLessThanOrEqualTo(String value) {
            addCriterion("extra_dynamic_score <=", value, "extraDynamicScore");
            return (Criteria) this;
        }

        public Criteria andExtraDynamicScoreLike(String value) {
            addCriterion("extra_dynamic_score like", value, "extraDynamicScore");
            return (Criteria) this;
        }

        public Criteria andExtraDynamicScoreNotLike(String value) {
            addCriterion("extra_dynamic_score not like", value, "extraDynamicScore");
            return (Criteria) this;
        }

        public Criteria andExtraDynamicScoreIn(List<String> values) {
            addCriterion("extra_dynamic_score in", values, "extraDynamicScore");
            return (Criteria) this;
        }

        public Criteria andExtraDynamicScoreNotIn(List<String> values) {
            addCriterion("extra_dynamic_score not in", values, "extraDynamicScore");
            return (Criteria) this;
        }

        public Criteria andExtraDynamicScoreBetween(String value1, String value2) {
            addCriterion("extra_dynamic_score between", value1, value2, "extraDynamicScore");
            return (Criteria) this;
        }

        public Criteria andExtraDynamicScoreNotBetween(String value1, String value2) {
            addCriterion("extra_dynamic_score not between", value1, value2, "extraDynamicScore");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("updater not between", value1, value2, "updater");
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