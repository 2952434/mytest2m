package yz.com.impala.bean.meta.criteria;

import yz.com.dao.AbstractCriteria;

import java.util.List;

public class AgmeE002CodCriteria extends AbstractCriteria {
    public AgmeE002CodCriteria andCCodeIsNull() {
        addCriterion("c_code is null");
        return this;
    }

    public AgmeE002CodCriteria andCCodeIsNotNull() {
        addCriterion("c_code is not null");
        return this;
    }

    public AgmeE002CodCriteria andCCodeEqualTo(String value) {
        addCriterion("c_code =", value, "cCode");
        return this;
    }

    public AgmeE002CodCriteria andCCodeNotEqualTo(String value) {
        addCriterion("c_code <>", value, "cCode");
        return this;
    }

    public AgmeE002CodCriteria andCCodeGreaterThan(String value) {
        addCriterion("c_code >", value, "cCode");
        return this;
    }

    public AgmeE002CodCriteria andCCodeGreaterThanOrEqualTo(String value) {
        addCriterion("c_code >=", value, "cCode");
        return this;
    }

    public AgmeE002CodCriteria andCCodeLessThan(String value) {
        addCriterion("c_code <", value, "cCode");
        return this;
    }

    public AgmeE002CodCriteria andCCodeLessThanOrEqualTo(String value) {
        addCriterion("c_code <=", value, "cCode");
        return this;
    }

    public AgmeE002CodCriteria andCCodeLike(String value) {
        addCriterion("c_code like", value, "cCode");
        return this;
    }

    public AgmeE002CodCriteria andCCodeNotLike(String value) {
        addCriterion("c_code not like", value, "cCode");
        return this;
    }

    public AgmeE002CodCriteria andCCodeIn(List<String> values) {
        addCriterion("c_code in", values, "cCode");
        return this;
    }

    public AgmeE002CodCriteria andCCodeNotIn(List<String> values) {
        addCriterion("c_code not in", values, "cCode");
        return this;
    }

    public AgmeE002CodCriteria andCCodeBetween(String value1, String value2) {
        addCriterion("c_code between", value1, value2, "cCode");
        return this;
    }

    public AgmeE002CodCriteria andCCodeNotBetween(String value1, String value2) {
        addCriterion("c_code not between", value1, value2, "cCode");
        return this;
    }

    public AgmeE002CodCriteria andCGrassnameIsNull() {
        addCriterion("c_grassname is null");
        return this;
    }

    public AgmeE002CodCriteria andCGrassnameIsNotNull() {
        addCriterion("c_grassname is not null");
        return this;
    }

    public AgmeE002CodCriteria andCGrassnameEqualTo(String value) {
        addCriterion("c_grassname =", value, "cGrassname");
        return this;
    }

    public AgmeE002CodCriteria andCGrassnameNotEqualTo(String value) {
        addCriterion("c_grassname <>", value, "cGrassname");
        return this;
    }

    public AgmeE002CodCriteria andCGrassnameGreaterThan(String value) {
        addCriterion("c_grassname >", value, "cGrassname");
        return this;
    }

    public AgmeE002CodCriteria andCGrassnameGreaterThanOrEqualTo(String value) {
        addCriterion("c_grassname >=", value, "cGrassname");
        return this;
    }

    public AgmeE002CodCriteria andCGrassnameLessThan(String value) {
        addCriterion("c_grassname <", value, "cGrassname");
        return this;
    }

    public AgmeE002CodCriteria andCGrassnameLessThanOrEqualTo(String value) {
        addCriterion("c_grassname <=", value, "cGrassname");
        return this;
    }

    public AgmeE002CodCriteria andCGrassnameLike(String value) {
        addCriterion("c_grassname like", value, "cGrassname");
        return this;
    }

    public AgmeE002CodCriteria andCGrassnameNotLike(String value) {
        addCriterion("c_grassname not like", value, "cGrassname");
        return this;
    }

    public AgmeE002CodCriteria andCGrassnameIn(List<String> values) {
        addCriterion("c_grassname in", values, "cGrassname");
        return this;
    }

    public AgmeE002CodCriteria andCGrassnameNotIn(List<String> values) {
        addCriterion("c_grassname not in", values, "cGrassname");
        return this;
    }

    public AgmeE002CodCriteria andCGrassnameBetween(String value1, String value2) {
        addCriterion("c_grassname between", value1, value2, "cGrassname");
        return this;
    }

    public AgmeE002CodCriteria andCGrassnameNotBetween(String value1, String value2) {
        addCriterion("c_grassname not between", value1, value2, "cGrassname");
        return this;
    }

    public AgmeE002CodCriteria andCFamilyIsNull() {
        addCriterion("c_family is null");
        return this;
    }

    public AgmeE002CodCriteria andCFamilyIsNotNull() {
        addCriterion("c_family is not null");
        return this;
    }

    public AgmeE002CodCriteria andCFamilyEqualTo(String value) {
        addCriterion("c_family =", value, "cFamily");
        return this;
    }

    public AgmeE002CodCriteria andCFamilyNotEqualTo(String value) {
        addCriterion("c_family <>", value, "cFamily");
        return this;
    }

    public AgmeE002CodCriteria andCFamilyGreaterThan(String value) {
        addCriterion("c_family >", value, "cFamily");
        return this;
    }

    public AgmeE002CodCriteria andCFamilyGreaterThanOrEqualTo(String value) {
        addCriterion("c_family >=", value, "cFamily");
        return this;
    }

    public AgmeE002CodCriteria andCFamilyLessThan(String value) {
        addCriterion("c_family <", value, "cFamily");
        return this;
    }

    public AgmeE002CodCriteria andCFamilyLessThanOrEqualTo(String value) {
        addCriterion("c_family <=", value, "cFamily");
        return this;
    }

    public AgmeE002CodCriteria andCFamilyLike(String value) {
        addCriterion("c_family like", value, "cFamily");
        return this;
    }

    public AgmeE002CodCriteria andCFamilyNotLike(String value) {
        addCriterion("c_family not like", value, "cFamily");
        return this;
    }

    public AgmeE002CodCriteria andCFamilyIn(List<String> values) {
        addCriterion("c_family in", values, "cFamily");
        return this;
    }

    public AgmeE002CodCriteria andCFamilyNotIn(List<String> values) {
        addCriterion("c_family not in", values, "cFamily");
        return this;
    }

    public AgmeE002CodCriteria andCFamilyBetween(String value1, String value2) {
        addCriterion("c_family between", value1, value2, "cFamily");
        return this;
    }

    public AgmeE002CodCriteria andCFamilyNotBetween(String value1, String value2) {
        addCriterion("c_family not between", value1, value2, "cFamily");
        return this;
    }

    public AgmeE002CodCriteria andCScientificnameIsNull() {
        addCriterion("c_scientificname is null");
        return this;
    }

    public AgmeE002CodCriteria andCScientificnameIsNotNull() {
        addCriterion("c_scientificname is not null");
        return this;
    }

    public AgmeE002CodCriteria andCScientificnameEqualTo(String value) {
        addCriterion("c_scientificname =", value, "cScientificname");
        return this;
    }

    public AgmeE002CodCriteria andCScientificnameNotEqualTo(String value) {
        addCriterion("c_scientificname <>", value, "cScientificname");
        return this;
    }

    public AgmeE002CodCriteria andCScientificnameGreaterThan(String value) {
        addCriterion("c_scientificname >", value, "cScientificname");
        return this;
    }

    public AgmeE002CodCriteria andCScientificnameGreaterThanOrEqualTo(String value) {
        addCriterion("c_scientificname >=", value, "cScientificname");
        return this;
    }

    public AgmeE002CodCriteria andCScientificnameLessThan(String value) {
        addCriterion("c_scientificname <", value, "cScientificname");
        return this;
    }

    public AgmeE002CodCriteria andCScientificnameLessThanOrEqualTo(String value) {
        addCriterion("c_scientificname <=", value, "cScientificname");
        return this;
    }

    public AgmeE002CodCriteria andCScientificnameLike(String value) {
        addCriterion("c_scientificname like", value, "cScientificname");
        return this;
    }

    public AgmeE002CodCriteria andCScientificnameNotLike(String value) {
        addCriterion("c_scientificname not like", value, "cScientificname");
        return this;
    }

    public AgmeE002CodCriteria andCScientificnameIn(List<String> values) {
        addCriterion("c_scientificname in", values, "cScientificname");
        return this;
    }

    public AgmeE002CodCriteria andCScientificnameNotIn(List<String> values) {
        addCriterion("c_scientificname not in", values, "cScientificname");
        return this;
    }

    public AgmeE002CodCriteria andCScientificnameBetween(String value1, String value2) {
        addCriterion("c_scientificname between", value1, value2, "cScientificname");
        return this;
    }

    public AgmeE002CodCriteria andCScientificnameNotBetween(String value1, String value2) {
        addCriterion("c_scientificname not between", value1, value2, "cScientificname");
        return this;
    }
}
